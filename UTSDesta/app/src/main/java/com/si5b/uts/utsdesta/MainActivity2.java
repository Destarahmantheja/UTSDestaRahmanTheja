package com.si5b.uts.utsdesta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {
    private TextView tvNamaLengkap, tvNomorPendaftaran, tvInformasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNomorPendaftaran = findViewById(R.id.tv_nomor_pendaftaran);
        tvInformasi = findViewById(R.id.tv_info);
        tvNamaLengkap = findViewById(R.id.tv_nama_lengkap);


        Intent intent = getIntent();
        tvNamaLengkap.setText(intent.getStringExtra("varNamaLengkap"));
        tvInformasi.setText(intent.getStringExtra("varInformasi"));
        tvNomorPendaftaran.setText(intent.getStringExtra("varNomorPendaftaran"));

    }
}