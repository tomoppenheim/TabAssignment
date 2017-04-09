package com.example.tom.tabassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import   android.widget.TabHost;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TabHost tabHost = (TabHost) findViewById(R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec spec;

        //Tab 1
        spec = tabHost.newTabSpec("Map");
        spec.setContent(R.id.Map);
        spec.setIndicator("Map");
        tabHost.addTab(spec);



        // Tab 2
        spec=tabHost.newTabSpec("web");
        spec.setContent(R.id.Web);
        spec.setIndicator("Web");
        tabHost.addTab(spec);




        // Tab 3
        spec=tabHost.newTabSpec("links");
        spec.setContent(R.id.Links);
        spec.setIndicator("Links");
        tabHost.addTab(spec);
    }
}
