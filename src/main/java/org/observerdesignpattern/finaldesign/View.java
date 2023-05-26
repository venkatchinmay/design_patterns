package org.observerdesignpattern.finaldesign;

import org.json.JSONObject;

public interface View {
    public void createView(JSONObject jsonObject);

    public Object getView();
}
