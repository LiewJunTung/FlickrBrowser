package org.example.jt.flickrbrowser;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by jt on 12/31/14.
 */
public class GetFlickrJsonData extends GetRawData{

    public GetFlickrJsonData(String mRawData) {
        super(mRawData);
        this.execute();
    }

    public JSONObject getJSON() throws JSONException {
        return new JSONObject(this.mData);
    }
}
