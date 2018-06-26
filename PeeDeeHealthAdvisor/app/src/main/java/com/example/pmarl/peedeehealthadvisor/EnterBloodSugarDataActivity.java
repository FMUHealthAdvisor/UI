package com.example.pmarl.peedeehealthadvisor;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class EnterBloodSugarDataActivity extends AppCompatActivity
{
    private ImageButton home;
    private ImageButton backBtn;

     @Override
    protected void  onCreate(Bundle saveInstanceState)
     {
         super.onCreate(saveInstanceState);
         setContentView(R.layout.acativty_enter_blood_sugar_data);

        home = (ImageButton) findViewById(R.id.Home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchMainActivity();
            }
        });

        backBtn = (ImageButton) findViewById(R.id.BackBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 launchprevActivity();
             }
         });


     }


    private void launchMainActivity()
    {
        Intent intent = new Intent (this, MainActivity.class);
        intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK | intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();

    }

    private void launchprevActivity()
    {
        Intent intent = new Intent (this, SelectDataActivity.class);
        intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK | intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }


}
