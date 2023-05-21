package org.strategydesignpattern.withinterfaces;
/*
  @author: chinmay venkat
  Copy rights reserved,Don't use this code for your personal purposes, if we use give credits
 */


public class Ambassador  extends Car implements Engine, Fuel, Gear {
    @Override
    public void name() {
        System.out.println("Ambassador car");
    }

    @Override
    public void engine(){
        System.out.println("it has diesel engine");
    }

    @Override
    public void isAutoGear() {
        System.out.println("it has auto gear");
    }
    @Override
    public void fuel() {
        System.out.println("we are using diesel");
    }
}
