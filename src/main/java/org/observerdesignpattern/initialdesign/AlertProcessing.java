package org.observerdesignpattern.initialdesign;

import org.json.JSONObject;

public class AlertProcessing implements CreateView{

    private String clientID;
    private double criticalThreshold;
    private double warningThreshold;
    private double value;
    private String metricName;

    public String getClientID() {
        return clientID;
    }

    private void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public double getCriticalThreshold() {
        return criticalThreshold;
    }

    private void setCriticalThreshold(double criticalThreshold) {
        this.criticalThreshold = criticalThreshold;
    }

    public double getWarningThreshold() {
        return warningThreshold;
    }

    private void setWarningThreshold(double warningThreshold) {
        this.warningThreshold = warningThreshold;
    }

    public double getValue() {
        return value;
    }

    private void setValue(double value) {
        this.value = value;
    }

    public String getMetricName() {
        return metricName;
    }

    private void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    @Override
    public Object createView(JSONObject jsonObject) {
        this.setClientID(jsonObject.has("clientID")? jsonObject.getString("clientID") : "" );
        this.setWarningThreshold(jsonObject.has("warningThreshold")?jsonObject.getDouble("warningThreshold") : 0d);
        this.setCriticalThreshold(jsonObject.has("criticalThreshold") ? jsonObject.getDouble("criticalThreshold") : 0d );
        this.setValue(jsonObject.has("value")? jsonObject.getDouble("value") : 0d);
        this.setMetricName(jsonObject.has("metric") ? jsonObject.getString("metric") : "");
      return this;
    }
}
