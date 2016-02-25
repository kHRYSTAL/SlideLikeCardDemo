package me.khrystal.cardslidepanneldemo;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MasterActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);
    }


    public void cardOnClick(View view) {
        Intent intent = new Intent(MasterActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void pagerOnClick(View view) {
        Intent intent = new Intent(MasterActivity.this,PagerActivity.class);
        startActivity(intent);
    }
}
