package com.baitap.english;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityLearn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
    }
    public void buttonClicked(View v)
    {
        if(v.getId()==R.id.back_home)
        {   Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.practice){
            Intent intent = new Intent(getApplicationContext(), ActivityPractice.class);
            startActivity(intent);
        }
    }
}
