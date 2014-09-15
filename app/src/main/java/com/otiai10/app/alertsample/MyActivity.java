package com.otiai10.app.alertsample;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.app.AlertDialog;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("marker00", "MyActivity.onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("AlertSample");
        builder.setMessage("いえーい、元気？");
        builder.setPositiveButton("元気っす", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.d("marker00", "元気らしいですよ、っと");
            }
        });
        builder.setNegativeButton("いや、ちょっと...", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.d("marker00", "元気じゃないってさ");
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d("marker00", "MyActivity.onCreateOptionsMenu");
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d("marker00", "MyActivity.onOptionsItemSelected");
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
