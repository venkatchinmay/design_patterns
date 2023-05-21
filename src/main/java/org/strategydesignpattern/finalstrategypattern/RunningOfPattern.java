package org.strategydesignpattern.finalstrategypattern;
/*
  @author: chinmay venkat
  Copy rights reserved,Don't use this code for your personal purposes, if we use give credits
 */
public class RunningOfPattern {

    public static void main(String args[]){
        Alto alto = new Alto();
        alto.name();
        alto.headLamps();
        alto.tyres();
        System.out.println(alto.getEngine());
        System.out.println(alto.getFuel());
        System.out.println(alto.getEngine());
    }
}
