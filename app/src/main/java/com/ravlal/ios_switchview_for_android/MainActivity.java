package com.ravlal.ios_switchview_for_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.ravlal.ravlaliosswitchview.RavlaliOSSwitchView;

public class MainActivity extends AppCompatActivity {
    RavlaliOSSwitchView ravlaliOSSwitchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ravlaliOSSwitchView = (RavlaliOSSwitchView) findViewById(R.id.switchView);
        ravlaliOSSwitchView.setOnCheckedChangeListener(new RavlaliOSSwitchView.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RavlaliOSSwitchView switchView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "onCheckedChanged: " + isChecked,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}