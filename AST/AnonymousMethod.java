/* This file was generated with JastAdd2 (http://jastadd.org) version R20130212 (r1031) */
package AST;

import java.util.HashSet;
import java.io.File;
import java.util.*;
import beaver.*;
import java.util.ArrayList;
import java.util.zip.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collections;
import jp.ac.kobe_u.cs.cream.Network;
import jp.ac.kobe_u.cs.cream.IntVariable;
import jp.ac.kobe_u.cs.cream.Constraint;
import jp.ac.kobe_u.cs.cream.Equals;
import jp.ac.kobe_u.cs.cream.NotEquals;
import jp.ac.kobe_u.cs.cream.IntComparison;
import jp.ac.kobe_u.cs.cream.DefaultSolver;
import jp.ac.kobe_u.cs.cream.Solution;
import jp.ac.kobe_u.cs.cream.IntArith;
import java.util.Map;
import java.util.Arrays;
import tests.CompileHelper;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * @production AnonymousMethod : {@link Expr} ::= <span class="component">Parameter:{@link ParameterDeclaration}*</span> <span class="component">TypeParameter:{@link TypeVariable}*</span> <span class="component">ReturnType:{@link Access}</span> <span class="component">Exception:{@link Access}*</span> <span class="component">{@link Block}</span> <span class="component">Arg:{@link Expr}*</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.ast:1
 */
public class AnonymousMethod extends Expr implements Cloneable, Scope {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    type_computed = false;
    type_value = null;
    uncheckedExceptionExit_computed = false;
    uncheckedExceptionExit_value = null;
    returns_computed = false;
    returns_value = null;
    finals_computed = false;
    finals_value = null;
    accessParameter_Variable_values = null;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public AnonymousMethod clone() throws CloneNotSupportedException {
    AnonymousMethod node = (AnonymousMethod)super.clone();
    node.type_computed = false;
    node.type_value = null;
    node.uncheckedExceptionExit_computed = false;
    node.uncheckedExceptionExit_value = null;
    node.returns_computed = false;
    node.returns_value = null;
    node.finals_computed = false;
    node.finals_value = null;
    node.accessParameter_Variable_values = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public AnonymousMethod copy() {
    try {
      AnonymousMethod node = (AnonymousMethod) clone();
      node.parent = null;
      if(children != null)
        node.children = (ASTNode[]) children.clone();
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " +
        getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   */
  @SuppressWarnings({"unchecked", "cast"})
  public AnonymousMethod fullCopy() {
    AnonymousMethod tree = (AnonymousMethod) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if(child != null) {
          child = child.fullCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * @ast method 
   * @aspect ClosureConversion
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/ClosureConversion.jrag:2
   */
  public AnonymousMethod convert() {
		java.util.Set<Variable> V = new java.util.LinkedHashSet<Variable>(),
								Val = new java.util.LinkedHashSet<Variable>(),
								Out = new java.util.LinkedHashSet<Variable>(),
								Ref = new java.util.LinkedHashSet<Variable>();
		for(VarAccess va : getBlock().varAccesses()) {
			if(va.hostBodyDecl() == hostBodyDecl() && va.isDest() && va.decl().isFinal())
				throw new RefactoringException("cannot extract writes to final fields");
			Variable v = va.decl();
			if(v instanceof LocalDeclaration && !((ASTNode)v).isDescendantTo(this)) {
				V.add(v);
				if(hasIncomingDataflowEdge(va)) {
					if(Out.contains(v)) {
						Out.remove(v);
						Ref.add(v);
					} else if(!Ref.contains(v)) {
						Val.add(v);
					}
				}
				if(hasOutgoingDataflowEdge(va)) {
					if(Val.contains(v)) {
						Val.remove(v);
						Ref.add(v);
					} else if(!Ref.contains(v)) {
						Out.add(v);
					}
				}
			}
		}
		hostType().flushCaches();
		for(Variable v : V) {
			Modifiers mod = (Modifiers)v.getModifiers().fullCopyAndDetach();
			Access tp = v.type().createLockedAccess();
			String n = v.name();
			if(Val.contains(v) || Out.contains(v) || Ref.contains(v)) {
				if(Out.contains(v))
					mod.addModifier("out");
				else if(Ref.contains(v))
					mod.addModifier("ref");
				addParameter(new ParameterDeclaration(mod, tp, n));
				addArg(new VarAccess(n));
			} else {
				getBlock().insertStmt(0, new VariableDeclaration(mod, tp, n, new Opt()));
			}
		}
		for(TypeAccess ta : typeVarAccesses()) {
			TypeVariable tv = (TypeVariable)ta.decl();
			if(tv.owner() == enclosingBodyDecl())
				addTypeVariable(tv);
		}
		hostType().flushCaches();
		return this;
	}
  /**
   * @ast method 
   * @aspect ClosureConversion
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/ClosureConversion.jrag:56
   */
  private boolean hasIncomingDataflowEdge(VarAccess v) {
		return v.hasReachingDefinitionBefore(entry());
	}
  /**
   * @ast method 
   * @aspect ClosureConversion
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/ClosureConversion.jrag:60
   */
  private boolean hasOutgoingDataflowEdge(VarAccess v) {
		if(v.hasReachedUseAfter(exit()))
			return true;
		for(Access acc : getExceptions())
			if(v.hasReachedUseAfter(acc))
				return true;
		return v.hasReachedUseAfter(uncheckedExceptionExit());
	}
  /**
   * @ast method 
   * @aspect ClosureConversion
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/ClosureConversion.jrag:70
   */
  private void addTypeVariable(TypeVariable tv) {
		for(TypeVariable tv2 : getTypeParameters())
			if(tv2.name().equals(tv.name()))
				return;
		addTypeParameter((TypeVariable)tv.fullCopyAndDetach());
	}
  /**
   * @ast method 
   * @aspect EliminateOutParams
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/EliminateOutParams.jrag:2
   */
  public void eliminateOutParams() throws RefactoringException {
		makeReturnExplicit();
		try {
			if(getNumWriteParameter() == 0)
				return;
			if(getNumWriteParameter() > 1)
				throw new RefactoringException("ambiguous return value: two or more output parameters");
			if(!getReturnType().type().isVoid())
				throw new RefactoringException("ambiguous return value: output parameter and return statement");
			int idx = getFirstWriteParameterPos();
			ParameterDeclaration pd = getParameter(idx);
			if(!(getArg(idx) instanceof VarAccess))
				throw new RefactoringException("cannot eliminate out parameter");
			VarAccess v = (VarAccess)getArg(idx);
			if(hasOutgoingDataflowEdgeThroughException(pd, v.getLocation()))
				throw new RefactoringException("cannot eliminate out parameter");
			for(Stmt s : exit().predStmt())
				((ReturnStmt)s).setResult(new VarAccess(pd.name()));
			setReturnType(pd.type().createLockedAccess());
			hostType().flushCaches();
			if(pd.isRef() || !entry().reachedUsesFor(pd).isEmpty()) {
				pd.makeIn();
			} else {
				// make it a local variable
				getBlock().insertStmt(0, new VariableDeclaration(v.type().createLockedAccess(), v.name()));
				removeParameter(idx);
				removeArg(idx);
			}
			AssignExpr assgn = new AssignSimpleExpr(new VarAccess(v.name()), null);
			replaceWith(assgn);
			assgn.setSource(this);
			hostType().flushCaches();
		} finally {
			makeReturnImplicit();
		}
	}
  /**
   * @ast method 
   * @aspect EliminateOutParams
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/EliminateOutParams.jrag:40
   */
  public void makeReturnExplicit() {
		if(getBlock().canCompleteNormally())
			getBlock().addStmt(new ReturnStmt());
	}
  /**
   * @ast method 
   * @aspect EliminateOutParams
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/EliminateOutParams.jrag:45
   */
  public void makeReturnImplicit() {
		int n = getBlock().getNumStmt();
		if(n == 0)
			return;
		Stmt s = getBlock().getStmt(n-1);
		if(s instanceof ReturnStmt && !((ReturnStmt)s).hasResult())
			getBlock().removeStmt(n-1);
	}
  /**
   * @ast method 
   * @aspect EliminateOutParams
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/EliminateOutParams.jrag:56
   */
  private boolean hasOutgoingDataflowEdgeThroughException(Variable v, Location l) {
		for(VarAccess acc : v.allUses()) {
			for(Access exn : getExceptions())
				if(acc.hasReachedUseAfter(l, exn))
					return true;
			if(acc.hasReachedUseAfter(l, uncheckedExceptionExit()))
				return true;
		}
		return false;
	}
  /**
   * @ast method 
   * @aspect ExtractClosureToMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/ExtractClosureToMethod.jrag:2
   */
  public MethodDecl extractToMethod(int visibility, String name) {
		Program root = programRoot();
		TypeDecl typedecl = hostType();
		eliminateOutParams();
		lockAllNames();
		MethodDecl md = asNamedMethod(visibility, name);
		Literal placeHolder = new NullLiteral("null");
		replaceWith(placeHolder);
		int index = typedecl.getBodyDeclList().getIndexOfChild(hostBodyDecl());
		root.lockMethodNames(name);
		typedecl.getBodyDeclList().insertChild(md, index+1);
		typedecl.flushCaches();
		for(Iterator<MethodDecl> iter=typedecl.localMethodsIterator();iter.hasNext();) {
			MethodDecl md2 = iter.next();
			if(md != md2 && md.signature().equals(md2.signature()))
				throw new RefactoringException("method with same signature exists");
		}
		if(!typedecl.ancestorMethods(md.signature()).isEmpty())
			throw new RefactoringException("extracted method would override or hide other method");
		if(!typedecl.descendantMethods(md.signature()).isEmpty())
			throw new RefactoringException("extracted method would be overridden or hidden by other method");
		placeHolder.replaceWith(md.createLockedAccess((List<Expr>) getArgList().fullCopyAndDetach()));
		return md;
	}
  /**
   * @ast method 
   * @aspect ExtractClosureToMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/ExtractClosureToMethod.jrag:29
   */
  public MethodDecl doExtractToMethod(int visibility, String name) {
		TypeDecl td = hostType();
		MethodDecl md = extractToMethod(visibility, name);
		td.eliminate(LOCKED_NAMES);
		return md;
	}
  /**
   * @ast method 
   * @aspect InlineAnonymousMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/InlineAnonymousMethod.jrag:3
   */
  public ASTNode inline() {
		TypeDecl root = hostType();
		if(getNumParameter() > 0)
			throw new RefactoringException("cannot inline this closure");
		if(getParent() instanceof ExprStmt) {
			this.makeReturnExplicit();
			String label = getBlock().pickFreshLabel("l");
			java.util.Set<BreakStmt> breaks = new HashSet<BreakStmt>();
			for(Stmt node : returns()) {
				ReturnStmt ret = (ReturnStmt)node;
				if(ret.hasResult() && !ret.getResult().isPure()) {
					if(!ret.getResult().isStatementExpression())
						throw new RefactoringException("cannot inline this closure");
					ret.insertStmtBefore(new ExprStmt(ret.getResult()));
				}
				BreakStmt brk = new BreakStmt(label);
				breaks.add(brk);
				ret.replaceWith(brk);
			}
			LabeledStmt body = new LabeledStmt(label, getBlock());
			getParent().replaceWith(body);
			root.flushCaches();
			for(BreakStmt brk : breaks)
				brk.removeUseless();
			this.makeReturnImplicit();
			return body.removeUselessLabel();
		} else if(isExprClosure()) {
			Expr expr = getExpr();
			replaceWith(expr);
			root.flushCaches();
			return expr;
		} else if(getParent().getParent() instanceof ReturnStmt) {
			Block block = getBlock();
			getParent().getParent().replaceWith(block);
			root.flushCaches();
			return block;
		} else {
			throw new RefactoringException("cannot inline this closure");
		}
	}
  /**
   * @ast method 
   * @aspect IntroduceOutParameter
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/IntroduceOutParameter.jrag:2
   */
  public AnonymousMethod introduceOutParameter() {
		eliminateVarargs();
		programRoot().flushCaches();
		if(!(getParent() instanceof AssignSimpleExpr))
			return this;
		AssignSimpleExpr parent = (AssignSimpleExpr)getParent();
		if(!(parent.getDest() instanceof VarAccess))
			throw new RefactoringException("cannot introduce non-variable out parameter");
		VarAccess v = (VarAccess)parent.getDest();
		setReturnType(new PrimitiveTypeAccess("void"));
		ParameterDeclaration pd = new FreshParameter(new Modifiers("out"), v.type().createLockedAccess(), "res");
		addParameter(pd);
		addArg(v.decl().createLockedAccess());
		getBlock().addAssignToReturns(pd);
		parent.replaceWith(this);
		hostType().flushCaches();
		return this;
	}
  /**
   * @ast method 
   * @aspect OpenVariables
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/OpenVariables.jrag:3
   */
  public AnonymousMethod open() {
		getBlock().flushCaches();
		getBlock().freshenAllDeclarations();
		for(int i=getNumParameter()-1;i>=0;--i)
			getParameter(i).inline();
		hostType().flushCaches();
		return this;
	}
  /**
   * @ast method 
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:2
   */
  public void toString(StringBuffer s) {
		s.append("({ ");
		if(getNumTypeParameter() > 0) {
			s.append("<");
    		getTypeParameter(0).toString(s);
    		for (int i = 1; i < getNumTypeParameter(); i++) {
    			s.append(", ");
    			getTypeParameter(i).toString(s);
    		}
	    	s.append("> ");		
	    }
		s.append("(");
		if(getNumParameter() > 0) {
			getParameter(0).toString(s);
			for(int i = 1; i < getNumParameter(); i++) {
				s.append(", ");
				getParameter(i).toString(s);
			}
		}
		s.append(") : ");
		getReturnType().toString(s);
		if(getNumException() > 0) {
			s.append(" throws ");
			getException(0).toString(s);
			for(int i = 1; i < getNumException(); i++) {
				s.append(", ");
				getException(i).toString(s);
			}
		}
		s.append(" => ");
		getBlock().toString(s);
		s.append("}) (");
		if(getNumArg() > 0) {
			getArg(0).toString(s);
			for(int i = 1; i < getNumArg(); i++) {
				s.append(", ");
				getArg(i).toString(s);
			}
		}
		s.append(")");
	}
  /**
   * @ast method 
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:71
   */
  
	
	// artificial node to represent throws of uncaught exceptions
	private final ExitStmt uncheckedExceptionExit = new ExitStmt();
  /**
   * @ast method 
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:183
   */
  public void removeArg(int i) {
		getArgList().removeChild(i);
	}
  /**
   * @ast method 
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:187
   */
  public void removeParameter(int i) {
		getParameterList().removeChild(i);
	}
  /**
   * @ast method 
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:204
   */
  public Expr lookupArg(String parmname) {
		for(int i = 0; i < getNumParameter(); ++i)
			if(getParameter(i).name().equals(parmname))
				return getArg(i);
		return null;
	}
  /**
   * @ast method 
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:239
   */
  public void eliminateVarargs() {
		if(!isVariableArity())
			return;
		VariableArityParameterDeclaration last = (VariableArityParameterDeclaration)lastParameter();
		ParameterDeclaration new_last = last.asFixedArityParameter();
		for(VarAccess va : last.uses())
			if(va.isLocked())
				va.lock(new_last);
		setParameter(new_last, getNumParameter()-1);
		if(!invokesVariableArityAsArray()) {
			List<Expr> varargs = new List<Expr>();
			for(int i=getNumArg()-1; i>getNumParameter()-1;--i) {
				Expr arg = getArg(i);
				removeArg(i);
				varargs.insertChild(arg, 0);
			}
			varargs.insertChild(getArg(getNumParameter()-1), 0);
			setArg(new ArrayCreationExpr(last.type().createLockedAccess(), new Opt(new ArrayInit(varargs))), getNumParameter()-1);
		}
	}
  /**
   * @ast method 
   * 
   */
  public AnonymousMethod() {
    super();


  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @ast method 
   * 
   */
  public void init$Children() {
    children = new ASTNode[6];
    setChild(new List(), 0);
    setChild(new List(), 1);
    setChild(new List(), 3);
    setChild(new List(), 5);
  }
  /**
   * @ast method 
   * 
   */
  public AnonymousMethod(List<ParameterDeclaration> p0, List<TypeVariable> p1, Access p2, List<Access> p3, Block p4, List<Expr> p5) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
    setChild(p3, 3);
    setChild(p4, 4);
    setChild(p5, 5);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  protected int numChildren() {
    return 6;
  }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /**
   * Replaces the Parameter list.
   * @param list The new list node to be used as the Parameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setParameterList(List<ParameterDeclaration> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Parameter list.
   * @return Number of children in the Parameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public int getNumParameter() {
    return getParameterList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Parameter list.
   * Calling this method will not trigger rewrites..
   * @return Number of children in the Parameter list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public int getNumParameterNoTransform() {
    return getParameterListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Parameter list..
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Parameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ParameterDeclaration getParameter(int i) {
    return (ParameterDeclaration)getParameterList().getChild(i);
  }
  /**
   * Append an element to the Parameter list.
   * @param node The element to append to the Parameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void addParameter(ParameterDeclaration node) {
    List<ParameterDeclaration> list = (parent == null || state == null) ? getParameterListNoTransform() : getParameterList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void addParameterNoTransform(ParameterDeclaration node) {
    List<ParameterDeclaration> list = getParameterListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Parameter list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setParameter(ParameterDeclaration node, int i) {
    List<ParameterDeclaration> list = getParameterList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Parameter list.
   * @return The node representing the Parameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public List<ParameterDeclaration> getParameters() {
    return getParameterList();
  }
  /**
   * Retrieves the Parameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Parameter list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public List<ParameterDeclaration> getParametersNoTransform() {
    return getParameterListNoTransform();
  }
  /**
   * Retrieves the Parameter list.
   * @return The node representing the Parameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<ParameterDeclaration> getParameterList() {
    List<ParameterDeclaration> list = (List<ParameterDeclaration>)getChild(0);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the Parameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Parameter list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<ParameterDeclaration> getParameterListNoTransform() {
    return (List<ParameterDeclaration>)getChildNoTransform(0);
  }
  /**
   * Replaces the TypeParameter list.
   * @param list The new list node to be used as the TypeParameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setTypeParameterList(List<TypeVariable> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the TypeParameter list.
   * @return Number of children in the TypeParameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public int getNumTypeParameter() {
    return getTypeParameterList().getNumChild();
  }
  /**
   * Retrieves the number of children in the TypeParameter list.
   * Calling this method will not trigger rewrites..
   * @return Number of children in the TypeParameter list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public int getNumTypeParameterNoTransform() {
    return getTypeParameterListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the TypeParameter list..
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the TypeParameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeVariable getTypeParameter(int i) {
    return (TypeVariable)getTypeParameterList().getChild(i);
  }
  /**
   * Append an element to the TypeParameter list.
   * @param node The element to append to the TypeParameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void addTypeParameter(TypeVariable node) {
    List<TypeVariable> list = (parent == null || state == null) ? getTypeParameterListNoTransform() : getTypeParameterList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void addTypeParameterNoTransform(TypeVariable node) {
    List<TypeVariable> list = getTypeParameterListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the TypeParameter list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setTypeParameter(TypeVariable node, int i) {
    List<TypeVariable> list = getTypeParameterList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the TypeParameter list.
   * @return The node representing the TypeParameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public List<TypeVariable> getTypeParameters() {
    return getTypeParameterList();
  }
  /**
   * Retrieves the TypeParameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the TypeParameter list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public List<TypeVariable> getTypeParametersNoTransform() {
    return getTypeParameterListNoTransform();
  }
  /**
   * Retrieves the TypeParameter list.
   * @return The node representing the TypeParameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<TypeVariable> getTypeParameterList() {
    List<TypeVariable> list = (List<TypeVariable>)getChild(1);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the TypeParameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the TypeParameter list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<TypeVariable> getTypeParameterListNoTransform() {
    return (List<TypeVariable>)getChildNoTransform(1);
  }
  /**
   * Replaces the ReturnType child.
   * @param node The new node to replace the ReturnType child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setReturnType(Access node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the ReturnType child.
   * @return The current node used as the ReturnType child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Access getReturnType() {
    return (Access)getChild(2);
  }
  /**
   * Retrieves the ReturnType child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the ReturnType child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public Access getReturnTypeNoTransform() {
    return (Access)getChildNoTransform(2);
  }
  /**
   * Replaces the Exception list.
   * @param list The new list node to be used as the Exception list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setExceptionList(List<Access> list) {
    setChild(list, 3);
  }
  /**
   * Retrieves the number of children in the Exception list.
   * @return Number of children in the Exception list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public int getNumException() {
    return getExceptionList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Exception list.
   * Calling this method will not trigger rewrites..
   * @return Number of children in the Exception list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public int getNumExceptionNoTransform() {
    return getExceptionListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Exception list..
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Exception list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Access getException(int i) {
    return (Access)getExceptionList().getChild(i);
  }
  /**
   * Append an element to the Exception list.
   * @param node The element to append to the Exception list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void addException(Access node) {
    List<Access> list = (parent == null || state == null) ? getExceptionListNoTransform() : getExceptionList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void addExceptionNoTransform(Access node) {
    List<Access> list = getExceptionListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Exception list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setException(Access node, int i) {
    List<Access> list = getExceptionList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Exception list.
   * @return The node representing the Exception list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public List<Access> getExceptions() {
    return getExceptionList();
  }
  /**
   * Retrieves the Exception list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Exception list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public List<Access> getExceptionsNoTransform() {
    return getExceptionListNoTransform();
  }
  /**
   * Retrieves the Exception list.
   * @return The node representing the Exception list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Access> getExceptionList() {
    List<Access> list = (List<Access>)getChild(3);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the Exception list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Exception list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Access> getExceptionListNoTransform() {
    return (List<Access>)getChildNoTransform(3);
  }
  /**
   * Replaces the Block child.
   * @param node The new node to replace the Block child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setBlock(Block node) {
    setChild(node, 4);
  }
  /**
   * Retrieves the Block child.
   * @return The current node used as the Block child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Block getBlock() {
    return (Block)getChild(4);
  }
  /**
   * Retrieves the Block child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Block child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public Block getBlockNoTransform() {
    return (Block)getChildNoTransform(4);
  }
  /**
   * Replaces the Arg list.
   * @param list The new list node to be used as the Arg list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setArgList(List<Expr> list) {
    setChild(list, 5);
  }
  /**
   * Retrieves the number of children in the Arg list.
   * @return Number of children in the Arg list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public int getNumArg() {
    return getArgList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Arg list.
   * Calling this method will not trigger rewrites..
   * @return Number of children in the Arg list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public int getNumArgNoTransform() {
    return getArgListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Arg list..
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Arg list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Expr getArg(int i) {
    return (Expr)getArgList().getChild(i);
  }
  /**
   * Append an element to the Arg list.
   * @param node The element to append to the Arg list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void addArg(Expr node) {
    List<Expr> list = (parent == null || state == null) ? getArgListNoTransform() : getArgList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void addArgNoTransform(Expr node) {
    List<Expr> list = getArgListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Arg list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setArg(Expr node, int i) {
    List<Expr> list = getArgList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Arg list.
   * @return The node representing the Arg list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public List<Expr> getArgs() {
    return getArgList();
  }
  /**
   * Retrieves the Arg list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Arg list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public List<Expr> getArgsNoTransform() {
    return getArgListNoTransform();
  }
  /**
   * Retrieves the Arg list.
   * @return The node representing the Arg list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Expr> getArgList() {
    List<Expr> list = (List<Expr>)getChild(5);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the Arg list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Arg list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Expr> getArgListNoTransform() {
    return (List<Expr>)getChildNoTransform(5);
  }
  /**
   * @attribute syn
   * @aspect EliminateOutParams
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/EliminateOutParams.jrag:68
   */
  public int getNumWriteParameter() {
    ASTNode$State state = state();
    try {
		int res = 0;
		for(int i = 0; i < getNumParameter(); ++i)
			if(getParameter(i).isWrite())
				++res;
		return res;
	}
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect EliminateOutParams
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/EliminateOutParams.jrag:76
   */
  public int getFirstWriteParameterPos() {
    ASTNode$State state = state();
    try {
		for(int i=0; i < getNumParameter(); ++i)
			if(getParameter(i).isWrite())
				return i;
		return -1;
	}
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean type_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl type_value;
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:63
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl type() {
    if(type_computed) {
      return type_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    type_value = type_compute();
      if(isFinal && num == state().boundariesCrossed) type_computed = true;
    return type_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl type_compute() {  return getReturnType().type();  }
  /**
   * @attribute syn
   * @aspect Precedence
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Precedence.jrag:2
   */
  public int precedence() {
    ASTNode$State state = state();
    try {  return 0;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean uncheckedExceptionExit_computed = false;
  /**
   * @apilevel internal
   */
  protected Stmt uncheckedExceptionExit_value;
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:72
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Stmt uncheckedExceptionExit() {
    if(uncheckedExceptionExit_computed) {
      return uncheckedExceptionExit_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    uncheckedExceptionExit_value = uncheckedExceptionExit_compute();
    uncheckedExceptionExit_value.setParent(this);
    uncheckedExceptionExit_value.is$Final = true;
      if(true) uncheckedExceptionExit_computed = true;
    return uncheckedExceptionExit_value;
  }
  /**
   * @apilevel internal
   */
  private Stmt uncheckedExceptionExit_compute() {  return uncheckedExceptionExit;  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:34
   */
  public CFGNode first() {
    ASTNode$State state = state();
    try {  return getNumArg() == 0 ? getBlock() : getArg(0).first();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:76
   */
  public CFGNode entry() {
    ASTNode$State state = state();
    try {  return getBlock();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:77
   */
  public CFGNode exit() {
    ASTNode$State state = state();
    try {  return this;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean returns_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<Stmt> returns_value;
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:111
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<Stmt> returns() {
    if(returns_computed) {
      return returns_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    returns_value = returns_compute();
      if(isFinal && num == state().boundariesCrossed) returns_computed = true;
    return returns_value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<Stmt> returns_compute() {  return getReturnType().predStmt();  }
  /**
   * @apilevel internal
   */
  protected boolean finals_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<Stmt> finals_value;
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:113
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<Stmt> finals() {
    if(finals_computed) {
      return finals_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    finals_value = finals_compute();
      if(isFinal && num == state().boundariesCrossed) finals_computed = true;
    return finals_value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<Stmt> finals_compute() {
    	SmallSet<Stmt> res = SmallSet.empty();
    	for(CFGNode n : pred()) {
    		if(n == getReturnType())
    			continue;
    		if(n instanceof Stmt) {
    			if(((Stmt)n).canCompleteNormally())
    				res = res.union((Stmt)n);
    		} else {
    			for(Stmt stmt : (SmallSet<Stmt>)n.predStmt())
    				if(stmt.canCompleteNormally())
    					res = res.union(stmt);
    		}
    	}
    	return res;
	}
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:139
   */
  public SimpleSet parameterDeclaration(String name) {
    ASTNode$State state = state();
    try {
		for(int i = 0; i < getNumParameter(); i++)
			if(getParameter(i).name().equals(name))
				return (ParameterDeclaration)getParameter(i);
		return SimpleSet.emptySet;
	}
    finally {
    }
  }
  protected java.util.Map accessParameter_Variable_values;
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:154
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SymbolicVarAccess accessParameter(Variable decl) {
    Object _parameters = decl;
    if(accessParameter_Variable_values == null) accessParameter_Variable_values = new java.util.HashMap(4);
    if(accessParameter_Variable_values.containsKey(_parameters)) {
      return (SymbolicVarAccess)accessParameter_Variable_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SymbolicVarAccess accessParameter_Variable_value = accessParameter_compute(decl);
      if(isFinal && num == state().boundariesCrossed) accessParameter_Variable_values.put(_parameters, accessParameter_Variable_value);
    return accessParameter_Variable_value;
  }
  /**
   * @apilevel internal
   */
  private SymbolicVarAccess accessParameter_compute(Variable decl) {
		for(ParameterDeclaration pd : getParameters())
			if(pd == decl)
				return pd;
		return unknownVarAccess();
	}
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:161
   */
  public SimpleSet localLookupType(String name) {
    ASTNode$State state = state();
    try {
		for(TypeVariable tv : getTypeParameters())
			if(tv.name().equals(name))
				return SimpleSet.emptySet.add(tv);
		return SimpleSet.emptySet;
	}
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:23
   */
  public boolean hasVariable(String name) {
    ASTNode$State state = state();
    try {  return !parameterDeclaration(name).isEmpty();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:36
   */
  public boolean isFlowThrough() {
    ASTNode$State state = state();
    try {  return true;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:191
   */
  public boolean isVariableArity() {
    ASTNode$State state = state();
    try {  return getNumParameter() == 0 ? false : getParameter(getNumParameter()-1).isVariableArity();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:192
   */
  public ParameterDeclaration lastParameter() {
    ASTNode$State state = state();
    try {  return getParameter(getNumParameter()-1);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:193
   */
  public Expr lastArg() {
    ASTNode$State state = state();
    try {  return getArg(getNumArg()-1);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:195
   */
  public boolean invokesVariableArityAsArray() {
    ASTNode$State state = state();
    try {
		if(!isVariableArity())
			return false;
		if(getNumParameter() != getNumArg())
			return false;
		return lastArg().type().methodInvocationConversionTo(lastParameter().type());
	}
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:229
   */
  public MethodDecl asNamedMethod(int visibility, String name) {
    ASTNode$State state = state();
    try {
		Modifiers mods = new Modifiers(visibility);
		if(inStaticContext() || inExplicitConstructorInvocation())
			mods.addModifier("static");
		if(getNumTypeParameter() == 0)
			return new MethodDecl(mods, getReturnType(), name, getParameters(), getExceptions(), new Opt(getBlock()));
		else
			return new GenericMethodDecl(mods, getReturnType(), name, getParameters(), getExceptions(), new Opt(getBlock()), getTypeParameterList());
	}
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:261
   */
  public boolean isExprClosure() {
    ASTNode$State state = state();
    try {  return getBlock().getNumStmt() == 1 && getBlock().getStmt(0) instanceof ReturnStmt &&
	      ((ReturnStmt)getBlock().getStmt(0)).hasResult();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:265
   */
  public Expr getExpr() {
    ASTNode$State state = state();
    try {  return ((ReturnStmt)getBlock().getStmt(0)).getResult();  }
    finally {
    }
  }
  /**
   * @attribute inh
   * @aspect ExtractClosureToMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/ExtractClosureToMethod.jrag:27
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean inExplicitConstructorInvocation() {
    ASTNode$State state = state();
    boolean inExplicitConstructorInvocation_value = getParent().Define_boolean_inExplicitConstructorInvocation(this, null);
    return inExplicitConstructorInvocation_value;
  }
  /**
   * @attribute inh
   * @aspect WrapBlockIntoClosure
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/WrapBlockIntoClosure.jrag:70
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl returnType() {
    ASTNode$State state = state();
    TypeDecl returnType_value = getParent().Define_TypeDecl_returnType(this, null);
    return returnType_value;
  }
  /**
   * @attribute inh
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:68
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> throwTarget(TypeDecl exn) {
    ASTNode$State state = state();
    SmallSet<CFGNode> throwTarget_TypeDecl_value = getParent().Define_SmallSet_CFGNode__throwTarget(this, null, exn);
    return throwTarget_TypeDecl_value;
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:51
   * @apilevel internal
   */
  public boolean Define_boolean_canIntroduceLocal(ASTNode caller, ASTNode child, String name) {
    if(caller == getParameterListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return !hasNestedLocal(name);
  }
    else {      return getParent().Define_boolean_canIntroduceLocal(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:58
   * @apilevel internal
   */
  public NameType Define_NameType_nameType(ASTNode caller, ASTNode child) {
    if(caller == getTypeParameterListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return NameType.TYPE_NAME;
  }
    else if(caller == getArgListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return NameType.EXPRESSION_NAME;
  }
    else if(caller == getExceptionListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return NameType.TYPE_NAME;
  }
    else if(caller == getParameterListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return NameType.TYPE_NAME;
  }
    else if(caller == getReturnTypeNoTransform()) {
      return NameType.TYPE_NAME;
    }
    else {      return getParent().Define_NameType_nameType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:61
   * @apilevel internal
   */
  public boolean Define_boolean_reachable(ASTNode caller, ASTNode child) {
    if(caller == getBlockNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_reachable(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:94
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
    if(caller == uncheckedExceptionExit_value){
      return uncheckedExnTarget();
    }
    else if(caller == getExceptionListNoTransform())  {
    int i = caller.getIndexOfChild(child);
    return throwTarget(getException(i).type());
  }
    else if(caller == getReturnTypeNoTransform()) {
      return SmallSet.<CFGNode>singleton(exit());
    }
    else if(caller == getBlockNoTransform()) {
      return SmallSet.<CFGNode>singleton(getReturnType());
    }
    else if(caller == getParameterListNoTransform())  { 
    int i = caller.getIndexOfChild(child);
    {
		if(i < getNumParameter()-1)
			return SmallSet.<CFGNode>singleton(getParameter(i+1).first());
		return SmallSet.<CFGNode>singleton(getBlock());
	}
  }
    else if(caller == getArgListNoTransform())  { 
    int i = caller.getIndexOfChild(child);
    {
		if(i < getNumArg()-1)
			return SmallSet.<CFGNode>singleton(getArg(i+1).first());
		if(getNumParameter() > 0)
			return SmallSet.<CFGNode>singleton(getParameter(0).first());
		return SmallSet.<CFGNode>singleton(getBlock());
	}
  }
    else {      return getParent().Define_SmallSet_CFGNode__following(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:96
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__breakTarget(ASTNode caller, ASTNode child, BreakStmt stmt) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SmallSet.empty();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:97
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__continueTarget(ASTNode caller, ASTNode child, ContinueStmt stmt) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SmallSet.empty();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:98
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__returnTarget(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SmallSet.<CFGNode>singleton(getReturnType());
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:99
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__throwTarget(ASTNode caller, ASTNode child, TypeDecl exn) {
     { 
   int childIndex = this.getIndexOfChild(caller);
{
		// this selects (somewhat arbitrarily) the left-most matching exception type
		for(Access acc : getExceptions())
			if(exn.instanceOf(acc.type()))
				return SmallSet.<CFGNode>singleton(acc);
		if(exn.isCheckedException())	// JastAddJ's definition of checked/unchecked is confused...
			return SmallSet.<CFGNode>singleton(uncheckedExceptionExit());
		return SmallSet.empty();
	}
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:108
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__uncheckedExnTarget(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SmallSet.<CFGNode>singleton(uncheckedExceptionExit());
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:136
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupVariable(ASTNode caller, ASTNode child, String name) {
    if(caller == getParameterListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return parameterDeclaration(name);
  }
    else if(caller == getBlockNoTransform()){
		SimpleSet set = parameterDeclaration(name);
		if(!set.isEmpty()) return set;
		return lookupVariable(name);
	}
    else {      return getParent().Define_SimpleSet_lookupVariable(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:151
   * @apilevel internal
   */
  public SymbolicVarAccess Define_SymbolicVarAccess_accessVariable(ASTNode caller, ASTNode child, Variable decl) {
    if(caller == getParameterListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return accessParameter(decl);
  }
    else if(caller == getBlockNoTransform()){
		SymbolicVarAccess acc = accessParameter(decl);
		if(!acc.isUnknownVarAccess()) return acc;
		return accessVariable(decl).moveInto(this);
	}
    else {      return getParent().Define_SymbolicVarAccess_accessVariable(this, caller, decl);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:168
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupType(ASTNode caller, ASTNode child, String name) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return localLookupType(name).isEmpty() ? lookupType(name) : localLookupType(name);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
