package com.bespokesoftbd.eliaskhan.fifa2018;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StadiumActivity extends AppCompatActivity {
    Dialog myDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stadium);
        myDialog = new Dialog(this);
    }

    public void luzhnikiInfo(View view) {
        TextView txtClose;
        TextView details;
        myDialog.setContentView(R.layout.custom_popup_for_stadium);
        txtClose = myDialog.findViewById(R.id.txtCloseID);
        details = myDialog.findViewById(R.id.stadiumDetails);
        details.setText(R.string.luzhniki_Details);
        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void saint(View view) {
        TextView txtClose;
        TextView details;
        myDialog.setContentView(R.layout.custom_popup_for_stadium);
        txtClose = myDialog.findViewById(R.id.txtCloseID);
        details = myDialog.findViewById(R.id.stadiumDetails);
        details.setText(R.string.saint_Details);
        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void fisht(View view) {
        TextView txtClose;
        TextView details;
        myDialog.setContentView(R.layout.custom_popup_for_stadium);
        txtClose = myDialog.findViewById(R.id.txtCloseID);
        details = myDialog.findViewById(R.id.stadiumDetails);
        details.setText(R.string.fisht_details);
        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void ekaterinburg(View view) {
        TextView txtClose;
        TextView details;
        myDialog.setContentView(R.layout.custom_popup_for_stadium);
        txtClose = myDialog.findViewById(R.id.txtCloseID);
        details = myDialog.findViewById(R.id.stadiumDetails);
        details.setText(R.string.ekaterinburg_details);
        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void kazan(View view) {
        TextView txtClose;
        TextView details;
        myDialog.setContentView(R.layout.custom_popup_for_stadium);
        txtClose = myDialog.findViewById(R.id.txtCloseID);
        details = myDialog.findViewById(R.id.stadiumDetails);
        details.setText(R.string.kazan_details);
        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void nizhny(View view) {
        TextView txtClose;
        TextView details;
        myDialog.setContentView(R.layout.custom_popup_for_stadium);
        txtClose = myDialog.findViewById(R.id.txtCloseID);
        details = myDialog.findViewById(R.id.stadiumDetails);
        details.setText(R.string.nizhny_details);
        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void rostov(View view) {
        TextView txtClose;
        TextView details;
        myDialog.setContentView(R.layout.custom_popup_for_stadium);
        txtClose = myDialog.findViewById(R.id.txtCloseID);
        details = myDialog.findViewById(R.id.stadiumDetails);
        details.setText(R.string.rostov_details);
        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void samara(View view) {
        TextView txtClose;
        TextView details;
        myDialog.setContentView(R.layout.custom_popup_for_stadium);
        txtClose = myDialog.findViewById(R.id.txtCloseID);
        details = myDialog.findViewById(R.id.stadiumDetails);
        details.setText(R.string.samara_details);
        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void saransh(View view) {
        TextView txtClose;
        TextView details;
        myDialog.setContentView(R.layout.custom_popup_for_stadium);
        txtClose = myDialog.findViewById(R.id.txtCloseID);
        details = myDialog.findViewById(R.id.stadiumDetails);
        details.setText(R.string.saransk_details);
        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void volgograd(View view) {
        TextView txtClose;
        TextView details;
        myDialog.setContentView(R.layout.custom_popup_for_stadium);
        txtClose = myDialog.findViewById(R.id.txtCloseID);
        details = myDialog.findViewById(R.id.stadiumDetails);
        details.setText(R.string.volgograd_details);
        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void moscowNew(View view) {
        TextView txtClose;
        TextView details;
        myDialog.setContentView(R.layout.custom_popup_for_stadium);
        txtClose = myDialog.findViewById(R.id.txtCloseID);
        details = myDialog.findViewById(R.id.stadiumDetails);
        details.setText(R.string.moscow_2_details);
        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void kalini(View view) {
        TextView txtClose;
        TextView details;
        myDialog.setContentView(R.layout.custom_popup_for_stadium);
        txtClose = myDialog.findViewById(R.id.txtCloseID);
        details = myDialog.findViewById(R.id.stadiumDetails);
        details.setText(R.string.kaliningrad_details);
        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
}
