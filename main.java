package com.example.lotre;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1, t2,t3,t4;
        Button b1;

        t1 =(TextView) findViewById(R.id.textView);
        t2 =(TextView) findViewById(R.id.textView2);
        t3 =(TextView) findViewById(R.id.textView3);
        t4 =(TextView) findViewById(R.id.textView4);
        b1 =(Button) findViewById(R.id.button);
        Random r = new Random();
        int rand = r.nextInt(99);
        int rand2 = r.nextInt(99);
        int rand3 = r.nextInt(99);
        int rand4 = r.nextInt(99);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(rand);
                t2.setText(rand2);
                t3.setText(rand3);
                t4.setText(rand4);
            }
        });


    }
}
