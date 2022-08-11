package com.example.trinning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView ruslt1= findViewById(R.id.num1);
        TextView ruslt2= findViewById(R.id.num2);

        Bundle b = getIntent().getExtras();
        String rus= b.getString("name" );
        String rus2 = b.getString("age");

        ruslt1.setText(rus);
        ruslt2.setText(rus2);






    }
}