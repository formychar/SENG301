package com.example.shahab.waitingtimecalculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    ImageButton starbucks;
    ImageButton timhortons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        starbucks = (ImageButton) findViewById(R.id.imageButton);
        timhortons = (ImageButton) findViewById(R.id.imageButton2);

        starbucks.setOnClickListener(this);
        timhortons.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

            switch(v.getId()) {
                case R.id.imageButton:  // StarBucks
                    starbucks();
                    break;
                case R.id.imageButton2:
                    timhortons();
                    break;

            }

    }

    private void starbucks(){

        startActivity(new Intent(".page2"));
    }

    private void timhortons(){

        startActivity(new Intent(".page2"));
    }
}
