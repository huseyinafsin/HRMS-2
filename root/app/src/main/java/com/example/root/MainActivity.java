package com.example.root;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            Runtime.getRuntime().exec("su");
            Runtime.getRuntime().exec("reboot");
            
        } catch (Exception e) {
        }
    }
}