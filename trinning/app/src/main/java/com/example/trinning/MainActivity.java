package com.example.trinning;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        Button b = findViewById(R.id.calculate);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = num1.getText().toString();
                String age  =num2.getText().toString();

                Intent i = new Intent(MainActivity.this,MainActivity2.class );
                i.putExtra("name",name);
                i.putExtra("age",name);

                


              startActivity (i);

            }
        });

        }


}


















