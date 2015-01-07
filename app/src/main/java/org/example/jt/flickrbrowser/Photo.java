package org.example.jt.flickrbrowser;

import org.json.JSONArray;

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
    private String mTags;
    private GetFlickrJsonData jsonData;

    public Photo(String mTitle, String mAuthor, String mAuthorId, String mLink, String mTags, String mImage) {
        this.mAuthor = mAuthor;
        this.mAuthorId = mAuthorId;
        this.mTitle = mTitle;
        this.mLink = mLink;
        this.mTags = mTags;
        this.mImage = mImage;
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

    public String getmTags() {
        return mTags;
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
