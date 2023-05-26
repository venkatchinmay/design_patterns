package org.observerdesignpattern.initialdesign;

import org.json.JSONObject;

public class MetricProcessing implements CreateView{

    private String clientID;
    private long ts;
    private double value;
    private String metricName;

    private void setClientID(String clientID){
        this.clientID = clientID;
    }
    public String getClientID(){
        return clientID;
    }

    public long getTs() {
        return ts;
    }

    private void setTs(long ts) {
        this.ts = ts;
    }

    public double getValue() {
        return value;
    }

    private void setValue(double value) {
        this.value = value;
    }
    private void setMetricName(String metricName){
        this.metricName = metricName;
    }
    public String getMetricName(){
        return metricName;
    }

    @Override
    public Object createView(JSONObject jsonObject) {
        this.setClientID(jsonObject.has("clientID")? jsonObject.getString("clientID") : "" );
        this.setTs(jsonObject.has("ts") ? jsonObject.getLong("ts") : 0L);
        this.setValue(jsonObject.has("value")? jsonObject.getDouble("value") : 0d);
        this.setMetricName(jsonObject.has("metric") ? jsonObject.getString("metric") : "");
       return this;
    }
}
