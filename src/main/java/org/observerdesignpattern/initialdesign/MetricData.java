package org.observerdesignpattern.initialdesign;

import org.json.JSONObject;

public class MetricData {

    private final JSONObject jsonObject;
    public MetricData(JSONObject jsonObject){
       this.jsonObject = jsonObject;
    }

    public AlertProcessing getAlertProcessing(){
        AlertProcessing alertProcessing = new AlertProcessing();
        return (AlertProcessing) alertProcessing.createView(this.jsonObject);
    }

    public MetricProcessing getMetricProcessing(){
        MetricProcessing metricProcessing = new MetricProcessing();
        return (MetricProcessing)  metricProcessing.createView(this.jsonObject);
    }

    public SyntheticMonitoring getSyntheticMonitoring(){
        SyntheticMonitoring syntheticMonitoring = new SyntheticMonitoring();
        return (SyntheticMonitoring) syntheticMonitoring.createView(this.jsonObject);
    }



}
