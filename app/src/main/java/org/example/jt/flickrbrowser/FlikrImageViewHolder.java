package org.example.jt.flickrbrowser;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jt on 1/6/15.
 */
public class FlikrImageViewHolder extends RecyclerView.ViewHolder{
    protected ImageView thumbnail;
    protected TextView title;

    public FlikrImageViewHolder(View view) {
        super(view);
        this.thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
        this.title = (TextView) view.findViewById((R.id.title));
    }


}
