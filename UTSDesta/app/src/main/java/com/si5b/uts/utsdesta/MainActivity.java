package com.si5b.uts.utsdesta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

private EditText etNamaLengkap, etNomorPendaftaran;
private Button btnDaftar;
private CheckBox cbFacebook, cbInstagram, cbWebsite;
private TextView tvFormulirPendaftaran, tvInformasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNamaLengkap = findViewById(R.id.et_nama_lengkap);
        etNomorPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        cbFacebook = findViewById(R.id.cb_facebook);
        cbInstagram = findViewById(R.id.cb_instagram);
        cbWebsite = findViewById(R.id.cb_website);
        tvFormulirPendaftaran = findViewById(R.id.tv_formulir_pendaftaran);
        tvInformasi = findViewById(R.id.tv_informasi);

        btnDaftar = findViewById(R.id.btn_daftar);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                }

        });
         

    }
}