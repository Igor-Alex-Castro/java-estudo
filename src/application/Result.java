package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class Result {

	    public static void main(String[] args) {
	    	
	    	List<Integer> health = new ArrayList<Integer>();
	    	List<Integer> serverType =new ArrayList<Integer>();
	    	
	    	health.add(1);
	    	health.add(2);
	    	health.add(3);
	    	health.add(10);
	    	health.add(10);
	    	serverType.add(3);
	    	serverType.add(3);
	    	serverType.add(1);
	    	serverType.add(2);
	    	serverType.add(5);
	    	System.out.println(findMaxHealthSum(health, serverType, 2));
			
		}
	

	    public static long findMaxHealthSum(List<Integer> health, List<Integer> serverType, int m) {
	        // Write your code here
	    	long soma = 0;
	    	
	    	Map<Long, Long> healthServerType =  new HashMap<Long, Long>();
	    
	    	SortedSet<Long> sortedMap = new TreeSet<>(healthServerType.keySet());
	    	
	    	if(serverType.size() >= m && m != 1 && m != 2) {
	    		for (Integer  h : health) {
					soma += h.longValue();
				}
	    		
	    		return soma;
	    	}
	    	
	    	if(m == 1) {
	    		
	    		for (int i = 0; i < health.size() ; i++) {
	    			
	    			for (int j = 0; j < health.size(); j++) {
	    				   if(serverType.get(i) == serverType.get(j) ) {
	    					   
	    					   soma += health.get(j);
	    				   }  
					}
	    	}
	    	
	    	if(m == 2) {
	    		Integer maior = 0;
	    		
	    		for (int i = 0; i < 2 ; i++) {
	    			
	    			for (int j = 0; j < health.size(); j++) {
	    				if(maior < health.get(j)) {
		    				maior = health.get(j);
		    			}
					}
	    			
	    			soma += maior;
	    	       
	    			
	    		}	 
			}
	    		
	    	
	    	
	    		
	    	return soma;
	        }
			return soma;
	    }
	}

