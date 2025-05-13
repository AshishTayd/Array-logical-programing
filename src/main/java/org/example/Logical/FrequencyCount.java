package org.example.Logical;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

    public void count(String word){

        Map<Character, Integer> hh=new HashMap();

        for(Character c: word.toCharArray()){
            if(c == ' ')
                continue;
            hh.put(c,hh.getOrDefault(c,0)+1);

        }

        for(Map.Entry  mm:hh.entrySet()){

            System.out.println(mm.getKey()+" "+mm.getValue());
        }

    }

    public static void main(String[] args) {
  new FrequencyCount().count("Ashish");
    }
}
