package it.unibo.oop.lab.collections1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Example class using {@link java.util.List} and {@link java.util.Map}.
 * 
 */
public final class UseCollection {

    private UseCollection() {
    }
    
    private static final int ELEMS = 100_000;
    private static final int READ = 1000;

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
        
    	/*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
    	final ArrayList<Integer> list = new ArrayList<>();
    	for (int i = 1000; i < 2000; i++) {
    		list.add(i);
    	}
        
    	/*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
    	final LinkedList<Integer> llist = new LinkedList<>(list);
        
    	/*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
    	int temp = list.get(0);
    	list.set(0, list.get(list.size()-1));
    	list.set(list.size()-1, temp);
        
    	/*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
    	for (int i: list) {
    		System.out.println(i);
    	}
        
    	/*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
    	long time = System.nanoTime();
    	 for (int i = 1; i <= ELEMS; i++) {
             list.add(0, i); 
         }
    	time = System.nanoTime() - time;
    	System.out.println("Time (ns) to insert " + ELEMS + " new elements to head of ArrayList: " + time);
    	
    	long time2 = System.nanoTime();
    	for (int i = 1; i <= ELEMS; i++) {
    		llist.add(0, i);
        }
    	time2 = System.nanoTime() - time2;
    	System.out.println("Time (ns) to insert " + ELEMS + " new elements to head of LinkedList: " + time2);
    	
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
    	long timeRead = System.nanoTime();
   	 	for (int i = 1; i <= READ; i++) {
   	 	    list.get(list.size()/2); 
        }
   	 	timeRead = System.nanoTime() - timeRead;
   	 	System.out.println("Time (ns) to read " + READ + " elements in the middle of ArrayList: " + timeRead);
   	 	
    	long timeRead2 = System.nanoTime();
   	 	for (int i = 1; i <= READ; i++) {
   	 	    llist.get(llist.size()/2); 
        }
   	 	timeRead2 = System.nanoTime() - timeRead2;
   	 	System.out.println("Time (ns) to read " + READ + " elements in the middle of LinkedList: " + timeRead2);
 
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         * 
         * Africa -> 1,110,635,000
         * 
         * Americas -> 972,005,000
         * 
         * Antarctica -> 0
         * 
         * Asia -> 4,298,723,000
         * 
         * Europe -> 742,452,000
         * 
         * Oceania -> 38,304,000
         */
   	 	final Map<Long, String> map = new HashMap<>();
   	 	map.put(1110635000L, "Africa");
   	 	map.put(972005000L, "Americas");
   	 	map.put(0L, "Antarctica");
   	 	map.put(4298723000L, "Asia");
   	 	map.put(742452000L, "Europe");
   	 	map.put(38304000L, "Oceania");
   	 	
   	 	/*
         * 8) Compute the population of the world
         */
    	long worldPop = 0;
   	 	for (Long l: map.keySet()) {
   	 	    worldPop += l;
    	}
   	 	System.out.println("World population is: " + worldPop);
    }
}
