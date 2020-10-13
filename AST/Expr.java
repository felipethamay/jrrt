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
 * @production Expr : {@link ASTNode};
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:104
 */
public abstract class Expr extends ASTNode<ASTNode> implements Cloneable, CFGNode, TypeConstraintVariable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    isArrayInit_computed = false;
    shouldMakeConversionExplicit_TypeDecl_values = null;
    getMonitor_computed = false;
    getMonitor_value = null;
    computeType_int_values = null;
    possibleTypes_computed = false;
    possibleTypes_value = null;
    exceptionalSucc_computed = false;
    exceptionalSucc_value = null;
    succ_computed = false;
    succ_value = null;
    dotLabel_computed = false;
    dotLabel_value = null;
    dotNode_computed = false;
    dotNode_value = null;
    reachingDefinitionsFor_Location_values = null;
    reachedUsesFor_Location_values = null;
    hasReachingDefinitionBefore_Location_CFGNode_values = null;
    hasReachedUseAfter_Location_CFGNode_values = null;
    weakSucc_computed = false;
    weakSucc_value = null;
    collect_BackwardEdge_CFGNode_values = null;
    collect_ForwardEdge_CFGNode_values = null;
    precedingDefsUpTo_CFGNode_values = null;
    isAnticipated_VariableDeclaration_values = null;
    makesAnticipated_VariableDeclaration_values = null;
    killsAnticipated_VariableDeclaration_values = null;
    isAvailable_ASTNode_values = null;
    uncheckedExnTarget_computed = false;
    uncheckedExnTarget_value = null;
    following_computed = false;
    following_value = null;
    CFGNode_collPred_computed = false;
    CFGNode_collPred_value = null;
    CFGNode_collPred_contributors = null;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
    CFGNode_collPred_computed = false;
    CFGNode_collPred_value = null;
    CFGNode_collPred_contributors = null;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Expr clone() throws CloneNotSupportedException {
    Expr node = (Expr)super.clone();
    node.isArrayInit_computed = false;
    node.shouldMakeConversionExplicit_TypeDecl_values = null;
    node.getMonitor_computed = false;
    node.getMonitor_value = null;
    node.computeType_int_values = null;
    node.possibleTypes_computed = false;
    node.possibleTypes_value = null;
    node.exceptionalSucc_computed = false;
    node.exceptionalSucc_value = null;
    node.succ_computed = false;
    node.succ_value = null;
    node.dotLabel_computed = false;
    node.dotLabel_value = null;
    node.dotNode_computed = false;
    node.dotNode_value = null;
    node.reachingDefinitionsFor_Location_values = null;
    node.reachedUsesFor_Location_values = null;
    node.hasReachingDefinitionBefore_Location_CFGNode_values = null;
    node.hasReachedUseAfter_Location_CFGNode_values = null;
    node.weakSucc_computed = false;
    node.weakSucc_value = null;
    node.collect_BackwardEdge_CFGNode_values = null;
    node.collect_ForwardEdge_CFGNode_values = null;
    node.precedingDefsUpTo_CFGNode_values = null;
    node.isAnticipated_VariableDeclaration_values = null;
    node.makesAnticipated_VariableDeclaration_values = null;
    node.killsAnticipated_VariableDeclaration_values = null;
    node.isAvailable_ASTNode_values = null;
    node.uncheckedExnTarget_computed = false;
    node.uncheckedExnTarget_value = null;
    node.following_computed = false;
    node.following_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @ast method 
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:461
   */
  public SimpleSet keepAccessibleTypes(SimpleSet oldSet) {
    SimpleSet newSet = SimpleSet.emptySet;
    TypeDecl hostType = hostType();
    for(Iterator iter = oldSet.iterator(); iter.hasNext(); ) {
      TypeDecl t = (TypeDecl)iter.next();
      if((hostType != null && t.accessibleFrom(hostType)) || (hostType == null && t.accessibleFromPackage(hostPackage())))
        newSet = newSet.add(t);
    }
    return newSet;
  }
  /**
   * Remove fields that are not accessible when using this Expr as qualifier
   * @return a set containing the accessible fields
   * @ast method 
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:169
   */
  public SimpleSet keepAccessibleFields(SimpleSet oldSet) {
    SimpleSet newSet = SimpleSet.emptySet;
    for(Iterator iter = oldSet.iterator(); iter.hasNext(); ) {
      Variable v = (Variable)iter.next();
      if(v instanceof FieldDeclaration) {
        FieldDeclaration f = (FieldDeclaration)v;
        if(mayAccess(f))
          newSet = newSet.add(f);
      }
    }
    return newSet;
  }
  /**
   * @see "JLS $6.6.2.1"
   * @return true if the expression may access the given field
   * @ast method 
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:196
   */
  public boolean mayAccess(FieldDeclaration f) {
    if(f.isPublic()) {
      return true;
    } else if(f.isProtected()) {
      if(f.hostPackage().equals(hostPackage()))
        return true;
      return hostType().mayAccess(this, f);
    } else if(f.isPrivate()) {
      return f.hostType().topLevelType() == hostType().topLevelType();
    } else {
      return f.hostPackage().equals(hostType().hostPackage());
    }
  }
  /**
   * @ast method 
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:106
   */
  public Dot qualifiesAccess(Access access) {
    Dot dot = new Dot(this, access);
    dot.setStart(this.getStart());
    dot.setEnd(access.getEnd());
    return dot;
  }
  /**
   * @ast method 
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:91
   */
  protected SimpleSet chooseConstructor(Collection constructors, List argList) {
    SimpleSet potentiallyApplicable = SimpleSet.emptySet;
    // select potentially applicable constructors
    for(Iterator iter = constructors.iterator(); iter.hasNext(); ) {
      ConstructorDecl decl = (ConstructorDecl)iter.next();
      if(decl.potentiallyApplicable(argList) && decl.accessibleFrom(hostType()))
        potentiallyApplicable = potentiallyApplicable.add(decl);
    }
    // first phase
    SimpleSet maxSpecific = SimpleSet.emptySet;
    for(Iterator iter = potentiallyApplicable.iterator(); iter.hasNext(); ) {
      ConstructorDecl decl = (ConstructorDecl)iter.next();
      if(decl.applicableBySubtyping(argList))
        maxSpecific = mostSpecific(maxSpecific, decl);
    }

    // second phase
    if(maxSpecific.isEmpty()) {
      for(Iterator iter = potentiallyApplicable.iterator(); iter.hasNext(); ) {
        ConstructorDecl decl = (ConstructorDecl)iter.next();
        if(decl.applicableByMethodInvocationConversion(argList))
          maxSpecific = mostSpecific(maxSpecific, decl);
      }
    }

    // third phase
    if(maxSpecific.isEmpty()) {
      for(Iterator iter = potentiallyApplicable.iterator(); iter.hasNext(); ) {
        ConstructorDecl decl = (ConstructorDecl)iter.next();
        if(decl.isVariableArity() && decl.applicableVariableArity(argList))
          maxSpecific = mostSpecific(maxSpecific, decl);
      }
    }
    return maxSpecific;
  }
  /**
   * @ast method 
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:128
   */
  protected static SimpleSet mostSpecific(SimpleSet maxSpecific, ConstructorDecl decl) {
    if(maxSpecific.isEmpty())
      maxSpecific = maxSpecific.add(decl);
    else {
      if(decl.moreSpecificThan((ConstructorDecl)maxSpecific.iterator().next()))
        maxSpecific = SimpleSet.emptySet.add(decl);
      else if(!((ConstructorDecl)maxSpecific.iterator().next()).moreSpecificThan(decl))
        maxSpecific = maxSpecific.add(decl);
    }
    return maxSpecific;
  }
  /**
   * @ast method 
   * @aspect BlockExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/BlockExt.jrag:25
   */
  public Block enclosingBlock() {
		return enclosingStmt().enclosingBlock();
	}
  /**
   * @ast method 
   * @aspect ExprExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:90
   */
  public boolean isArgument() {
		return getParent() instanceof List && getParent().getParent() instanceof Call;
	}
  /**
   * @ast method 
   * @aspect TypeVariableExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeVariableExt.jrag:120
   */
  public boolean isInaccessibleTypeVariable(TypeDecl td) {
		if(!td.isTypeVariable())
			return false;
		return lookupType(td.name()) != td;
	}
  /**
   * @ast method 
   * @aspect IntroduceParameter
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ChangeMethodSignature/IntroduceParameter.jrag:2
   */
  public void introduceParameter(String name) {
		if(inextractible() || !isFlowInvariant())
			throw new RefactoringException("expression cannot be extracted");
		if(!(hostBodyDecl() instanceof MethodDecl))
			throw new RefactoringException("cannot introduce parameter for non-method");
		MethodDecl md = (MethodDecl)hostBodyDecl();
		if(md.relatives().size() != 1)
			throw new RefactoringException("cannot introduce parameter in methods with relatives");
		programRoot().lockMethodNames(md.name());
		TypeDecl td = effectiveType();
		int idx = md.isVariableArity() ? md.getNumParameter()-1 : md.getNumParameter();
		if(!md.parameterDeclaration(name).isEmpty())
			throw new RefactoringException("parameter of same name exists");
		ParameterDeclaration pd = new ParameterDeclaration(td.createLockedAccess(), name);
		md.getParameterList().insertChild(pd, idx);
		for(MethodAccess ma : md.uses())
			ma.getArgList().insertChild((Expr)lockedCopy(), idx);
		replaceWith(pd.createLockedAccess());
	}
  /**
   * @ast method 
   * @aspect IntroduceParameter
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ChangeMethodSignature/IntroduceParameter.jrag:22
   */
  public void doIntroduceParameter(String name) {
		Program root = programRoot();
		introduceParameter(name);
		root.eliminate(LOCKED_NAMES);
	}
  /**
   * @ast method 
   * @aspect ExtractAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractTemp/ExtractAssignment.jrag:3
   */
  public VariableDeclaration extractAssignment(VariableDeclaration v, Stmt insertBefore) {
		if(inextractible())
			throw new RefactoringException("expression is not extractible");
		
		if(getParent() instanceof ExprStmt) {
			ExprStmt parent = (ExprStmt)getParent();
			parent.setExpr(new AssignSimpleExpr(v.createLockedAccess(), this));
		} else {
				
			Block block = enclosingBlock();
			if(block == null)
				throw new RefactoringException("cannot extract assignment here");
			// TODO: the following (if commented out?) is unsound; keep it for Eclipse compliance
//			if(!locationsWritten().isEmpty())
//				throw new RefactoringException("cannot extract expression with side effects");
			
			// lock and insert assignment before this stmt
			lockAllNames();
			lockThrowEdges();
			block.lockSyncDependencies();
			VarAccess vacc = v.createLockedAccess();
			replaceWith(vacc);
			VarAccess vaccDef = v.createLockedAccess();
			insertBefore.insertStmtBefore(AssignExpr.asStmt(vaccDef, this));
			
			block.hostType().flushCaches();
			
			// check we could inline back
			if(!vacc.isAvailable(this))
				throw new RefactoringException("extracted expression is not available");
			
			SmallSet<Access> U = vaccDef.reachedUses();
			assert(U.size() == 0 || U.size() == 1);
			if(U.size() != 1)
				throw new RefactoringException("extracted value is used more than once");
			Access u = U.iterator().next();
			
			SmallSet<CFGNode> C = this.collectExceptionalSucc();
			if(!C.isEmpty() && !vacc.isAnticipated((VariableDeclaration)vaccDef.decl()))
				throw new RefactoringException("expression may throw exception, but is not inlined along all paths");
			for(CFGNode c : C)
				for(CFGNode w : u.precedingDefsUpTo(v))
					if(!c.reachedUsesFor(((Access)w).getLocation()).isEmpty())
						throw new RefactoringException("write to live variable may be lost");
			
			if(u.isDest())
				throw new RefactoringException("cannot extract as expr is a destination");
			if(!u.reachingDefinitions().isSingleton())
				throw new RefactoringException("ambiguous dataflow");
			if(u.hostBodyDecl() != insertBefore.hostBodyDecl())
				throw new RefactoringException("cannot inline across method boundaries");
			
			hostType().flushCaches();
			
			block.unlockSyncDependencies();
				
		
		}
		
		return v;
	}
  /**
   * @ast method 
   * @aspect ExtractConstant
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractTemp/ExtractConstant.jrag:2
   */
  public void extractConstant(String name) {
		if(inextractible())
			throw new RefactoringException("not extractible");
		lockAllNames();
		lockDataFlow();
		TypeDecl host = hostType();
		Opt<Expr> fd_init = new Opt<Expr>();
		Modifiers mods = new Modifiers("static", "final");
		mods.addModifier(hostType().isInterfaceDecl() ? "public" : "private");
		FieldDeclaration fd = new FieldDeclaration(mods, effectiveType().createLockedAccess(), name, fd_init);
		replaceWith(fd.createLockedAccess());
		fd_init.setChild(this, 0);
		host.insertField(fd);
		host.flushCaches();
	}
  /**
   * @ast method 
   * @aspect ExtractConstant
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractTemp/ExtractConstant.jrag:18
   */
  public void doExtractConstant(String name) {
		Program root = programRoot();
		extractConstant(name);
		root.eliminate(LOCKED_NAMES, LOCKED_DATAFLOW);
	}
  /**
   * @ast method 
   * @aspect ExtractTemp
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractTemp/ExtractTemp.jrag:2
   */
  public VariableDeclaration extractTemp(String name, boolean makeFinal) {
		TypeDecl type = effectiveType();
		return insertUnusedLocal(new VariableDeclaration(type.createLockedAccess(), name)).
			   extractAssignment(this).merge().makeFinal(makeFinal);
	}
  /**
   * @ast method 
   * @aspect ExtractTemp
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractTemp/ExtractTemp.jrag:8
   */
  public VariableDeclaration extractTemp(String name) {
		return extractTemp(name, false);
	}
  /**
   * @ast method 
   * @aspect ExtractTemp
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractTemp/ExtractTemp.jrag:13
   */
  public VariableDeclaration doExtract(String name, boolean makeFinal) {
    	Program root = programRoot();
    	VariableDeclaration decl = extractTemp(name, makeFinal);
    	root.eliminate(LOCKED_DATAFLOW, LOCKED_NAMES, LOCKED_THROW);
    	return decl;
    }
  /**
   * @ast method 
   * @aspect ExtractTemp
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractTemp/ExtractTemp.jrag:20
   */
  public VariableDeclaration doExtract(String name) {
    	return doExtract(name, false);
    }
  /**
   * @ast method 
   * @aspect InsertUnusedLocal
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractTemp/IntroduceUnusedLocal.jrag:17
   */
  public VariableDeclaration insertUnusedLocal(VariableDeclaration decl) {
		Stmt s = enclosingStmt();
		if(s == null)
			throw new RefactoringException("no surrounding statement");
		return s.insertUnusedLocal(decl);
	}
  /**
   * @ast method 
   * @aspect ArrayInits
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/ArrayInits.jrag:5
   */
  public Expr wrapArrayInit() {
		  if(isArrayInit())
			  return new ArrayCreationExpr(type().createLockedAccess(), new Opt(this));
		  return this;
	  }
  /**
   * @ast method 
   * @aspect MakeConversionExplicit
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/MakeConversionExplicit.jrag:9
   */
  public Expr makeConversionExplicit(TypeDecl destType) {
		if(shouldMakeConversionExplicit(destType))
			return createConversion(destType, this);
		return this;
	}
  /**
   * @ast method 
   * @aspect With
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:130
   */
  public void eliminateWith(List<Access> qualifiers, TypeDecl hostType) {
		if(isThisAccess()) {
			for(int i=qualifiers.getNumChild()-1;i>=0;--i) {
				Access qual = qualifiers.getChild(i);
				TypeDecl qual_type = qual.type().isParameterizedType() ? ((ParTypeDecl)qual.type()).genericDecl() : qual.type();
				if(qual_type.subtype(this.type())) {
					if(qual.isThisAccess() && qual_type == this.type())
						return;
					if(isLeftChildOfDot())
						replace(getParent()).with(((Expr)qual.fullCopyAndDetach()).qualifiesAccess(parentDot().getRight()));
					else
						replaceWith(qual.fullCopyAndDetach());
					return;
				}
			}
			throw new RefactoringException("cannot eliminate this");
		} else if(isSuperAccess()) {
			for(int i=qualifiers.getNumChild()-1;i>=0;--i) {
				Access qual = qualifiers.getChild(i);
				TypeDecl qual_type = qual.type().isParameterizedType() ? ((ParTypeDecl)qual.type()).genericDecl() : qual.type();
				if(!qual_type.isClassDecl() || !((ClassDecl)qual_type).hasSuperclass())
					continue;
				ClassDecl cd = (ClassDecl)qual_type;
				if(this.type().equals(cd.superclass())) {
					if(((Access)this).qualifiesMethodAccess()) {
						if(qual.isThisAccess()) {
							Access qual_super = (Access)qual.convertThisToSuper();
							if(qual_super != null) {
								if(isLeftChildOfDot())
									replace(getParent()).with(qual_super.qualifiesAccess(parentDot().getRight()));
								return;
							}
						}
//						if (false) //ConditionMT 15
						throw new RefactoringException("cannot eliminate with on super method calls");
					} else {
						replaceWith(new ParExpr(new CastExpr(cd.superclass().createLockedAccess(),
															 (Expr)qual.fullCopyAndDetach())));
					}
					return;
				}
			}
			throw new RefactoringException("cannot eliminate super");
		} else {
			super.eliminateWith(qualifiers, hostType);
		}
	}
  /**
   * @ast method 
   * @aspect Lookup
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/Lookup.jrag:3
   */
  public SimpleSet lookupName(String name) {
		if(!isValidName(name))
			return SimpleSet.emptySet;
		NameType nt = this.nameType();
		if(nt == NameType.PACKAGE_NAME) {
			return lookupPackage(name);
		} else if(nt == NameType.TYPE_NAME) {
			return lookupType(name);
		} else if(nt == NameType.PACKAGE_OR_TYPE_NAME) {
			if(!lookupType(name).isEmpty())
				return lookupType(name);
			return lookupPackage(name);
		} else if(nt == NameType.AMBIGUOUS_NAME) {
			if(!lookupVariable(name).isEmpty())
				return lookupVariable(name);
			if(!lookupType(name).isEmpty())
				return lookupType(name);
			return lookupPackage(name);
		} else if(nt == NameType.METHOD_NAME) {
			return new SimpleSet.SimpleSetImpl(lookupMethod(name));
		} else if(nt == NameType.EXPRESSION_NAME) {
			return lookupVariable(name);
		}
		throw new Error("unsupported name type");
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:228
   */
  public void unparenthesise() {
		if(getParent() instanceof ParExpr) {
			getParent().replaceWith(this);
			unparenthesise();
		}
	}
  /**
   * @ast method 
   * @aspect TypeConstraintSolving
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/TypeConstraintSolving.jrag:102
   */
  protected void collectAllUpdatableExprs(TypeDecl type, Collection<TypeConstraintVariable> res) {
		if(type() == type)
			if(!isFixed())
				res.add(this);
		super.collectAllUpdatableExprs(type, res);
	}
  /**
   * @ast method 
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:50
   */
  public SmallSet<CFGNode> pred() { return collPred(); }
  /**
   * @ast method 
   * @aspect DotGeneration
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/DotGeneration.jrag:66
   */
  public void dot() {
		String thisName = String.valueOf(hashCode());
		for(CFGNode that : succ())
			System.out.println("\t" + this.dotNode() + " -> " + that.dotNode() + ";");
		super.dot();
	}
  /**
   * @ast method 
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:14
   */
  public void lockControlFlow() {
		if(lockedSucc == null)
			lockedSucc = weakSucc();
		super.lockControlFlow();
	}
  /**
   * @ast method 
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:20
   */
  public void unlockControlFlow() {
		if(lockedSucc != null) {
			if(!lockedSucc.equals(weakSucc()))
				throw new RefactoringException("control flow successors not preserved");
			lockedSucc = null;
		}
		super.unlockControlFlow();
	}
  /**
   * @ast method 
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:69
   */
  public void lockThrowEdges() {
		if(lockedThrowEdges == null) {
			SmallSet<CFGNode> throwEdges = exceptionalSucc();
			if(!throwEdges.isEmpty())
				lockedThrowEdges = throwEdges;
		}
		super.lockThrowEdges();
	}
  /**
   * @ast method 
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:78
   */
  public void unlockThrowEdges() {
		if(lockedThrowEdges != null) {
			if(!exceptionalSucc().equals(lockedThrowEdges))
				throw new RefactoringException("throw edges have changed");
			lockedThrowEdges = null;
		}
		super.unlockThrowEdges();
	}
  /**
   * @ast method 
   * @aspect DependencyEdges
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DependencyEdges.jrag:86
   */
  public IdentityHashMap<DependencyEdge, SmallSet<CFGNode>> getDependencies() {
		if(dependencies == null)
			dependencies = new IdentityHashMap<DependencyEdge, SmallSet<CFGNode>>();
		return dependencies;
	}
  /**
   * @ast method 
   * @aspect DependencyEdges
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DependencyEdges.jrag:100
   */
  public void lockDependencies(DependencyEdge... edges) {
		for(DependencyEdge e : edges)
			if(e.isStart(this))
				getDependencies().put(e, e.collect(this));
		super.lockDependencies(edges);
	}
  /**
   * @ast method 
   * @aspect DependencyEdges
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DependencyEdges.jrag:115
   */
  public void unlockDependencies(PreservationStrategy r) {
		DependencyEdge e = r.getEdge();
		if(e.isStart(this)) {
			SmallSet<CFGNode> old_edges = getDependencies().get(e);
			if(old_edges != null) {
				SmallSet<CFGNode> new_edges = e.collect(this);
				if(r.preserve(this) && !old_edges.subsetOf(new_edges))
					throw new RefactoringException("couldn't preserve edge: "+e);
				if(r.reflect(this) && !new_edges.subsetOf(old_edges))
					throw new RefactoringException("couldn't reflect edge: "+e);
			}
		}
		super.unlockDependencies(r);
	}
  /**
   * @ast method 
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:54
   */
  public SmallSet<CFGNode> collectExceptionalSucc() {
		return exceptionalSucc().union(super.collectExceptionalSucc());
	}
  /**
   * @ast method 
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:99
   */
  public boolean makesAvailable(ASTNode e) {
		return this == e;
	}
  /**
   * @ast method 
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:103
   */
  public boolean makesUnavailable(ASTNode e) {
		for(Location l : (Collection<Location>)e.locationsRead())
			if(isReachingDefinitionFor(l))
				return true;
		return false;
	}
  /**
   * @ast method 
   * 
   */
  public Expr() {
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
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  protected int numChildren() {
    return 0;
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
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:276
   */
  @SuppressWarnings({"unchecked", "cast"})
  public abstract TypeDecl type();
  /**
   * @attribute syn
   * @aspect Precedence
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Precedence.jrag:2
   */
  @SuppressWarnings({"unchecked", "cast"})
  public abstract int precedence();
  /**
   * @attribute syn
   * @aspect ConstantExpression
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ConstantExpression.jrag:98
   */
  public Constant constant() {
    ASTNode$State state = state();
    try {
    throw new UnsupportedOperationException("ConstantExpression operation constant" +
      " not supported for type " + getClass().getName()); 
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ConstantExpression
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ConstantExpression.jrag:241
   */
  public boolean isPositive() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /* 
   * representableIn(T) is true if and only if the the expression is a 
   * compile-time constant of type byte, char, short or int, and the value  
   * of the expression can be represented (by an expression) in the type T
   * where T must be byte, char or short.
   * @attribute syn
   * @aspect ConstantExpression
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ConstantExpression.jrag:454
   */
  public boolean representableIn(TypeDecl t) {
    ASTNode$State state = state();
    try {	
  	if (!type().isByte() && !type().isChar() && !type().isShort() && !type().isInt()) {
  		return false;
  	}
  	if (t.isByte())
  		return constant().intValue() >= Byte.MIN_VALUE && constant().intValue() <= Byte.MAX_VALUE;
  	if (t.isChar())
  		return constant().intValue() >= Character.MIN_VALUE && constant().intValue() <= Character.MAX_VALUE;
  	if (t.isShort())
  		return constant().intValue() >= Short.MIN_VALUE && constant().intValue() <= Short.MAX_VALUE;
    if(t.isInt()) 
      return constant().intValue() >= Integer.MIN_VALUE && constant().intValue() <= Integer.MAX_VALUE;
	  return false;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ConstantExpression
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ConstantExpression.jrag:482
   */
  public boolean isConstant() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ConstantExpression
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ConstantExpression.jrag:511
   */
  public boolean isTrue() {
    ASTNode$State state = state();
    try {  return isConstant() && type() instanceof BooleanType && constant().booleanValue();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ConstantExpression
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ConstantExpression.jrag:512
   */
  public boolean isFalse() {
    ASTNode$State state = state();
    try {  return isConstant() && type() instanceof BooleanType && !constant().booleanValue();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DefiniteAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:58
   */
  public Variable varDecl() {
    ASTNode$State state = state();
    try {  return null;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:333
   */
  public boolean isDAafterFalse(Variable v) {
    ASTNode$State state = state();
    try {  return isTrue() || isDAbefore(v);  }
    finally {
    }
  }
  /*eq Stmt.isDAafter(Variable v) {
    //System.out.println("### isDAafter reached in " + getClass().getName());
    //throw new NullPointerException();
    throw new Error("Can not compute isDAafter for " + getClass().getName() + " at " + errorPrefix());
  }* @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:332
   */
  public boolean isDAafterTrue(Variable v) {
    ASTNode$State state = state();
    try {  return isFalse() || isDAbefore(v);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:235
   */
  public boolean isDAafter(Variable v) {
    ASTNode$State state = state();
    try {  return (isDAafterFalse(v) && isDAafterTrue(v)) || isDAbefore(v);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:703
   */
  public boolean isDUafterFalse(Variable v) {
    ASTNode$State state = state();
    try {
    if(isTrue())
      return true;
    return isDUbefore(v);
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:702
   */
  public boolean isDUafterTrue(Variable v) {
    ASTNode$State state = state();
    try {
    if(isFalse())
      return true;
    return isDUbefore(v);
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:694
   */
  public boolean isDUafter(Variable v) {
    ASTNode$State state = state();
    try {  return (isDUafterFalse(v) && isDUafterTrue(v)) || isDUbefore(v);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ConstructScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:32
   */
  public SimpleSet mostSpecificConstructor(Collection constructors) {
    ASTNode$State state = state();
    try {
    SimpleSet maxSpecific = SimpleSet.emptySet;
    for(Iterator iter = constructors.iterator(); iter.hasNext(); ) {
      ConstructorDecl decl = (ConstructorDecl)iter.next();
      if(applicableAndAccessible(decl)) {
        if(maxSpecific.isEmpty())
          maxSpecific = maxSpecific.add(decl);
        else {
          if(decl.moreSpecificThan((ConstructorDecl)maxSpecific.iterator().next()))
            maxSpecific = SimpleSet.emptySet.add(decl);
          else if(!((ConstructorDecl)maxSpecific.iterator().next()).moreSpecificThan(decl))
            maxSpecific = maxSpecific.add(decl);
        }
      }
    }
    return maxSpecific;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ConstructScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:50
   */
  public boolean applicableAndAccessible(ConstructorDecl decl) {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect LookupFullyQualifiedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:83
   */
  public boolean hasQualifiedPackage(String packageName) {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:430
   */
  public SimpleSet qualifiedLookupType(String name) {
    ASTNode$State state = state();
    try {  return keepAccessibleTypes(type().memberTypes(name));  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:148
   */
  public SimpleSet qualifiedLookupVariable(String name) {
    ASTNode$State state = state();
    try {
    if(type().accessibleFrom(hostType()))
      return keepAccessibleFields(type().memberFields(name));
    return SimpleSet.emptySet;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Names
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/QualifiedNames.jrag:25
   */
  public String packageName() {
    ASTNode$State state = state();
    try {  return "";  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Names
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/QualifiedNames.jrag:62
   */
  public String typeName() {
    ASTNode$State state = state();
    try {  return "";  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:13
   */
  public boolean isTypeAccess() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:17
   */
  public boolean isMethodAccess() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:21
   */
  public boolean isFieldAccess() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:25
   */
  public boolean isSuperAccess() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:31
   */
  public boolean isThisAccess() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:37
   */
  public boolean isPackageAccess() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:41
   */
  public boolean isArrayAccess() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:45
   */
  public boolean isClassAccess() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:49
   */
  public boolean isSuperConstructorAccess() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:55
   */
  public boolean isLeftChildOfDot() {
    ASTNode$State state = state();
    try {  return hasParentDot() && parentDot().getLeft() == this;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:56
   */
  public boolean isRightChildOfDot() {
    ASTNode$State state = state();
    try {  return hasParentDot() && parentDot().getRight() == this;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:69
   */
  public AbstractDot parentDot() {
    ASTNode$State state = state();
    try {  return getParent() instanceof AbstractDot ? (AbstractDot)getParent() : null;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:70
   */
  public boolean hasParentDot() {
    ASTNode$State state = state();
    try {  return parentDot() != null;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:72
   */
  public Access nextAccess() {
    ASTNode$State state = state();
    try {  return parentDot().nextAccess();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:73
   */
  public boolean hasNextAccess() {
    ASTNode$State state = state();
    try {  return isLeftChildOfDot();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect NestedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:503
   */
  public Stmt enclosingStmt() {
    ASTNode$State state = state();
    try {
    ASTNode node = this;
    while(node != null && !(node instanceof Stmt))
      node = node.getParent();
    return (Stmt)node;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:15
   */
  public boolean isVariable() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeHierarchyCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:20
   */
  public boolean isUnknown() {
    ASTNode$State state = state();
    try {  return type().isUnknown();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeHierarchyCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:150
   */
  public boolean staticContextQualifier() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Enums
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Enums.jrag:500
   */
  public boolean isEnumConstant() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:90
   */
  public boolean isReachingDefinitionFor(Location l) {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:91
   */
  public boolean isBlockingDefinitionFor(Location l) {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:92
   */
  public boolean isReachedUseFor(Location l) {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ExprExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:2
   */
  public boolean isStatementExpression() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ExprExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:12
   */
  public boolean inextractible() {
    ASTNode$State state = state();
    try {  return notAnObject() || inInextractiblePosition();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ExprExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:15
   */
  public boolean notAnObject() {
    ASTNode$State state = state();
    try {  return type().isVoid();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ExprExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:45
   */
  public boolean isFlowInvariant() {
    ASTNode$State state = state();
    try {  return isConstant();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ExprExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:80
   */
  public Expr convertSuperToThis() {
    ASTNode$State state = state();
    try {  return this;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ExprExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:85
   */
  public Expr convertThisToSuper() {
    ASTNode$State state = state();
    try {  return null;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ExprExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:94
   */
  public boolean isParameterType() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Purity
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Purity.jrag:2
   */
  public boolean isPure() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeExt.jrag:61
   */
  public TypeDecl effectiveType() {
    ASTNode$State state = state();
    try {
		TypeDecl type = type();
		if(type.isAnonymous())
			return ((AnonymousDecl)type).superType();
		else if(isInaccessibleTypeVariable(type))
			return ((TypeVariable)type).uniqueUpperBound();
		return type;
	}
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect VariableExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/VariableExt.jrag:45
   */
  public boolean isFieldAccessInThis(FieldDeclaration fd) {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean isArrayInit_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isArrayInit_value;
  /**
   * @attribute syn
   * @aspect ArrayInits
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/ArrayInits.jrag:2
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isArrayInit() {
    if(isArrayInit_computed) {
      return isArrayInit_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    isArrayInit_value = isArrayInit_compute();
      if(isFinal && num == state().boundariesCrossed) isArrayInit_computed = true;
    return isArrayInit_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isArrayInit_compute() {  return false;  }
  protected java.util.Map shouldMakeConversionExplicit_TypeDecl_values;
  /**
   * @attribute syn
   * @aspect MakeConversionExplicit
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/MakeConversionExplicit.jrag:15
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean shouldMakeConversionExplicit(TypeDecl destType) {
    Object _parameters = destType;
    if(shouldMakeConversionExplicit_TypeDecl_values == null) shouldMakeConversionExplicit_TypeDecl_values = new java.util.HashMap(4);
    if(shouldMakeConversionExplicit_TypeDecl_values.containsKey(_parameters)) {
      return ((Boolean)shouldMakeConversionExplicit_TypeDecl_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean shouldMakeConversionExplicit_TypeDecl_value = shouldMakeConversionExplicit_compute(destType);
      if(isFinal && num == state().boundariesCrossed) shouldMakeConversionExplicit_TypeDecl_values.put(_parameters, Boolean.valueOf(shouldMakeConversionExplicit_TypeDecl_value));
    return shouldMakeConversionExplicit_TypeDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean shouldMakeConversionExplicit_compute(TypeDecl destType) {  return !type().equals(destType);  }
  /**
   * @apilevel internal
   */
  protected boolean getMonitor_computed = false;
  /**
   * @apilevel internal
   */
  protected Monitor getMonitor_value;
  /**
   * @attribute syn
   * @aspect Monitor
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/Monitor.jrag:81
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Monitor getMonitor() {
    if(getMonitor_computed) {
      return getMonitor_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    getMonitor_value = getMonitor_compute();
      if(isFinal && num == state().boundariesCrossed) getMonitor_computed = true;
    return getMonitor_value;
  }
  /**
   * @apilevel internal
   */
  private Monitor getMonitor_compute() {
		TypeDecl tp = type();
		if(tp.isObject())
			tp = computeType(1);
		// if expression is of type Class<A> for a type access A, return class monitor for A
		if(tp.isParameterizedType()) {
			ParTypeDecl ptd = (ParTypeDecl)tp;
			if(ptd.genericDecl().fullName().equals("java.lang.Class")) {
				TypeDecl argtp = ptd.getArgument(0).type();
				if(argtp.isClassDecl() || argtp.isInterfaceDecl())
					return new ClassMonitor(argtp);
			}
		}
		// otherwise just use general monitor
		return new Monitor(tp);
	}
  protected java.util.Map computeType_int_values;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/TypeAnalysis.jrag:19
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl computeType(int i) {
    Object _parameters = Integer.valueOf(i);
    if(computeType_int_values == null) computeType_int_values = new java.util.HashMap(4);
    if(computeType_int_values.containsKey(_parameters)) {
      return (TypeDecl)computeType_int_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    TypeDecl computeType_int_value = computeType_compute(i);
      if(isFinal && num == state().boundariesCrossed) computeType_int_values.put(_parameters, computeType_int_value);
    return computeType_int_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl computeType_compute(int i) {  return type();  }
  /**
   * @apilevel internal
   */
  protected boolean possibleTypes_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<TypeDecl> possibleTypes_value;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/TypeAnalysis.jrag:86
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<TypeDecl> possibleTypes() {
    if(possibleTypes_computed) {
      return possibleTypes_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    possibleTypes_value = possibleTypes_compute();
      if(isFinal && num == state().boundariesCrossed) possibleTypes_computed = true;
    return possibleTypes_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<TypeDecl> possibleTypes_compute() {  return null;  }
  /**
   * @attribute syn
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:263
   */
  public SymbolicVarAccess qualifiedAccessVariable(Variable decl) {
    ASTNode$State state = state();
    try {
		if(type().accessibleFrom(hostType()))
			return type().accessMemberField(decl).ensureAccessible(this);
		return unknownVarAccess();
	}
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/TypeConstraints.jrag:184
   */
  public TypeDecl getConstrainedType() {
    ASTNode$State state = state();
    try {  return type();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/TypeConstraints.jrag:185
   */
  public String describeConstraintVariable() {
    ASTNode$State state = state();
    try {  return "[" + this + "]";  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/TypeConstraints.jrag:186
   */
  public boolean isFixed() {
    ASTNode$State state = state();
    try {
		if(!fromSource() || !type().isSubtypeConstrainable())
			return true;
		if(isTypeAccess()) {
			// only types of declarations and types appearing in casts are variable
			// method return types are not adjusted (see ExtractInterfaceTests.test9)
			if(getParent() instanceof Variable) {
				Variable v = (Variable)getParent();
				return this != v.getTypeAccess() 
					|| v.isSubstituted() 
					|| v instanceof VariableArityParameterDeclaration;
			}
			if(getParent() instanceof CastExpr)
				return this != ((CastExpr)getParent()).getTypeAccess();
			return true;
		}
		return false;
	}
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean exceptionalSucc_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<CFGNode> exceptionalSucc_value;
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:30
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> exceptionalSucc() {
    if(exceptionalSucc_computed) {
      return exceptionalSucc_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    exceptionalSucc_value = exceptionalSucc_compute();
      if(isFinal && num == state().boundariesCrossed) exceptionalSucc_computed = true;
    return exceptionalSucc_value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> exceptionalSucc_compute() {  return SmallSet.<CFGNode>empty();  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:34
   */
  public CFGNode first() {
    ASTNode$State state = state();
    try {  return this;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean succ_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<CFGNode> succ_value;
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:57
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> succ() {
    if(succ_computed) {
      return succ_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    succ_value = succ_compute();
      if(isFinal && num == state().boundariesCrossed) succ_computed = true;
    return succ_value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> succ_compute() {  return following().union(exceptionalSucc());  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:777
   */
  public SmallSet<Stmt> succStmt() {
    ASTNode$State state = state();
    try {
		SmallSet<Stmt> res = new SmallSet<Stmt>();
		for(CFGNode n : succ()) {
			if(n instanceof Stmt)
				res = res.union((Stmt)n);
			else
				res = res.union(n.succStmt());
		}
		return res;
	}
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:788
   */
  public SmallSet<Stmt> predStmt() {
    ASTNode$State state = state();
    try {
		SmallSet<Stmt> res = new SmallSet<Stmt>();
		for(CFGNode n : pred()) {
			if(n instanceof Stmt)
				res = res.union((Stmt)n);
			else
				res = res.union(n.predStmt());
		}
		return res;
	}
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean dotLabel_computed = false;
  /**
   * @apilevel internal
   */
  protected String dotLabel_value;
  /**
   * @attribute syn
   * @aspect DotGeneration
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/DotGeneration.jrag:25
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String dotLabel() {
    if(dotLabel_computed) {
      return dotLabel_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    dotLabel_value = dotLabel_compute();
      if(isFinal && num == state().boundariesCrossed) dotLabel_computed = true;
    return dotLabel_value;
  }
  /**
   * @apilevel internal
   */
  private String dotLabel_compute() {
		String label = toString();
		label = label.replace('"', '\'').replace('\n', ' ');
		if(label.length() > 20)
			label = label.substring(0, 10) + label.substring(label.length()-10, label.length());
		return label;
	}
  /**
   * @apilevel internal
   */
  protected boolean dotNode_computed = false;
  /**
   * @apilevel internal
   */
  protected String dotNode_value;
  /**
   * @attribute syn
   * @aspect DotGeneration
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/DotGeneration.jrag:53
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String dotNode() {
    if(dotNode_computed) {
      return dotNode_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    dotNode_value = dotNode_compute();
      if(isFinal && num == state().boundariesCrossed) dotNode_computed = true;
    return dotNode_value;
  }
  /**
   * @apilevel internal
   */
  private String dotNode_compute() {
		String n = String.valueOf(hashCode());
		String label = dotLabel();
		System.out.println("\t" + n + "[label=\"" + label + "\"];");
		return n;
	}
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:2
   */
  public boolean isDef() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  protected java.util.Map reachingDefinitionsFor_Location_values;
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:53
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> reachingDefinitionsFor(Location l) {
    Object _parameters = l;
    if(reachingDefinitionsFor_Location_values == null) reachingDefinitionsFor_Location_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(reachingDefinitionsFor_Location_values.containsKey(_parameters)) {
      Object _o = reachingDefinitionsFor_Location_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return (SmallSet<CFGNode>)_o;
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      reachingDefinitionsFor_Location_values.put(_parameters, _value);
      _value.value = SmallSet.<CFGNode>empty();
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      SmallSet<CFGNode> new_reachingDefinitionsFor_Location_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_reachingDefinitionsFor_Location_value = reachingDefinitionsFor_compute(l);
        if ((new_reachingDefinitionsFor_Location_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_reachingDefinitionsFor_Location_value!=null && !new_reachingDefinitionsFor_Location_value.equals((SmallSet<CFGNode>)_value.value))) {
          state.CHANGE = true;
          _value.value = new_reachingDefinitionsFor_Location_value;
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        reachingDefinitionsFor_Location_values.put(_parameters, new_reachingDefinitionsFor_Location_value);
      }
      else {
        reachingDefinitionsFor_Location_values.remove(_parameters);
      state.RESET_CYCLE = true;
      reachingDefinitionsFor_compute(l);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_reachingDefinitionsFor_Location_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      SmallSet<CFGNode> new_reachingDefinitionsFor_Location_value = reachingDefinitionsFor_compute(l);
      if (state.RESET_CYCLE) {
        reachingDefinitionsFor_Location_values.remove(_parameters);
      }
      else if ((new_reachingDefinitionsFor_Location_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_reachingDefinitionsFor_Location_value!=null && !new_reachingDefinitionsFor_Location_value.equals((SmallSet<CFGNode>)_value.value))) {
        state.CHANGE = true;
        _value.value = new_reachingDefinitionsFor_Location_value;
      }
      return new_reachingDefinitionsFor_Location_value;
    }
    return (SmallSet<CFGNode>)_value.value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> reachingDefinitionsFor_compute(Location l) {
		SmallSet<CFGNode> res = SmallSet.<CFGNode>empty();
		if(isReachingDefinitionFor(l)) {
			res = SmallSet.singleton((CFGNode)this);
			if(isBlockingDefinitionFor(l))
				return res;
		}
		for(CFGNode p : pred())
			res = res.union(p.reachingDefinitionsFor(l));
		return res;
	}
  protected java.util.Map reachedUsesFor_Location_values;
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:66
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<Access> reachedUsesFor(Location l) {
    Object _parameters = l;
    if(reachedUsesFor_Location_values == null) reachedUsesFor_Location_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(reachedUsesFor_Location_values.containsKey(_parameters)) {
      Object _o = reachedUsesFor_Location_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return (SmallSet<Access>)_o;
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      reachedUsesFor_Location_values.put(_parameters, _value);
      _value.value = SmallSet.<CFGNode>empty();
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      SmallSet<Access> new_reachedUsesFor_Location_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_reachedUsesFor_Location_value = reachedUsesFor_compute(l);
        if ((new_reachedUsesFor_Location_value==null && (SmallSet<Access>)_value.value!=null) || (new_reachedUsesFor_Location_value!=null && !new_reachedUsesFor_Location_value.equals((SmallSet<Access>)_value.value))) {
          state.CHANGE = true;
          _value.value = new_reachedUsesFor_Location_value;
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        reachedUsesFor_Location_values.put(_parameters, new_reachedUsesFor_Location_value);
      }
      else {
        reachedUsesFor_Location_values.remove(_parameters);
      state.RESET_CYCLE = true;
      reachedUsesFor_compute(l);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_reachedUsesFor_Location_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      SmallSet<Access> new_reachedUsesFor_Location_value = reachedUsesFor_compute(l);
      if (state.RESET_CYCLE) {
        reachedUsesFor_Location_values.remove(_parameters);
      }
      else if ((new_reachedUsesFor_Location_value==null && (SmallSet<Access>)_value.value!=null) || (new_reachedUsesFor_Location_value!=null && !new_reachedUsesFor_Location_value.equals((SmallSet<Access>)_value.value))) {
        state.CHANGE = true;
        _value.value = new_reachedUsesFor_Location_value;
      }
      return new_reachedUsesFor_Location_value;
    }
    return (SmallSet<Access>)_value.value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<Access> reachedUsesFor_compute(Location l) {
		SmallSet<Access> res = SmallSet.<Access>empty();
		if(isBlockingDefinitionFor(l))
			return res;
		for(CFGNode s : succ())
			res = res.union(s.reachedUsesFor(l));
		return res;
	}
  protected java.util.Map hasReachingDefinitionBefore_Location_CFGNode_values;
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:159
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean hasReachingDefinitionBefore(Location l, CFGNode n) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(l);
    _parameters.add(n);
    if(hasReachingDefinitionBefore_Location_CFGNode_values == null) hasReachingDefinitionBefore_Location_CFGNode_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(hasReachingDefinitionBefore_Location_CFGNode_values.containsKey(_parameters)) {
      Object _o = hasReachingDefinitionBefore_Location_CFGNode_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      hasReachingDefinitionBefore_Location_CFGNode_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(false);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_hasReachingDefinitionBefore_Location_CFGNode_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_hasReachingDefinitionBefore_Location_CFGNode_value = hasReachingDefinitionBefore_compute(l, n);
        if (new_hasReachingDefinitionBefore_Location_CFGNode_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_hasReachingDefinitionBefore_Location_CFGNode_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        hasReachingDefinitionBefore_Location_CFGNode_values.put(_parameters, new_hasReachingDefinitionBefore_Location_CFGNode_value);
      }
      else {
        hasReachingDefinitionBefore_Location_CFGNode_values.remove(_parameters);
      state.RESET_CYCLE = true;
      hasReachingDefinitionBefore_compute(l, n);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_hasReachingDefinitionBefore_Location_CFGNode_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_hasReachingDefinitionBefore_Location_CFGNode_value = hasReachingDefinitionBefore_compute(l, n);
      if (state.RESET_CYCLE) {
        hasReachingDefinitionBefore_Location_CFGNode_values.remove(_parameters);
      }
      else if (new_hasReachingDefinitionBefore_Location_CFGNode_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_hasReachingDefinitionBefore_Location_CFGNode_value;
      }
      return new_hasReachingDefinitionBefore_Location_CFGNode_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilevel internal
   */
  private boolean hasReachingDefinitionBefore_compute(Location l, CFGNode n) {
		if(this == n)
			return !reachingDefinitionsFor(l).isEmpty();
		if(isBlockingDefinitionFor(l))
			return false;
		for(CFGNode pred : pred())
			if(pred.hasReachingDefinitionBefore(l, n))
				return true;
		return false;
	}
  protected java.util.Map hasReachedUseAfter_Location_CFGNode_values;
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:199
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean hasReachedUseAfter(Location l, CFGNode n) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(l);
    _parameters.add(n);
    if(hasReachedUseAfter_Location_CFGNode_values == null) hasReachedUseAfter_Location_CFGNode_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(hasReachedUseAfter_Location_CFGNode_values.containsKey(_parameters)) {
      Object _o = hasReachedUseAfter_Location_CFGNode_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      hasReachedUseAfter_Location_CFGNode_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(false);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_hasReachedUseAfter_Location_CFGNode_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_hasReachedUseAfter_Location_CFGNode_value = hasReachedUseAfter_compute(l, n);
        if (new_hasReachedUseAfter_Location_CFGNode_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_hasReachedUseAfter_Location_CFGNode_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        hasReachedUseAfter_Location_CFGNode_values.put(_parameters, new_hasReachedUseAfter_Location_CFGNode_value);
      }
      else {
        hasReachedUseAfter_Location_CFGNode_values.remove(_parameters);
      state.RESET_CYCLE = true;
      hasReachedUseAfter_compute(l, n);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_hasReachedUseAfter_Location_CFGNode_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_hasReachedUseAfter_Location_CFGNode_value = hasReachedUseAfter_compute(l, n);
      if (state.RESET_CYCLE) {
        hasReachedUseAfter_Location_CFGNode_values.remove(_parameters);
      }
      else if (new_hasReachedUseAfter_Location_CFGNode_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_hasReachedUseAfter_Location_CFGNode_value;
      }
      return new_hasReachedUseAfter_Location_CFGNode_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilevel internal
   */
  private boolean hasReachedUseAfter_compute(Location l, CFGNode n) {
		if(this == n)
			return !reachedUsesFor(l).isEmpty();
		if(isBlockingDefinitionFor(l))
			return false;
		for(CFGNode succ : succ())
			if(succ.hasReachedUseAfter(l, n))
				return true;
		return false;
	}
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:13
   */
  public boolean isAcquire() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:14
   */
  public boolean isRelease() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:15
   */
  public boolean isThreadManagementAction() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:16
   */
  public boolean isSyncAction() {
    ASTNode$State state = state();
    try {  return isAcquire() || isRelease() || isThreadManagementAction();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:17
   */
  public boolean isMemoryAction() {
    ASTNode$State state = state();
    try {  return isSyncAction();  }
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
    try {  return false;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean weakSucc_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<CFGNode> weakSucc_value;
  /**
   * @attribute syn
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:45
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> weakSucc() {
    if(weakSucc_computed) {
      return weakSucc_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    weakSucc_value = weakSucc_compute();
      if(isFinal && num == state().boundariesCrossed) weakSucc_computed = true;
    return weakSucc_value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> weakSucc_compute() {
		SmallSet<CFGNode> res = SmallSet.<CFGNode>empty();
		for(CFGNode s : succ())
			if(s.isFlowThrough())
				res = res.union(s.weakSucc());
			else
				res = res.union(s);
		return res;
	}
  protected java.util.Map collect_BackwardEdge_CFGNode_values;
  /**
   * @attribute syn
   * @aspect DependencyEdges
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DependencyEdges.jrag:28
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> collect(BackwardEdge be, CFGNode start) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(be);
    _parameters.add(start);
    if(collect_BackwardEdge_CFGNode_values == null) collect_BackwardEdge_CFGNode_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(collect_BackwardEdge_CFGNode_values.containsKey(_parameters)) {
      Object _o = collect_BackwardEdge_CFGNode_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return (SmallSet<CFGNode>)_o;
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      collect_BackwardEdge_CFGNode_values.put(_parameters, _value);
      _value.value = SmallSet.<CFGNode> empty();
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      SmallSet<CFGNode> new_collect_BackwardEdge_CFGNode_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_collect_BackwardEdge_CFGNode_value = collect_compute(be, start);
        if ((new_collect_BackwardEdge_CFGNode_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_collect_BackwardEdge_CFGNode_value!=null && !new_collect_BackwardEdge_CFGNode_value.equals((SmallSet<CFGNode>)_value.value))) {
          state.CHANGE = true;
          _value.value = new_collect_BackwardEdge_CFGNode_value;
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        collect_BackwardEdge_CFGNode_values.put(_parameters, new_collect_BackwardEdge_CFGNode_value);
      }
      else {
        collect_BackwardEdge_CFGNode_values.remove(_parameters);
      state.RESET_CYCLE = true;
      collect_compute(be, start);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_collect_BackwardEdge_CFGNode_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      SmallSet<CFGNode> new_collect_BackwardEdge_CFGNode_value = collect_compute(be, start);
      if (state.RESET_CYCLE) {
        collect_BackwardEdge_CFGNode_values.remove(_parameters);
      }
      else if ((new_collect_BackwardEdge_CFGNode_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_collect_BackwardEdge_CFGNode_value!=null && !new_collect_BackwardEdge_CFGNode_value.equals((SmallSet<CFGNode>)_value.value))) {
        state.CHANGE = true;
        _value.value = new_collect_BackwardEdge_CFGNode_value;
      }
      return new_collect_BackwardEdge_CFGNode_value;
    }
    return (SmallSet<CFGNode>)_value.value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> collect_compute(BackwardEdge be, CFGNode start) {
		SmallSet<CFGNode> res = be.isTarget(start, this) ? SmallSet.singleton((CFGNode)this)
													  : SmallSet.<CFGNode>empty();
		if(be.terminates(start, this))
			return res;
		for(CFGNode p : pred())
			res = res.union(p.collect(be, start));
		return res;
	}
  protected java.util.Map collect_ForwardEdge_CFGNode_values;
  /**
   * @attribute syn
   * @aspect DependencyEdges
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DependencyEdges.jrag:59
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> collect(ForwardEdge fe, CFGNode start) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(fe);
    _parameters.add(start);
    if(collect_ForwardEdge_CFGNode_values == null) collect_ForwardEdge_CFGNode_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(collect_ForwardEdge_CFGNode_values.containsKey(_parameters)) {
      Object _o = collect_ForwardEdge_CFGNode_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return (SmallSet<CFGNode>)_o;
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      collect_ForwardEdge_CFGNode_values.put(_parameters, _value);
      _value.value = SmallSet.<CFGNode> empty();
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      SmallSet<CFGNode> new_collect_ForwardEdge_CFGNode_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_collect_ForwardEdge_CFGNode_value = collect_compute(fe, start);
        if ((new_collect_ForwardEdge_CFGNode_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_collect_ForwardEdge_CFGNode_value!=null && !new_collect_ForwardEdge_CFGNode_value.equals((SmallSet<CFGNode>)_value.value))) {
          state.CHANGE = true;
          _value.value = new_collect_ForwardEdge_CFGNode_value;
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        collect_ForwardEdge_CFGNode_values.put(_parameters, new_collect_ForwardEdge_CFGNode_value);
      }
      else {
        collect_ForwardEdge_CFGNode_values.remove(_parameters);
      state.RESET_CYCLE = true;
      collect_compute(fe, start);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_collect_ForwardEdge_CFGNode_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      SmallSet<CFGNode> new_collect_ForwardEdge_CFGNode_value = collect_compute(fe, start);
      if (state.RESET_CYCLE) {
        collect_ForwardEdge_CFGNode_values.remove(_parameters);
      }
      else if ((new_collect_ForwardEdge_CFGNode_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_collect_ForwardEdge_CFGNode_value!=null && !new_collect_ForwardEdge_CFGNode_value.equals((SmallSet<CFGNode>)_value.value))) {
        state.CHANGE = true;
        _value.value = new_collect_ForwardEdge_CFGNode_value;
      }
      return new_collect_ForwardEdge_CFGNode_value;
    }
    return (SmallSet<CFGNode>)_value.value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> collect_compute(ForwardEdge fe, CFGNode start) {
		SmallSet<CFGNode> res = fe.isTarget(start, this) ? SmallSet.singleton((CFGNode)this)
												  	  : SmallSet.<CFGNode>empty();
		if(fe.terminates(start, this))
			return res;
		for(CFGNode p : succ())
			res = res.union(p.collect(fe, start));
		return res;
	}
  protected java.util.Map precedingDefsUpTo_CFGNode_values;
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:59
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> precedingDefsUpTo(CFGNode n) {
    Object _parameters = n;
    if(precedingDefsUpTo_CFGNode_values == null) precedingDefsUpTo_CFGNode_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(precedingDefsUpTo_CFGNode_values.containsKey(_parameters)) {
      Object _o = precedingDefsUpTo_CFGNode_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return (SmallSet<CFGNode>)_o;
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      precedingDefsUpTo_CFGNode_values.put(_parameters, _value);
      _value.value = SmallSet.<CFGNode>empty();
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      SmallSet<CFGNode> new_precedingDefsUpTo_CFGNode_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_precedingDefsUpTo_CFGNode_value = precedingDefsUpTo_compute(n);
        if ((new_precedingDefsUpTo_CFGNode_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_precedingDefsUpTo_CFGNode_value!=null && !new_precedingDefsUpTo_CFGNode_value.equals((SmallSet<CFGNode>)_value.value))) {
          state.CHANGE = true;
          _value.value = new_precedingDefsUpTo_CFGNode_value;
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        precedingDefsUpTo_CFGNode_values.put(_parameters, new_precedingDefsUpTo_CFGNode_value);
      }
      else {
        precedingDefsUpTo_CFGNode_values.remove(_parameters);
      state.RESET_CYCLE = true;
      precedingDefsUpTo_compute(n);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_precedingDefsUpTo_CFGNode_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      SmallSet<CFGNode> new_precedingDefsUpTo_CFGNode_value = precedingDefsUpTo_compute(n);
      if (state.RESET_CYCLE) {
        precedingDefsUpTo_CFGNode_values.remove(_parameters);
      }
      else if ((new_precedingDefsUpTo_CFGNode_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_precedingDefsUpTo_CFGNode_value!=null && !new_precedingDefsUpTo_CFGNode_value.equals((SmallSet<CFGNode>)_value.value))) {
        state.CHANGE = true;
        _value.value = new_precedingDefsUpTo_CFGNode_value;
      }
      return new_precedingDefsUpTo_CFGNode_value;
    }
    return (SmallSet<CFGNode>)_value.value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> precedingDefsUpTo_compute(CFGNode n) {
		SmallSet<CFGNode> res = SmallSet.<CFGNode>empty();
		if(this == n)
			return res;
		if(isDef())
			res = SmallSet.singleton((CFGNode)this);
		for(CFGNode p : pred())
			res = res.union(p.precedingDefsUpTo(n));
		return res;
	}
  protected java.util.Map isAnticipated_VariableDeclaration_values;
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:71
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isAnticipated(VariableDeclaration v) {
    Object _parameters = v;
    if(isAnticipated_VariableDeclaration_values == null) isAnticipated_VariableDeclaration_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(isAnticipated_VariableDeclaration_values.containsKey(_parameters)) {
      Object _o = isAnticipated_VariableDeclaration_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      isAnticipated_VariableDeclaration_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(true);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_isAnticipated_VariableDeclaration_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_isAnticipated_VariableDeclaration_value = isAnticipated_compute(v);
        if (new_isAnticipated_VariableDeclaration_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_isAnticipated_VariableDeclaration_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        isAnticipated_VariableDeclaration_values.put(_parameters, new_isAnticipated_VariableDeclaration_value);
      }
      else {
        isAnticipated_VariableDeclaration_values.remove(_parameters);
      state.RESET_CYCLE = true;
      isAnticipated_compute(v);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_isAnticipated_VariableDeclaration_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_isAnticipated_VariableDeclaration_value = isAnticipated_compute(v);
      if (state.RESET_CYCLE) {
        isAnticipated_VariableDeclaration_values.remove(_parameters);
      }
      else if (new_isAnticipated_VariableDeclaration_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_isAnticipated_VariableDeclaration_value;
      }
      return new_isAnticipated_VariableDeclaration_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilevel internal
   */
  private boolean isAnticipated_compute(VariableDeclaration v) {
		if(makesAnticipated(v))
			return true;
		for(CFGNode s : succ())
			if(!s.isAnticipated(v))
				return false;
		return !killsAnticipated(v);
	}
  protected java.util.Map makesAnticipated_VariableDeclaration_values;
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:81
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean makesAnticipated(VariableDeclaration v) {
    Object _parameters = v;
    if(makesAnticipated_VariableDeclaration_values == null) makesAnticipated_VariableDeclaration_values = new java.util.HashMap(4);
    if(makesAnticipated_VariableDeclaration_values.containsKey(_parameters)) {
      return ((Boolean)makesAnticipated_VariableDeclaration_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean makesAnticipated_VariableDeclaration_value = makesAnticipated_compute(v);
      if(isFinal && num == state().boundariesCrossed) makesAnticipated_VariableDeclaration_values.put(_parameters, Boolean.valueOf(makesAnticipated_VariableDeclaration_value));
    return makesAnticipated_VariableDeclaration_value;
  }
  /**
   * @apilevel internal
   */
  private boolean makesAnticipated_compute(VariableDeclaration v) {  return false;  }
  protected java.util.Map killsAnticipated_VariableDeclaration_values;
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:84
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean killsAnticipated(VariableDeclaration v) {
    Object _parameters = v;
    if(killsAnticipated_VariableDeclaration_values == null) killsAnticipated_VariableDeclaration_values = new java.util.HashMap(4);
    if(killsAnticipated_VariableDeclaration_values.containsKey(_parameters)) {
      return ((Boolean)killsAnticipated_VariableDeclaration_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean killsAnticipated_VariableDeclaration_value = killsAnticipated_compute(v);
      if(isFinal && num == state().boundariesCrossed) killsAnticipated_VariableDeclaration_values.put(_parameters, Boolean.valueOf(killsAnticipated_VariableDeclaration_value));
    return killsAnticipated_VariableDeclaration_value;
  }
  /**
   * @apilevel internal
   */
  private boolean killsAnticipated_compute(VariableDeclaration v) {  return false;  }
  protected java.util.Map isAvailable_ASTNode_values;
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:88
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isAvailable(ASTNode e) {
    Object _parameters = e;
    if(isAvailable_ASTNode_values == null) isAvailable_ASTNode_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(isAvailable_ASTNode_values.containsKey(_parameters)) {
      Object _o = isAvailable_ASTNode_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      isAvailable_ASTNode_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(false);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_isAvailable_ASTNode_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_isAvailable_ASTNode_value = isAvailable_compute(e);
        if (new_isAvailable_ASTNode_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_isAvailable_ASTNode_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        isAvailable_ASTNode_values.put(_parameters, new_isAvailable_ASTNode_value);
      }
      else {
        isAvailable_ASTNode_values.remove(_parameters);
      state.RESET_CYCLE = true;
      isAvailable_compute(e);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_isAvailable_ASTNode_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_isAvailable_ASTNode_value = isAvailable_compute(e);
      if (state.RESET_CYCLE) {
        isAvailable_ASTNode_values.remove(_parameters);
      }
      else if (new_isAvailable_ASTNode_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_isAvailable_ASTNode_value;
      }
      return new_isAvailable_ASTNode_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilevel internal
   */
  private boolean isAvailable_compute(ASTNode e) {
		if(makesAvailable(e))
			return true;
		if(makesUnavailable(e))
			return false;
		for(CFGNode p : pred())
			if(!p.isAvailable(e))
				return false;
		return true;
	}
  /**
   * @attribute inh
   * @aspect DefiniteAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:15
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isDest() {
    ASTNode$State state = state();
    boolean isDest_value = getParent().Define_boolean_isDest(this, null);
    return isDest_value;
  }
  /**
   * @attribute inh
   * @aspect DefiniteAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:25
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isSource() {
    ASTNode$State state = state();
    boolean isSource_value = getParent().Define_boolean_isSource(this, null);
    return isSource_value;
  }
  /**
   * @attribute inh
   * @aspect DefiniteAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:49
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isIncOrDec() {
    ASTNode$State state = state();
    boolean isIncOrDec_value = getParent().Define_boolean_isIncOrDec(this, null);
    return isIncOrDec_value;
  }
  /**
   * @attribute inh
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:234
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isDAbefore(Variable v) {
    ASTNode$State state = state();
    boolean isDAbefore_Variable_value = getParent().Define_boolean_isDAbefore(this, null, v);
    return isDAbefore_Variable_value;
  }
  /**
   * @attribute inh
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:693
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isDUbefore(Variable v) {
    ASTNode$State state = state();
    boolean isDUbefore_Variable_value = getParent().Define_boolean_isDUbefore(this, null, v);
    return isDUbefore_Variable_value;
  }
  /**
   * @attribute inh
   * @aspect LookupMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:23
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection lookupMethod(String name) {
    ASTNode$State state = state();
    Collection lookupMethod_String_value = getParent().Define_Collection_lookupMethod(this, null, name);
    return lookupMethod_String_value;
  }
  /**
   * @attribute inh
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:49
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeBoolean() {
    ASTNode$State state = state();
    TypeDecl typeBoolean_value = getParent().Define_TypeDecl_typeBoolean(this, null);
    return typeBoolean_value;
  }
  /**
   * @attribute inh
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:50
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeByte() {
    ASTNode$State state = state();
    TypeDecl typeByte_value = getParent().Define_TypeDecl_typeByte(this, null);
    return typeByte_value;
  }
  /**
   * @attribute inh
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:51
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeShort() {
    ASTNode$State state = state();
    TypeDecl typeShort_value = getParent().Define_TypeDecl_typeShort(this, null);
    return typeShort_value;
  }
  /**
   * @attribute inh
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:52
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeChar() {
    ASTNode$State state = state();
    TypeDecl typeChar_value = getParent().Define_TypeDecl_typeChar(this, null);
    return typeChar_value;
  }
  /**
   * @attribute inh
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:53
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeInt() {
    ASTNode$State state = state();
    TypeDecl typeInt_value = getParent().Define_TypeDecl_typeInt(this, null);
    return typeInt_value;
  }
  /**
   * @attribute inh
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:54
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeLong() {
    ASTNode$State state = state();
    TypeDecl typeLong_value = getParent().Define_TypeDecl_typeLong(this, null);
    return typeLong_value;
  }
  /**
   * @attribute inh
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:55
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeFloat() {
    ASTNode$State state = state();
    TypeDecl typeFloat_value = getParent().Define_TypeDecl_typeFloat(this, null);
    return typeFloat_value;
  }
  /**
   * @attribute inh
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:56
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeDouble() {
    ASTNode$State state = state();
    TypeDecl typeDouble_value = getParent().Define_TypeDecl_typeDouble(this, null);
    return typeDouble_value;
  }
  /**
   * @attribute inh
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:57
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeString() {
    ASTNode$State state = state();
    TypeDecl typeString_value = getParent().Define_TypeDecl_typeString(this, null);
    return typeString_value;
  }
  /**
   * @attribute inh
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:58
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeVoid() {
    ASTNode$State state = state();
    TypeDecl typeVoid_value = getParent().Define_TypeDecl_typeVoid(this, null);
    return typeVoid_value;
  }
  /**
   * @attribute inh
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:59
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeNull() {
    ASTNode$State state = state();
    TypeDecl typeNull_value = getParent().Define_TypeDecl_typeNull(this, null);
    return typeNull_value;
  }
  /**
   * @attribute inh
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:72
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl unknownType() {
    ASTNode$State state = state();
    TypeDecl unknownType_value = getParent().Define_TypeDecl_unknownType(this, null);
    return unknownType_value;
  }
  /**
   * @attribute inh
   * @aspect LookupFullyQualifiedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:86
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean hasPackage(String packageName) {
    ASTNode$State state = state();
    boolean hasPackage_String_value = getParent().Define_boolean_hasPackage(this, null, packageName);
    return hasPackage_String_value;
  }
  /**
   * @attribute inh
   * @aspect LookupFullyQualifiedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:95
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl lookupType(String packageName, String typeName) {
    ASTNode$State state = state();
    TypeDecl lookupType_String_String_value = getParent().Define_TypeDecl_lookupType(this, null, packageName, typeName);
    return lookupType_String_String_value;
  }
  /**
   * @attribute inh
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:264
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet lookupType(String name) {
    ASTNode$State state = state();
    SimpleSet lookupType_String_value = getParent().Define_SimpleSet_lookupType(this, null, name);
    return lookupType_String_value;
  }
  /**
   * @attribute inh
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:19
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet lookupVariable(String name) {
    ASTNode$State state = state();
    SimpleSet lookupVariable_String_value = getParent().Define_SimpleSet_lookupVariable(this, null, name);
    return lookupVariable_String_value;
  }
  /**
   * @attribute inh
   * @aspect SyntacticClassification
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/SyntacticClassification.jrag:20
   */
  @SuppressWarnings({"unchecked", "cast"})
  public NameType nameType() {
    ASTNode$State state = state();
    NameType nameType_value = getParent().Define_NameType_nameType(this, null);
    return nameType_value;
  }
  /**
   * @attribute inh
   * @aspect NestedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:510
   */
  @SuppressWarnings({"unchecked", "cast"})
  public BodyDecl enclosingBodyDecl() {
    ASTNode$State state = state();
    BodyDecl enclosingBodyDecl_value = getParent().Define_BodyDecl_enclosingBodyDecl(this, null);
    return enclosingBodyDecl_value;
  }
  /**
   * @attribute inh
   * @aspect NestedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:567
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String hostPackage() {
    ASTNode$State state = state();
    String hostPackage_value = getParent().Define_String_hostPackage(this, null);
    return hostPackage_value;
  }
  /**
   * @attribute inh
   * @aspect NestedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:586
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl hostType() {
    ASTNode$State state = state();
    TypeDecl hostType_value = getParent().Define_TypeDecl_hostType(this, null);
    return hostType_value;
  }
  /**
   * @attribute inh
   * @aspect TypeHierarchyCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:11
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String methodHost() {
    ASTNode$State state = state();
    String methodHost_value = getParent().Define_String_methodHost(this, null);
    return methodHost_value;
  }
  /**
   * @attribute inh
   * @aspect TypeHierarchyCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:134
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean inStaticContext() {
    ASTNode$State state = state();
    boolean inStaticContext_value = getParent().Define_boolean_inStaticContext(this, null);
    return inStaticContext_value;
  }
  /**
   * @attribute inh
   * @aspect GenericMethodsInference
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericMethodsInference.jrag:33
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl assignConvertedType() {
    ASTNode$State state = state();
    TypeDecl assignConvertedType_value = getParent().Define_TypeDecl_assignConvertedType(this, null);
    return assignConvertedType_value;
  }
  /**
   * @attribute inh
   * @aspect GenericsTypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:271
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean inExtendsOrImplements() {
    ASTNode$State state = state();
    boolean inExtendsOrImplements_value = getParent().Define_boolean_inExtendsOrImplements(this, null);
    return inExtendsOrImplements_value;
  }
  /**
   * @attribute inh
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:249
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> throwTarget(TypeDecl exn) {
    ASTNode$State state = state();
    SmallSet<CFGNode> throwTarget_TypeDecl_value = getParent().Define_SmallSet_CFGNode__throwTarget(this, null, exn);
    return throwTarget_TypeDecl_value;
  }
  /**
   * @attribute inh
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:328
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> followingWhenTrue() {
    ASTNode$State state = state();
    SmallSet<CFGNode> followingWhenTrue_value = getParent().Define_SmallSet_CFGNode__followingWhenTrue(this, null);
    return followingWhenTrue_value;
  }
  /**
   * @attribute inh
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:329
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> followingWhenFalse() {
    ASTNode$State state = state();
    SmallSet<CFGNode> followingWhenFalse_value = getParent().Define_SmallSet_CFGNode__followingWhenFalse(this, null);
    return followingWhenFalse_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean uncheckedExnTarget_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<CFGNode> uncheckedExnTarget_value;
  /**
   * @attribute inh
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:666
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> uncheckedExnTarget() {
    if(uncheckedExnTarget_computed) {
      return uncheckedExnTarget_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    uncheckedExnTarget_value = getParent().Define_SmallSet_CFGNode__uncheckedExnTarget(this, null);
      if(isFinal && num == state().boundariesCrossed) uncheckedExnTarget_computed = true;
    return uncheckedExnTarget_value;
  }
  /**
   * @attribute inh
   * @aspect ExprExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:28
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean inInextractiblePosition() {
    ASTNode$State state = state();
    boolean inInextractiblePosition_value = getParent().Define_boolean_inInextractiblePosition(this, null);
    return inInextractiblePosition_value;
  }
  /**
   * @attribute inh
   * @aspect PackageDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:32
   */
  @SuppressWarnings({"unchecked", "cast"})
  public PackageDecl lookupPackage(String name) {
    ASTNode$State state = state();
    PackageDecl lookupPackage_String_value = getParent().Define_PackageDecl_lookupPackage(this, null, name);
    return lookupPackage_String_value;
  }
  /**
   * @attribute inh
   * @aspect Precedence
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Precedence.jrag:49
   */
  @SuppressWarnings({"unchecked", "cast"})
  public int maxPrecedence() {
    ASTNode$State state = state();
    int maxPrecedence_value = getParent().Define_int_maxPrecedence(this, null);
    return maxPrecedence_value;
  }
  /**
   * @attribute inh
   * @aspect AccessMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessMethod.jrag:77
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodAccessInfo accessMethod(MethodDecl md) {
    ASTNode$State state = state();
    MethodAccessInfo accessMethod_MethodDecl_value = getParent().Define_MethodAccessInfo_accessMethod(this, null, md);
    return accessMethod_MethodDecl_value;
  }
  /**
   * @attribute inh
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:118
   */
  @SuppressWarnings({"unchecked", "cast"})
  public UnknownVarAccess unknownVarAccess() {
    ASTNode$State state = state();
    UnknownVarAccess unknownVarAccess_value = getParent().Define_UnknownVarAccess_unknownVarAccess(this, null);
    return unknownVarAccess_value;
  }
  /**
   * @attribute inh
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:135
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SymbolicVarAccess accessVariable(Variable decl) {
    ASTNode$State state = state();
    SymbolicVarAccess accessVariable_Variable_value = getParent().Define_SymbolicVarAccess_accessVariable(this, null, decl);
    return accessVariable_Variable_value;
  }
  /**
   * @attribute inh
   * @aspect InsertEmptyStmt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:15
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Stmt insertStmtBefore(Stmt s) {
    ASTNode$State state = state();
    Stmt insertStmtBefore_Stmt_value = getParent().Define_Stmt_insertStmtBefore(this, null, s);
    return insertStmtBefore_Stmt_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean following_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<CFGNode> following_value;
  /**
   * @attribute inh
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:29
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> following() {
    if(following_computed) {
      return following_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    following_value = getParent().Define_SmallSet_CFGNode__following(this, null);
      if(isFinal && num == state().boundariesCrossed) following_computed = true;
    return following_value;
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /**
   * @apilevel internal
   */
  protected boolean CFGNode_collPred_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<CFGNode> CFGNode_collPred_value;
  /**
   * @attribute coll
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:37
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> collPred() {
    if(CFGNode_collPred_computed) {
      return CFGNode_collPred_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    CFGNode_collPred_value = collPred_compute();
      if(isFinal && num == state().boundariesCrossed) CFGNode_collPred_computed = true;
    return CFGNode_collPred_value;
  }
  java.util.Set CFGNode_collPred_contributors;
  public java.util.Set CFGNode_collPred_contributors() {
    if(CFGNode_collPred_contributors == null) CFGNode_collPred_contributors  = new ASTNode$State.IdentityHashSet(4);
    return CFGNode_collPred_contributors;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> collPred_compute() {
    ASTNode node = this;
    while(node.getParent() != null && !(node instanceof TypeDecl))
      node = node.getParent();
    TypeDecl root = (TypeDecl)node;
    root.collect_contributors_CFGNode_collPred();
    CFGNode_collPred_value = SmallSet.mutable();
    if(CFGNode_collPred_contributors != null)
    for(java.util.Iterator iter = CFGNode_collPred_contributors.iterator(); iter.hasNext(); ) {
      ASTNode contributor = (ASTNode)iter.next();
      contributor.contributeTo_CFGNode_CFGNode_collPred(CFGNode_collPred_value);
    }
    return CFGNode_collPred_value;
  }

  protected void collect_contributors_CFGNode_collPred() {
    /**
   * @attribute coll
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:39
   */
    for(java.util.Iterator iter = (succ()).iterator(); iter.hasNext(); ) {
      CFGNode ref = (CFGNode)iter.next();
      if(ref != null)
      ref.CFGNode_collPred_contributors().add(this);
    }
    super.collect_contributors_CFGNode_collPred();
  }
  protected void contributeTo_CFGNode_CFGNode_collPred(SmallSet<CFGNode> collection) {
    super.contributeTo_CFGNode_CFGNode_collPred(collection);
    collection.add(this);
  }

}
