package com.syntax.class15;

public class Task02 {

	public static void main(String[] args) {
		
    /*
     * Mom's name--> Mary
     * dad's name--> Daniel
     * baby boy --> Danry
     * baby girl--> Maiel
     */
      
		String father="Danilo";
		String mother="Mariam";
		String expectation="girl";
		String firstPart="";
		String secondPart="";
		
		if(expectation.equalsIgnoreCase("boy")){
			firstPart=father.substring(0,father.length()/2);
			secondPart=mother.substring(mother.length()/2);
		}else if(expectation.equalsIgnoreCase("girl")){
				firstPart=mother.substring(0,mother.length()/2);
				secondPart=father.substring(father.length()/2);
		}
		System.out.println(firstPart+secondPart);
		
		
			
		
		
		
		
		
		
		
		
	}
}
