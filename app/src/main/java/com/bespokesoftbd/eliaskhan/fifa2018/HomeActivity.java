package com.bespokesoftbd.eliaskhan.fifa2018;

import android.Manifest;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class HomeActivity extends AppCompatActivity{
    private Intent intent;
    int[] images = {R.drawable.football,R.drawable.groups,R.drawable.teams,
        R.drawable.players,R.drawable.about_this_cup,R.drawable.stadium,R.drawable.news,R.drawable.world_cup};
    String[] features;
    GridView gridView;
    Dialog myDialog;
    AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private static final int MY_PERMISSIONS_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        features = getResources().getStringArray(R.array.home_features);
        myDialog = new Dialog(this);
        CustomAdapder adapder = new CustomAdapder(this,images,features);
        gridView = findViewById(R.id.myGridViewID);
        gridView.setAdapter(adapder);
        // for ads
        MobileAds.initialize(this, "ca-app-pub-9736622551342035~6571672357");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9736622551342035/8431548934");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
        // .....
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String feature = features[i];
                if(feature.equals("FIXTURES")){
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    }
                    intent = new Intent(HomeActivity.this,FixturesActivity.class);
                    startActivity(intent);
                }else if(feature.equals("GROUPS DETAILS")){
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    }
                    intent = new Intent(HomeActivity.this,GroupsActivity.class);
                    startActivity(intent);
                }else if(feature.equals("TEAMS INFO")){
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    }
                    intent = new Intent(HomeActivity.this,TeamsActivity.class);
                    startActivity(intent);
                }else if(feature.equals("PLAYERS DETAILS")){
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    }
                    intent = new Intent(HomeActivity.this,PlayersDetailsActivity.class);
                    startActivity(intent);
                }else if(feature.equals("FIFA HISTORY")){
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    }
                    intent = new Intent(HomeActivity.this,WorldCupDetailsActivity.class);
                    startActivity(intent);
                }else if(feature.equals("THIS FIFA")){
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    }
                    intent = new Intent(HomeActivity.this,AboutThisFifaActivity.class);
                    startActivity(intent);
                }else if(feature.equals("STADIUM INFO")){
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    }
                    intent = new Intent(HomeActivity.this,StadiumActivity.class);
                    startActivity(intent);
                }else if(feature.equals("FIFA NEWS")){
                    intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.fifa.com/news/all-news.html"));
                    if (ActivityCompat.checkSelfPermission(HomeActivity.this, Manifest.permission.ACCESS_NETWORK_STATE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(HomeActivity.this,
                                new String[]{Manifest.permission.ACCESS_NETWORK_STATE},
                                MY_PERMISSIONS_REQUEST);
                        return;
                    }
                    startActivity(intent);
                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.shareApp){
            final String appPackageName = BuildConfig.APPLICATION_ID;
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            String shareSubText = "FIFA World Cup Russia 2018";
            String shareBodyText = "https://play.google.com/store/apps/details?id=" +appPackageName;
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, shareSubText);
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareBodyText);
            startActivity(Intent.createChooser(shareIntent, "Share With"));
        }
        if(item.getItemId() == R.id.exitApp) {
            final AlertDialog.Builder aleartDialogBuilder = new AlertDialog.Builder(HomeActivity.this);
            aleartDialogBuilder.setTitle(R.string.aleart_title);
            aleartDialogBuilder.setMessage(R.string.alert_mes);
            aleartDialogBuilder.setIcon(R.drawable.alert);
            aleartDialogBuilder.setCancelable(false);
            aleartDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });
            aleartDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            AlertDialog alertDialog = aleartDialogBuilder.create();
            alertDialog.show();

        }
        if(item.getItemId()==R.id.rateApp ){
            rateApp();
        }
        if(item.getItemId() == R.id.aboutUs){
            TextView txtClose;
            myDialog.setContentView(R.layout.custom_popup);
            txtClose = myDialog.findViewById(R.id.txtCloseID);
            txtClose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    myDialog.dismiss();
                }
            });
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            myDialog.show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder aleartDialogBuilder = new AlertDialog.Builder(HomeActivity.this);
        aleartDialogBuilder.setTitle(R.string.aleart_title);
        aleartDialogBuilder.setMessage(R.string.alert_mes);
        aleartDialogBuilder.setIcon(R.drawable.alert);
        aleartDialogBuilder.setCancelable(false);
        aleartDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        aleartDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alertDialog = aleartDialogBuilder.create();
        alertDialog.show();
    }

    /*
     * Start with rating the app
     * Determine if the Play Store is installed on the device
     *
     * */
    public void rateApp() {
        try {
            Intent rateIntent = rateIntentForUrl("market://details");
            startActivity(rateIntent);
        }
        catch (ActivityNotFoundException e) {
            Intent rateIntent = rateIntentForUrl("https://play.google.com/store/apps/details");
            startActivity(rateIntent);
        }
    }

    private Intent rateIntentForUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(String.format("%s?id=%s", url, getPackageName())));
        int flags = Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_MULTIPLE_TASK;
        if (Build.VERSION.SDK_INT >= 21)
        {
            flags |= Intent.FLAG_ACTIVITY_NEW_DOCUMENT;
        }
        else
        {
            flags |= Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET;
        }
        intent.addFlags(flags);
        return intent;
    }
    @Override
    public void onRequestPermissionsResult(int requestCode,String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    reload();
                } else {
                    reload();
                }
            }
        }
    }
    public void reload(){
        intent = new Intent(HomeActivity.this,HomeActivity.class);
        startActivity(intent);
    }
}
