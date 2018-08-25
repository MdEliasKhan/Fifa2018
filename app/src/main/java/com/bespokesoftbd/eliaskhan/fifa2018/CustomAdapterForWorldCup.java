package com.bespokesoftbd.eliaskhan.fifa2018;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapterForWorldCup extends ArrayAdapter{
    private Context context;
    private ArrayList<WorldCupDetails> everyWorldCupDetails;

    public CustomAdapterForWorldCup(@NonNull Context context,@NonNull ArrayList<WorldCupDetails> everyWorldCupDetails) {
        super(context, R.layout.custom_fifahistory_listview, everyWorldCupDetails);
        this.context = context;
        this.everyWorldCupDetails = everyWorldCupDetails;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final ViewHolder viewHolder;
        if(convertView == null){
            convertView =   LayoutInflater.from(context).inflate(R.layout.custom_fifahistory_listview,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.falgLeft = convertView.findViewById(R.id.flag_one);
            viewHolder.details = convertView.findViewById(R.id.worldCupDetailsTV);
            viewHolder.flagRight = convertView.findViewById(R.id.flag_two);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        WorldCupDetails worldCupDetails = everyWorldCupDetails.get(position);
        viewHolder.falgLeft.setImageResource(worldCupDetails.getFlagLeft());
        viewHolder.flagRight.setImageResource(worldCupDetails.getFlagRight());
        viewHolder.details.setText("Year : " + worldCupDetails.getWorldCupYear() +
                "\n" + worldCupDetails.getVs() + "\nWinner : " + worldCupDetails.getWinnerTeam());
        return convertView;
    }

    static class ViewHolder{
        ImageView falgLeft;
        TextView details;
        ImageView flagRight;
    }
}
