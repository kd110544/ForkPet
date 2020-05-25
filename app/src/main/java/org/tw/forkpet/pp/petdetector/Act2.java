package org.tw.forkpet.pp.petdetector;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.tw.forkpet.R;
import org.tw.forkpet.pp.petdetector.tracking.MultiBoxTracker;

public class Act2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act2);

        TextView txtName = findViewById(R.id.txtCatBreed);
        txtName.setText("貓的品種是:" +MultiBoxTracker.callBreed());

        TextView txtAttribute = findViewById(R.id.txtAccuracy);
        txtAttribute.setText("辨識準確度:"+ String.format("%.3f",MultiBoxTracker.callAccuracy()));

//        TextView txtCatColor = findViewById(R.id.txtCatColor);
//        txtCatColor.setText("貓的顏色是:"+MultiBoxTracker.callCatColor());


    }
}
