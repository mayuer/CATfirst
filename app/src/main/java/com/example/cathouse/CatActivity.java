package com.example.cathouse;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class CatActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.CatHouse:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.Map:
                Intent intent = new Intent();
                intent.setClass(CatActivity.this, Map.class);
                startActivity(intent);
                return true;
                case R.id.communication:
                    Intent intentCom = new Intent();
                    intentCom.setClass(CatActivity.this, CommunicationActivity.class);
                    startActivity(intentCom);
                    return true;
                case R.id.picture:
                    Intent intentpicture = new Intent();
                    intentpicture.setClass(CatActivity.this, PictureActivity.class);
                    startActivity(intentpicture);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
