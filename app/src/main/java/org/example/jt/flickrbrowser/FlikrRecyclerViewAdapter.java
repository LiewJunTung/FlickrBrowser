package org.example.jt.flickrbrowser;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by jt on 1/6/15.
 */
public class FlikrRecyclerViewAdapter extends RecyclerView.Adapter<FlikrImageViewHolder> {
    private List<Photo> mPhotoList;
    private Context mContext;
    private String test;

    public FlikrRecyclerViewAdapter(List<Photo> mPhotoList, Context context) {
        this.mPhotoList = mPhotoList;
        mContext = context;
    }

    @Override
    public FlikrImageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.browse, null);
        FlikrImageViewHolder flikrImageViewHolder = new FlikrImageViewHolder(view);
        return flikrImageViewHolder;
    }

    @Override
    public void onBindViewHolder(FlikrImageViewHolder flikrImageViewHolder, int i) {
        Photo photoItem = mPhotoList.get(i);
        Picasso.with(mContext).load(photoItem.getmImage())
                .error(R.drawable.placeholder)
                .placeholder(R.drawable.placeholder)
                .into(flikrImageViewHolder.thumbnail);
        test = photoItem.getmTitle();
        flikrImageViewHolder.title.setText(photoItem.getmTitle());
    }

    @Override
    public int getItemCount() {
        return (null != mPhotoList ? mPhotoList.size() : 0);
    }
}
