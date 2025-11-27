package com.example.Day5JavaMaven;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoOnMaps {

	public static void main(String[] args) {
//		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
//		hashMap.put(1, "BKJ");
//		hashMap.put(2, "SMET");
//		hashMap.put(3, "KDP");
//		hashMap.put(4, "SBC");
//		hashMap.put(5, "MYS");
//		System.out.println(hashMap);
//		hashMap.put(3, "UDP");
//		System.out.println(hashMap);
//		System.out.println(hashMap.keySet());
//		System.out.println(hashMap.values());
//		System.out.println(hashMap.entrySet());
//		System.out.println(hashMap.get(3));
//		System.out.println(hashMap.getOrDefault(14, "Null"));
//		
//		Set<Integer> keySet=hashMap.keySet();
//		Set<String> valueSet=new HashSet<String>(hashMap.values());
//		Iterator<Integer> keyIt=keySet.iterator();
//		while(keyIt.hasNext())
//			System.out.println(keyIt.next());
//		
//		Iterator<Entry<Integer,String>> entryItr=hashMap.entrySet().iterator();
//		while(entryItr.hasNext())
//			System.out.println(entryItr.next());
		
		TreeMap<Integer,Integer> treeMap=new TreeMap<Integer,Integer>();
		treeMap.put(1,1);
		treeMap.put(2,4);
		treeMap.put(35,5);
		treeMap.put(21,45);
		treeMap.put(67,43);
		System.out.println(treeMap);
		System.out.println(treeMap.ceilingEntry(5));
		System.out.println(treeMap.descendingMap());
		System.out.println(treeMap.navigableKeySet());
		System.out.println(treeMap.pollLastEntry());
		
		//HashTable
		Hashtable<Integer,String> table =new Hashtable<Integer,String>();
		table.put(3, "Anirudha");
		table.put(2, "Rashmi");
		table.put(26, "Rambhe");
		table.put(54, "Urvashi");
		table.put(89, "Menake");
		 System.out.println(table);
		Enumeration<Integer> keys=table.keys();
		while(keys.hasMoreElements())
			System.out.println(keys.nextElement());
		
		Enumeration<String> values= table.elements();
		while(values.hasMoreElements())
			System.out.println(values.nextElement());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
