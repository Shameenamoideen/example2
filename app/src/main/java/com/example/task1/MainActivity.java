package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView img;
    TextView txt;
    Button skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.textView);
        img=findViewById(R.id.imageView);
        skip=findViewById(R.id.button);
        txt.setOnClickListener(this);
        img.setOnClickListener(this);
        skip.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.button){
            Toast.makeText(this, "skip clikked", Toast.LENGTH_SHORT).show();
        }


    }
}