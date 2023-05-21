package org.strategydesignpattern.finalstrategypattern;

import org.strategydesignpattern.finalstrategypattern.engine.DieselEngine;
import org.strategydesignpattern.finalstrategypattern.engine.Engine;
import org.strategydesignpattern.finalstrategypattern.fuel.Diesel;
import org.strategydesignpattern.finalstrategypattern.fuel.Fuel;
import org.strategydesignpattern.finalstrategypattern.gear.Gear;
import org.strategydesignpattern.finalstrategypattern.gear.NormalGear;

/*
  @author: chinmay venkat
  Copy rights reserved,Don't use this code for your personal purposes, if we use give credits
 */
public class Ambassador extends Car {
    public Ambassador(){
        Engine engine = new DieselEngine();
        setEngine(engine);
        Fuel fuel = new Diesel();
        setFuel(fuel);
        Gear gear = new NormalGear();
        setGear(gear);
    }
    @Override
    public void name() {
        System.out.println("Ambassador car");
    }
}
