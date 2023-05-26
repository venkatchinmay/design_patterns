package org.observerdesignpattern.initialdesign.execution;

import org.json.JSONObject;
import org.observerdesignpattern.initialdesign.MetricData;
import org.observerdesignpattern.initialdesign.MetricProcessing;

import java.util.Date;

public class Execution {

    public static void main(String args[]){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("clientID", "123e4567-e89b-12d3-a456-426614174000");
        jsonObject.put("ts", new Date().getTime());
        jsonObject.put("value", 26.0);
        jsonObject.put("metric","CPU");
        jsonObject.put("criticalThreshold", 80);
        jsonObject.put("warningThreshold", 50);
        jsonObject.put("location", "India");

        MetricData metricData = new MetricData(jsonObject);
        MetricProcessing metricProcessing = metricData.getMetricProcessing();
        System.out.println(metricProcessing.getClientID());
        System.out.println(metricProcessing.getMetricName());
        System.out.println(metricProcessing.getTs());
        System.out.println(metricProcessing.getValue());
    }
}
