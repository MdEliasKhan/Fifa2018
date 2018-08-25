package com.bespokesoftbd.eliaskhan.fifa2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PlayersDetailsActivity extends AppCompatActivity {
    ExpandableListView expandableListView;
    private AdView mAdView;
    List<String> listTeamName;
   PlayerDetailsCustomAdapter playerDetailsCustomAdapter;
    HashMap<String,List<String>> listTeamPlayerName;
    private int lastExpend = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_details);
        // for ads
        MobileAds.initialize(this, "ca-app-pub-9736622551342035~6571672357");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        // .....
        prepareListData();
        expandableListView = findViewById(R.id.expandableLVid);
        playerDetailsCustomAdapter = new PlayerDetailsCustomAdapter(this,listTeamName,listTeamPlayerName);
        expandableListView.setAdapter(playerDetailsCustomAdapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int i) {
                if(lastExpend != -1 && lastExpend !=i){
                    expandableListView.collapseGroup(lastExpend);
                }
                lastExpend = i;
            }
        });
    }

    public void  prepareListData(){
        String[] teamName = getResources().getStringArray(R.array.team_names);
        String[] teamPlayerName = getResources().getStringArray(R.array.team_palyers_name);

        listTeamName = new ArrayList<>();
        listTeamPlayerName = new HashMap<>();

        for(int i=0;i<teamName.length;i++){
            listTeamName.add(teamName[i]);
            List<String> child = new ArrayList<>();
            child.add(teamPlayerName[i]);
            listTeamPlayerName.put(listTeamName.get(i),child);
        }

    }
}
