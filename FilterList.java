package com.example.MovieRating;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterList {
	
	
	public static void main(String[] args)  
    { 
		List<Integer> evenList=new ArrayList<Integer>();
		
		evenList.add(2);
		evenList.add(9);
		evenList.add(21);
		evenList.add(8);
		evenList.add(7);
		evenList.add(10);
		
		Predicate<Integer> even =  x -> x %2 != 0;
		
		
		  evenList.removeAll(evenList.stream() .filter(even)
		  .collect(Collectors.toList()));
		 
	    
	    
	    evenList.stream().forEach(n->System.out.println("Even="+n));
	    

	 
	 evenList.removeAll(evenList.stream().filter(n->isPrime(n)).collect(Collectors.toList())); 
	 
	 evenList.stream().forEach(n->System.out.println("Not Prime="+n));

    }
	
	public static boolean isPrime(int number) {
	    return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
	}
	
}
