package org.strategydesignpattern.finalstrategypattern;

import org.strategydesignpattern.finalstrategypattern.engine.ElectricEngine;
import org.strategydesignpattern.finalstrategypattern.engine.Engine;
import org.strategydesignpattern.finalstrategypattern.fuel.Electric;
import org.strategydesignpattern.finalstrategypattern.fuel.Fuel;
import org.strategydesignpattern.finalstrategypattern.gear.AutoGear;
import org.strategydesignpattern.finalstrategypattern.gear.Gear;
/*
  @author: chinmay venkat
  Copy rights reserved,Don't use this code for your personal purposes, if we use give credits
 */
public class Baleno extends Car {
    public Baleno(){
        Engine engine = new ElectricEngine();
        setEngine(engine);
        Fuel fuel = new Electric();
        setFuel(fuel);
        Gear gear = new AutoGear();
        setGear(gear);
    }
    @Override
    public void name() {
       System.out.println("Car name is Baleno");
    }
}
