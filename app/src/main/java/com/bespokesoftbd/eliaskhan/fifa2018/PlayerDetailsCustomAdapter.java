package com.bespokesoftbd.eliaskhan.fifa2018;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class PlayerDetailsCustomAdapter extends BaseExpandableListAdapter{
    private Context context;
   private List<String> listTeamName;
   private HashMap<String,List<String>> listTeamPlayerName;

    public PlayerDetailsCustomAdapter(Context context, List<String> listTeamName, HashMap<String, List<String>> listTeamPlayerName) {
        this.context = context;
        this.listTeamName = listTeamName;
        this.listTeamPlayerName = listTeamPlayerName;
    }

    @Override
    public int getGroupCount() {
        return listTeamName.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return listTeamPlayerName.get(listTeamName.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return listTeamName.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return listTeamPlayerName.get(listTeamName.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        // For Heder Text
        String teamName = (String) getGroup(i);
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.team_name_layout,null);
        }
        TextView team_nameTv =  view.findViewById(R.id.team_nameTV);
        team_nameTv.setText(teamName);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        // For Child Text
        String teamPlayerName = (String) getChild(i,i1);
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.team_palyer_name_layout,null);
        }
        TextView player_nameTv =  view.findViewById(R.id.playersNamePerTeam);
        player_nameTv.setText(teamPlayerName);
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}
