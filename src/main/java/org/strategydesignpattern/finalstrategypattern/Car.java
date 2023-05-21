package org.strategydesignpattern.finalstrategypattern;

import org.strategydesignpattern.finalstrategypattern.engine.Engine;
import org.strategydesignpattern.finalstrategypattern.fuel.Fuel;
import org.strategydesignpattern.finalstrategypattern.gear.Gear;
/*
  @author: chinmay venkat
  Copy rights reserved,Don't use this code for your personal purposes, if we use give credits
 */
public abstract class Car {

    public abstract void name();

    //encapsulation and abstraction
    private Engine engine ;
    private Fuel fuel;
    private Gear gear;

    public void tyres(){
        System.out.println("Car had apollo tyres");
    }

    public void headLamps(){
        System.out.println("we are using head lamps");
    }

    public String getEngine() {
        return engine.engine();
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getFuel() {
        return fuel.fuel();
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public String getGear() {
        return gear.isAutoGear();
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }
}
