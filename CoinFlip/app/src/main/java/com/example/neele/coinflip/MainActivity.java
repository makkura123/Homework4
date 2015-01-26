package com.example.neele.coinflip;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    CoinFlip flip = new CoinFlip();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    /*
    * Function for button click
    * Calls flipCoin from CoinFlip class, changes image und textlable depending on result
    */
    public void btnClick (View v){
        TextView tv = (TextView)this.findViewById(R.id.textView);
        ImageView iv = (ImageView)this.findViewById(R.id.imageView);
        if (flip.flipCoin() == 1){
            tv.setText("Head!");
            iv.setImageResource(R.drawable.eurohead);
        }

        else {
            tv.setText("Tails!");
            iv.setImageResource(R.drawable.eurotails);
        }

    }
}
