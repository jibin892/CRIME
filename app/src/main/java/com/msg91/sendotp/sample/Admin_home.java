package com.msg91.sendotp.sample;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Admin_home extends AppCompatActivity {
Button phycologist_btn,terapy_btn,event,c,em,emm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);



c=findViewById(R.id.co);
        phycologist_btn=findViewById(R.id.phycologist_btn);
        terapy_btn=findViewById(R.id.terapy_btn);
event=findViewById(R.id.event);
        em=findViewById(R.id.em);
        emm=findViewById(R.id.em2);

        event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jj= new Intent(getApplicationContext(),Teachers_detailes_Admin1.class);
                startActivity(jj );
            }
        });



terapy_btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent j= new Intent(getApplicationContext(),Eventokadminview.class);
        startActivity(j);
    }
});

        phycologist_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(), Teachers_detailes_Admin.class);
                startActivity(i);
            }
        });




        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ie= new Intent(getApplicationContext(), Eventokadminview1.class);
                startActivity(ie);
            }
        });
        em.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ie= new Intent(getApplicationContext(), Phycology.class);
                startActivity(ie);
            }
        });
        emm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ie= new Intent(getApplicationContext(), Phycology1.class);
                startActivity(ie);
            }
        });

    }




}

