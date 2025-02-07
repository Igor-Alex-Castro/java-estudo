package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class Result3 {

	    public static void main(String[] args) {
	    	
	    	List<Integer> health = new ArrayList<Integer>();
	    	List<Integer> serverType =new ArrayList<Integer>();
	    	/*
	    	//health.add(1);3
	    	//health.add(2);10
	    	//health.add(3);10
	    	//health.add(10);1
	    	//health.add(10);2
	    	*/
	    	
	    	health.add(10);//10
	    	health.add(7);//7
	    	health.add(6);//6
	    	health.add(5);//5
	    	
	    	serverType.add(2);//2
	    	serverType.add(3);//3
	    	serverType.add(2);//2
	    	serverType.add(3);//3
	    	System.out.println(findMaxHealthSum(health, serverType, 1));
			
		}
	

	    public static long findMaxHealthSum(List<Integer> health, List<Integer> serverType, int m) {
	        // Write your code here
	    
	    	
	    	for (int i = 0; i < health.size(); i++) {
				for (int j = 0; j < health.size(); j++) {
					int alt = 0;
					if(health.get(i) > health.get(j)) {
						alt =  health.get(j);
						
						health.add(j, health.get(i));
						health.remove(j + 1);
						
						health.add(i, alt);
						health.remove(i + 1);
						
						alt = 0;
					
						alt =  serverType.get(j);
						
						serverType.add(j, serverType.get(i));
						serverType.remove(j + 1);
						
						serverType.add(i, alt);
						serverType.remove(i + 1);
						
						
					}
				}
			}
	    	
	    	long soma = 0;
	    	
	    	if(serverType.size() >= m && m != 1 && m != 2) {
	    		for (Integer  h : health) {
					soma += h.longValue();
				}
	    		
	    		return soma;
	    	}
	    	
	    	if(m == 1) {
	    		int j  = health.size();
	    		int i = 0;
	    		while (i < j) {
	    			 
	    				if(serverType.get(i) == serverType.get(j) ) {
	    					   
	    					   soma = health.get(j) + health.get(i) ;
	    					   health.remove(i);
	    					   health.remove(j);
	    					   j  = health.size();
	    					   
	    				 }else {
	    					 j -= 1;
	    				 }
					}
	    			return soma;
	    	}
	    	
	    	
	    	return health.get(0) + health.get(1); 
	    	
	    }
	}

