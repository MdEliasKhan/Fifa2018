package com.bespokesoftbd.eliaskhan.fifa2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

import java.util.ArrayList;

public class FixturesActivity extends AppCompatActivity implements RewardedVideoAdListener{
     ArrayList<MatchDetails> matchDetails;
     ListView listView;
    private AdView mAdView;
    private RewardedVideoAd mAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixtures);
        listView = findViewById(R.id.showfixtutes);
        // for ads
        MobileAds.initialize(this, "ca-app-pub-9736622551342035/1674568895");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        // .....
        //Rewarded ads
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        mAd = MobileAds.getRewardedVideoAdInstance(this);
        mAd.setRewardedVideoAdListener((RewardedVideoAdListener) this);
        loadRewardedVideoAd();
        //------------
        matchDetails = new ArrayList<>();
        matchDetails.add(new MatchDetails(R.drawable.flag_russia_small,R.drawable.flag_saudi_arabia_small,
                getString(R.string.match1),"14-June-2018","9.00 PM",
                "4.00 PM","Moscow, Rassia","Group : A, Match(1)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_egypt_small,R.drawable.flag_uruguay_small,
                getString(R.string.match2),"15-June-2018","6.00 PM",
                "1.00 PM","Ekaterinburg","Group : A, Match(2)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_morocco_small,R.drawable.flag_iran_small,
                getString(R.string.match3),"15-June-2018","9.00 PM",
                "4.00 PM","St Petersburg","Group : B, Match(3)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_portugal_small,R.drawable.flag_spain_small,
                getString(R.string.match4),"16-June-2018","12.00 AM",
                "7.00 PM","Sochi","Group :B, Match(4)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_france_small,R.drawable.flag_australia_small,
                getString(R.string.match5),"16-June-2018","4.00 PM",
                "11.00 AM","Kazan","Group :C, Match(5)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_argentina_small,R.drawable.flag_iceland_small,
                getString(R.string.march6),"16-June-2018","7.00 PM",
                "2.00 PM","Moscow (Spartak)","Group : D, Match(6)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_peru_small,R.drawable.flag_denmark_small,
                getString(R.string.match7),"16-June-2018","10.00 PM",
                "5.00 PM","Saransk","Group : C, Match(7)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_croatia_small,R.drawable.flag_nigeria_small,
                getString(R.string.match8),"17-June-2018","10.00 AM",
                "8.00 PM","Kaliningrad","Group : D, Match(8)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_costa_rica_small,R.drawable.flag_serbia_small,
                getString(R.string.match9),"17-June-2018","6.00 PM",
                "1.00 PM","Samara","Group :E, Match(9)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_germany_small,R.drawable.flag_mexico_small,
                getString(R.string.match10),"17-June-2018","9.00 PM",
                "4.00 PM","Moscow (Luzhniki)","Group : F, Match(10)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_brazil_small,R.drawable.flag_switzerland_small,
                getString(R.string.match11),"18-June-2018","12.00 AM",
                "7.00 PM","Rostov-on-Don","Group : E, Match(11)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_sweden_small,R.drawable.flag_korea_south,
                getString(R.string.match12),"18-June-2018","6.00 PM",
                "1.00 PM","Nizhny Novgorod","Group : F, Match(12)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_belgium_small,R.drawable.flag_panama_small,
                getString(R.string.match13),"18-June-2018","9.00 PM",
                "4.00 PM","Sochi","Group : G, Match(13)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_tunisia_small,R.drawable.flag_england_small,
                getString(R.string.match14),"19-June-2018","12.00 AM",
                "7.00 PM","Volgograd","Group : G, Match(14)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_colombia_small,R.drawable.flag_japan_small,
                getString(R.string.march15),"19-June-2018","6.00 PM",
                "4.00 PM","Saransk","Group : H, Match(15)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_poland_small,R.drawable.flag_senegal_small,
                getString(R.string.match16),"19-June-2018","9.00 PM",
                "1.00 PM","Moscow (Spartak)","Group : H, Match(16)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_russia_small,R.drawable.flag_egypt_small,
                getString(R.string.match17),"20-June-2018","12.00 AM",
                "7.00 PM","St Petersburg","Group : A, Match(17)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_portugal_small,R.drawable.flag_morocco_small,
                getString(R.string.match18),"20-June-2018","6.00 PM",
                "1.00 PM","Moscow (Luzhniki)","Group : B, Match(18)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_uruguay_small,R.drawable.flag_saudi_arabia_small,
                getString(R.string.match19),"20-June-2018","9.00 PM",
                "4.00 PM","Rostov-on-Don","Group : A, Match(19)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_iran_small,R.drawable.flag_spain_small,
                getString(R.string.match20),"21-June-2018","12.00 AM",
                "7.00 PM","Kazan","Group : B, Match(20)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_denmark_small,R.drawable.flag_australia_small,
                getString(R.string.march21),"21-June-2018","6.00 PM",
                "4.00 PM","Samara","Group : C, Match(21)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_france_small,R.drawable.flag_peru_small,
                getString(R.string.match22),"21-June-2018","9.00 PM",
                "1.00 PM","Ekaterinburg","Group : C, Match(22)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_argentina_small,R.drawable.flag_croatia_small,
                getString(R.string.match23),"22-June-2018","12.00 AM",
                "7.00 PM","Nizhny Novgorod","Group : D, Match(23)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_brazil_small,R.drawable.flag_costa_rica_small,
                getString(R.string.match24),"22-June-2018","6.00 PM",
                "1.00 PM","St Petersburg","Group : E, Match(24)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_nigeria_small,R.drawable.flag_iceland_small,
                getString(R.string.match25),"22-June-2018","9.00 PM",
                "4.00 PM","Volgograd","Group : D, Match(25)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_serbia_small,R.drawable.flag_switzerland_small,
                getString(R.string.match26),"23-June-2018","12.00 AM",
                "7.00 PM","Kaliningrad","Group : E,Match(26)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_belgium_small,R.drawable.flag_tunisia_small,
                getString(R.string.match27),"23-June-2018","6.00 PM",
                "1.00 PM","Moscow (Spartak)","Group : G,Match(27)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_korea_south,R.drawable.flag_mexico_small,
                getString(R.string.match28),"23-June-2018","9.00 PM",
                "7.00 PM","Rostov-on-Don","Group : F, Match(28)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_germany_small,R.drawable.flag_sweden_small,
                getString(R.string.match29),"24-June-2018","12.00 AM",
                "4.00 PM","Sochi","Group : F,Match(29)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_england_small,R.drawable.flag_panama_small,
                getString(R.string.match30),"24-June-2018","6.00 PM",
                "1.00 PM","Nizhny Novgorod","Group : G,Match(30)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_japan_small,R.drawable.flag_senegal_small,
                getString(R.string.match31),"24-June-2018","9.00 PM",
                "4.00 PM","Ekaterinburg","Group : H,Match(31)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_poland_small,R.drawable.flag_colombia_small,
                getString(R.string.match32),"25-June-2018","12.00 AM",
                "7.00 PM","Kazan","Group : H,Match(32)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_saudi_arabia_small,R.drawable.flag_egypt_small,
                getString(R.string.match33),"25-June-2018","8.00 PM",
                "3.00 PM","Volgograd","Group : A, Match(33)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_uruguay_small,R.drawable.flag_russia_small,
                getString(R.string.match34),"25-June-2018","8.00 PM",
                "3.00 PM","Samara","Group : A, Match(34)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_iran_small,R.drawable.flag_portugal_small,
                getString(R.string.match35),"26-June-2018","12.00 AM",
                "7.00 PM","Saransk","Group : B,Match(35)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_spain_small,R.drawable.flag_morocco_small,
                getString(R.string.match36),"26-June-2018","12.00 AM",
                "7.00 PM","Kaliningrad","Group : B, Match(36)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_australia_small,R.drawable.flag_peru_small,
                getString(R.string.match37),"26-June-2018","8.00 PM",
                "3.00 PM","Sochi","Group : C, Match(37)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_denmark_small,R.drawable.flag_france_small,
                getString(R.string.match38),"26-June-2018","8.00 PM",
                "3.00 PM","Moscow (Luzhniki)","Group : C, Match(38)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_nigeria_small,R.drawable.flag_argentina_small,
                getString(R.string.match39),"27-June-2018","12.00 AM",
                "7.00 PM","St Petersburg","Group : D,Match(39)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_iceland_small,R.drawable.flag_croatia_small,
                getString(R.string.match40),"27-June-2018","12.00 AM",
                "7.00 PM","Rostov-on-Don","Group : D, Match(40)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_korea_south,R.drawable.flag_germany_small,
                getString(R.string.match41),"27-June-2018","8.00 PM",
                "3.00 PM","Kazan","Group : F, Match(41)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_mexico_small,R.drawable.flag_sweden_small,
                getString(R.string.match42),"27-June-2018","8.00 PM",
                "3.00 PM","Ekaterinburg","Group : F, Match(42)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_switzerland_small,R.drawable.flag_costa_rica_small,
                getString(R.string.match43),"28-June-2018","12.00 AM",
                "7.00 PM","Nizhny Novgorod","Group : E, Match(43)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_serbia_small,R.drawable.flag_brazil_small,
                getString(R.string.match44),"28-June-2018","12.00 AM",
                "7.00 PM","Moscow (Spartak)","Group : E, Match(44)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_senegal_small,R.drawable.flag_colombia_small,
                getString(R.string.match45),"28-June-2018","8.00 PM",
                "3.00 PM","Samara","Group : H, Match(45)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_japan_small,R.drawable.flag_poland_small,
                getString(R.string.match46),"28-June-2018","8.00 PM",
                "3.00 PM","Volgograd","Group : H, Match(46)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_england_small,R.drawable.flag_belgium_small,
                getString(R.string.match47),"29-June-2018","12.00 AM",
                "7.00 PM","Kaliningrad","Group : G,Match(47)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_panama_small,R.drawable.flag_tunisia_small,
                getString(R.string.match48),"29-June-2018","12.00 AM",
                "7.00 PM","Saransk","Group : G, Match(48)"));
        matchDetails.add(new MatchDetails(R.drawable.unknown_offwhite,R.drawable.unknown_offwhite,
                getString(R.string.match49),"30-June-2018","12.00 AM",
                "7.00 PM","Sochi","A VS B, Match(49)"));
        matchDetails.add(new MatchDetails(R.drawable.unknown_offwhite,R.drawable.unknown_offwhite,
                getString(R.string.match50),"30-June-2018","8.00 PM",
                "3.00 PM","Kazan","C VS D, Match(50)"));
        matchDetails.add(new MatchDetails(R.drawable.unknown_offwhite,R.drawable.unknown_offwhite,
                getString(R.string.match51),"01-July-2018","8.00 PM",
                "3.00 PM","Moscow","A VS B, Match(51)"));
        matchDetails.add(new MatchDetails(R.drawable.unknown_offwhite,R.drawable.unknown_offwhite,
                getString(R.string.match52),"01-July-2018","12.00 AM",
                "7.00 PM","Nizhny Novgorod","D VS C, Match(52)"));
        matchDetails.add(new MatchDetails(R.drawable.unknown_offwhite,R.drawable.unknown_offwhite,
                getString(R.string.match53),"02-July-2018","8.00 PM",
                "3.00 PM","Samara","E VS F, Match(53)"));
        matchDetails.add(new MatchDetails(R.drawable.unknown_offwhite,R.drawable.unknown_offwhite,
                getString(R.string.match54),"02-July-2018","12.00 AM",
                "7.00 PM","Rostov-on-Don","G VS H, Match(54)"));
        matchDetails.add(new MatchDetails(R.drawable.unknown_offwhite,R.drawable.unknown_offwhite,
                getString(R.string.match55),"03-July-2018","8.00 PM",
                "3.00 PM","St Petersburg","F VS E, Match(55)"));
        matchDetails.add(new MatchDetails(R.drawable.unknown_offwhite,R.drawable.unknown_offwhite,
                getString(R.string.match56),"03-July-2018","12.00 AM",
                "7.00 PM","Moscow (Spartak)","H VS G, Match(56)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_unknown_small,R.drawable.flag_unknown_small,
                getString(R.string.match57),"06-July-2018","8.00 PM",
                "3.00 PM","Nizhny Novgorod","Quarter Final,Match(57)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_unknown_small,R.drawable.flag_unknown_small,
                getString(R.string.match58),"06-July-2018","12.00 AM",
                "7.00 PM","Kazan","Quarter Final,Match(58)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_unknown_small,R.drawable.flag_unknown_small,
                getString(R.string.match59),"07-July-2018","8.00 PM",
                "3.00 PM","Samara","Quarter Final,Match(59)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_unknown_small,R.drawable.flag_unknown_small,
                getString(R.string.match60),"07-July-2018","12.00 AM",
                "7.00 PM","Sochi","Quarter Final,Match(60)"));
        matchDetails.add(new MatchDetails(R.drawable.unknown_offwhite,R.drawable.unknown_offwhite,
                getString(R.string.match61),"10-July-2018","12.00 AM",
                "7.00 PM","St Petersburg","Semi Final,Match(61)"));
        matchDetails.add(new MatchDetails(R.drawable.unknown_offwhite,R.drawable.unknown_offwhite,
                getString(R.string.match62),"11-July-2018","12.00 AM",
                "7.00 PM","Moscow (Luzhniki)","Semi Final,Match(62)"));
        matchDetails.add(new MatchDetails(R.drawable.unknown_offwhite,R.drawable.unknown_offwhite,
                getString(R.string.match63),"14-July-2018","8.00 PM",
                "3.00 PM","St Petersburg","Third Place Play-Off,Match(62)"));
        matchDetails.add(new MatchDetails(R.drawable.flag_unknown_small,R.drawable.flag_unknown_small,
                getString(R.string.match64),"15-July-2018","9.00 PM",
                "4.00 PM","Moscow (Luzhniki)","Fifa World cup Final"));

        CustomAdapterForFixtures customAdapterForFixtures = new CustomAdapterForFixtures(FixturesActivity.this,matchDetails);
        listView.setAdapter(customAdapterForFixtures);
    }

    private void loadRewardedVideoAd() {
        mAd.loadAd("ca-app-pub-9736622551342035/1674568895",
                new AdRequest.Builder().build());
    }

    @Override
    public void onRewardedVideoAdLoaded() {
        try {
            if (mAd.isLoaded()) {
                mAd.show();
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {

    }

    @Override
    public void onRewarded(RewardItem rewardItem) {

    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

    @Override
    public void onRewardedVideoCompleted() {

    }
}
