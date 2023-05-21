package org.strategydesignpattern.finalstrategypattern;

import org.strategydesignpattern.finalstrategypattern.engine.Engine;
import org.strategydesignpattern.finalstrategypattern.engine.SimplePetrolEngine;
import org.strategydesignpattern.finalstrategypattern.fuel.Fuel;
import org.strategydesignpattern.finalstrategypattern.fuel.Petrol;
import org.strategydesignpattern.finalstrategypattern.gear.Gear;
import org.strategydesignpattern.finalstrategypattern.gear.NormalGear;
/*
  @author: chinmay venkat
  Copy rights reserved,Don't use this code for your personal purposes, if we use give credits
 */
public class Alto extends Car {

    public Alto(){
        //polymorphism
       Engine engine = new SimplePetrolEngine();
        setEngine(engine);
        Fuel fuel = new Petrol();
        setFuel(fuel);
        Gear gear = new NormalGear();
        setGear(gear);
    }
    @Override
    public void name() {
        System.out.println("Alto car");
    }

}
