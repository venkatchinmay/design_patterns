package org.observerdesignpattern.finaldesign.execution;

import org.json.JSONObject;
import org.observerdesignpattern.finaldesign.AlertProcessing;
import org.observerdesignpattern.finaldesign.MetricData;
import org.observerdesignpattern.finaldesign.MetricProcessing;


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

        MetricData metricData = new MetricData();
        MetricProcessing metricProcessing = new MetricProcessing(metricData);
        AlertProcessing alertProcessing = new AlertProcessing(metricData);
        metricData.receiveMetricData(jsonObject);
        MetricProcessing metricView = (MetricProcessing) metricProcessing.getView();
        AlertProcessing alertView = (AlertProcessing) alertProcessing.getView();
        System.out.println(metricView.getClientID());
        System.out.println(metricView.getMetricName());
        System.out.println(metricView.getTs());
        System.out.println(metricView.getValue());
        System.out.println("----------------------");
        System.out.println(alertView.getClientID());
        System.out.println(alertView.getMetricName());
        System.out.println(alertView.getCriticalThreshold());
        System.out.println(alertView.getWarningThreshold());



    }
}
