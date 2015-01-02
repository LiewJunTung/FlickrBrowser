package org.example.jt.flickrbrowser;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by jt on 12/31/14.
 */
public class Photo {
    private JSONArray mItems;
    private String mAuthor;
    private String mAuthorId;
    private String mTitle;
    private String mLink;
    private String mImage;
    private GetFlickrJsonData jsonData;

    public Photo(String url) {
        jsonData = new GetFlickrJsonData(url);
        //jsonData.execute();
        setItemArray("items");
        test();
    }

    public void setItemArray(String name){
        try {
            mItems = jsonData.getJSON().getJSONArray(name);
        } catch (JSONException e){
            e.printStackTrace();
        }
    }

    public void test(){
        try {
            Log.d("BILBO", mItems.getJSONObject(1).getString("author"));
        } catch (JSONException e){
            e.printStackTrace();
        }
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public String getmAuthorId() {
        return mAuthorId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmLink() {
        return mLink;
    }

    public String getmImage() {
        return mImage;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "mAuthor='" + mAuthor + '\'' +
                ", mAuthorId='" + mAuthorId + '\'' +
                ", mTitle='" + mTitle + '\'' +
                ", mLink='" + mLink + '\'' +
                ", mImage='" + mImage + '\'' +
                '}';
    }
}
