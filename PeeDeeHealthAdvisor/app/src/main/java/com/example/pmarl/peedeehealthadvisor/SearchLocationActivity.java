package com.example.pmarl.peedeehealthadvisor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class SearchLocationActivity extends AppCompatActivity
{
    private ImageButton home;
    private ImageButton backBtn;

    @Override
    protected void  onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_search_location);



        this.home = (ImageButton) findViewById(R.id.Home);

        this.home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchMainActivity();
            }
        });


        this.backBtn = (ImageButton) findViewById(R.id.BackBtn);

        this.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchPrevActivity();
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

    private void launchPrevActivity()
    {
        Intent intent = new Intent(this, SearchServiceActivity.class);
        intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK | intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }
}
