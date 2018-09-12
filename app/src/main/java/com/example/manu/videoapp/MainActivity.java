package com.example.manu.videoapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //basic video
        //1. get Video view
        VideoView videoView =(VideoView) findViewById(R.id.videoView);

        //2.point to video resource
        videoView.setVideoPath("android.resource://"+getPackageName()+"/" +R.raw.demo);//use path as URL

        //3. add control

        //4.run video
        videoView.start();

    }
}
