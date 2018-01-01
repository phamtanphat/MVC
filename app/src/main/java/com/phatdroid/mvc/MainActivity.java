package com.phatdroid.mvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity implements Observer,View.OnClickListener{

    private Model model;
    private Button mbutton1;
    private TextView textview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        model = new Model();
        mbutton1 = findViewById(R.id.buttonthing1);
        textview1 = findViewById(R.id.textview1);
        mbutton1.setOnClickListener(this);
        textview1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonthing1 :
                model.setValueIndex(0);
                break;
        }

    }

    @Override
    public void update(Observable observable, Object o) {
        textview1.setText("count " +model.getValueIndex(0));
    }
}
