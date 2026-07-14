package com.cursos.allydn.enigma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //final é uma constante ou seja, um valor que não muda
    private static final String dadosApp = "ArquivoDados";

    private TextView txtPontos, txtValorImagem1, txtValorImagem2, txtValorImagem3;
    private ImageView imgValorImagem1, imgValorImagem2, imgValorImagem3;
    private Button btnJogarNovamente, btnResposta1, btnResposta2, btnResposta3;
    private TextView txtInstrucoes;
    private Button btnFacil, btnIntermediario, btnAvancado;

    private ImageView linha1_Imagem_1_1, linha1_Imagem_1_2, linha1_Imagem_2_1, linha1_Imagem_2_2, linha1_Imagem_3_1, linha1_Imagem_3_2;
    private ImageView linha2_Imagem_1_1, linha2_Imagem_1_2, linha2_Imagem_2_1, linha2_Imagem_2_2, linha2_Imagem_3_1, linha2_Imagem_3_2;
    private ImageView linha3_Imagem_1_1, linha3_Imagem_1_2, linha3_Imagem_2_1, linha3_Imagem_2_2, linha3_Imagem_3_1, linha3_Imagem_3_2;
    private ImageView linha4_Imagem_1_1, linha4_Imagem_1_2, linha4_Imagem_2_1, linha4_Imagem_2_2, linha4_Imagem_3_1, linha4_Imagem_3_2;

    private TextView operador1_linha1, operador2_linha1, txtResposta1;
    private TextView operador1_linha2, operador2_linha2, txtResposta2;
    private TextView operador1_linha3, operador2_linha3, txtResposta3;
    private TextView operador1_linha4, operador2_linha4, txtResposta4;

    private TextView msgPergunta, txtDetalheRespostaLinha1, txtDetalheRespostaLinha2, txtDetalheRespostaLinha3, txtDetalheRespostaLinha4, txtValoresLinha4;

    private LinearLayout llResolva, llNumeroEImagens, llConferirResultado, llNiveis, llBotoesOpcoesResposta;

    private String palavraEmbaralhada, oResultado, ordemResultado, ordemResposta;
    private String letra1, letra2, letra3, letra4, letra5, letra6, letra7, letra8, letra9, letra10;
    private String letra11, letra12;

    private String nDistResultado1, nDistResultado2;
    private String distorceResultado1;

    private int v1, v2, v3;
    private int soma1, soma2, soma3, resultado1, pontos;
    private String nivel;
    private String queOperacao1, queOperacao2;
    private String tipoOperacao1, tipoOperacao2, tipoOperacao3, tipoOperacao4, queOperacao3, queOperacao4;
    private String qtdImagens1, qtdImagens2, qtdImagens3, qtdImagens4, qtdImagens5, qtdImagens6, qtdImagens7, qtdImagens8, qtdImagens9, qtdImagens10, qtdImagens11, qtdImagens12;
    private String numeroDeImagensLinha1_1, numeroDeImagensLinha1_2, numeroDeImagensLinha1_3, numeroDeImagensLinha2_1, numeroDeImagensLinha2_2, numeroDeImagensLinha2_3, numeroDeImagensLinha3_1, numeroDeImagensLinha3_2, numeroDeImagensLinha3_3, numeroDeImagensLinha4_1, numeroDeImagensLinha4_2, numeroDeImagensLinha4_3;
    private int totalImagensLinha1_1, totalImagensLinha1_2, totalImagensLinha1_3, totalImagensLinha2_1, totalImagensLinha2_2, totalImagensLinha2_3, totalImagensLinha3_1, totalImagensLinha3_2, totalImagensLinha3_3, totalImagensLinha1_10, totalImagensLinha1_11, totalImagensLinha1_12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPontos = findViewById(R.id.txtPontos);
        txtValorImagem1 = findViewById(R.id.txtValorImagem1);
        txtValorImagem2 = findViewById(R.id.txtValorImagem2);
        txtValorImagem3 = findViewById(R.id.txtValorImagem3);
        txtInstrucoes = findViewById(R.id.txtInstrucoes);

        imgValorImagem1 = findViewById(R.id.imgValorImagem1);
        imgValorImagem2 = findViewById(R.id.imgValorImagem2);
        imgValorImagem3 = findViewById(R.id.imgValorImagem3);

        btnJogarNovamente = findViewById(R.id.btnJogarNovamente);
        btnResposta1 = findViewById(R.id.btnResposta1);
        btnResposta2 = findViewById(R.id.btnResposta2);
        btnResposta3 = findViewById(R.id.btnResposta3);
        btnFacil = findViewById(R.id.btnFacil);
        btnIntermediario = findViewById(R.id.btnIntermediario);
        btnAvancado = findViewById(R.id.btnAvancado);

        linha1_Imagem_1_1 = findViewById(R.id.linha1_Imagem_1_1);
        linha1_Imagem_1_2 = findViewById(R.id.linha1_Imagem_1_2);
        linha1_Imagem_2_1 = findViewById(R.id.linha1_Imagem_2_1);
        linha1_Imagem_2_2 = findViewById(R.id.linha1_Imagem_2_2);
        linha1_Imagem_3_1 = findViewById(R.id.linha1_Imagem_3_1);
        linha1_Imagem_3_2 = findViewById(R.id.linha1_Imagem_3_2);

        linha2_Imagem_1_1 = findViewById(R.id.linha2_Imagem_1_1);
        linha2_Imagem_1_2 = findViewById(R.id.linha2_Imagem_1_2);
        linha2_Imagem_2_1 = findViewById(R.id.linha2_Imagem_2_1);
        linha2_Imagem_2_2 = findViewById(R.id.linha2_Imagem_2_2);
        linha2_Imagem_3_1 = findViewById(R.id.linha2_Imagem_3_1);
        linha2_Imagem_3_2 = findViewById(R.id.linha2_Imagem_3_2);

        linha3_Imagem_1_1 = findViewById(R.id.linha3_Imagem_1_1);
        linha3_Imagem_1_2 = findViewById(R.id.linha3_Imagem_1_2);
        linha3_Imagem_2_1 = findViewById(R.id.linha3_Imagem_2_1);
        linha3_Imagem_2_2 = findViewById(R.id.linha3_Imagem_2_2);
        linha3_Imagem_3_1 = findViewById(R.id.linha3_Imagem_3_1);
        linha3_Imagem_3_2 = findViewById(R.id.linha3_Imagem_3_2);

        linha4_Imagem_1_1 = findViewById(R.id.linha4_Imagem_1_1);
        linha4_Imagem_1_2 = findViewById(R.id.linha4_Imagem_1_2);
        linha4_Imagem_2_1 = findViewById(R.id.linha4_Imagem_2_1);
        linha4_Imagem_2_2 = findViewById(R.id.linha4_Imagem_2_2);
        linha4_Imagem_3_1 = findViewById(R.id.linha4_Imagem_3_1);
        linha4_Imagem_3_2 = findViewById(R.id.linha4_Imagem_3_2);

        operador1_linha1 = findViewById(R.id.operador1_linha1);
        operador2_linha1 = findViewById(R.id.operador2_linha1);
        txtResposta1 = findViewById(R.id.txtResposta1);

        operador1_linha2 = findViewById(R.id.operador1_linha2);
        operador2_linha2 = findViewById(R.id.operador2_linha2);
        txtResposta2 = findViewById(R.id.txtResposta2);

        operador1_linha3 = findViewById(R.id.operador1_linha3);
        operador2_linha3 = findViewById(R.id.operador2_linha3);
        txtResposta3 = findViewById(R.id.txtResposta3);

        operador1_linha4 = findViewById(R.id.operador1_linha4);
        operador2_linha4 = findViewById(R.id.operador2_linha4);
        txtResposta4 = findViewById(R.id.txtResposta4);

        msgPergunta = findViewById(R.id.msgPergunta);
        txtDetalheRespostaLinha1 = findViewById(R.id.txtDetalheRespostaLinha1);
        txtDetalheRespostaLinha2 = findViewById(R.id.txtDetalheRespostaLinha2);
        txtDetalheRespostaLinha3 = findViewById(R.id.txtDetalheRespostaLinha3);
        txtDetalheRespostaLinha4 = findViewById(R.id.txtDetalheRespostaLinha4);
        txtDetalheRespostaLinha4.setVisibility(View.GONE);
        txtValoresLinha4 = findViewById(R.id.txtValoresLinha4);

        llResolva = findViewById(R.id.llResolva);
        llNumeroEImagens = findViewById(R.id.llNumeroEImagens);
        llConferirResultado = findViewById(R.id.llConferirResultado);
        llNiveis = findViewById(R.id.llNiveis);
        llBotoesOpcoesResposta = findViewById(R.id.llBotoesOpcoesResposta);

        //Ocultando campos que mostram o resultado
        llNumeroEImagens.setVisibility(View.GONE);
        btnJogarNovamente.setVisibility(View.GONE);
        llConferirResultado.setVisibility(View.GONE);

        //SharedPreferences para salvar os dados no celular do usuário
        //Cria um arquivo xml e dentro desse arquivo. conseguimos salvar os dados
        //mode 0 - significa que esse arquivo que vai ser gerado sí vai ser lido pelo nosso aplicativo
        SharedPreferences dados = getSharedPreferences(dadosApp, 0);

        if (dados.contains("pontos")){

            int pontosRecuperado = dados.getInt("pontos", 0);
            txtPontos.setText("Pontos: " + pontosRecuperado);

        }else {

            SharedPreferences.Editor editor = dados.edit();

            //Cria a coluna de ponto e deixa o valor de zero
            editor.putInt("pontos", 0);
            editor.commit();

            txtPontos.setText("Pontos: 0");

        }

        palavraEmbaralhada = embaralhar("abcdefghijklmnopqrstuvwy0123456789");

        ordemResultado = embaralharTipoOrdemResultado("123");
        embaralharOrdemResposta();

        nivel = "facil";

        recomecar();
        /*
        misturaTipoOperacao1();
        disResultado1();
        preencheImagensNosCampos();
        arrumaNivel();

         */

        btnFacil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nivel = "facil";

                recomecar();

            }
        });

        btnIntermediario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nivel = "intermediario";

                recomecar();

            }
        });

        btnAvancado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nivel = "avancado";

                recomecar();

            }
        });

        btnJogarNovamente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                recomecar();

                txtInstrucoes.setText("Resolva a equação");
                txtInstrucoes.setBackgroundColor(Color.parseColor("#23338C"));

                //Habilito os botões para conferir as respostas
                llBotoesOpcoesResposta.setVisibility(View.VISIBLE);

            }
        });

        btnResposta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Ocultando
                llNiveis.setVisibility(View.GONE);

                String valorBotao = btnResposta1.getText().toString();

                //if - se
                if (valorBotao.equals(oResultado)){

                    Toast.makeText(MainActivity.this, "Parabéns! Você acertou a resposta!", Toast.LENGTH_LONG).show();
                    txtInstrucoes.setText("Você acertou é " + valorBotao);
                    txtInstrucoes.setBackgroundColor(Color.parseColor("#23338C"));
                    addPonto();
                }else {

                    Toast.makeText(MainActivity.this, "Você errou a resposta!", Toast.LENGTH_LONG).show();
                    txtInstrucoes.setText("Você errou! O valor não é " + valorBotao);
                    txtInstrucoes.setBackgroundColor(Color.parseColor("#F44336"));

                    tiraPonto();

                }

                //Ocultando campos que mostram o resultado
                llNumeroEImagens.setVisibility(View.VISIBLE);
                btnJogarNovamente.setVisibility(View.VISIBLE);
                llConferirResultado.setVisibility(View.VISIBLE);
                llBotoesOpcoesResposta.setVisibility(View.GONE);



            }
        });

        btnResposta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Ocultando
                llNiveis.setVisibility(View.GONE);

                String valorBotao = btnResposta2.getText().toString();

                //if - se
                if (valorBotao.equals(oResultado)){

                    Toast.makeText(MainActivity.this, "Parabéns! Você acertou a resposta!", Toast.LENGTH_LONG).show();
                    txtInstrucoes.setText("Você acertou é " + valorBotao);
                    txtInstrucoes.setBackgroundColor(Color.parseColor("#23338C"));
                    addPonto();
                }else {

                    Toast.makeText(MainActivity.this, "Você errou a resposta!", Toast.LENGTH_LONG).show();
                    txtInstrucoes.setText("Você errou! O valor não é " + valorBotao);
                    txtInstrucoes.setBackgroundColor(Color.parseColor("#F44336"));

                    tiraPonto();

                }

                //Ocultando campos que mostram o resultado
                llNumeroEImagens.setVisibility(View.VISIBLE);
                btnJogarNovamente.setVisibility(View.VISIBLE);
                llConferirResultado.setVisibility(View.VISIBLE);
                llBotoesOpcoesResposta.setVisibility(View.GONE);


            }
        });

        btnResposta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Ocultando
                llNiveis.setVisibility(View.GONE);

                String valorBotao = btnResposta3.getText().toString();

                //if - se
                if (valorBotao.equals(oResultado)){

                    Toast.makeText(MainActivity.this, "Parabéns! Você acertou a resposta!", Toast.LENGTH_LONG).show();
                    txtInstrucoes.setText("Você acertou é " + valorBotao);
                    txtInstrucoes.setBackgroundColor(Color.parseColor("#23338C"));
                    addPonto();
                }else {

                    Toast.makeText(MainActivity.this, "Você errou a resposta!", Toast.LENGTH_LONG).show();
                    txtInstrucoes.setText("Você errou! O valor não é " + valorBotao);
                    txtInstrucoes.setBackgroundColor(Color.parseColor("#F44336"));

                    tiraPonto();

                }

                //Ocultando campos que mostram o resultado
                llNumeroEImagens.setVisibility(View.VISIBLE);
                btnJogarNovamente.setVisibility(View.VISIBLE);
                llConferirResultado.setVisibility(View.VISIBLE);
                llBotoesOpcoesResposta.setVisibility(View.GONE);

            }
        });


    }

    private void addPonto(){

        //SharedPreferences para salvar os dados no celular do usuário
        //Cria um arquivo xml e dentro desse arquivo. conseguimos salvar os dados
        //mode 0 - significa que esse arquivo que vai ser gerado sí vai ser lido pelo nosso aplicativo
        SharedPreferences arquivos = getSharedPreferences(dadosApp, 0);

        if (arquivos.contains("pontos")){

            SharedPreferences.Editor editor = arquivos.edit();

            pontos = arquivos.getInt("pontos", 0);

            //0 + 1 = 1
            //1 + 1 = 2
            pontos++;

            //Cria a coluna de ponto e deixa o valor de zero
            editor.putInt("pontos", pontos);
            editor.commit();

            txtPontos.setText("Pontos: " + pontos);


        }else {

            txtPontos.setText("Pontos: 0");

        }

    }

    private void tiraPonto(){

        //SharedPreferences para salvar os dados no celular do usuário
        //Cria um arquivo xml e dentro desse arquivo. conseguimos salvar os dados
        //mode 0 - significa que esse arquivo que vai ser gerado sí vai ser lido pelo nosso aplicativo
        SharedPreferences arquivos = getSharedPreferences(dadosApp, 0);

        if (arquivos.contains("pontos")){

            SharedPreferences.Editor editor = arquivos.edit();

            pontos = arquivos.getInt("pontos", 0);

            //Se eu tiver mais de 5 pontos eu tiro 5 pontos por que errou o cálculo
            if (pontos >= 5){

                //0 + 1 = 1
                //1 + 1 = 2
                pontos = pontos - 5;

                //Cria a coluna de ponto e deixa o valor de zero
                editor.putInt("pontos", pontos);
                editor.commit();

                txtPontos.setText("Pontos: " + pontos);

            }else {

                //Cria a coluna de ponto e deixa o valor de zero
                editor.putInt("pontos", 0);
                editor.commit();

                txtPontos.setText("Pontos: 0");

            }




        }else {

            txtPontos.setText("Pontos: 0");

        }

    }

    private void recomecar(){

        //if - se
        if (nivel.equals("avancado")){

            soma1 = 0;
            soma2 = 0;
            soma3 = 0;

            //Passamos o 12 e retorna ou 12 ou 21
            qtdImagens1 = embaralharQtdImagens1("12");
            qtdImagens2 = embaralharQtdImagens1("12");
            qtdImagens3 = embaralharQtdImagens1("12");
            qtdImagens4 = embaralharQtdImagens1("12");
            qtdImagens5 = embaralharQtdImagens1("12");
            qtdImagens6 = embaralharQtdImagens1("12");
            qtdImagens7 = embaralharQtdImagens1("12");
            qtdImagens8 = embaralharQtdImagens1("12");
            qtdImagens9 = embaralharQtdImagens1("12");
            qtdImagens10 = embaralharQtdImagens1("12");
            qtdImagens11 = embaralharQtdImagens1("12");
            qtdImagens12 = embaralharQtdImagens1("12");

            abreImagensAvancado();

            //------------------------------------

            tipoOperacao1 = embaralharTipoOperacao1("+*-");
            tipoOperacao2 = embaralharTipoOperacao2("+**");
            tipoOperacao3 = embaralharTipoOperacao2("+*-");
            tipoOperacao4 = embaralharTipoOperacao4("+*-");

            palavraEmbaralhada = embaralhar("abcdefghijklmnopqrstuvwy0123456789");
            distorceResultado1 = embaralharDis1("123");

            misturaTipoOperacao1();
            disResultado1();
            preencheImagensNosCampos();


            arrumaNivel();

            ordemResultado = embaralharTipoOrdemResultado("123");
            embaralharOrdemResposta();

        }else {

            soma1 = 0;
            soma2 = 0;
            soma3 = 0;

            tipoOperacao1 = embaralharTipoOperacao1("+*-");
            tipoOperacao2 = embaralharTipoOperacao2("+**");
            tipoOperacao3 = embaralharTipoOperacao2("+*-");
            tipoOperacao4 = embaralharTipoOperacao4("+*-");

            palavraEmbaralhada = embaralhar("abcdefghijklmnopqrstuvwy0123456789");
            distorceResultado1 = embaralharDis1("123");

            misturaTipoOperacao1();
            disResultado1();
            preencheImagensNosCampos();


            arrumaNivel();

            ordemResultado = embaralharTipoOrdemResultado("123");
            embaralharOrdemResposta();

        }

        //Ocultando campos que mostram o resultado
        llNumeroEImagens.setVisibility(View.GONE);
        btnJogarNovamente.setVisibility(View.GONE);
        llConferirResultado.setVisibility(View.GONE);
        llNiveis.setVisibility(View.VISIBLE);

    }

    private void abreImagensAvancado() {

        String imagem1 = qtdImagens1;
        numeroDeImagensLinha1_1 = String.valueOf(imagem1.charAt(0));

        //qtdImagens1 = 12
        //A posição 0 é 1
        if (numeroDeImagensLinha1_1.equals("1")){
            linha1_Imagem_1_2.setVisibility(View.GONE);

            //Se é 12 entao o valor do avançado é 1 imagem apenas
            totalImagensLinha1_1 = 1;
        }else {
            //Deixar a segunda imagem visivel
            linha1_Imagem_1_2.setVisibility(View.VISIBLE);

            //Se é 21 entao o valor do avançado é 2 imagens apenas
            totalImagensLinha1_1 = 2;

        }

        //--------------------

        String imagem2 = qtdImagens2;
        numeroDeImagensLinha1_2 = String.valueOf(imagem2.charAt(0));

        //qtdImagens1 = 12
        //A posição 0 é 1
        if (numeroDeImagensLinha1_2.equals("1")){
            linha1_Imagem_2_2.setVisibility(View.GONE);

            //Se é 12 entao o valor do avançado é 1 imagem apenas
            totalImagensLinha1_2 = 1;
        }else {
            //Deixar a segunda imagem visivel
            linha1_Imagem_2_2.setVisibility(View.VISIBLE);

            //Se é 21 entao o valor do avançado é 2 imagens apenas
            totalImagensLinha1_2 = 2;

        }

        //--------------------

        String imagem3 = qtdImagens3;
        numeroDeImagensLinha1_3 = String.valueOf(imagem3.charAt(0));

        //qtdImagens1 = 12
        //A posição 0 é 1
        if (numeroDeImagensLinha1_3.equals("1")){
            linha1_Imagem_3_2.setVisibility(View.GONE);

            //Se é 12 entao o valor do avançado é 1 imagem apenas
            totalImagensLinha1_3 = 1;
        }else {
            //Deixar a segunda imagem visivel
            linha1_Imagem_3_2.setVisibility(View.VISIBLE);

            //Se é 21 entao o valor do avançado é 2 imagens apenas
            totalImagensLinha1_3 = 2;

        }

        //--------------------

        String imagem4 = qtdImagens4;
        numeroDeImagensLinha2_1 = String.valueOf(imagem4.charAt(0));

        //qtdImagens1 = 12
        //A posição 0 é 1
        if (numeroDeImagensLinha2_1.equals("1")){
            linha2_Imagem_1_2.setVisibility(View.GONE);

            //Se é 12 entao o valor do avançado é 1 imagem apenas
            totalImagensLinha2_1 = 1;
        }else {
            //Deixar a segunda imagem visivel
            linha2_Imagem_1_2.setVisibility(View.VISIBLE);

            //Se é 21 entao o valor do avançado é 2 imagens apenas
            totalImagensLinha2_1 = 2;

        }

        //--------------------

        String imagem5 = qtdImagens5;
        numeroDeImagensLinha2_2 = String.valueOf(imagem5.charAt(0));

        //qtdImagens1 = 12
        //A posição 0 é 1
        if (numeroDeImagensLinha2_2.equals("1")){
            linha2_Imagem_2_2.setVisibility(View.GONE);

            //Se é 12 entao o valor do avançado é 1 imagem apenas
            totalImagensLinha2_2 = 1;
        }else {
            //Deixar a segunda imagem visivel
            linha2_Imagem_2_2.setVisibility(View.VISIBLE);

            //Se é 21 entao o valor do avançado é 2 imagens apenas
            totalImagensLinha2_2 = 2;

        }

        //--------------------

        String imagem6 = qtdImagens6;
        numeroDeImagensLinha2_3 = String.valueOf(imagem6.charAt(0));

        //qtdImagens1 = 12
        //A posição 0 é 1
        if (numeroDeImagensLinha2_3.equals("1")){
            linha2_Imagem_3_2.setVisibility(View.GONE);

            //Se é 12 entao o valor do avançado é 1 imagem apenas
            totalImagensLinha2_3 = 1;
        }else {
            //Deixar a segunda imagem visivel
            linha2_Imagem_3_2.setVisibility(View.VISIBLE);

            //Se é 21 entao o valor do avançado é 2 imagens apenas
            totalImagensLinha2_3 = 2;

        }

        //--------------------

        String imagem7 = qtdImagens7;
        numeroDeImagensLinha3_1 = String.valueOf(imagem7.charAt(0));

        //qtdImagens1 = 12
        //A posição 0 é 1
        if (numeroDeImagensLinha3_1.equals("1")){
            linha3_Imagem_1_2.setVisibility(View.GONE);

            //Se é 12 entao o valor do avançado é 1 imagem apenas
            totalImagensLinha3_1 = 1;
        }else {
            //Deixar a segunda imagem visivel
            linha3_Imagem_1_2.setVisibility(View.VISIBLE);

            //Se é 21 entao o valor do avançado é 2 imagens apenas
            totalImagensLinha3_1 = 2;

        }

        //--------------------

        String imagem8 = qtdImagens8;
        numeroDeImagensLinha3_2 = String.valueOf(imagem8.charAt(0));

        //qtdImagens1 = 12
        //A posição 0 é 1
        if (numeroDeImagensLinha3_2.equals("1")){
            linha3_Imagem_2_2.setVisibility(View.GONE);

            //Se é 12 entao o valor do avançado é 1 imagem apenas
            totalImagensLinha3_2 = 1;
        }else {
            //Deixar a segunda imagem visivel
            linha3_Imagem_2_2.setVisibility(View.VISIBLE);

            //Se é 21 entao o valor do avançado é 2 imagens apenas
            totalImagensLinha3_2 = 2;

        }

        //--------------------

        String imagem9 = qtdImagens9;
        numeroDeImagensLinha3_3 = String.valueOf(imagem9.charAt(0));

        //qtdImagens1 = 12
        //A posição 0 é 1
        if (numeroDeImagensLinha3_3.equals("1")){
            linha3_Imagem_3_2.setVisibility(View.GONE);

            //Se é 12 entao o valor do avançado é 1 imagem apenas
            totalImagensLinha3_3 = 1;
        }else {
            //Deixar a segunda imagem visivel
            linha3_Imagem_3_2.setVisibility(View.VISIBLE);

            //Se é 21 entao o valor do avançado é 2 imagens apenas
            totalImagensLinha3_3 = 2;

        }

        //--------------------

        String imagem10 = qtdImagens10;
        numeroDeImagensLinha4_1 = String.valueOf(imagem10.charAt(0));

        //qtdImagens1 = 12
        //A posição 0 é 1
        if (numeroDeImagensLinha4_1.equals("1")){
            linha4_Imagem_1_2.setVisibility(View.GONE);

            //Se é 12 entao o valor do avançado é 1 imagem apenas
            totalImagensLinha1_10 = 1;
        }else {
            //Deixar a segunda imagem visivel
            linha4_Imagem_1_2.setVisibility(View.VISIBLE);

            //Se é 21 entao o valor do avançado é 2 imagens apenas
            totalImagensLinha1_10 = 2;

        }

        //--------------------

        String imagem11 = qtdImagens11;
        numeroDeImagensLinha4_2 = String.valueOf(imagem11.charAt(0));

        //qtdImagens1 = 12
        //A posição 0 é 1
        if (numeroDeImagensLinha4_2.equals("1")){
            linha4_Imagem_2_2.setVisibility(View.GONE);

            //Se é 12 entao o valor do avançado é 1 imagem apenas
            totalImagensLinha1_11 = 1;
        }else {
            //Deixar a segunda imagem visivel
            linha4_Imagem_2_2.setVisibility(View.VISIBLE);

            //Se é 21 entao o valor do avançado é 2 imagens apenas
            totalImagensLinha1_11 = 2;

        }

        //--------------------

        String imagem12 = qtdImagens12;
        numeroDeImagensLinha4_3 = String.valueOf(imagem12.charAt(0));

        //qtdImagens1 = 12
        //A posição 0 é 1
        if (numeroDeImagensLinha4_3.equals("1")){
            linha4_Imagem_3_2.setVisibility(View.GONE);

            //Se é 12 entao o valor do avançado é 1 imagem apenas
            totalImagensLinha1_12 = 1;
        }else {
            //Deixar a segunda imagem visivel
            linha4_Imagem_3_2.setVisibility(View.VISIBLE);

            //Se é 21 entao o valor do avançado é 2 imagens apenas
            totalImagensLinha1_12 = 2;

        }

        //--------------------

    }

    private String embaralharQtdImagens1(String qtdImg) {

        //recebendo a palavra e embaralhando, mudando a ordem das letras
        List<String> numero = Arrays.asList(qtdImg.split(""));
        Collections.shuffle(numero);

        String posicaoDoNumero = "";

        //for - para item a item até o final da palavra
        for (String item : numero )

            posicaoDoNumero += item;

        //Retorna a palavra toda embaralhada
        return posicaoDoNumero;

    }

    private void disResultado1() {

        String textoDistR1 = distorceResultado1;

        //Avançado
        nDistResultado1 = String.valueOf(textoDistR1.charAt(0));
        nDistResultado2 = String.valueOf(textoDistR1.charAt(1));

    }

    private void embaralharOrdemResposta() {

        String ordem = ordemResultado;

        //ordemResultado é por exemplo 321, 213, 132...
        //ordemResposta pega a posição 0
        ordemResposta = String.valueOf(ordem.charAt(0));

    }

    private void arrumaNivel() {

        if (nivel.equals("facil")){

            linha1_Imagem_1_2.setVisibility(View.GONE);
            linha1_Imagem_2_2.setVisibility(View.GONE);
            linha1_Imagem_3_2.setVisibility(View.GONE);
            linha2_Imagem_1_2.setVisibility(View.GONE);
            linha2_Imagem_2_2.setVisibility(View.GONE);
            linha2_Imagem_3_2.setVisibility(View.GONE);
            linha3_Imagem_1_2.setVisibility(View.GONE);
            linha3_Imagem_2_2.setVisibility(View.GONE);
            linha3_Imagem_3_2.setVisibility(View.GONE);
            linha4_Imagem_1_2.setVisibility(View.GONE);
            linha4_Imagem_2_2.setVisibility(View.GONE);
            linha4_Imagem_3_2.setVisibility(View.GONE);

        }else if (nivel.equals("intermediario")){

            linha1_Imagem_1_2.setVisibility(View.GONE);
            linha1_Imagem_2_2.setVisibility(View.GONE);
            linha1_Imagem_3_2.setVisibility(View.GONE);
            linha2_Imagem_1_2.setVisibility(View.GONE);
            linha2_Imagem_2_2.setVisibility(View.GONE);
            linha2_Imagem_3_2.setVisibility(View.GONE);
            linha3_Imagem_1_2.setVisibility(View.GONE);
            linha3_Imagem_2_2.setVisibility(View.GONE);
            linha3_Imagem_3_2.setVisibility(View.GONE);
            linha4_Imagem_1_2.setVisibility(View.GONE);
            linha4_Imagem_2_2.setVisibility(View.GONE);
            linha4_Imagem_3_2.setVisibility(View.GONE);

        }else if (nivel.equals("avancado")){



        }

    }

    private void preencheImagensNosCampos() {

        String minhaPalavra = palavraEmbaralhada;

        letra1 = String.valueOf(minhaPalavra.charAt(0));
        letra2 = String.valueOf(minhaPalavra.charAt(1));
        letra3 = String.valueOf(minhaPalavra.charAt(2));
        letra4 = String.valueOf(minhaPalavra.charAt(3));
        letra5 = String.valueOf(minhaPalavra.charAt(4));
        letra6 = String.valueOf(minhaPalavra.charAt(5));
        letra7 = String.valueOf(minhaPalavra.charAt(6));
        letra8 = String.valueOf(minhaPalavra.charAt(7));
        letra9 = String.valueOf(minhaPalavra.charAt(8));
        letra10 = String.valueOf(minhaPalavra.charAt(9));
        letra11 = String.valueOf(minhaPalavra.charAt(10));
        letra12 = String.valueOf(minhaPalavra.charAt(11));

        //if - se
        //------------------------------------
        if (letra1.equals("a")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.fish1);
            linha1_Imagem_1_2.setImageResource(R.drawable.fish1);
            linha1_Imagem_2_1.setImageResource(R.drawable.fish1);
            linha1_Imagem_2_2.setImageResource(R.drawable.fish1);
            linha1_Imagem_3_1.setImageResource(R.drawable.fish1);
            linha1_Imagem_3_2.setImageResource(R.drawable.fish1);
            linha2_Imagem_1_1.setImageResource(R.drawable.fish1);
            linha2_Imagem_1_2.setImageResource(R.drawable.fish1);
            linha4_Imagem_3_1.setImageResource(R.drawable.fish1);
            linha4_Imagem_3_2.setImageResource(R.drawable.fish1);
            imgValorImagem1.setImageResource(R.drawable.fish1);

            v1 = 1;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("b")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.coracao);
            linha1_Imagem_1_2.setImageResource(R.drawable.coracao);
            linha1_Imagem_2_1.setImageResource(R.drawable.coracao);
            linha1_Imagem_2_2.setImageResource(R.drawable.coracao);
            linha1_Imagem_3_1.setImageResource(R.drawable.coracao);
            linha1_Imagem_3_2.setImageResource(R.drawable.coracao);
            linha2_Imagem_1_1.setImageResource(R.drawable.coracao);
            linha2_Imagem_1_2.setImageResource(R.drawable.coracao);
            linha4_Imagem_3_1.setImageResource(R.drawable.coracao);
            linha4_Imagem_3_2.setImageResource(R.drawable.coracao);
            imgValorImagem1.setImageResource(R.drawable.coracao);

            v1 = 2;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("c")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.fazendeiro);
            linha1_Imagem_1_2.setImageResource(R.drawable.fazendeiro);
            linha1_Imagem_2_1.setImageResource(R.drawable.fazendeiro);
            linha1_Imagem_2_2.setImageResource(R.drawable.fazendeiro);
            linha1_Imagem_3_1.setImageResource(R.drawable.fazendeiro);
            linha1_Imagem_3_2.setImageResource(R.drawable.fazendeiro);
            linha2_Imagem_1_1.setImageResource(R.drawable.fazendeiro);
            linha2_Imagem_1_2.setImageResource(R.drawable.fazendeiro);
            linha4_Imagem_3_1.setImageResource(R.drawable.fazendeiro);
            linha4_Imagem_3_2.setImageResource(R.drawable.fazendeiro);
            imgValorImagem1.setImageResource(R.drawable.fazendeiro);

            v1 = 3;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("d")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.tartaruga);
            linha1_Imagem_1_2.setImageResource(R.drawable.tartaruga);
            linha1_Imagem_2_1.setImageResource(R.drawable.tartaruga);
            linha1_Imagem_2_2.setImageResource(R.drawable.tartaruga);
            linha1_Imagem_3_1.setImageResource(R.drawable.tartaruga);
            linha1_Imagem_3_2.setImageResource(R.drawable.tartaruga);
            linha2_Imagem_1_1.setImageResource(R.drawable.tartaruga);
            linha2_Imagem_1_2.setImageResource(R.drawable.tartaruga);
            linha4_Imagem_3_1.setImageResource(R.drawable.tartaruga);
            linha4_Imagem_3_2.setImageResource(R.drawable.tartaruga);
            imgValorImagem1.setImageResource(R.drawable.tartaruga);

            v1 = 4;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("e")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.baleia);
            linha1_Imagem_1_2.setImageResource(R.drawable.baleia);
            linha1_Imagem_2_1.setImageResource(R.drawable.baleia);
            linha1_Imagem_2_2.setImageResource(R.drawable.baleia);
            linha1_Imagem_3_1.setImageResource(R.drawable.baleia);
            linha1_Imagem_3_2.setImageResource(R.drawable.baleia);
            linha2_Imagem_1_1.setImageResource(R.drawable.baleia);
            linha2_Imagem_1_2.setImageResource(R.drawable.baleia);
            linha4_Imagem_3_1.setImageResource(R.drawable.baleia);
            linha4_Imagem_3_2.setImageResource(R.drawable.baleia);
            imgValorImagem1.setImageResource(R.drawable.baleia);

            v1 = 5;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("f")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.casa);
            linha1_Imagem_1_2.setImageResource(R.drawable.casa);
            linha1_Imagem_2_1.setImageResource(R.drawable.casa);
            linha1_Imagem_2_2.setImageResource(R.drawable.casa);
            linha1_Imagem_3_1.setImageResource(R.drawable.casa);
            linha1_Imagem_3_2.setImageResource(R.drawable.casa);
            linha2_Imagem_1_1.setImageResource(R.drawable.casa);
            linha2_Imagem_1_2.setImageResource(R.drawable.casa);
            linha4_Imagem_3_1.setImageResource(R.drawable.casa);
            linha4_Imagem_3_2.setImageResource(R.drawable.casa);
            imgValorImagem1.setImageResource(R.drawable.casa);

            v1 = 6;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("g")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.borboleta);
            linha1_Imagem_1_2.setImageResource(R.drawable.borboleta);
            linha1_Imagem_2_1.setImageResource(R.drawable.borboleta);
            linha1_Imagem_2_2.setImageResource(R.drawable.borboleta);
            linha1_Imagem_3_1.setImageResource(R.drawable.borboleta);
            linha1_Imagem_3_2.setImageResource(R.drawable.borboleta);
            linha2_Imagem_1_1.setImageResource(R.drawable.borboleta);
            linha2_Imagem_1_2.setImageResource(R.drawable.borboleta);
            linha4_Imagem_3_1.setImageResource(R.drawable.borboleta);
            linha4_Imagem_3_2.setImageResource(R.drawable.borboleta);
            imgValorImagem1.setImageResource(R.drawable.borboleta);

            v1 = 7;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("h")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.sapo);
            linha1_Imagem_1_2.setImageResource(R.drawable.sapo);
            linha1_Imagem_2_1.setImageResource(R.drawable.sapo);
            linha1_Imagem_2_2.setImageResource(R.drawable.sapo);
            linha1_Imagem_3_1.setImageResource(R.drawable.sapo);
            linha1_Imagem_3_2.setImageResource(R.drawable.sapo);
            linha2_Imagem_1_1.setImageResource(R.drawable.sapo);
            linha2_Imagem_1_2.setImageResource(R.drawable.sapo);
            linha4_Imagem_3_1.setImageResource(R.drawable.sapo);
            linha4_Imagem_3_2.setImageResource(R.drawable.sapo);
            imgValorImagem1.setImageResource(R.drawable.sapo);

            v1 = 8;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("i")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.leao);
            linha1_Imagem_1_2.setImageResource(R.drawable.leao);
            linha1_Imagem_2_1.setImageResource(R.drawable.leao);
            linha1_Imagem_2_2.setImageResource(R.drawable.leao);
            linha1_Imagem_3_1.setImageResource(R.drawable.leao);
            linha1_Imagem_3_2.setImageResource(R.drawable.leao);
            linha2_Imagem_1_1.setImageResource(R.drawable.leao);
            linha2_Imagem_1_2.setImageResource(R.drawable.leao);
            linha4_Imagem_3_1.setImageResource(R.drawable.leao);
            linha4_Imagem_3_2.setImageResource(R.drawable.leao);
            imgValorImagem1.setImageResource(R.drawable.leao);

            v1 = 9;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("j")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.aranha);
            linha1_Imagem_1_2.setImageResource(R.drawable.aranha);
            linha1_Imagem_2_1.setImageResource(R.drawable.aranha);
            linha1_Imagem_2_2.setImageResource(R.drawable.aranha);
            linha1_Imagem_3_1.setImageResource(R.drawable.aranha);
            linha1_Imagem_3_2.setImageResource(R.drawable.aranha);
            linha2_Imagem_1_1.setImageResource(R.drawable.aranha);
            linha2_Imagem_1_2.setImageResource(R.drawable.aranha);
            linha4_Imagem_3_1.setImageResource(R.drawable.aranha);
            linha4_Imagem_3_2.setImageResource(R.drawable.aranha);
            imgValorImagem1.setImageResource(R.drawable.aranha);

            v1 = 10;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("k")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.foca);
            linha1_Imagem_1_2.setImageResource(R.drawable.foca);
            linha1_Imagem_2_1.setImageResource(R.drawable.foca);
            linha1_Imagem_2_2.setImageResource(R.drawable.foca);
            linha1_Imagem_3_1.setImageResource(R.drawable.foca);
            linha1_Imagem_3_2.setImageResource(R.drawable.foca);
            linha2_Imagem_1_1.setImageResource(R.drawable.foca);
            linha2_Imagem_1_2.setImageResource(R.drawable.foca);
            linha4_Imagem_3_1.setImageResource(R.drawable.foca);
            linha4_Imagem_3_2.setImageResource(R.drawable.foca);
            imgValorImagem1.setImageResource(R.drawable.foca);

            v1 = 11;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("l")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.passaro);
            linha1_Imagem_1_2.setImageResource(R.drawable.passaro);
            linha1_Imagem_2_1.setImageResource(R.drawable.passaro);
            linha1_Imagem_2_2.setImageResource(R.drawable.passaro);
            linha1_Imagem_3_1.setImageResource(R.drawable.passaro);
            linha1_Imagem_3_2.setImageResource(R.drawable.passaro);
            linha2_Imagem_1_1.setImageResource(R.drawable.passaro);
            linha2_Imagem_1_2.setImageResource(R.drawable.passaro);
            linha4_Imagem_3_1.setImageResource(R.drawable.passaro);
            linha4_Imagem_3_2.setImageResource(R.drawable.passaro);
            imgValorImagem1.setImageResource(R.drawable.passaro);

            v1 = 12;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("m")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.bola);
            linha1_Imagem_1_2.setImageResource(R.drawable.bola);
            linha1_Imagem_2_1.setImageResource(R.drawable.bola);
            linha1_Imagem_2_2.setImageResource(R.drawable.bola);
            linha1_Imagem_3_1.setImageResource(R.drawable.bola);
            linha1_Imagem_3_2.setImageResource(R.drawable.bola);
            linha2_Imagem_1_1.setImageResource(R.drawable.bola);
            linha2_Imagem_1_2.setImageResource(R.drawable.bola);
            linha4_Imagem_3_1.setImageResource(R.drawable.bola);
            linha4_Imagem_3_2.setImageResource(R.drawable.bola);
            imgValorImagem1.setImageResource(R.drawable.bola);

            v1 = 13;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("n")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.nipe);
            linha1_Imagem_1_2.setImageResource(R.drawable.nipe);
            linha1_Imagem_2_1.setImageResource(R.drawable.nipe);
            linha1_Imagem_2_2.setImageResource(R.drawable.nipe);
            linha1_Imagem_3_1.setImageResource(R.drawable.nipe);
            linha1_Imagem_3_2.setImageResource(R.drawable.nipe);
            linha2_Imagem_1_1.setImageResource(R.drawable.nipe);
            linha2_Imagem_1_2.setImageResource(R.drawable.nipe);
            linha4_Imagem_3_1.setImageResource(R.drawable.nipe);
            linha4_Imagem_3_2.setImageResource(R.drawable.nipe);
            imgValorImagem1.setImageResource(R.drawable.nipe);

            v1 = 14;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("o")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.laco);
            linha1_Imagem_1_2.setImageResource(R.drawable.laco);
            linha1_Imagem_2_1.setImageResource(R.drawable.laco);
            linha1_Imagem_2_2.setImageResource(R.drawable.laco);
            linha1_Imagem_3_1.setImageResource(R.drawable.laco);
            linha1_Imagem_3_2.setImageResource(R.drawable.laco);
            linha2_Imagem_1_1.setImageResource(R.drawable.laco);
            linha2_Imagem_1_2.setImageResource(R.drawable.laco);
            linha4_Imagem_3_1.setImageResource(R.drawable.laco);
            linha4_Imagem_3_2.setImageResource(R.drawable.laco);
            imgValorImagem1.setImageResource(R.drawable.laco);

            v1 = 15;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("p")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.cachorro);
            linha1_Imagem_1_2.setImageResource(R.drawable.cachorro);
            linha1_Imagem_2_1.setImageResource(R.drawable.cachorro);
            linha1_Imagem_2_2.setImageResource(R.drawable.cachorro);
            linha1_Imagem_3_1.setImageResource(R.drawable.cachorro);
            linha1_Imagem_3_2.setImageResource(R.drawable.cachorro);
            linha2_Imagem_1_1.setImageResource(R.drawable.cachorro);
            linha2_Imagem_1_2.setImageResource(R.drawable.cachorro);
            linha4_Imagem_3_1.setImageResource(R.drawable.cachorro);
            linha4_Imagem_3_2.setImageResource(R.drawable.cachorro);
            imgValorImagem1.setImageResource(R.drawable.cachorro);

            v1 = 16;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("q")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.trevo);
            linha1_Imagem_1_2.setImageResource(R.drawable.trevo);
            linha1_Imagem_2_1.setImageResource(R.drawable.trevo);
            linha1_Imagem_2_2.setImageResource(R.drawable.trevo);
            linha1_Imagem_3_1.setImageResource(R.drawable.trevo);
            linha1_Imagem_3_2.setImageResource(R.drawable.trevo);
            linha2_Imagem_1_1.setImageResource(R.drawable.trevo);
            linha2_Imagem_1_2.setImageResource(R.drawable.trevo);
            linha4_Imagem_3_1.setImageResource(R.drawable.trevo);
            linha4_Imagem_3_2.setImageResource(R.drawable.trevo);
            imgValorImagem1.setImageResource(R.drawable.trevo);

            v1 = 17;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("r")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.flor);
            linha1_Imagem_1_2.setImageResource(R.drawable.flor);
            linha1_Imagem_2_1.setImageResource(R.drawable.flor);
            linha1_Imagem_2_2.setImageResource(R.drawable.flor);
            linha1_Imagem_3_1.setImageResource(R.drawable.flor);
            linha1_Imagem_3_2.setImageResource(R.drawable.flor);
            linha2_Imagem_1_1.setImageResource(R.drawable.flor);
            linha2_Imagem_1_2.setImageResource(R.drawable.flor);
            linha4_Imagem_3_1.setImageResource(R.drawable.flor);
            linha4_Imagem_3_2.setImageResource(R.drawable.flor);
            imgValorImagem1.setImageResource(R.drawable.flor);

            v1 = 18;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("s")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.rato);
            linha1_Imagem_1_2.setImageResource(R.drawable.rato);
            linha1_Imagem_2_1.setImageResource(R.drawable.rato);
            linha1_Imagem_2_2.setImageResource(R.drawable.rato);
            linha1_Imagem_3_1.setImageResource(R.drawable.rato);
            linha1_Imagem_3_2.setImageResource(R.drawable.rato);
            linha2_Imagem_1_1.setImageResource(R.drawable.rato);
            linha2_Imagem_1_2.setImageResource(R.drawable.rato);
            linha4_Imagem_3_1.setImageResource(R.drawable.rato);
            linha4_Imagem_3_2.setImageResource(R.drawable.rato);
            imgValorImagem1.setImageResource(R.drawable.rato);

            v1 = 19;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("t")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.tigre);
            linha1_Imagem_1_2.setImageResource(R.drawable.tigre);
            linha1_Imagem_2_1.setImageResource(R.drawable.tigre);
            linha1_Imagem_2_2.setImageResource(R.drawable.tigre);
            linha1_Imagem_3_1.setImageResource(R.drawable.tigre);
            linha1_Imagem_3_2.setImageResource(R.drawable.tigre);
            linha2_Imagem_1_1.setImageResource(R.drawable.tigre);
            linha2_Imagem_1_2.setImageResource(R.drawable.tigre);
            linha4_Imagem_3_1.setImageResource(R.drawable.tigre);
            linha4_Imagem_3_2.setImageResource(R.drawable.tigre);
            imgValorImagem1.setImageResource(R.drawable.tigre);

            v1 = 20;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("u")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.porco);
            linha1_Imagem_1_2.setImageResource(R.drawable.porco);
            linha1_Imagem_2_1.setImageResource(R.drawable.porco);
            linha1_Imagem_2_2.setImageResource(R.drawable.porco);
            linha1_Imagem_3_1.setImageResource(R.drawable.porco);
            linha1_Imagem_3_2.setImageResource(R.drawable.porco);
            linha2_Imagem_1_1.setImageResource(R.drawable.porco);
            linha2_Imagem_1_2.setImageResource(R.drawable.porco);
            linha4_Imagem_3_1.setImageResource(R.drawable.porco);
            linha4_Imagem_3_2.setImageResource(R.drawable.porco);
            imgValorImagem1.setImageResource(R.drawable.porco);

            v1 = 21;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("v")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.mergulho);
            linha1_Imagem_1_2.setImageResource(R.drawable.mergulho);
            linha1_Imagem_2_1.setImageResource(R.drawable.mergulho);
            linha1_Imagem_2_2.setImageResource(R.drawable.mergulho);
            linha1_Imagem_3_1.setImageResource(R.drawable.mergulho);
            linha1_Imagem_3_2.setImageResource(R.drawable.mergulho);
            linha2_Imagem_1_1.setImageResource(R.drawable.mergulho);
            linha2_Imagem_1_2.setImageResource(R.drawable.mergulho);
            linha4_Imagem_3_1.setImageResource(R.drawable.mergulho);
            linha4_Imagem_3_2.setImageResource(R.drawable.mergulho);
            imgValorImagem1.setImageResource(R.drawable.mergulho);

            v1 = 22;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("w")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.dado);
            linha1_Imagem_1_2.setImageResource(R.drawable.dado);
            linha1_Imagem_2_1.setImageResource(R.drawable.dado);
            linha1_Imagem_2_2.setImageResource(R.drawable.dado);
            linha1_Imagem_3_1.setImageResource(R.drawable.dado);
            linha1_Imagem_3_2.setImageResource(R.drawable.dado);
            linha2_Imagem_1_1.setImageResource(R.drawable.dado);
            linha2_Imagem_1_2.setImageResource(R.drawable.dado);
            linha4_Imagem_3_1.setImageResource(R.drawable.dado);
            linha4_Imagem_3_2.setImageResource(R.drawable.dado);
            imgValorImagem1.setImageResource(R.drawable.dado);

            v1 = 23;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("y")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.piramide);
            linha1_Imagem_1_2.setImageResource(R.drawable.piramide);
            linha1_Imagem_2_1.setImageResource(R.drawable.piramide);
            linha1_Imagem_2_2.setImageResource(R.drawable.piramide);
            linha1_Imagem_3_1.setImageResource(R.drawable.piramide);
            linha1_Imagem_3_2.setImageResource(R.drawable.piramide);
            linha2_Imagem_1_1.setImageResource(R.drawable.piramide);
            linha2_Imagem_1_2.setImageResource(R.drawable.piramide);
            linha4_Imagem_3_1.setImageResource(R.drawable.piramide);
            linha4_Imagem_3_2.setImageResource(R.drawable.piramide);
            imgValorImagem1.setImageResource(R.drawable.piramide);

            v1 = 24;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("0")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.trem);
            linha1_Imagem_1_2.setImageResource(R.drawable.trem);
            linha1_Imagem_2_1.setImageResource(R.drawable.trem);
            linha1_Imagem_2_2.setImageResource(R.drawable.trem);
            linha1_Imagem_3_1.setImageResource(R.drawable.trem);
            linha1_Imagem_3_2.setImageResource(R.drawable.trem);
            linha2_Imagem_1_1.setImageResource(R.drawable.trem);
            linha2_Imagem_1_2.setImageResource(R.drawable.trem);
            linha4_Imagem_3_1.setImageResource(R.drawable.trem);
            linha4_Imagem_3_2.setImageResource(R.drawable.trem);
            imgValorImagem1.setImageResource(R.drawable.trem);

            v1 = 25;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("1")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.chat);
            linha1_Imagem_1_2.setImageResource(R.drawable.chat);
            linha1_Imagem_2_1.setImageResource(R.drawable.chat);
            linha1_Imagem_2_2.setImageResource(R.drawable.chat);
            linha1_Imagem_3_1.setImageResource(R.drawable.chat);
            linha1_Imagem_3_2.setImageResource(R.drawable.chat);
            linha2_Imagem_1_1.setImageResource(R.drawable.chat);
            linha2_Imagem_1_2.setImageResource(R.drawable.chat);
            linha4_Imagem_3_1.setImageResource(R.drawable.chat);
            linha4_Imagem_3_2.setImageResource(R.drawable.chat);
            imgValorImagem1.setImageResource(R.drawable.chat);

            v1 = 26;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("2")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.cadeado);
            linha1_Imagem_1_2.setImageResource(R.drawable.cadeado);
            linha1_Imagem_2_1.setImageResource(R.drawable.cadeado);
            linha1_Imagem_2_2.setImageResource(R.drawable.cadeado);
            linha1_Imagem_3_1.setImageResource(R.drawable.cadeado);
            linha1_Imagem_3_2.setImageResource(R.drawable.cadeado);
            linha2_Imagem_1_1.setImageResource(R.drawable.cadeado);
            linha2_Imagem_1_2.setImageResource(R.drawable.cadeado);
            linha4_Imagem_3_1.setImageResource(R.drawable.cadeado);
            linha4_Imagem_3_2.setImageResource(R.drawable.cadeado);
            imgValorImagem1.setImageResource(R.drawable.cadeado);

            v1 = 27;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("3")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.cracha);
            linha1_Imagem_1_2.setImageResource(R.drawable.cracha);
            linha1_Imagem_2_1.setImageResource(R.drawable.cracha);
            linha1_Imagem_2_2.setImageResource(R.drawable.cracha);
            linha1_Imagem_3_1.setImageResource(R.drawable.cracha);
            linha1_Imagem_3_2.setImageResource(R.drawable.cracha);
            linha2_Imagem_1_1.setImageResource(R.drawable.cracha);
            linha2_Imagem_1_2.setImageResource(R.drawable.cracha);
            linha4_Imagem_3_1.setImageResource(R.drawable.cracha);
            linha4_Imagem_3_2.setImageResource(R.drawable.cracha);
            imgValorImagem1.setImageResource(R.drawable.cracha);

            v1 = 28;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("4")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.sino);
            linha1_Imagem_1_2.setImageResource(R.drawable.sino);
            linha1_Imagem_2_1.setImageResource(R.drawable.sino);
            linha1_Imagem_2_2.setImageResource(R.drawable.sino);
            linha1_Imagem_3_1.setImageResource(R.drawable.sino);
            linha1_Imagem_3_2.setImageResource(R.drawable.sino);
            linha2_Imagem_1_1.setImageResource(R.drawable.sino);
            linha2_Imagem_1_2.setImageResource(R.drawable.sino);
            linha4_Imagem_3_1.setImageResource(R.drawable.sino);
            linha4_Imagem_3_2.setImageResource(R.drawable.sino);
            imgValorImagem1.setImageResource(R.drawable.sino);

            v1 = 29;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("5")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.resetar);
            linha1_Imagem_1_2.setImageResource(R.drawable.resetar);
            linha1_Imagem_2_1.setImageResource(R.drawable.resetar);
            linha1_Imagem_2_2.setImageResource(R.drawable.resetar);
            linha1_Imagem_3_1.setImageResource(R.drawable.resetar);
            linha1_Imagem_3_2.setImageResource(R.drawable.resetar);
            linha2_Imagem_1_1.setImageResource(R.drawable.resetar);
            linha2_Imagem_1_2.setImageResource(R.drawable.resetar);
            linha4_Imagem_3_1.setImageResource(R.drawable.resetar);
            linha4_Imagem_3_2.setImageResource(R.drawable.resetar);
            imgValorImagem1.setImageResource(R.drawable.resetar);

            v1 = 30;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("6")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.livro);
            linha1_Imagem_1_2.setImageResource(R.drawable.livro);
            linha1_Imagem_2_1.setImageResource(R.drawable.livro);
            linha1_Imagem_2_2.setImageResource(R.drawable.livro);
            linha1_Imagem_3_1.setImageResource(R.drawable.livro);
            linha1_Imagem_3_2.setImageResource(R.drawable.livro);
            linha2_Imagem_1_1.setImageResource(R.drawable.livro);
            linha2_Imagem_1_2.setImageResource(R.drawable.livro);
            linha4_Imagem_3_1.setImageResource(R.drawable.livro);
            linha4_Imagem_3_2.setImageResource(R.drawable.livro);
            imgValorImagem1.setImageResource(R.drawable.livro);

            v1 = 31;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("7")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.cesta);
            linha1_Imagem_1_2.setImageResource(R.drawable.cesta);
            linha1_Imagem_2_1.setImageResource(R.drawable.cesta);
            linha1_Imagem_2_2.setImageResource(R.drawable.cesta);
            linha1_Imagem_3_1.setImageResource(R.drawable.cesta);
            linha1_Imagem_3_2.setImageResource(R.drawable.cesta);
            linha2_Imagem_1_1.setImageResource(R.drawable.cesta);
            linha2_Imagem_1_2.setImageResource(R.drawable.cesta);
            linha4_Imagem_3_1.setImageResource(R.drawable.cesta);
            linha4_Imagem_3_2.setImageResource(R.drawable.cesta);
            imgValorImagem1.setImageResource(R.drawable.cesta);

            v1 = 32;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("8")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.delivery);
            linha1_Imagem_1_2.setImageResource(R.drawable.delivery);
            linha1_Imagem_2_1.setImageResource(R.drawable.delivery);
            linha1_Imagem_2_2.setImageResource(R.drawable.delivery);
            linha1_Imagem_3_1.setImageResource(R.drawable.delivery);
            linha1_Imagem_3_2.setImageResource(R.drawable.delivery);
            linha2_Imagem_1_1.setImageResource(R.drawable.delivery);
            linha2_Imagem_1_2.setImageResource(R.drawable.delivery);
            linha4_Imagem_3_1.setImageResource(R.drawable.delivery);
            linha4_Imagem_3_2.setImageResource(R.drawable.delivery);
            imgValorImagem1.setImageResource(R.drawable.delivery);

            v1 = 33;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }else if (letra1.equals("9")) {
            linha1_Imagem_1_1.setImageResource(R.drawable.bitcoin);
            linha1_Imagem_1_2.setImageResource(R.drawable.bitcoin);
            linha1_Imagem_2_1.setImageResource(R.drawable.bitcoin);
            linha1_Imagem_2_2.setImageResource(R.drawable.bitcoin);
            linha1_Imagem_3_1.setImageResource(R.drawable.bitcoin);
            linha1_Imagem_3_2.setImageResource(R.drawable.bitcoin);
            linha2_Imagem_1_1.setImageResource(R.drawable.bitcoin);
            linha2_Imagem_1_2.setImageResource(R.drawable.bitcoin);
            linha4_Imagem_3_1.setImageResource(R.drawable.bitcoin);
            linha4_Imagem_3_2.setImageResource(R.drawable.bitcoin);
            imgValorImagem1.setImageResource(R.drawable.bitcoin);

            v1 = 34;

            txtValorImagem1.setText(": " + v1);

            if (nivel.equals("facil")) {

                //v1 + v1 + v1
                soma1 = v1 * 3;

                txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao1.equals("*")){

                    soma1 = v1 * v1 + v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + (" + v1 + " * " + v1 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = v1 + v1 - v1;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " - " + v1 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = v1 * 3;

                    txtDetalheRespostaLinha1.setText(v1 + " + " + v1 + " + " + v1 + " = " + soma1);

                }



            } else if (nivel.equals("avancado")) {

                int calculo1 = v1 * totalImagensLinha1_1;
                int calculo2 = v1 * totalImagensLinha1_2;
                int calculo3 = v1 * totalImagensLinha1_3;

                if (queOperacao1.equals("*")){

                    soma1 = calculo2 * calculo3 + calculo1;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + (" + calculo2 + " * " + calculo3 + ") = " + soma1);

                }else if (queOperacao1.equals("-")){

                    soma1 = calculo1 + calculo2 - calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " - " + calculo3 + " = " + soma1);

                }else {

                    //v1 + v1 + v1
                    soma1 = calculo1 + calculo2 + calculo3;

                    txtDetalheRespostaLinha1.setText(calculo1 + " + " + calculo2 + " + " + calculo3 + " = " + soma1);

                }

            }

            String res = String.valueOf(soma1);
            txtResposta1.setText(res);

        }

        populaImagensLinha2();
        populaImagensLinha3();

        if (nivel.equals("avancado")){

            //Linha 4 - Imagem 3 - 1 ou 2 imagens
            v1 = v1 * totalImagensLinha1_12;

            //Linha 4 - Imagem 1 - 1 ou 2 imagens
            v2 = v2 * totalImagensLinha1_10;

            //Linha 4 - Imagem 2 - 1 ou 2 imagens
            v3 = v3 * totalImagensLinha1_11;

        }

        //Linha 4
        if (queOperacao4.equals("*")){
            resultado1 = v1 * v3 + v2;
            txtValoresLinha4.setText("Resposta: " + v2 + " + (" + v1 + " * " + v3 + ") = " + resultado1);
        }else if (queOperacao4.equals("-")){
            resultado1 = v2 + v3 - v1;
            txtValoresLinha4.setText("Resposta: " + v2 + " + " + v3 + " - " + v1 + " = " + resultado1);
        } else {
            resultado1 = v1 + v2 + v3;
            txtValoresLinha4.setText("Resposta: " + v1 + " + " + v2 + " + " + v3 + " = " + resultado1);
        }

        //resultado1 = v1 + v2 + v3;
        //txtValoresLinha4.setText("Resposta: " + v2 + " + " + v3 + " + " + v1 + " = " + resultado1);

        oResultado = String.valueOf(resultado1);

        //nDistResultado1 - Posicao do Resultado 1, 2 ou 3
        int numeroMultiplicado = Integer.parseInt(nDistResultado1);

        //resultado2 pega o número da imagem 1 e multiplica por 1, 2 ou 3
        int resultado2 = v1 * numeroMultiplicado;

        if (resultado2 == resultado1){
            resultado2 = resultado2 + 1;
        }else {

        }

        //----------------------------------------

        String oResultado2 = String.valueOf(resultado2);

        //nDistResultado2 - Posicao do Resultado 1, 2 ou 3
        int numeroMultiplicado2 = Integer.parseInt(nDistResultado2);

        //resultado3 pega o número da imagem 3 e multiplica por 1, 2 ou 3
        int resultado3 = v3 * numeroMultiplicado2;

        if (resultado3 == resultado1){
            resultado3 = resultado3 + 1;
        }else {

        }

        String oResultado3 = String.valueOf(resultado3);

        if (ordemResposta.equals("1")){

            btnResposta1.setText(oResultado);
            btnResposta2.setText(oResultado2);
            btnResposta3.setText(oResultado3);

        }else if (ordemResposta.equals("2")){

            btnResposta2.setText(oResultado);
            btnResposta1.setText(oResultado2);
            btnResposta3.setText(oResultado3);

        }else if (ordemResposta.equals("3")){

            btnResposta3.setText(oResultado);
            btnResposta2.setText(oResultado2);
            btnResposta1.setText(oResultado3);

        }



    }

    private void populaImagensLinha2() {

        //if - se
        //------------------------------------
        if (letra2.equals("a")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.joia);
            linha2_Imagem_2_2.setImageResource(R.drawable.joia);
            linha2_Imagem_3_1.setImageResource(R.drawable.joia);
            linha2_Imagem_3_2.setImageResource(R.drawable.joia);
            linha3_Imagem_1_1.setImageResource(R.drawable.joia);
            linha3_Imagem_1_2.setImageResource(R.drawable.joia);
            linha4_Imagem_1_1.setImageResource(R.drawable.joia);
            linha4_Imagem_1_2.setImageResource(R.drawable.joia);
            imgValorImagem2.setImageResource(R.drawable.joia);

            v2 = 1;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("b")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.tuba);
            linha2_Imagem_2_2.setImageResource(R.drawable.tuba);
            linha2_Imagem_3_1.setImageResource(R.drawable.tuba);
            linha2_Imagem_3_2.setImageResource(R.drawable.tuba);
            linha3_Imagem_1_1.setImageResource(R.drawable.tuba);
            linha3_Imagem_1_2.setImageResource(R.drawable.tuba);
            linha4_Imagem_1_1.setImageResource(R.drawable.tuba);
            linha4_Imagem_1_2.setImageResource(R.drawable.tuba);
            imgValorImagem2.setImageResource(R.drawable.tuba);

            v2 = 2;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("c")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.disco);
            linha2_Imagem_2_2.setImageResource(R.drawable.disco);
            linha2_Imagem_3_1.setImageResource(R.drawable.disco);
            linha2_Imagem_3_2.setImageResource(R.drawable.disco);
            linha3_Imagem_1_1.setImageResource(R.drawable.disco);
            linha3_Imagem_1_2.setImageResource(R.drawable.disco);
            linha4_Imagem_1_1.setImageResource(R.drawable.disco);
            linha4_Imagem_1_2.setImageResource(R.drawable.disco);
            imgValorImagem2.setImageResource(R.drawable.disco);

            v2 = 3;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("d")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.bateria);
            linha2_Imagem_2_2.setImageResource(R.drawable.bateria);
            linha2_Imagem_3_1.setImageResource(R.drawable.bateria);
            linha2_Imagem_3_2.setImageResource(R.drawable.bateria);
            linha3_Imagem_1_1.setImageResource(R.drawable.bateria);
            linha3_Imagem_1_2.setImageResource(R.drawable.bateria);
            linha4_Imagem_1_1.setImageResource(R.drawable.bateria);
            linha4_Imagem_1_2.setImageResource(R.drawable.bateria);
            imgValorImagem2.setImageResource(R.drawable.bateria);

            v2 = 4;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("e")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.cifra);
            linha2_Imagem_2_2.setImageResource(R.drawable.cifra);
            linha2_Imagem_3_1.setImageResource(R.drawable.cifra);
            linha2_Imagem_3_2.setImageResource(R.drawable.cifra);
            linha3_Imagem_1_1.setImageResource(R.drawable.cifra);
            linha3_Imagem_1_2.setImageResource(R.drawable.cifra);
            linha4_Imagem_1_1.setImageResource(R.drawable.cifra);
            linha4_Imagem_1_2.setImageResource(R.drawable.cifra);
            imgValorImagem2.setImageResource(R.drawable.cifra);

            v2 = 5;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("f")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.guitarra);
            linha2_Imagem_2_2.setImageResource(R.drawable.guitarra);
            linha2_Imagem_3_1.setImageResource(R.drawable.guitarra);
            linha2_Imagem_3_2.setImageResource(R.drawable.guitarra);
            linha3_Imagem_1_1.setImageResource(R.drawable.guitarra);
            linha3_Imagem_1_2.setImageResource(R.drawable.guitarra);
            linha4_Imagem_1_1.setImageResource(R.drawable.guitarra);
            linha4_Imagem_1_2.setImageResource(R.drawable.guitarra);
            imgValorImagem2.setImageResource(R.drawable.guitarra);

            v2 = 6;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("g")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.chapeu);
            linha2_Imagem_2_2.setImageResource(R.drawable.chapeu);
            linha2_Imagem_3_1.setImageResource(R.drawable.chapeu);
            linha2_Imagem_3_2.setImageResource(R.drawable.chapeu);
            linha3_Imagem_1_1.setImageResource(R.drawable.chapeu);
            linha3_Imagem_1_2.setImageResource(R.drawable.chapeu);
            linha4_Imagem_1_1.setImageResource(R.drawable.chapeu);
            linha4_Imagem_1_2.setImageResource(R.drawable.chapeu);
            imgValorImagem2.setImageResource(R.drawable.chapeu);

            v2 = 7;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("h")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.musica);
            linha2_Imagem_2_2.setImageResource(R.drawable.musica);
            linha2_Imagem_3_1.setImageResource(R.drawable.musica);
            linha2_Imagem_3_2.setImageResource(R.drawable.musica);
            linha3_Imagem_1_1.setImageResource(R.drawable.musica);
            linha3_Imagem_1_2.setImageResource(R.drawable.musica);
            linha4_Imagem_1_1.setImageResource(R.drawable.musica);
            linha4_Imagem_1_2.setImageResource(R.drawable.musica);
            imgValorImagem2.setImageResource(R.drawable.musica);

            v2 = 8;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("i")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.radio);
            linha2_Imagem_2_2.setImageResource(R.drawable.radio);
            linha2_Imagem_3_1.setImageResource(R.drawable.radio);
            linha2_Imagem_3_2.setImageResource(R.drawable.radio);
            linha3_Imagem_1_1.setImageResource(R.drawable.radio);
            linha3_Imagem_1_2.setImageResource(R.drawable.radio);
            linha4_Imagem_1_1.setImageResource(R.drawable.radio);
            linha4_Imagem_1_2.setImageResource(R.drawable.radio);
            imgValorImagem2.setImageResource(R.drawable.radio);

            v2 = 9;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("j")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.horas);
            linha2_Imagem_2_2.setImageResource(R.drawable.horas);
            linha2_Imagem_3_1.setImageResource(R.drawable.horas);
            linha2_Imagem_3_2.setImageResource(R.drawable.horas);
            linha3_Imagem_1_1.setImageResource(R.drawable.horas);
            linha3_Imagem_1_2.setImageResource(R.drawable.horas);
            linha4_Imagem_1_1.setImageResource(R.drawable.horas);
            linha4_Imagem_1_2.setImageResource(R.drawable.horas);
            imgValorImagem2.setImageResource(R.drawable.horas);

            v2 = 10;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("k")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.comercial);
            linha2_Imagem_2_2.setImageResource(R.drawable.comercial);
            linha2_Imagem_3_1.setImageResource(R.drawable.comercial);
            linha2_Imagem_3_2.setImageResource(R.drawable.comercial);
            linha3_Imagem_1_1.setImageResource(R.drawable.comercial);
            linha3_Imagem_1_2.setImageResource(R.drawable.comercial);
            linha4_Imagem_1_1.setImageResource(R.drawable.comercial);
            linha4_Imagem_1_2.setImageResource(R.drawable.comercial);
            imgValorImagem2.setImageResource(R.drawable.comercial);

            v2 = 11;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("l")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.lugar);
            linha2_Imagem_2_2.setImageResource(R.drawable.lugar);
            linha2_Imagem_3_1.setImageResource(R.drawable.lugar);
            linha2_Imagem_3_2.setImageResource(R.drawable.lugar);
            linha3_Imagem_1_1.setImageResource(R.drawable.lugar);
            linha3_Imagem_1_2.setImageResource(R.drawable.lugar);
            linha4_Imagem_1_1.setImageResource(R.drawable.lugar);
            linha4_Imagem_1_2.setImageResource(R.drawable.lugar);
            imgValorImagem2.setImageResource(R.drawable.lugar);

            v2 = 12;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("m")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.disconto);
            linha2_Imagem_2_2.setImageResource(R.drawable.disconto);
            linha2_Imagem_3_1.setImageResource(R.drawable.disconto);
            linha2_Imagem_3_2.setImageResource(R.drawable.disconto);
            linha3_Imagem_1_1.setImageResource(R.drawable.disconto);
            linha3_Imagem_1_2.setImageResource(R.drawable.disconto);
            linha4_Imagem_1_1.setImageResource(R.drawable.disconto);
            linha4_Imagem_1_2.setImageResource(R.drawable.disconto);
            imgValorImagem2.setImageResource(R.drawable.disconto);

            v2 = 13;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("n")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.presente);
            linha2_Imagem_2_2.setImageResource(R.drawable.presente);
            linha2_Imagem_3_1.setImageResource(R.drawable.presente);
            linha2_Imagem_3_2.setImageResource(R.drawable.presente);
            linha3_Imagem_1_1.setImageResource(R.drawable.presente);
            linha3_Imagem_1_2.setImageResource(R.drawable.presente);
            linha4_Imagem_1_1.setImageResource(R.drawable.presente);
            linha4_Imagem_1_2.setImageResource(R.drawable.presente);
            imgValorImagem2.setImageResource(R.drawable.presente);

            v2 = 14;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("o")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.diamante);
            linha2_Imagem_2_2.setImageResource(R.drawable.diamante);
            linha2_Imagem_3_1.setImageResource(R.drawable.diamante);
            linha2_Imagem_3_2.setImageResource(R.drawable.diamante);
            linha3_Imagem_1_1.setImageResource(R.drawable.diamante);
            linha3_Imagem_1_2.setImageResource(R.drawable.diamante);
            linha4_Imagem_1_1.setImageResource(R.drawable.diamante);
            linha4_Imagem_1_2.setImageResource(R.drawable.diamante);
            imgValorImagem2.setImageResource(R.drawable.diamante);

            v2 = 15;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("p")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.dinghy);
            linha2_Imagem_2_2.setImageResource(R.drawable.dinghy);
            linha2_Imagem_3_1.setImageResource(R.drawable.dinghy);
            linha2_Imagem_3_2.setImageResource(R.drawable.dinghy);
            linha3_Imagem_1_1.setImageResource(R.drawable.dinghy);
            linha3_Imagem_1_2.setImageResource(R.drawable.dinghy);
            linha4_Imagem_1_1.setImageResource(R.drawable.dinghy);
            linha4_Imagem_1_2.setImageResource(R.drawable.dinghy);
            imgValorImagem2.setImageResource(R.drawable.dinghy);

            v2 = 16;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("q")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.gas_station);
            linha2_Imagem_2_2.setImageResource(R.drawable.gas_station);
            linha2_Imagem_3_1.setImageResource(R.drawable.gas_station);
            linha2_Imagem_3_2.setImageResource(R.drawable.gas_station);
            linha3_Imagem_1_1.setImageResource(R.drawable.gas_station);
            linha3_Imagem_1_2.setImageResource(R.drawable.gas_station);
            linha4_Imagem_1_1.setImageResource(R.drawable.gas_station);
            linha4_Imagem_1_2.setImageResource(R.drawable.gas_station);
            imgValorImagem2.setImageResource(R.drawable.gas_station);

            v2 = 17;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("r")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.cable_car);
            linha2_Imagem_2_2.setImageResource(R.drawable.cable_car);
            linha2_Imagem_3_1.setImageResource(R.drawable.cable_car);
            linha2_Imagem_3_2.setImageResource(R.drawable.cable_car);
            linha3_Imagem_1_1.setImageResource(R.drawable.cable_car);
            linha3_Imagem_1_2.setImageResource(R.drawable.cable_car);
            linha4_Imagem_1_1.setImageResource(R.drawable.cable_car);
            linha4_Imagem_1_2.setImageResource(R.drawable.cable_car);
            imgValorImagem2.setImageResource(R.drawable.cable_car);

            v2 = 18;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("s")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.highway);
            linha2_Imagem_2_2.setImageResource(R.drawable.highway);
            linha2_Imagem_3_1.setImageResource(R.drawable.highway);
            linha2_Imagem_3_2.setImageResource(R.drawable.highway);
            linha3_Imagem_1_1.setImageResource(R.drawable.highway);
            linha3_Imagem_1_2.setImageResource(R.drawable.highway);
            linha4_Imagem_1_1.setImageResource(R.drawable.highway);
            linha4_Imagem_1_2.setImageResource(R.drawable.highway);
            imgValorImagem2.setImageResource(R.drawable.highway);

            v2 = 19;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("t")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.obstacle);
            linha2_Imagem_2_2.setImageResource(R.drawable.obstacle);
            linha2_Imagem_3_1.setImageResource(R.drawable.obstacle);
            linha2_Imagem_3_2.setImageResource(R.drawable.obstacle);
            linha3_Imagem_1_1.setImageResource(R.drawable.obstacle);
            linha3_Imagem_1_2.setImageResource(R.drawable.obstacle);
            linha4_Imagem_1_1.setImageResource(R.drawable.obstacle);
            linha4_Imagem_1_2.setImageResource(R.drawable.obstacle);
            imgValorImagem2.setImageResource(R.drawable.obstacle);

            v2 = 20;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("u")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.train_station);
            linha2_Imagem_2_2.setImageResource(R.drawable.train_station);
            linha2_Imagem_3_1.setImageResource(R.drawable.train_station);
            linha2_Imagem_3_2.setImageResource(R.drawable.train_station);
            linha3_Imagem_1_1.setImageResource(R.drawable.train_station);
            linha3_Imagem_1_2.setImageResource(R.drawable.train_station);
            linha4_Imagem_1_1.setImageResource(R.drawable.train_station);
            linha4_Imagem_1_2.setImageResource(R.drawable.train_station);
            imgValorImagem2.setImageResource(R.drawable.train_station);

            v2 = 21;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("v")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.digger);
            linha2_Imagem_2_2.setImageResource(R.drawable.digger);
            linha2_Imagem_3_1.setImageResource(R.drawable.digger);
            linha2_Imagem_3_2.setImageResource(R.drawable.digger);
            linha3_Imagem_1_1.setImageResource(R.drawable.digger);
            linha3_Imagem_1_2.setImageResource(R.drawable.digger);
            linha4_Imagem_1_1.setImageResource(R.drawable.digger);
            linha4_Imagem_1_2.setImageResource(R.drawable.digger);
            imgValorImagem2.setImageResource(R.drawable.digger);

            v2 = 22;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("w")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.ford_model);
            linha2_Imagem_2_2.setImageResource(R.drawable.ford_model);
            linha2_Imagem_3_1.setImageResource(R.drawable.ford_model);
            linha2_Imagem_3_2.setImageResource(R.drawable.ford_model);
            linha3_Imagem_1_1.setImageResource(R.drawable.ford_model);
            linha3_Imagem_1_2.setImageResource(R.drawable.ford_model);
            linha4_Imagem_1_1.setImageResource(R.drawable.ford_model);
            linha4_Imagem_1_2.setImageResource(R.drawable.ford_model);
            imgValorImagem2.setImageResource(R.drawable.ford_model);

            v2 = 23;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("y")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.dumping);
            linha2_Imagem_2_2.setImageResource(R.drawable.dumping);
            linha2_Imagem_3_1.setImageResource(R.drawable.dumping);
            linha2_Imagem_3_2.setImageResource(R.drawable.dumping);
            linha3_Imagem_1_1.setImageResource(R.drawable.dumping);
            linha3_Imagem_1_2.setImageResource(R.drawable.dumping);
            linha4_Imagem_1_1.setImageResource(R.drawable.dumping);
            linha4_Imagem_1_2.setImageResource(R.drawable.dumping);
            imgValorImagem2.setImageResource(R.drawable.dumping);

            v2 = 24;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("0")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.motorcycle);
            linha2_Imagem_2_2.setImageResource(R.drawable.motorcycle);
            linha2_Imagem_3_1.setImageResource(R.drawable.motorcycle);
            linha2_Imagem_3_2.setImageResource(R.drawable.motorcycle);
            linha3_Imagem_1_1.setImageResource(R.drawable.motorcycle);
            linha3_Imagem_1_2.setImageResource(R.drawable.motorcycle);
            linha4_Imagem_1_1.setImageResource(R.drawable.motorcycle);
            linha4_Imagem_1_2.setImageResource(R.drawable.motorcycle);
            imgValorImagem2.setImageResource(R.drawable.motorcycle);

            v2 = 25;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("1")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.aircraft);
            linha2_Imagem_2_2.setImageResource(R.drawable.aircraft);
            linha2_Imagem_3_1.setImageResource(R.drawable.aircraft);
            linha2_Imagem_3_2.setImageResource(R.drawable.aircraft);
            linha3_Imagem_1_1.setImageResource(R.drawable.aircraft);
            linha3_Imagem_1_2.setImageResource(R.drawable.aircraft);
            linha4_Imagem_1_1.setImageResource(R.drawable.aircraft);
            linha4_Imagem_1_2.setImageResource(R.drawable.aircraft);
            imgValorImagem2.setImageResource(R.drawable.aircraft);

            v2 = 26;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("2")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.flood_car);
            linha2_Imagem_2_2.setImageResource(R.drawable.flood_car);
            linha2_Imagem_3_1.setImageResource(R.drawable.flood_car);
            linha2_Imagem_3_2.setImageResource(R.drawable.flood_car);
            linha3_Imagem_1_1.setImageResource(R.drawable.flood_car);
            linha3_Imagem_1_2.setImageResource(R.drawable.flood_car);
            linha4_Imagem_1_1.setImageResource(R.drawable.flood_car);
            linha4_Imagem_1_2.setImageResource(R.drawable.flood_car);
            imgValorImagem2.setImageResource(R.drawable.flood_car);

            v2 = 27;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("3")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.ink);
            linha2_Imagem_2_2.setImageResource(R.drawable.ink);
            linha2_Imagem_3_1.setImageResource(R.drawable.ink);
            linha2_Imagem_3_2.setImageResource(R.drawable.ink);
            linha3_Imagem_1_1.setImageResource(R.drawable.ink);
            linha3_Imagem_1_2.setImageResource(R.drawable.ink);
            linha4_Imagem_1_1.setImageResource(R.drawable.ink);
            linha4_Imagem_1_2.setImageResource(R.drawable.ink);
            imgValorImagem2.setImageResource(R.drawable.ink);

            v2 = 28;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("4")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.texto);
            linha2_Imagem_2_2.setImageResource(R.drawable.texto);
            linha2_Imagem_3_1.setImageResource(R.drawable.texto);
            linha2_Imagem_3_2.setImageResource(R.drawable.texto);
            linha3_Imagem_1_1.setImageResource(R.drawable.texto);
            linha3_Imagem_1_2.setImageResource(R.drawable.texto);
            linha4_Imagem_1_1.setImageResource(R.drawable.texto);
            linha4_Imagem_1_2.setImageResource(R.drawable.texto);
            imgValorImagem2.setImageResource(R.drawable.texto);

            v2 = 29;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("5")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.copybook);
            linha2_Imagem_2_2.setImageResource(R.drawable.copybook);
            linha2_Imagem_3_1.setImageResource(R.drawable.copybook);
            linha2_Imagem_3_2.setImageResource(R.drawable.copybook);
            linha3_Imagem_1_1.setImageResource(R.drawable.copybook);
            linha3_Imagem_1_2.setImageResource(R.drawable.copybook);
            linha4_Imagem_1_1.setImageResource(R.drawable.copybook);
            linha4_Imagem_1_2.setImageResource(R.drawable.copybook);
            imgValorImagem2.setImageResource(R.drawable.copybook);

            v2 = 30;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("6")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.scotch_tape);
            linha2_Imagem_2_2.setImageResource(R.drawable.scotch_tape);
            linha2_Imagem_3_1.setImageResource(R.drawable.scotch_tape);
            linha2_Imagem_3_2.setImageResource(R.drawable.scotch_tape);
            linha3_Imagem_1_1.setImageResource(R.drawable.scotch_tape);
            linha3_Imagem_1_2.setImageResource(R.drawable.scotch_tape);
            linha4_Imagem_1_1.setImageResource(R.drawable.scotch_tape);
            linha4_Imagem_1_2.setImageResource(R.drawable.scotch_tape);
            imgValorImagem2.setImageResource(R.drawable.scotch_tape);

            v2 = 31;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("7")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.windmill);
            linha2_Imagem_2_2.setImageResource(R.drawable.windmill);
            linha2_Imagem_3_1.setImageResource(R.drawable.windmill);
            linha2_Imagem_3_2.setImageResource(R.drawable.windmill);
            linha3_Imagem_1_1.setImageResource(R.drawable.windmill);
            linha3_Imagem_1_2.setImageResource(R.drawable.windmill);
            linha4_Imagem_1_1.setImageResource(R.drawable.windmill);
            linha4_Imagem_1_2.setImageResource(R.drawable.windmill);
            imgValorImagem2.setImageResource(R.drawable.windmill);

            v2 = 32;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("8")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.amanita);
            linha2_Imagem_2_2.setImageResource(R.drawable.amanita);
            linha2_Imagem_3_1.setImageResource(R.drawable.amanita);
            linha2_Imagem_3_2.setImageResource(R.drawable.amanita);
            linha3_Imagem_1_1.setImageResource(R.drawable.amanita);
            linha3_Imagem_1_2.setImageResource(R.drawable.amanita);
            linha4_Imagem_1_1.setImageResource(R.drawable.amanita);
            linha4_Imagem_1_2.setImageResource(R.drawable.amanita);
            imgValorImagem2.setImageResource(R.drawable.amanita);

            v2 = 33;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }else if (letra2.equals("9")) {
            linha2_Imagem_2_1.setImageResource(R.drawable.carrot);
            linha2_Imagem_2_2.setImageResource(R.drawable.carrot);
            linha2_Imagem_3_1.setImageResource(R.drawable.carrot);
            linha2_Imagem_3_2.setImageResource(R.drawable.carrot);
            linha3_Imagem_1_1.setImageResource(R.drawable.carrot);
            linha3_Imagem_1_2.setImageResource(R.drawable.carrot);
            linha4_Imagem_1_1.setImageResource(R.drawable.carrot);
            linha4_Imagem_1_2.setImageResource(R.drawable.carrot);
            imgValorImagem2.setImageResource(R.drawable.carrot);

            v2 = 34;

            txtValorImagem2.setText(": " + v2);

            if (nivel.equals("facil")) {

                //v2 + v2 + v1
                soma2 = v2 * 2 + v1;

                txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao2.equals("*")) {

                    soma2 = v2 * v2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + (" + v2 + " * " + v2 + ") = " + soma2);

                } else if (queOperacao2.equals("-")) {

                    soma2 = v1 + v2 - v2;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " - " + v2 + " = " + soma2);

                } else {

                    //v2 + v2 + v1
                    soma2 = v2 * 2 + v1;

                    txtDetalheRespostaLinha2.setText(v1 + " + " + v2 + " + " + v2 + " = " + soma2);

                }


            } else if (nivel.equals("avancado")) {

                int calculo4 = v1 * totalImagensLinha2_1;
                int calculo5 = v2 * totalImagensLinha2_2;
                int calculo6 = v2 * totalImagensLinha2_3;

                if (queOperacao2.equals("*")){

                    soma2 = calculo5 * calculo6 + calculo4;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + (" + calculo5 + " * " + calculo6 + ") = " + soma2);

                }else if (queOperacao2.equals("-")){

                    soma2 = calculo4 + calculo5 - calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " - " + calculo6 + " = " + soma2);

                }else {

                    //v2 + v2 + v1
                    soma2 = calculo4 + calculo5 + calculo6;

                    txtDetalheRespostaLinha2.setText(calculo4 + " + " + calculo5 + " + " + calculo6 + " = " + soma2);

                }

            }

            String res_linha2 = String.valueOf(soma2);
            txtResposta2.setText(res_linha2);

        }

    }

    private void populaImagensLinha3() {

        //if - se
        //------------------------------------
        if (letra3.equals("a")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.nut);
            linha3_Imagem_2_2.setImageResource(R.drawable.nut);
            linha3_Imagem_3_1.setImageResource(R.drawable.nut);
            linha3_Imagem_3_2.setImageResource(R.drawable.nut);
            linha4_Imagem_2_1.setImageResource(R.drawable.nut);
            linha4_Imagem_2_2.setImageResource(R.drawable.nut);
            imgValorImagem3.setImageResource(R.drawable.nut);

            v3 = 1;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("b")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.orange);
            linha3_Imagem_2_2.setImageResource(R.drawable.orange);
            linha3_Imagem_3_1.setImageResource(R.drawable.orange);
            linha3_Imagem_3_2.setImageResource(R.drawable.orange);
            linha4_Imagem_2_1.setImageResource(R.drawable.orange);
            linha4_Imagem_2_2.setImageResource(R.drawable.orange);
            imgValorImagem3.setImageResource(R.drawable.orange);

            v3 = 2;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("c")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.bitten_apple);
            linha3_Imagem_2_2.setImageResource(R.drawable.bitten_apple);
            linha3_Imagem_3_1.setImageResource(R.drawable.bitten_apple);
            linha3_Imagem_3_2.setImageResource(R.drawable.bitten_apple);
            linha4_Imagem_2_1.setImageResource(R.drawable.bitten_apple);
            linha4_Imagem_2_2.setImageResource(R.drawable.bitten_apple);
            imgValorImagem3.setImageResource(R.drawable.bitten_apple);

            v3 = 3;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("d")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.strawberry);
            linha3_Imagem_2_2.setImageResource(R.drawable.strawberry);
            linha3_Imagem_3_1.setImageResource(R.drawable.strawberry);
            linha3_Imagem_3_2.setImageResource(R.drawable.strawberry);
            linha4_Imagem_2_1.setImageResource(R.drawable.strawberry);
            linha4_Imagem_2_2.setImageResource(R.drawable.strawberry);
            imgValorImagem3.setImageResource(R.drawable.strawberry);

            v3 = 4;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("e")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.grapes);
            linha3_Imagem_2_2.setImageResource(R.drawable.grapes);
            linha3_Imagem_3_1.setImageResource(R.drawable.grapes);
            linha3_Imagem_3_2.setImageResource(R.drawable.grapes);
            linha4_Imagem_2_1.setImageResource(R.drawable.grapes);
            linha4_Imagem_2_2.setImageResource(R.drawable.grapes);
            imgValorImagem3.setImageResource(R.drawable.grapes);

            v3 = 5;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("f")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.water);
            linha3_Imagem_2_2.setImageResource(R.drawable.water);
            linha3_Imagem_3_1.setImageResource(R.drawable.water);
            linha3_Imagem_3_2.setImageResource(R.drawable.water);
            linha4_Imagem_2_1.setImageResource(R.drawable.water);
            linha4_Imagem_2_2.setImageResource(R.drawable.water);
            imgValorImagem3.setImageResource(R.drawable.water);

            v3 = 6;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("g")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.deforestation);
            linha3_Imagem_2_2.setImageResource(R.drawable.deforestation);
            linha3_Imagem_3_1.setImageResource(R.drawable.deforestation);
            linha3_Imagem_3_2.setImageResource(R.drawable.deforestation);
            linha4_Imagem_2_1.setImageResource(R.drawable.deforestation);
            linha4_Imagem_2_2.setImageResource(R.drawable.deforestation);
            imgValorImagem3.setImageResource(R.drawable.deforestation);

            v3 = 7;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("h")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.avalanche);
            linha3_Imagem_2_2.setImageResource(R.drawable.avalanche);
            linha3_Imagem_3_1.setImageResource(R.drawable.avalanche);
            linha3_Imagem_3_2.setImageResource(R.drawable.avalanche);
            linha4_Imagem_2_1.setImageResource(R.drawable.avalanche);
            linha4_Imagem_2_2.setImageResource(R.drawable.avalanche);
            imgValorImagem3.setImageResource(R.drawable.avalanche);

            v3 = 8;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("i")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.coconut);
            linha3_Imagem_2_2.setImageResource(R.drawable.coconut);
            linha3_Imagem_3_1.setImageResource(R.drawable.coconut);
            linha3_Imagem_3_2.setImageResource(R.drawable.coconut);
            linha4_Imagem_2_1.setImageResource(R.drawable.coconut);
            linha4_Imagem_2_2.setImageResource(R.drawable.coconut);
            imgValorImagem3.setImageResource(R.drawable.coconut);

            v3 = 9;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("j")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.beach_ball);
            linha3_Imagem_2_2.setImageResource(R.drawable.beach_ball);
            linha3_Imagem_3_1.setImageResource(R.drawable.beach_ball);
            linha3_Imagem_3_2.setImageResource(R.drawable.beach_ball);
            linha4_Imagem_2_1.setImageResource(R.drawable.beach_ball);
            linha4_Imagem_2_2.setImageResource(R.drawable.beach_ball);
            imgValorImagem3.setImageResource(R.drawable.beach_ball);

            v3 = 10;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("k")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.summer);
            linha3_Imagem_2_2.setImageResource(R.drawable.summer);
            linha3_Imagem_3_1.setImageResource(R.drawable.summer);
            linha3_Imagem_3_2.setImageResource(R.drawable.summer);
            linha4_Imagem_2_1.setImageResource(R.drawable.summer);
            linha4_Imagem_2_2.setImageResource(R.drawable.summer);
            imgValorImagem3.setImageResource(R.drawable.summer);

            v3 = 11;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("l")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.lash_light);
            linha3_Imagem_2_2.setImageResource(R.drawable.lash_light);
            linha3_Imagem_3_1.setImageResource(R.drawable.lash_light);
            linha3_Imagem_3_2.setImageResource(R.drawable.lash_light);
            linha4_Imagem_2_1.setImageResource(R.drawable.lash_light);
            linha4_Imagem_2_2.setImageResource(R.drawable.lash_light);
            imgValorImagem3.setImageResource(R.drawable.lash_light);

            v3 = 12;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("m")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.cat_footprint);
            linha3_Imagem_2_2.setImageResource(R.drawable.cat_footprint);
            linha3_Imagem_3_1.setImageResource(R.drawable.cat_footprint);
            linha3_Imagem_3_2.setImageResource(R.drawable.cat_footprint);
            linha4_Imagem_2_1.setImageResource(R.drawable.cat_footprint);
            linha4_Imagem_2_2.setImageResource(R.drawable.cat_footprint);
            imgValorImagem3.setImageResource(R.drawable.cat_footprint);

            v3 = 13;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("n")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.archeology);
            linha3_Imagem_2_2.setImageResource(R.drawable.archeology);
            linha3_Imagem_3_1.setImageResource(R.drawable.archeology);
            linha3_Imagem_3_2.setImageResource(R.drawable.archeology);
            linha4_Imagem_2_1.setImageResource(R.drawable.archeology);
            linha4_Imagem_2_2.setImageResource(R.drawable.archeology);
            imgValorImagem3.setImageResource(R.drawable.archeology);

            v3 = 14;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("o")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.volcano);
            linha3_Imagem_2_2.setImageResource(R.drawable.volcano);
            linha3_Imagem_3_1.setImageResource(R.drawable.volcano);
            linha3_Imagem_3_2.setImageResource(R.drawable.volcano);
            linha4_Imagem_2_1.setImageResource(R.drawable.volcano);
            linha4_Imagem_2_2.setImageResource(R.drawable.volcano);
            imgValorImagem3.setImageResource(R.drawable.volcano);

            v3 = 15;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("p")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.labyrinth);
            linha3_Imagem_2_2.setImageResource(R.drawable.labyrinth);
            linha3_Imagem_3_1.setImageResource(R.drawable.labyrinth);
            linha3_Imagem_3_2.setImageResource(R.drawable.labyrinth);
            linha4_Imagem_2_1.setImageResource(R.drawable.labyrinth);
            linha4_Imagem_2_2.setImageResource(R.drawable.labyrinth);
            imgValorImagem3.setImageResource(R.drawable.labyrinth);

            v3 = 16;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("q")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.statue_of_liberty);
            linha3_Imagem_2_2.setImageResource(R.drawable.statue_of_liberty);
            linha3_Imagem_3_1.setImageResource(R.drawable.statue_of_liberty);
            linha3_Imagem_3_2.setImageResource(R.drawable.statue_of_liberty);
            linha4_Imagem_2_1.setImageResource(R.drawable.statue_of_liberty);
            linha4_Imagem_2_2.setImageResource(R.drawable.statue_of_liberty);
            imgValorImagem3.setImageResource(R.drawable.statue_of_liberty);

            v3 = 17;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("r")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.horseback_riding);
            linha3_Imagem_2_2.setImageResource(R.drawable.horseback_riding);
            linha3_Imagem_3_1.setImageResource(R.drawable.horseback_riding);
            linha3_Imagem_3_2.setImageResource(R.drawable.horseback_riding);
            linha4_Imagem_2_1.setImageResource(R.drawable.horseback_riding);
            linha4_Imagem_2_2.setImageResource(R.drawable.horseback_riding);
            imgValorImagem3.setImageResource(R.drawable.horseback_riding);

            v3 = 18;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("s")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.zipline);
            linha3_Imagem_2_2.setImageResource(R.drawable.zipline);
            linha3_Imagem_3_1.setImageResource(R.drawable.zipline);
            linha3_Imagem_3_2.setImageResource(R.drawable.zipline);
            linha4_Imagem_2_1.setImageResource(R.drawable.zipline);
            linha4_Imagem_2_2.setImageResource(R.drawable.zipline);
            imgValorImagem3.setImageResource(R.drawable.zipline);

            v3 = 19;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("t")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.double_decker_bus);
            linha3_Imagem_2_2.setImageResource(R.drawable.double_decker_bus);
            linha3_Imagem_3_1.setImageResource(R.drawable.double_decker_bus);
            linha3_Imagem_3_2.setImageResource(R.drawable.double_decker_bus);
            linha4_Imagem_2_1.setImageResource(R.drawable.double_decker_bus);
            linha4_Imagem_2_2.setImageResource(R.drawable.double_decker_bus);
            imgValorImagem3.setImageResource(R.drawable.double_decker_bus);

            v3 = 20;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("u")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.o_3d_glasses);
            linha3_Imagem_2_2.setImageResource(R.drawable.o_3d_glasses);
            linha3_Imagem_3_1.setImageResource(R.drawable.o_3d_glasses);
            linha3_Imagem_3_2.setImageResource(R.drawable.o_3d_glasses);
            linha4_Imagem_2_1.setImageResource(R.drawable.o_3d_glasses);
            linha4_Imagem_2_2.setImageResource(R.drawable.o_3d_glasses);
            imgValorImagem3.setImageResource(R.drawable.o_3d_glasses);

            v3 = 21;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);


        }else if (letra3.equals("v")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.o_3d);
            linha3_Imagem_2_2.setImageResource(R.drawable.o_3d);
            linha3_Imagem_3_1.setImageResource(R.drawable.o_3d);
            linha3_Imagem_3_2.setImageResource(R.drawable.o_3d);
            linha4_Imagem_2_1.setImageResource(R.drawable.o_3d);
            linha4_Imagem_2_2.setImageResource(R.drawable.o_3d);
            imgValorImagem3.setImageResource(R.drawable.o_3d);

            v3 = 22;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("w")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.o_3d_58);
            linha3_Imagem_2_2.setImageResource(R.drawable.o_3d_58);
            linha3_Imagem_3_1.setImageResource(R.drawable.o_3d_58);
            linha3_Imagem_3_2.setImageResource(R.drawable.o_3d_58);
            linha4_Imagem_2_1.setImageResource(R.drawable.o_3d_58);
            linha4_Imagem_2_2.setImageResource(R.drawable.o_3d_58);
            imgValorImagem3.setImageResource(R.drawable.o_3d_58);

            v3 = 23;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("y")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.o_3d_64);
            linha3_Imagem_2_2.setImageResource(R.drawable.o_3d_64);
            linha3_Imagem_3_1.setImageResource(R.drawable.o_3d_64);
            linha3_Imagem_3_2.setImageResource(R.drawable.o_3d_64);
            linha4_Imagem_2_1.setImageResource(R.drawable.o_3d_64);
            linha4_Imagem_2_2.setImageResource(R.drawable.o_3d_64);
            imgValorImagem3.setImageResource(R.drawable.o_3d_64);

            v3 = 24;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("0")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.o_3d_);
            linha3_Imagem_2_2.setImageResource(R.drawable.o_3d_);
            linha3_Imagem_3_1.setImageResource(R.drawable.o_3d_);
            linha3_Imagem_3_2.setImageResource(R.drawable.o_3d_);
            linha4_Imagem_2_1.setImageResource(R.drawable.o_3d_);
            linha4_Imagem_2_2.setImageResource(R.drawable.o_3d_);
            imgValorImagem3.setImageResource(R.drawable.o_3d_);

            v3 = 25;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("1")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.o_3d_60);
            linha3_Imagem_2_2.setImageResource(R.drawable.o_3d_60);
            linha3_Imagem_3_1.setImageResource(R.drawable.o_3d_60);
            linha3_Imagem_3_2.setImageResource(R.drawable.o_3d_60);
            linha4_Imagem_2_1.setImageResource(R.drawable.o_3d_60);
            linha4_Imagem_2_2.setImageResource(R.drawable.o_3d_60);
            imgValorImagem3.setImageResource(R.drawable.o_3d_60);

            v3 = 26;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("2")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.glasses_65);
            linha3_Imagem_2_2.setImageResource(R.drawable.glasses_65);
            linha3_Imagem_3_1.setImageResource(R.drawable.glasses_65);
            linha3_Imagem_3_2.setImageResource(R.drawable.glasses_65);
            linha4_Imagem_2_1.setImageResource(R.drawable.glasses_65);
            linha4_Imagem_2_2.setImageResource(R.drawable.glasses_65);
            imgValorImagem3.setImageResource(R.drawable.glasses_65);

            v3 = 27;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("3")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.add);
            linha3_Imagem_2_2.setImageResource(R.drawable.add);
            linha3_Imagem_3_1.setImageResource(R.drawable.add);
            linha3_Imagem_3_2.setImageResource(R.drawable.add);
            linha4_Imagem_2_1.setImageResource(R.drawable.add);
            linha4_Imagem_2_2.setImageResource(R.drawable.add);
            imgValorImagem3.setImageResource(R.drawable.add);

            v3 = 28;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("4")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.admin_64);
            linha3_Imagem_2_2.setImageResource(R.drawable.admin_64);
            linha3_Imagem_3_1.setImageResource(R.drawable.admin_64);
            linha3_Imagem_3_2.setImageResource(R.drawable.admin_64);
            linha4_Imagem_2_1.setImageResource(R.drawable.admin_64);
            linha4_Imagem_2_2.setImageResource(R.drawable.admin_64);
            imgValorImagem3.setImageResource(R.drawable.admin_64);

            v3 = 29;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("5")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.circled_user);
            linha3_Imagem_2_2.setImageResource(R.drawable.circled_user);
            linha3_Imagem_3_1.setImageResource(R.drawable.circled_user);
            linha3_Imagem_3_2.setImageResource(R.drawable.circled_user);
            linha4_Imagem_2_1.setImageResource(R.drawable.circled_user);
            linha4_Imagem_2_2.setImageResource(R.drawable.circled_user);
            imgValorImagem3.setImageResource(R.drawable.circled_user);

            v3 = 30;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("6")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.user_female_skin);
            linha3_Imagem_2_2.setImageResource(R.drawable.user_female_skin);
            linha3_Imagem_3_1.setImageResource(R.drawable.user_female_skin);
            linha3_Imagem_3_2.setImageResource(R.drawable.user_female_skin);
            linha4_Imagem_2_1.setImageResource(R.drawable.user_female_skin);
            linha4_Imagem_2_2.setImageResource(R.drawable.user_female_skin);
            imgValorImagem3.setImageResource(R.drawable.user_female_skin);

            v3 = 31;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("7")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.aavatar_64);
            linha3_Imagem_2_2.setImageResource(R.drawable.aavatar_64);
            linha3_Imagem_3_1.setImageResource(R.drawable.aavatar_64);
            linha3_Imagem_3_2.setImageResource(R.drawable.aavatar_64);
            linha4_Imagem_2_1.setImageResource(R.drawable.aavatar_64);
            linha4_Imagem_2_2.setImageResource(R.drawable.aavatar_64);
            imgValorImagem3.setImageResource(R.drawable.aavatar_64);

            v3 = 32;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("8")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.aavatar_67);
            linha3_Imagem_2_2.setImageResource(R.drawable.aavatar_67);
            linha3_Imagem_3_1.setImageResource(R.drawable.aavatar_67);
            linha3_Imagem_3_2.setImageResource(R.drawable.aavatar_67);
            linha4_Imagem_2_1.setImageResource(R.drawable.aavatar_67);
            linha4_Imagem_2_2.setImageResource(R.drawable.aavatar_67);
            imgValorImagem3.setImageResource(R.drawable.aavatar_67);

            v3 = 33;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }else if (letra3.equals("9")) {
            linha3_Imagem_2_1.setImageResource(R.drawable.battery);
            linha3_Imagem_2_2.setImageResource(R.drawable.battery);
            linha3_Imagem_3_1.setImageResource(R.drawable.battery);
            linha3_Imagem_3_2.setImageResource(R.drawable.battery);
            linha4_Imagem_2_1.setImageResource(R.drawable.battery);
            linha4_Imagem_2_2.setImageResource(R.drawable.battery);
            imgValorImagem3.setImageResource(R.drawable.battery);

            v3 = 34;

            txtValorImagem3.setText(": " + v3);

            if (nivel.equals("facil")) {

                //v3 + v3 + v2
                soma3 = v3 * 2 + v2;

                txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

            } else if (nivel.equals("intermediario")) {

                if (queOperacao3.equals("*")) {

                    soma3 = v3 * v3 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + (" + v3 + " * " + v3 + ") = " + soma3);

                } else if (queOperacao3.equals("-")) {

                    soma3 = v2 + v3 - v3;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " - " + v3 + " = " + soma3);

                } else {

                    //v3 + v3 + v2
                    soma3 = v3 * 2 + v2;

                    txtDetalheRespostaLinha3.setText(v2 + " + " + v3 + " + " + v3 + " = " + soma3);

                }


            } else if (nivel.equals("avancado")) {

                int calculo7 = v2 * totalImagensLinha3_1;
                int calculo8 = v3 * totalImagensLinha3_2;
                int calculo9 = v3 * totalImagensLinha3_3;

                if (queOperacao3.equals("*")){

                    soma3 = calculo8 * calculo9 + calculo7;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + (" + calculo8 + " * " + calculo9 + ") = " + soma3);

                }else if (queOperacao3.equals("-")){

                    soma3 = calculo7 + calculo8 - calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " - " + calculo9 + " = " + soma3);

                }else {

                    soma3 = calculo7 + calculo8 + calculo9;

                    txtDetalheRespostaLinha3.setText(calculo7 + " + " + calculo8 + " + " + calculo9 + " = " + soma3);

                }


            }

            String res_linha3 = String.valueOf(soma3);
            txtResposta3.setText(res_linha3);

        }

    }

    private String embaralhar(String letra) {

        //recebendo a palavra e embaralhando, mudando a ordem das letras
        List<String> letras = Arrays.asList(letra.split(""));
        Collections.shuffle(letras);

        String palavra = "";

        //for - para item a item até o final da palavra
        for (String item : letras )

            palavra += item;

        //Retorna a palavra toda embaralhada
        return palavra;
    }

    private String embaralharTipoOrdemResultado(String sequenciaNumeros) {

        //recebendo a palavra e embaralhando, mudando a ordem das letras
        List<String> numeros = Arrays.asList(sequenciaNumeros.split(""));
        Collections.shuffle(numeros);

        String numerosEmbaralhado = "";

        //for - para item a item até o final da palavra
        for (String item : numeros )

            numerosEmbaralhado += item;

        //Retorna a palavra toda embaralhada
        return numerosEmbaralhado;
    }

    private String embaralharTipoOperacao1(String opecoesOperacao1){

        //recebendo a palavra e embaralhando, mudando a ordem das letras
        List<String> letras = Arrays.asList(opecoesOperacao1.split(""));
        Collections.shuffle(letras);

        String tipoOperacao1 = "";

        //for - para item a item até o final da palavra
        for (String item : letras )

            tipoOperacao1 += item;

        //Retorna a palavra toda embaralhada
        return tipoOperacao1;
    }

    private String embaralharTipoOperacao2(String opcoesOperacao2){

        //recebendo a palavra e embaralhando, mudando a ordem das letras
        List<String> letras = Arrays.asList(opcoesOperacao2.split(""));
        Collections.shuffle(letras);

        String tipoOperacao2 = "";

        //for - para item a item até o final da palavra
        for (String item : letras )

            tipoOperacao2 += item;

        //Retorna a palavra toda embaralhada
        return tipoOperacao2;
    }

    private String embaralharTipoOperacao3(String opcoesOperacao3){

        //recebendo a palavra e embaralhando, mudando a ordem das letras
        List<String> letras = Arrays.asList(opcoesOperacao3.split(""));
        Collections.shuffle(letras);

        String tipoOperacao3 = "";

        //for - para item a item até o final da palavra
        for (String item : letras )

            tipoOperacao3 += item;

        //Retorna a palavra toda embaralhada
        return tipoOperacao3;
    }

    private String embaralharTipoOperacao4(String opcoesOperacao4){

        //recebendo a palavra e embaralhando, mudando a ordem das letras
        List<String> letras = Arrays.asList(opcoesOperacao4.split(""));
        Collections.shuffle(letras);

        String tipoOperacao4 = "";

        //for - para item a item até o final da palavra
        for (String item : letras )

            tipoOperacao4 += item;

        //Retorna a palavra toda embaralhada
        return tipoOperacao4;
    }

    private String embaralharDis1(String posicaoResultado){

        //recebendo a palavra e embaralhando, mudando a ordem das letras
        List<String> letras = Arrays.asList(posicaoResultado.split(""));
        Collections.shuffle(letras);

        String posicaoDoResultado = "";

        //for - para item a item até o final da palavra
        for (String item : letras )

            posicaoDoResultado += item;

        //Retorna a palavra toda embaralhada
        return posicaoDoResultado;
    }



    private void misturaTipoOperacao1(){

        //if - se
        if (nivel.equals("facil")){

            operador2_linha1.setText("+");
            operador2_linha2.setText("+");
            operador2_linha3.setText("+");
            operador2_linha4.setText("+");

            queOperacao1 = "+";
            queOperacao2 = "+";
            queOperacao3 = "+";
            queOperacao4 = "+";

        }else if (nivel.equals("intermediario")){

            String textoDistR1 = tipoOperacao1;

            queOperacao1 = String.valueOf(textoDistR1.charAt(0));

            operador2_linha1.setText(queOperacao1);

            //--------------------

            String textoDistR2 = tipoOperacao2;

            queOperacao2 = String.valueOf(textoDistR2.charAt(0));

            operador2_linha2.setText(queOperacao2);

            //--------------------

            String textoDistR3 = tipoOperacao3;

            queOperacao3 = String.valueOf(textoDistR3.charAt(0));

            operador2_linha3.setText(queOperacao3);

            //--------------------

            String textoDistR4 = tipoOperacao4;

            queOperacao4 = String.valueOf(textoDistR4.charAt(0));

            operador2_linha4.setText(queOperacao4);

            //--------------------

        }else if (nivel.equals("avancado")){

            String textoDistR1 = tipoOperacao1;

            queOperacao1 = String.valueOf(textoDistR1.charAt(0));

            operador2_linha1.setText(queOperacao1);

            //--------------------

            String textoDistR2 = tipoOperacao2;

            queOperacao2 = String.valueOf(textoDistR2.charAt(0));

            operador2_linha2.setText(queOperacao2);

            //--------------------

            String textoDistR3 = tipoOperacao3;

            queOperacao3 = String.valueOf(textoDistR3.charAt(0));

            operador2_linha3.setText(queOperacao3);

            //--------------------

            String textoDistR4 = tipoOperacao4;

            queOperacao4 = String.valueOf(textoDistR4.charAt(0));

            operador2_linha4.setText(queOperacao4);

        }

    }

}