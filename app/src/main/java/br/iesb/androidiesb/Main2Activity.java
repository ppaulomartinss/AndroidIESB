package br.iesb.androidiesb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.R.attr.defaultValue;
import static android.R.attr.name;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txt = (TextView) findViewById(R.id.textView);

        Intent it = getIntent();

        Double latitude = it.getDoubleExtra ("latitude", 0);
        Double longitude = it.getDoubleExtra ("latitude", 0);

        txt.setText("latitude: " + latitude.toString() + "Longitude: " + longitude.toString());
    }
}
