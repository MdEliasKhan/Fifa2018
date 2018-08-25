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

public class CustomAdapterForFixtures extends ArrayAdapter{
    private Context context;
    private ArrayList<MatchDetails> everyMatchDetails;

    public CustomAdapterForFixtures(@NonNull Context context,@NonNull ArrayList<MatchDetails> everyMatchDetails) {
        super(context, R.layout.custom_fixtures_listview, everyMatchDetails);
        this.context = context;
        this.everyMatchDetails = everyMatchDetails;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final ViewHolder viewHolder;
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.custom_fixtures_listview,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.leftFlag = convertView.findViewById(R.id.leftFalg);
            viewHolder.matchInfo = convertView.findViewById(R.id.matchDetails);
            viewHolder.rightFlag = convertView.findViewById(R.id.rightFlag);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (CustomAdapterForFixtures.ViewHolder) convertView.getTag();
        }

        MatchDetails matchDetails = everyMatchDetails.get(position);
        viewHolder.leftFlag.setImageResource(matchDetails.getLeftFlag());
        viewHolder.matchInfo.setText(matchDetails.getVs() + "\n" + "Date : " + matchDetails.getMatchDate()+"\n"
        +"BD Time : " + matchDetails.getBdTime() + "\nGMT Time : " + matchDetails.getIndianTime() +
                "\nVenue : " + matchDetails.getVanue() + "\n" + matchDetails.getGroup());
        viewHolder.rightFlag.setImageResource(matchDetails.getRightFlag());
        return convertView;
    }
    static class ViewHolder{
        ImageView leftFlag;
        TextView matchInfo;
        ImageView rightFlag;
    }
}
