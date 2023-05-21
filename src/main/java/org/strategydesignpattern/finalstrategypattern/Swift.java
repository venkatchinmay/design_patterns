package org.strategydesignpattern.finalstrategypattern;

import org.strategydesignpattern.finalstrategypattern.engine.Engine;
import org.strategydesignpattern.finalstrategypattern.engine.FourStrokeEngine;
import org.strategydesignpattern.finalstrategypattern.fuel.Fuel;
import org.strategydesignpattern.finalstrategypattern.fuel.Petrol;
import org.strategydesignpattern.finalstrategypattern.gear.AutoGear;
import org.strategydesignpattern.finalstrategypattern.gear.Gear;
/*
  @author: chinmay venkat
  Copy rights reserved,Don't use this code for your personal purposes, if we use give credits
 */
public class Swift extends Car {
    public Swift(){
        Engine engine = new FourStrokeEngine();
        setEngine(engine);
        Fuel fuel = new Petrol();
        setFuel(fuel);
        Gear gear = new AutoGear();
        setGear(gear);
    }

    @Override
    public void name() {
       System.out.println("Car name is Swift");
    }
}
