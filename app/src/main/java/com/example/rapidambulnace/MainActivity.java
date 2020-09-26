package com.example.rapidambulnace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {
@BindView(R.id.test)
    TextView hello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Unbinder unbinder = ButterKnife.bind(this);
//

    }

    @OnClick(R.id.test)
    public  void onClicked()
    {
        startActivity(new Intent( MainActivity.this,RegisterActivity.class));
    }
}