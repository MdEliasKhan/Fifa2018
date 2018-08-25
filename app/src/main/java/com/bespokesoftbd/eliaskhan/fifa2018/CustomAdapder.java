package com.bespokesoftbd.eliaskhan.fifa2018;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapder extends BaseAdapter{
   private Context context;
   private int[] images;
   private String[] features;
   LayoutInflater inflater;

    public CustomAdapder(Context context, int[] images, String[] features) {
        this.context = context;
        this.images = images;
        this.features = features;
    }

    @Override
    public int getCount() {
        return features.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view =  inflater.inflate(R.layout.my_gridview_for_home,viewGroup,false);
        }
        ImageView imageView =  view.findViewById(R.id.imageViewID);
        TextView textView = view.findViewById(R.id.textViewID);

        imageView.setImageResource(images[i]);
        textView.setText(features[i]);
        return view;
    }
    }
