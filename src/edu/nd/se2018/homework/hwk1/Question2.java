package edu.nd.se2018.homework.hwk1;

import java.util.*;


public class Question2 {

	public Question2(){}
	
	public String getMostFrequentWord(String input, String stopwords){
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		String[] StopWordSplit = stopwords.split(" ");
		List<String> stopList = new ArrayList<String>(Arrays.asList(StopWordSplit));
		String[] inputSplit = input.split(" ");
		List<String> inputList = new ArrayList<String>(Arrays.asList(inputSplit));

        for (String s: stopList) {
            if (inputList.contains(s)) {
            	inputList.removeAll(Collections.singleton(s));//remove stop word
            }
        }
        
        for (String ss: inputList) {
        	if (!h.containsKey(ss)) {
        		h.put(ss, 1);
        	}
        	else {
        		h.put(ss, h.get(ss) + 1);
        	}
//        	System.out.println(ss);
        }
        
        Integer maxValue = 0;
        List<String> maxKeys = new ArrayList<String>();
        for (HashMap.Entry<String, Integer> entry : h.entrySet()) {
          if (maxValue == 0 || maxValue.equals(entry.getValue())) {
            maxValue = entry.getValue();
            maxKeys.add(entry.getKey());
          } else if (entry.getValue() > maxValue) {
            maxValue = entry.getValue();
            maxKeys.clear();
            maxKeys.add(entry.getKey());
          }
        }
 
        if (maxKeys.size()!= 1) {
        	return null;
        }
        
		return maxKeys.get(0);
	}
	
	public static void main(String[] args) {
		Question2 q = new Question2();
		String inputString3 = "giraffe elephant of giraffe the tiger";
		String stopWords = "and a hes the of up but with";
		
		String res = q.getMostFrequentWord(inputString3, stopWords);
		System.out.println(res);
	}
}
