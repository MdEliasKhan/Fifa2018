package com.bespokesoftbd.eliaskhan.fifa2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class WorldCupDetailsActivity extends AppCompatActivity {
     ArrayList<WorldCupDetails> worldCupDetails;
     ListView listViewWorldCup;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world_cup_details);
        listViewWorldCup = findViewById(R.id.worldCupDetailsLV);
        // for ads
        MobileAds.initialize(this, "ca-app-pub-9736622551342035~6571672357");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        // .....
        worldCupDetails = new ArrayList<>();
        worldCupDetails.add(new WorldCupDetails(R.drawable.flag_uruguay_small,R.drawable.flag_argentina_small,
                getString(R.string.fifa1),getString(R.string.uva),getString(R.string.w_uruguay)));
        worldCupDetails.add(new WorldCupDetails(R.drawable.flag_italy,R.drawable.flag_czech_republic,
                getString(R.string.fifa2),getString(R.string.ivc),getString(R.string.w_italy)));
        worldCupDetails.add(new WorldCupDetails(R.drawable.flag_italy,R.drawable.flag_hungary,
                getString(R.string.fifa_3),getString(R.string.ivh),getString(R.string.w_italy)));
        worldCupDetails.add(new WorldCupDetails(R.drawable.flag_uruguay_small,R.drawable.flag_brazil_small,
                getString(R.string.fifa_4),getString(R.string.uvb),getString(R.string.w_uruguay)));
        worldCupDetails.add(new WorldCupDetails(R.drawable.flag_germany_small,R.drawable.flag_hungary,
                getString(R.string.fifa5),getString(R.string.gbh),getString(R.string.w_west_germany)));
        worldCupDetails.add(new WorldCupDetails(R.drawable.flag_brazil_small,R.drawable.flag_sweden_small,
                getString(R.string.fifa6),getString(R.string.bvs),getString(R.string.w_brazil)));
        worldCupDetails.add(new WorldCupDetails(R.drawable.flag_brazil_small,R.drawable.flag_czech_republic,
                getString(R.string.fifa7),getString(R.string.bvc),getString(R.string.w_brazil) ));
        worldCupDetails.add(new WorldCupDetails(R.drawable.flag_england_small,R.drawable.flag_germany_small,
                getString(R.string.fifa9),getString(R.string.evg),getString(R.string.w_england)));
        worldCupDetails.add(new WorldCupDetails(R.drawable.flag_brazil_small,R.drawable.flag_italy,
                getString(R.string.fifa10),getString(R.string.bvi),getString(R.string.w_brazil)));
        worldCupDetails.add(new WorldCupDetails(R.drawable.flag_germany_small,R.drawable.flag_netherlands,
                getString(R.string.fifa11),getString(R.string.wvn),getString(R.string.w_west_germany)));
        worldCupDetails.add(new WorldCupDetails(R.drawable.flag_argentina_small,R.drawable.flag_netherlands,
                getString(R.string.fifa12),getString(R.string.avn),getString(R.string.w_argentina)));
        worldCupDetails.add(new WorldCupDetails(R.drawable.flag_italy,R.drawable.flag_germany_small,
                getString(R.string.fifa13),getString(R.string.ivg),getString(R.string.w_italy)));
        worldCupDetails.add(new WorldCupDetails(R.drawable.flag_argentina_small,R.drawable.flag_germany_small,
                getString(R.string.fifa14),getString(R.string.avw),getString(R.string.w_argentina)));
        worldCupDetails.add(new WorldCupDetails(R.drawable.flag_germany_small,R.drawable.flag_argentina_small,
                getString(R.string.fofa15),getString(R.string.gca),getString(R.string.w_west_germany)));
        worldCupDetails.add(new WorldCupDetails(R.drawable.flag_brazil_small,R.drawable.flag_italy,
                getString(R.string.fofa16),getString(R.string.bvi),getString(R.string.w_brazil)));
        worldCupDetails.add(new WorldCupDetails(R.drawable.flag_france_small,R.drawable.flag_brazil_small,
                getString(R.string.fifa17),getString(R.string.fvb),getString(R.string.w_france)));
        worldCupDetails.add(new WorldCupDetails(R.drawable.flag_brazil_small,R.drawable.flag_france_small,
                getString(R.string.fifa18),getString(R.string.bvg),getString(R.string.w_brazil)));
        worldCupDetails.add(new WorldCupDetails(R.drawable.flag_italy,R.drawable.flag_france_small,
                getString(R.string.fifa19),getString(R.string.ivf),getString(R.string.w_italy)));
        worldCupDetails.add(new WorldCupDetails(R.drawable.flag_spain_small,R.drawable.flag_netherlands,
                getString(R.string.fifa20),getString(R.string.svn),getString(R.string.w_spain)));
        worldCupDetails.add(new WorldCupDetails(R.drawable.flag_germany_small,R.drawable.flag_argentina_small,
                getString(R.string.fifa21),getString(R.string.gva),getString(R.string.w_germany)));

        CustomAdapterForWorldCup customAdapterForWorldCup = new CustomAdapterForWorldCup(WorldCupDetailsActivity.this,worldCupDetails);
        listViewWorldCup.setAdapter(customAdapterForWorldCup);
    }
}
