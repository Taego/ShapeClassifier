package com.development.fischer.shapeclassifier;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }

    public void identify (View view){

        Intent intent = new Intent(this, identify.class);
        startActivity(intent);
    }

    public void settings (View view){

        Intent intent = new Intent(this, settings.class);
        startActivity(intent);
    }

    public void close (View view){

        finish();
    }

}
