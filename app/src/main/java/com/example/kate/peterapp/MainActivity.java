package com.example.kate.peterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    final Random rnd = new Random();
    private FrameLayout fl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView vidView = (VideoView)findViewById(R.id.myVideo);


        Uri vidUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.peterkaterun);

        vidView.setVideoURI(vidUri);
        vidView.start();


        fl = (FrameLayout)findViewById(R.id.titlescreenframe);
        fl.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        VideoView vidView = (VideoView)findViewById(R.id.myVideo);

        Uri[] images = {Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.kate_tree), Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.kate_car), Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.peterkaterun), Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.kate_tower), Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.kate_couch), Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.post_run)};
        int n=rnd.nextInt(6);
        vidView.setVideoURI(images[n]);
        vidView.start();
    }
}
