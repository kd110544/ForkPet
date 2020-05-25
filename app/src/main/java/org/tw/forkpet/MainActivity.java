package org.tw.forkpet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import org.tw.forkpet.pp.petdetector.*;

public class MainActivity extends AppCompatActivity {
    Button btnCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCamera = findViewById(R.id.btncamera);
        btnCamera.setOnClickListener(btnCamera_Click);

    }

    private View.OnClickListener btnCamera_Click = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, ActMain.class);
            startActivity(intent);

        }
    };

}
