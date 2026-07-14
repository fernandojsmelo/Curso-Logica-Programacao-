package com.cursos.allydn.anagrama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaPontoActivity extends AppCompatActivity {

    private TextView txtPalavraCerta, statusDoJogo;
    private Button btnJogarNovamente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_ponto);

        txtPalavraCerta = findViewById(R.id.txtPalavraCerta);
        btnJogarNovamente = findViewById(R.id.btnJogarNovamente);
        statusDoJogo = findViewById(R.id.txtStatus);

        //Recuperar a palavra certa
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){

            String pegaAPalavra = String.valueOf(getIntent().getSerializableExtra("palavra"));
            txtPalavraCerta.setText(pegaAPalavra);

            String statusJogo = String.valueOf(getIntent().getSerializableExtra("status"));

            if (statusJogo.equals("acertou")){
                statusDoJogo.setText("Você marcou ponto!");
            }else {
                statusDoJogo.setText("Infelizmente você errou a palavra!");
            }



        }else {

        }

        btnJogarNovamente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}