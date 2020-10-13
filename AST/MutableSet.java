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
  * @ast class
 * 
 */
public class MutableSet extends Set {


    private static int nbrOfCreatedSets = 0;


	public static int getNbrOfCreatedSets() { return nbrOfCreatedSets; }



	private static int nbrOfAdd = 0;


	public static int getNbrOfAdd() { return nbrOfAdd; }



	protected MutableSet(int size) {
		super(size);
		nbrOfCreatedSets++;
	}



	public void add(Object element) {

		nbrOfAdd++;

		int index = index(element);
		int offset = index >> 5;
		int bit = 1 << (index & 0x1f);
		if (bits.length > offset && (bits[offset] & bit) == bit) {
			return;
		}
		// Copy if needed
		if (offset >= bits.length) {
			int[] newBits = new int[offset + 1];
			for (int i = 0; i < bits.length; i++) {
				newBits[i] = bits[i];
			}
			bits = newBits;
		}
		bits[offset] |= bit;
	}



	public void add(Set set) {

		nbrOfAdd++;

		if (set.bits.length > bits.length) {
			int[] newBits = new int[set.bits.length];
			for(int i = 0; i < bits.length; i++) {
				newBits[i] = bits[i];
 			}
			bits = newBits;         
		}
		int i = 0;
		while (i < set.bits.length && (bits[i] & set.bits[i]) == set.bits[i]) { 
			i++;
		}
		if (i != bits.length) {
			for(; i < set.bits.length; i++)
				bits[i] |= set.bits[i];			
		}
	}


	
    public static MutableSet empty() {
      return new MutableSet(0);
    }


}
