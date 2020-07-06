package com.stayready;

import java.util.Arrays;
import java.util.Collections;

import com.stayready.assessment1.part2.ArrayUtils;

public class fun {
    public static void main(String args[])  {
        
        String[] assetClasses = {"bond", "equity", "gold", "real estate"};
        System.out.println("Array before reversing: "
                     + Arrays.toString(assetClasses));
        Collections.reverse(Arrays.asList(assetClasses));
        System.out.println("Array after reversing: "
                     + Arrays.toString(assetClasses));
       
      }
    
}