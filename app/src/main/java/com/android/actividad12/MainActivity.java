package com.android.actividad12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btnE);

        editText = (EditText) findViewById(R.id.nombre);

        /**
        btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), Activity2.class);
        intent.putExtra("nombre", editText.getText().toString());
        startActivity(intent);
        }
        });
        */

    }

        public void enviarDatos(View v){
        Intent intent = new Intent(getApplicationContext(), Activity2.class);
        intent.putExtra("nombre", editText.getText().toString());
        startActivity(intent);
    }



}