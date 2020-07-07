package com.baitap.english;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityPractice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);
    }
    public void buttonClicked(View v)
    {
        if(v.getId()==R.id.home)
        {   Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }else if (v.getId() == R.id.learn){
            Intent intent=new Intent(getApplicationContext(),ActivityLearn.class);
            startActivity(intent);
        }
    }
}
