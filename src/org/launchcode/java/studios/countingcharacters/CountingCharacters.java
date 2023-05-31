package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args){
        String Quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with." + "" +
                " So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero." + "" +
                " Once you’ve done that, it’s pretty straightforward from there." ;
            char[] charactersInString = Quote.toCharArray();
        HashMap<Character , Integer> QuoteStr = new HashMap<>();

        for(char str : charactersInString ){
            if(QuoteStr.containsKey(str)){
                QuoteStr.put(str,QuoteStr.get(str)+1);
            }
            else{
                QuoteStr.put(str,1);
            }
        }
       for(Map.Entry Character : QuoteStr.entrySet()){
           System.out.println(Character.getKey() + " : " + Character.getValue());
       }
    }

}
