package com.example.infoyear;

import static com.example.infoyear.Year.getLeap;
import static com.example.infoyear.Year.chinese;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button resultButton = (Button) findViewById(R.id.button);
        resultButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inYear = (EditText)findViewById(R.id.inputYear);
                int value = Integer.parseInt(inYear.getText().toString());

                TextView showYear = (TextView)findViewById(R.id.leap);
                s = getLeap(value);
                showYear.setText(s);


                ImageView animalImage = (ImageView) findViewById(R.id.animal);
                int source = chinese(value);
                animalImage.setImageResource(source);
            }
        });
    }
}