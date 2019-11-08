package com.example.videoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import java.io.IOException;

import bg.devlabs.fullscreenvideoview.FullscreenVideoView;

public class MainActivity extends AppCompatActivity {
TextView title, page;
MediaController media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FullscreenVideoView videoView = findViewById(R.id.fullscreenVideoView);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        String videoUrl = "https://ezvidya.s3-ap-southeast-1.amazonaws.com/nursery/NurseryEnglish2-LettersAndWords.mp4";
        videoView.videoUrl(videoUrl).addSeekBackwardButton().addSeekForwardButton().enableAutoStart(); //customize controls

    }

}
