package com.educacionit.laboratorio.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AppPrincipal {

	public static void main(String[] args) {
//		-----------------------------hashSet------------------------------------
		final Set hashSet = new HashSet(1_000_000);
		// tomamos la hora del sistema previo a la insercion
		final Long startHashSetTime = System.currentTimeMillis();
		// agrgamos un millon de elementos al HashSet
		for (int i = 0; i < 1_000_000; i++) {
			hashSet.add(i);
		}
		// tomamos la hora del sistema post a la insercion
		final Long endHashSetTime = System.currentTimeMillis();
		System.out.println("Time spent by hashSet: " + (endHashSetTime - startHashSetTime));
//	-----------------------------------------treeSet------------------------

		final Set treeSet = new TreeSet();
		// tomamos la hora del sistema previo a la insercion
		final Long startTreeSetTime = System.currentTimeMillis();
		// agrgamos un millon de elementos al HashSet
		for (int i = 0; i < 1_000_000; i++) {
			treeSet.add(i);
		}
		// tomamos la hora del sistema post a la insercion
		final Long endTreeSetTime = System.currentTimeMillis();
		System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));

//-------------------------------------- LinkedHashSet -----------------------------------------------		
		final Set linkedHashSet = new LinkedHashSet(1_000_000);
		// tomamos la hora del sistema previo a la insercion
		final Long startLinkedHashSetTime = System.currentTimeMillis();
		// agrgamos un millon de elementos al HashSet
		for (int i = 0; i < 1_000_000; i++) {
			linkedHashSet.add(i);
		}
		// tomamos la hora del sistema post a la insercion
		final Long endLinkedHashSetTime = System.currentTimeMillis();
		System.out.println("Time spent by linkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));

	}

}
