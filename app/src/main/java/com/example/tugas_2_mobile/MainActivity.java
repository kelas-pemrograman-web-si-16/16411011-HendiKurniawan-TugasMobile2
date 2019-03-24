package com.example.tugas_2_mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edNpm;
    EditText edNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        edNpm =(EditText) findViewById(R.id.edNpm);
        edNama = (EditText) findViewById(R.id.edNama);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String npm = edNpm.getText().toString();
                String nama = edNama.getText().toString();
                if (npm.equals("16411011") && nama.equals("Hendi Kurniawan")){
                    Toast.makeText(getApplicationContext(), "Sukses", Toast.LENGTH_LONG).show();
                    Intent a = new Intent(MainActivity.this,MainActivity2.class);
                    MainActivity.this.startActivity(a);
                    a.putExtra("nama", nama);
                    a.putExtra("npm", npm);
                    startActivity(a);
                    finish();
                }else {
                    Toast.makeText(getApplicationContext(), "Input Salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
