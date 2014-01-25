package com.arik181.canvastest;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(new HedgeMaze(this));
    }
}
