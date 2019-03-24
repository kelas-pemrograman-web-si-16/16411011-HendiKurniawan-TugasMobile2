package com.example.tugas_2_mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txtNpm;
    TextView txtNama;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnBack = (Button) findViewById(R.id.btnBack);
        txtNpm = (TextView) findViewById(R.id.txtNpm);
        txtNama = (TextView) findViewById(R.id.txtNama);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(a);
                finish();
            }
        });

        Intent Intent = getIntent();
        String npm = Intent.getStringExtra("npm");
        String nama = Intent.getStringExtra("nama");
        txtNpm.setText(npm);
        txtNama.setText(nama);

    }
}
