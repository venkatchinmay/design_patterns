package org.observerdesignpattern.finaldesign;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MetricData implements Subject {

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    private JSONObject jsonObject;
    public static List<Observer> observers = new ArrayList<>();
    public void receiveMetricData(JSONObject jsonObject){
       this.jsonObject = jsonObject;
       this.notifyObserver(observers);
    }

    @Override
    public void addObserver(Observer observer) {
       observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
       observers.remove(observer);
    }

    @Override
    public void notifyObserver(List<Observer> observers) {
       for(Observer observer : observers){
           observer.update();
       }
    }
}
