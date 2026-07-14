package com.cursos.allydn.anagrama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    //final é uma constatante ou seja um valor que muda
    private static final String dadosApp = "ArquivoDados";

    private String palavraEmbaralhada, letraDigitada, palavraSemEdicao, nomeSelecionado, palavra;
    private String clickBtn1, clickBtn2, clickBtn3, clickBtn4, clickBtn5, clickBtn6, clickBtn7, clickBtn8, clickBtn9, clickBtn10, clickBtn11, clickBtn12, clickBtn13, clickBtn14, clickBtn15, clickBtn16, clickBtn17, clickBtn18, clickBtn19, clickBtn20, clickBtn21, clickBtn22, clickBtn23, clickBtn24, clickBtn25, clickBtn26;
    private String letra0, letra1, letra2, letra3, letra4, letra5, letra6, letra7, letra8, letra9, letra10, letra11, letra12, letra13, letra14, letra15, letra16, letra17, letra18, letra19, letra20, letra21, letra22, letra23, letra24, letra25;
    private String letra_1, letra_2, letra_3, letra_4, letra_5, letra_6, letra_7, letra_8, letra_9, letra_10, letra_11, letra_12, letra_13, letra_14, letra_15, letra_16, letra_17, letra_18, letra_19, letra_20, letra_21, letra_22, letra_23, letra_24, letra_25, letra_26;

    private TextView txtTotalPontos, txtDica;
    private TextView txtLetraMontada1, txtLetraMontada2, txtLetraMontada3, txtLetraMontada4, txtLetraMontada5, txtLetraMontada6, txtLetraMontada7, txtLetraMontada8, txtLetraMontada9, txtLetraMontada10, txtLetraMontada11, txtLetraMontada12, txtLetraMontada13;
    private TextView txtLetraMontada14, txtLetraMontada15, txtLetraMontada16, txtLetraMontada17, txtLetraMontada18, txtLetraMontada19, txtLetraMontada20, txtLetraMontada21, txtLetraMontada22, txtLetraMontada23, txtLetraMontada24, txtLetraMontada25, txtLetraMontada26;

    private Button buttonLetra1, buttonLetra2, buttonLetra3, buttonLetra4, buttonLetra5, buttonLetra6, buttonLetra7, buttonLetra8, buttonLetra9, buttonLetra10, buttonLetra11, buttonLetra12, buttonLetra13;
    private Button buttonLetra14, buttonLetra15, buttonLetra16, buttonLetra17, buttonLetra18, buttonLetra19, buttonLetra20, buttonLetra21, buttonLetra22, buttonLetra23, buttonLetra24, buttonLetra25, buttonLetra26;

    private Button btnEmbaralhar, btnSair;

    private int posicaoLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializando
        novoJogo();



        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Sair / Fechar o aplicativo
                finish();

            }
        });

        btnEmbaralhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Começar do zero
                novoJogo();

            }
        });

        buttonLetra1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn1.equals("nao")){

                    clickBtn1 = "sim";
                    letraDigitada = letra0;
                    digitaLetra();

                    buttonLetra1.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn2.equals("nao")){

                    clickBtn2 = "sim";
                    letraDigitada = letra1;
                    digitaLetra();

                    buttonLetra2.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn3.equals("nao")){

                    clickBtn3 = "sim";
                    letraDigitada = letra2;
                    digitaLetra();

                    buttonLetra3.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn4.equals("nao")){

                    clickBtn4 = "sim";
                    letraDigitada = letra3;
                    digitaLetra();

                    buttonLetra4.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn5.equals("nao")){

                    clickBtn5 = "sim";
                    letraDigitada = letra4;
                    digitaLetra();

                    buttonLetra5.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn6.equals("nao")){

                    clickBtn6 = "sim";
                    letraDigitada = letra5;
                    digitaLetra();

                    buttonLetra6.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn7.equals("nao")){

                    clickBtn7 = "sim";
                    letraDigitada = letra6;
                    digitaLetra();

                    buttonLetra7.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn8.equals("nao")){

                    clickBtn8 = "sim";
                    letraDigitada = letra7;
                    digitaLetra();

                    buttonLetra8.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn9.equals("nao")){

                    clickBtn9 = "sim";
                    letraDigitada = letra8;
                    digitaLetra();

                    buttonLetra9.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn10.equals("nao")){

                    clickBtn10 = "sim";
                    letraDigitada = letra9;
                    digitaLetra();

                    buttonLetra10.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn11.equals("nao")){

                    clickBtn11 = "sim";
                    letraDigitada = letra10;
                    digitaLetra();

                    buttonLetra11.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn12.equals("nao")){

                    clickBtn12 = "sim";
                    letraDigitada = letra11;
                    digitaLetra();

                    buttonLetra12.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn13.equals("nao")){

                    clickBtn13 = "sim";
                    letraDigitada = letra12;
                    digitaLetra();

                    buttonLetra13.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn14.equals("nao")){

                    clickBtn14 = "sim";
                    letraDigitada = letra13;
                    digitaLetra();

                    buttonLetra14.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn15.equals("nao")){

                    clickBtn15 = "sim";
                    letraDigitada = letra14;
                    digitaLetra();

                    buttonLetra15.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn16.equals("nao")){

                    clickBtn16 = "sim";
                    letraDigitada = letra15;
                    digitaLetra();

                    buttonLetra16.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn17.equals("nao")){

                    clickBtn17 = "sim";
                    letraDigitada = letra16;
                    digitaLetra();

                    buttonLetra17.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn18.equals("nao")){

                    clickBtn18 = "sim";
                    letraDigitada = letra17;
                    digitaLetra();

                    buttonLetra18.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn19.equals("nao")){

                    clickBtn19 = "sim";
                    letraDigitada = letra18;
                    digitaLetra();

                    buttonLetra19.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn20.equals("nao")){

                    clickBtn20 = "sim";
                    letraDigitada = letra19;
                    digitaLetra();

                    buttonLetra20.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn21.equals("nao")){

                    clickBtn21 = "sim";
                    letraDigitada = letra20;
                    digitaLetra();

                    buttonLetra21.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn22.equals("nao")){

                    clickBtn22 = "sim";
                    letraDigitada = letra21;
                    digitaLetra();

                    buttonLetra22.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn23.equals("nao")){

                    clickBtn23 = "sim";
                    letraDigitada = letra22;
                    digitaLetra();

                    buttonLetra23.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn24.equals("nao")){

                    clickBtn24 = "sim";
                    letraDigitada = letra23;
                    digitaLetra();

                    buttonLetra24.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn25.equals("nao")){

                    clickBtn25 = "sim";
                    letraDigitada = letra24;
                    digitaLetra();

                    buttonLetra25.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if - se
                if (clickBtn26.equals("nao")){

                    clickBtn26 = "sim";
                    letraDigitada = letra25;
                    digitaLetra();

                    buttonLetra26.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(MainActivity.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }

    public String listaNomes(){

        List<String> minhaLista = Arrays.asList("dinossauro", "baixista", "lobo", "palhaço", "gorila", "vigilante",
                "datilógrafo", "gazela", "sanitarista", "Almofada", "seleiro", "Ouro", "carrapato",
                "lixeiro", "Concha", "peixeiro", "Pão", "ferrageiro", "metacárpico", "bovinicultor",
                "Som", "romancista", "mandíbula", "rizicultor", "nadador", "rinoceronte", "lagosteiro",
                "paleontólogo", "bomboneiro", "caiador", "garça", "coala", "psiquiatra", "camelô",
                "Peneira", "Toalha", "zigomático", "lagosta", "Televisão", "vaca", "desenhista",
                "marmota", "jardineira", "contador", "designer", "escriturário", "Caramelo", "relojoeiro",
                "Âmbar", "rêmora", "coralista", "superintendente", "urutu", "esturjão", "ouriço", "esquilo",
                "corredor", "pelicano", "motoqueiro", "projecionista", "dramaturgo", "camaleão", "Colher",
                "andorinha", "koala", "salmão", "feitor", "Ventilador", "ebanista", "cavalo", "cegonha",
                "apicultor", "chita", "correeiro", "tritão", "percevejo", "siri", "vieira", "etimólogo",
                "marcheteiro", "teclista", "zabumbeiro", "detetive", "bandeirinha", "leiteiro", "albatroz",
                "afinador", "retalhista", "desportista", "oftalmólogo", "noveleiro", "iaque", "funileiro",
                "impositor", "teatrólogo", "esqueitista", "compositor", "babá", "intérprete", "ácaro", "docente",
                "velocista", "lavagante", "damão", "bailarino", "constitucionalista", "cobra", "caixeiro",
                "caricaturista", "búfalo", "mecânico", "ourives", "cosmólogo", "semilunar", "tubista", "golfinho",
                "pinguim", "codorna", "urso", "quati", "pizzaiolo", "aguadeiro", "lagarto", "perereca", "sardão",
                "saúva", "vigia", "canguru", "contista", "baiacu", "político", "secretariado", "sinuqueiro",
                "zidedê", "telexista", "almoxarife", "jangadeiro", "Coral", "comercialista", "boa", "ema",
                "concertista", "rainha", "odontologista", "frentista", "aranha", "jabuti", "tatuí", "bufarinheiro",
                "frontal", "timoneiro", "antropologista", "esculápio", "opticista", "oftalmologista", "fisiologista",
                "vocalista", "cuboide", "botoeiro", "fiscalizador", "obstetra", "queijeiro", "proctologista", "sertanejo",
                "piscicultor", "biomédico", "rifeiro", "hipopótamo", "oncologista", "enfermeiro", "unicórnio", "rato",
                "alienista", "niala", "Leiteira", "oticista", "servente", "camarão", "narrador", "agrimensor", "castanheiro",
                "produtor", "oleiro", "Rack", "criminalista", "consultor", "chapeleiro", "Chocolate", "jamanta", "Alho",
                "perfumista", "vespa", "maxilar", "governador", "organista", "kea", "governanta", "recrutador", "Ametista",
                "cozinheiro", "fossa", "cineasta", "barracuda", "tilápia", "pescador", "galo", "neurologista", "médico",
                "cosmonauta", "deputado", "bacalhau", "acrobata", "geógrafo", "parteira", "canoísta", "morsa",
                "miniaturista", "cortador", "asclépio", "Dourado", "arquiteto", "viticultor", "anunciador",
                "cágado", "ambientalista", "manicure", "diretor", "aviador", "quiropata", "tecnólogo", "síndico",
                "besteiro", "galinha", "anaconda", "Ocre", "leão", "guitarrista", "dourado", "calcâneo;", "foca",
                "polvo", "matemática", "grou", "bode", "seringueiro", "vômer", "músico", "doméstico", "Gris",
                "percussionista", "assistente", "capivara", "entalhador", "atuário", "cornaca", "girino", "comediógrafo",
                "violonista", "copeiro", "citologista", "estilista", "Lilás", "Café", "bisonte", "doméstica", "tesoureiro",
                "Aquecedor", "nandaia", "alforjeiro", "sanfoneiro", "civilista", "patrulheiro", "antropólogo", "serpente",
                "caranguejo", "brocador", "Branco", "cosmaker", "nútria", "Castanho", "Damasco", "badmintonista", "aurífice",
                "futebolista", "remendão", "sonoplasta", "empacotador", "comentarista", "sociólogo", "jaguar",
                "alvanel", "sucuri", "sapo", "clínico", "bicicleteiro", "modelo", "gerbo", "artista", "ostreicultor",
                "mestre", "truta", "Macarrão", "mercador", "agricultor", "escabino", "sapateiro", "tapir",
                "investigador", "encharqueiro", "quatipuru", "mímico", "engenheiro", "rouxinol", "Cereja", "mariposa",
                "modista", "marimbondo", "desembargador", "dentista", "Abóbora", "anestesista", "lagartixa",
                "Turquesa", "marimbeiro", "orca", "restaurador", "canalizador", "Limão", "delegado", "temporal",
                "veterinário", "onça", "correspondente", "grilo", "malabarista", "irara", "confeiteiro", "Rubro",
                "fruticultor", "serventuário", "tetra", "roteirista", "carpideira", "Fouet", "desenhador", "bancário",
                "programador", "inhambu", "musicista", "zelador", "educador", "suiriri", "baterista", "entomologista",
                "fisioterapeuta", "despachante", "furão", "radiologista", "uber", "endocrinologista", "Vinho", "lavadeira",
                "maleiro", "alfaiate", "morcego", "psicoterapeuta", "barbeiro", "cuca", "ferreirinho", "juiz", "retocador",
                "letrista", "cardador", "catedrático", "neonatologista", "baleia", "enciclopedista", "equilibrista",
                "verdilhão", "peru", "marreco", "parietal", "luveiro", "tenista", "locutor", "pastor", "naja",
                "zoogeógrafo", "enfermeira", "garçonete", "cobrador", "ilustrador", "mosquito", "desentupidor",
                "verdinho", "ferrador", "Roxo", "taxista", "violeiro", "quitandeiro", "comerciante", "fanqueiro",
                "tucano", "gerontólogo", "repórter", "revisor", "palatino", "iguana", "pisiforme", "Chaleira", "falcão",
                "audiologista", "tutriz", "senador", "maquetista", "sinólogo", "víbora", "tainha", "hadoque", "armeiro",
                "Jambo", "cafeicultor", "truqueiro", "tartaruga", "comissário", "mula", "pavão", "cartonageiro",
                "controlador", "clarinetista", "porteiro", "oculista", "alguazil", "jornalista", "nefrologista",
                "periquito", "coiote", "navegador", "chofer", "Amarelo", "plantonista", "Copo", "grafologista",
                "piloto", "cacimbeiro", "Saladas", "motociclista", "caçador", "uberista", "asno", "ortodontista",
                "estorninho", "bacteriologista", "garagista", "Bordô", "escafoide", "sirgueiro", "Laranja", "cafezista",
                "apresentador", "cantador", "cualeiro", "jiboia", "anta", "canário", "Terracota", "paisagista", "cascavel",
                "projetista", "protesista", "camundongo", "verbetista", "suçuarana", "ovelha", "carcereiro", "texugo",
                "Marfim", "badejo", "adido", "ventríloquo", "cisne", "pedagogo", "mergulhão", "penalista", "unhalonga",
                "mocho", "algibebe", "boi", "gaivota", "fuinha", "Rosa", "serralheiro", "serigrafista", "Ferrugem",
                "boto", "cabra", "surucucu", "égua", "arquiministro", "hamster", "lebre", "violoncelista", "sagui",
                "entertainer", "flautinista", "ajudante", "figurante", "cardiologista", "capitato", "jardineiro",
                "caseiro", "escorpião", "nutricionista", "pintador", "numerólogo", "verbeteiro", "javali", "biólogo",
                "pianista", "fabricante", "mimólogo", "cabeleireiro", "construtor", "poeta", "montador", "Panela",
                "tecladista", "empregada", "vitela", "xadrezista", "pernilongo", "enxadrista", "Anil", "tubarão", "faisão",
                "eleitoralista", "barista", "lontra", "lanterninha", "cenotécnico", "farmacêutico", "enchova", "pombo",
                "gato", "banqueiro", "lanceiro", "meteorologista", "camelo", "motorneiro", "coruja", "flautista",
                "cantor", "Oliva", "optometrista", "raposa", "Escumadeira", "caubói", "bordadeira", "entregador",
                "procurador", "chargista", "cardiólogo", "Esmeralda", "ratazana", "formiga", "pato", "picheleiro",
                "dourador", "lince", "supervisor", "fonoaudiólogo", "Bandeja", "Carmim", "gondoleiro", "administrador",
                "animador", "roqueiro", "encadernador", "padeiro", "agrônomo", "escriba", "redator", "trombeteiro",
                "psicólogo", "sorveteiro", "gavião", "gari", "curandeiro", "pintor", "pesquisador", "aguateiro", "tálus",
                "ciclista", "gralha", "alparqueiro", "crítico", "talhante", "Malva", "confeiteira", "zoólogo", "garçom",
                "antiquário", "presidente", "arameiro", "carroceiro", "jumento", "transportador", "Pegadores", "protético",
                "colunista", "massarongo", "codificador", "recepcionista", "carimbador", "Mostarda", "cupim", "toupeira",
                "espião", "Marrom", "costureiro", "emepebista", "esponja", "ornitorrinco", "tradutor", "transitário",
                "uacari", "Cortina", "carvoeiro", "geneticista", "Gelo", "contrarregra", "astrônomo", "violista", "Carmesim",
                "bilheteiro", "bedel", "egiptólogo", "terapeuta", "Salmão", "pantera", "dicionarista", "marisqueira",
                "fiscal", "ortopedista", "entomólogo", "esportista", "doutrinador", "gerontologista", "vidraceiro",
                "leopardo", "jóquei", "geotécnico", "barata", "occipital", "alce", "advogado", "gaiteiro", "mágico",
                "comediante", "curtidor", "mico", "costureira", "babuíno", "narval", "faxineira", "esteireiro", "carteiro",
                "lhama", "impala", "grifo", "bombeiro", "chinchila", "caixoteiro", "panificador", "biologista", "digitador",
                "Faqueiro", "capoteiro", "alpargateiro", "propagandista", "novelista", "trapézio", "secretária", "Climatizador",
                "salamandra", "Grená", "queixada", "besouro", "veado", "etmoide", "escultor", "trocador", "arquivista",
                "Escarlate", "higienista", "toxicologista", "frila", "gafanhoto", "lula", "gestor", "taquígrafo", "fotógrafo",
                "brigadiano", "policial", "elefante", "pescada", "fromager", "precentor", "DVD", "andrologista", "contrabaixista",
                "funcionário", "radialista", "veleiro", "manobrista", "marceneiro", "maquiador", "continuísta", "bonequeiro",
                "atendente", "varejista", "trapezoide", "belchior", "trombonista", "fiscalista", "cientista", "oficial",
                "publicitário", "auditor", "suricate", "arrumador", "Tesoura", "domador", "cinegrafista", "cutia", "toureiro",
                "patologista", "parecerista", "aeronauta", "retratista", "iguanara", "abelha", "corretor", "fuzileiro",
                "inspetor", "almocreve", "esfenoide", "vaqueiro", "pirarucu", "cameleiro", "tigre", "dançador", "libretista",
                "cuscuzeiro", "capoeirista", "raia", "panda", "piolho", "sambista", "intendente", "touro", "joalheiro",
                "carneireiro", "vendedor", "calista", "kiwi", "pardal", "faturista", "jacaré", "barman", "promotor", "marinheiro",
                "tecelão", "jurista", "balconista", "esteticista", "linguado", "coveiro", "zangão", "Azul", "camareiro",
                "repeiro", "alparcateiro", "Frigideira", "pássaro", "garção", "fagotista", "orientador", "rabudinho",
                "Magenta", "dedetizador", "pedreiro", "ostra", "Vaso", "Garfo", "geólogo", "escrevedeira", "rodoviário",
                "mamute", "Verde", "tricoterapeuta", "instrumentista", "expedicionário", "químico", "Legumes", "cocheiro",
                "dingo", "chapineiro", "presidenta", "burro", "musaranho", "Ameixa", "vereador", "previdenciarista", "barbo",
                "bibliotécnico", "cachorro", "solista", "Ralador", "guará", "estatístico", "auxiliar", "ferroviário", "litógrafo",
                "formulista", "reumatologista", "guaxinim", "Índigo", "turismólogo", "aramador", "publicano", "artesão", "águia",
                "piramidal", "cachalote", "sabiá", "federal", "joaninha", "esperantólogo", "zebra", "tisiologista", "gravateiro",
                "bezerro", "carneiro", "lampreia", "potreiro", "Uva", "historiador", "macaco", "inhacoso", "dermatologista",
                "Ciano", "estenógrafo", "falcoeiro", "castor", "alvazir", "fono", "caldeireiro", "orangotango", "gasista", "porco",
                "Negro", "nasal", "droguista", "tamboril", "grafólogo", "jabiru", "Púrpura", "arbusteiro", "aguazil", "escrivão",
                "sardinha", "girafa", "comenda", "tripulante", "surubi", "sanduicheiro", "tratorista", "aeromodelista", "almotacé",
                "tintureiro", "krill", "fresador", "mergulhador", "garrafeiro", "bagre", "artífice", "endireita", "pulga", "saxofonista",
                "motoboy", "lojista", "boiadeiro", "mastologista", "dromedário", "rã", "petroquímico", "Porta", "Pilão", "Violeta",
                "pombeiro", "alpercateiro", "abutre", "capataz", "minhoca", "flamingo", "Jade", "zaragateiro", "lacraia", "borboleta",
                "feirante", "trompetista", "decorador", "Cinza", "criminólogo", "Loiro", "Tijolo", "papagaio", "tipógrafo", "Sépia",
                "editor", "ensaísta", "harpia", "periodicista", "matemático", "assessor", "avestruz", "fogueteiro", "Lavanda", "boticário",
                "ascensorista", "escritor", "atum", "carregador", "orçamentista", "topógrafo", "coelho", "cenógrafo", "Vermelho", "espadarte", "medusa",
                "Bronze", "tamanduá", "empresário", "Bege", "Amêndoa", "lagarta", "peixe", "citareiro", "barmaid", "físico", "pasteleiro", "rena",
                "Açafrão", "gravador", "robalo", "barbearia", "copista", "hipnólogo", "cristalógrafo", "hírax", "esmerilhão", "trovador", "mandril",
                "centopeia", "basquetebolista", "Pêssego", "arqueólogo", "piranha", "boxeador", "pedicure", "gerente", "hortelão", "corista", "alcatifeiro",
                "arrumadeira", "tentilhão", "culturalista", "museólogo", "alarife", "trapezista", "bibliotecário", "taberneiro", "magistrado", "tapeceiro",
                "romanista", "parlamentar", "cirurgião", "Cáqui", "crocodilo", "assentador", "kowari", "contramestre", "marisco", "massagista", "cutelaria",
                "enferrujado", "explorador", "Tapete", "moreia", "alpinista", "chimpanzé", "copidesque", "garimpeiro", "gladiador", "bacuri", "hamato",
                "camionista", "odontólogo", "mixólogo", "caracol", "enguia", "garoupa", "caminhoneiro", "provedor", "pediatra", "toxicógrafo", "torneiro",
                "defensordativo", "astrólogo", "gramático", "ecologista", "escolástico", "jararaca", "fundidor", "otorrinolaringologista", "eletricista",
                "treinador", "motorista", "ouvidor", "escaravelho", "barreteiro", "corvo", "espeleologista", "Cobre", "Pufe", "Gelo", "cigarra", "prefeito",
                "lavadeira", "jegue", "arara", "linguista", "lacrimal", "Creme", "ceifeiro", "mosca", "diagramador", "mexilhão", "fisiólogo", "almotacel",
                "Preto", "navicular", "noitibó", "tatu", "esbirro", "urutaurana", "Mesa", "seriema", "zombeteiro", "Porta-retratos", "secretário", "ganso",
                "acupunturista", "carpinteiro", "ginecologista", "cenarista", "lombriga", "niquim", "aquarista", "impressor", "acordeonista", "geriatra",
                "professor", "roupeiro", "sanguessuga", "gambá", "contabilista", "hiena", "violinista", "fazendeiro", "Cinzento", "lesma", "Fúcsia", "oceanógrafo",
                "enólogo", "tordo", "Funil", "Prata", "dançarino", "estivador", "timpanista", "pregoeiro", "tributarista", "figurinista", "bilharista",
                "florista", "metatarsais");

        //SharedPreferences para salvar os dados no celular do usuário
        //Cria um arquivo xml e dentro do arquivo, conseguimos salvar os dados
        //mode 0 - Significa que esse arquivo vai ser lido somente por este app
        SharedPreferences arquivos = getSharedPreferences(dadosApp, 0);

        //if - se
        if (arquivos.contains("pontos")){

            posicaoLista = arquivos.getInt("pontos", 0);

            nomeSelecionado = minhaLista.get(posicaoLista);

            listaDica();

        }else {

            posicaoLista = 0;
            nomeSelecionado = minhaLista.get(posicaoLista);


        }


        return nomeSelecionado;

    }

    public String listaDica(){

        List<String> minhaListaDicas = Arrays.asList("Animal", "Profissão", "Animal", "Profissão", "Animal", "Profissão",
                "Profissão", "Animal", "Profissão", "Tem na Sala", "Profissão", "Cor", "Animal", "Profissão",
                "Tem na Cozinha", "Profissão", "Tem na Cozinha", "Profissão", "Osso do membro superior", "Profissão",
                "Tem na Sala", "Profissão", "Osso da Face", "Profissão", "Profissão", "Animal", "Profissão", "Profissão",
                "Profissão", "Profissão", "Animal", "Animal", "Profissão", "Profissão", "Tem na Cozinha", "Tem na Sala",
                "Osso da Face", "Animal", "Tem na Sala", "Animal", "Profissão", "Animal", "Profissão", "Profissão", "Profissão",
                "Profissão", "Cor", "Profissão", "Cor", "Animal", "Profissão", "Profissão", "Animal", "Animal", "Animal", "Animal",
                "Profissão", "Animal", "Profissão", "Profissão", "Profissão", "Animal", "Tem na Cozinha", "Animal", "Animal",
                "Animal", "Profissão", "Tem na Sala", "Profissão", "Animal", "Animal", "Profissão", "Animal", "Profissão", "Animal",
                "Animal", "Animal", "Animal", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão",
                "Animal", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Animal", "Profissão", "Profissão", "Profissão",
                "Profissão", "Profissão", "Profissão", "Profissão", "Animal", "Profissão", "Profissão", "Animal", "Animal",
                "Profissão", "Profissão", "Animal", "Profissão", "Profissão", "Animal", "Profissão", "Profissão", "Profissão",
                "Osso do membro superior", "Profissão", "Animal", "Animal", "Animal", "Animal", "Animal", "Profissão", "Profissão",
                "Animal", "Animal", "Animal", "Animal", "Profissão", "Animal", "Profissão", "Animal", "Profissão", "Profissão",
                "Profissão", "Animal", "Profissão", "Profissão", "Profissão", "Cor", "Profissão", "Animal", "Animal", "Profissão",
                "Profissão", "Profissão", "Profissão", "Animal", "Animal", "Animal", "Profissão", "Osso do Crânio",
                "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Osso do membro inferior",
                "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão",
                "Profissão", "Animal", "Profissão", "Profissão", "Animal", "Animal", "Profissão", "Animal",
                "Tem na Cozinha", "Profissão", "Profissão", "Animal", "Profissão", "Profissão", "Profissão",
                "Profissão", "Profissão", "Tem na Sala", "Profissão", "Profissão", "Profissão", "Cor", "Animal",
                "Tem na Cozinha", "Profissão", "Animal", "Osso da Face", "Profissão", "Profissão", "Animal",
                "Profissão", "Profissão", "Cor", "Profissão", "Animal", "Profissão", "Animal", "Animal", "Profissão",
                "Animal", "Profissão", "Profissão", "Profissão", "Profissão", "Animal", "Profissão", "Profissão",
                "Profissão", "Profissão", "Animal", "Profissão", "Profissão", "Profissão", "Cor", "Profissão",
                "Profissão", "Profissão", "Animal", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão",
                "Profissão", "Profissão", "Profissão", "Animal", "Animal", "Cor", "Animal", "Profissão", "Animal",
                "Osso do membro inferior", "Animal", "Animal", "Profissão", "Animal", "Animal", "Profissão", "Osso da Face",
                "Profissão", "Profissão", "Cor", "Profissão", "Profissão", "Animal", "Profissão", "Profissão", "Profissão",
                "Animal", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Cor", "Tem na Cozinha",
                "Animal", "Profissão", "Profissão", "Tem na Sala", "Animal", "Profissão", "Profissão", "Profissão",
                "Profissão", "Profissão", "Animal", "Animal", "Profissão", "Cor", "Profissão", "Animal", "Cor", "Cor",
                "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão",
                "Animal", "Profissão", "Animal", "Animal", "Profissão", "Profissão", "Profissão", "Animal", "Profissão",
                "Profissão", "Profissão", "Animal", "Tem na Cozinha", "Profissão", "Profissão", "Profissão", "Profissão",
                "Animal", "Profissão", "Profissão", "Animal", "Profissão", "Profissão", "Animal", "Cor", "Animal",
                "Profissão", "Animal", "Profissão", "Profissão", "Cor", "Profissão", "Animal", "Cor", "Profissão", "Animal",
                "Profissão", "Profissão", "Cor", "Profissão", "Osso do Crânio", "Profissão", "Animal", "Profissão", "Animal",
                "Profissão", "Animal", "Profissão", "Cor", "Profissão", "Profissão", "Animal", "Profissão", "Profissão",
                "Tem na Cozinha", "Profissão", "Profissão", "Profissão", "Animal", "Profissão", "Profissão", "Profissão",
                "Animal", "Profissão", "Profissão", "Profissão", "Profissão", "Animal", "Profissão", "Profissão",
                "Profissão", "Cor", "Profissão", "Profissão", "Profissão", "Animal", "Profissão", "Profissão",
                "Profissão", "Animal", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão",
                "Animal", "Profissão", "Profissão", "Animal", "Animal", "Animal", "Osso do Crânio", "Profissão",
                "Profissão", "Profissão", "Profissão", "Animal", "Profissão", "Profissão", "Profissão", "Profissão",
                "Profissão", "Animal", "Profissão", "Animal", "Profissão", "Cor", "Profissão", "Profissão",
                "Profissão", "Profissão", "Profissão", "Animal", "Profissão", "Profissão", "Profissão", "Osso da Face",
                "Animal", "Osso do membro superior", "Tem na Cozinha", "Animal", "Profissão", "Profissão", "Profissão",
                "Profissão", "Profissão", "Animal", "Animal", "Animal", "Profissão", "Cor", "Profissão", "Profissão",
                "Animal", "Profissão", "Animal", "Animal", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão",
                "Profissão", "Profissão", "Profissão", "Animal", "Animal", "Profissão", "Profissão", "Cor", "Profissão",
                "Tem na Sala", "Profissão", "Profissão", "Profissão", "Tem na Cozinha", "Profissão", "Profissão", "Profissão",
                "Animal", "Profissão", "Animal", "Profissão", "Profissão", "Cor", "Osso do membro superior", "Profissão",
                "Cor", "Profissão", "Profissão", "Profissão", "Profissão", "Animal", "Animal", "Animal", "Cor", "Profissão",
                "Animal", "Profissão", "Profissão", "Animal", "Profissão", "Animal", "Animal", "Profissão", "Animal", "Cor",
                "Animal", "Profissão", "Profissão", "Animal", "Profissão", "Animal", "Profissão", "Animal", "Animal", "Profissão",
                "Animal", "Animal", "Animal", "Cor", "Profissão", "Profissão", "Cor", "Animal", "Animal", "Animal", "Animal",
                "Profissão", "Animal", "Animal", "Profissão", "Animal", "Profissão", "Profissão", "Profissão", "Profissão",
                "Profissão", "Osso do membro superior", "Profissão", "Profissão", "Animal", "Profissão", "Profissão",
                "Profissão", "Profissão", "Animal", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão",
                "Profissão", "Profissão", "Profissão", "Tem na Cozinha", "Profissão", "Profissão", "Animal", "Profissão",
                "Animal", "Profissão", "Cor", "Animal", "Animal", "Profissão", "Profissão", "Animal", "Profissão", "Profissão",
                "Profissão", "Animal", "Animal", "Animal", "Profissão", "Profissão", "Profissão", "Animal", "Profissão", "Animal",
                "Profissão", "Profissão", "Cor", "Profissão", "Animal", "Tem na Cozinha", "Profissão", "Profissão", "Profissão",
                "Profissão", "Profissão", "Profissão", "Cor", "Animal", "Animal", "Animal", "Profissão", "Profissão",
                "Animal", "Profissão", "Profissão", "Tem na Sala", "Cor", "Profissão", "Profissão", "Profissão",
                "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão",
                "Profissão", "Animal", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Osso do membro inferior",
                "Profissão", "Animal", "Profissão", "Profissão", "Profissão", "Cor", "Profissão", "Profissão", "Profissão",
                "Profissão", "Profissão", "Profissão", "Profissão", "Animal", "Profissão", "Tem na Cozinha", "Profissão",
                "Profissão", "Animal", "Profissão", "Profissão", "Profissão", "Cor", "Animal", "Animal", "Profissão",
                "Cor", "Profissão", "Profissão", "Animal", "Animal", "Profissão", "Profissão", "Animal", "Tem na Sala",
                "Profissão", "Profissão", "Cor", "Profissão", "Profissão", "Profissão", "Cor", "Profissão", "Profissão",
                "Profissão", "Profissão", "Cor", "Animal", "Profissão", "Profissão", "Profissão", "Profissão",
                "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Animal", "Profissão",
                "Profissão", "Animal", "Osso do Crânio", "Animal", "Profissão", "Profissão", "Profissão",
                "Profissão", "Profissão", "Animal", "Profissão", "Animal", "Animal", "Profissão", "Profissão",
                "Profissão", "Animal", "Animal", "Animal", "Profissão", "Animal", "Profissão", "Profissão",
                "Profissão", "Profissão", "Tem na Cozinha", "Profissão", "Profissão", "Profissão", "Profissão",
                "Osso do membro superior", "Profissão", "Tem na Sala", "Animal", "Cor", "Animal", "Animal",
                "Animal", "Osso do Crânio", "Profissão", "Profissão", "Profissão", "Cor", "Profissão",
                "Profissão", "Profissão", "Animal", "Animal", "Profissão", "Profissão", "Profissão", "Profissão",
                "Profissão", "Animal", "Animal", "Profissão", "Profissão", "Tem na Sala", "Profissão",
                "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão",
                "Profissão", "Profissão", "Profissão", "Profissão", "Osso do membro superior", "Profissão",
                "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Animal",
                "Profissão", "Tem na Cozinha", "Profissão", "Profissão", "Animal", "Profissão", "Profissão",
                "Profissão", "Profissão", "Profissão", "Animal", "Animal", "Profissão", "Profissão", "Profissão",
                "Profissão", "Osso do Crânio", "Profissão", "Animal", "Profissão", "Animal", "Animal", "Profissão",
                "Profissão", "Profissão", "Animal", "Animal", "Animal", "Profissão", "Profissão", "Animal",
                "Profissão", "Profissão", "Profissão", "Profissão", "Animal", "Animal", "Profissão", "Animal",
                "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Animal",
                "Profissão", "Animal", "Cor", "Profissão", "Profissão", "Profissão", "Tem na Cozinha", "Animal",
                "Profissão", "Profissão", "Profissão", "Animal", "Cor", "Profissão", "Profissão", "Animal",
                "Tem na Sala", "Tem na Cozinha", "Profissão", "Animal", "Profissão", "Animal", "Cor", "Profissão",
                "Profissão", "Profissão", "Profissão", "Tem na Cozinha", "Profissão", "Animal", "Profissão",
                "Profissão", "Animal", "Animal", "Cor", "Profissão", "Profissão", "Animal", "Profissão", "Animal",
                "Profissão", "Tem na Cozinha", "Animal", "Profissão", "Profissão", "Profissão", "Profissão",
                "Profissão", "Profissão", "Animal", "Cor", "Profissão", "Profissão", "Profissão", "Profissão",
                "Animal", "Osso do membro superior", "Animal", "Animal", "Profissão", "Animal", "Profissão",
                "Animal", "Profissão", "Profissão", "Animal", "Animal", "Animal", "Profissão", "Cor", "Profissão",
                "Animal", "Animal", "Profissão", "Cor", "Profissão", "Profissão", "Animal", "Profissão", "Profissão",
                "Profissão", "Animal", "Profissão", "Animal", "Cor", "Osso da Face", "Profissão", "Animal", "Profissão",
                "Animal", "Cor", "Profissão", "Profissão", "Profissão", "Animal", "Animal", "Profissão", "Profissão",
                "Animal", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Animal", "Profissão",
                "Profissão", "Profissão", "Animal", "Profissão", "Profissão", "Animal", "Profissão", "Profissão",
                "Profissão", "Profissão", "Profissão", "Animal", "Animal", "Profissão", "Tem na Sala", "Tem na Cozinha",
                "Cor", "Profissão", "Profissão", "Animal", "Profissão", "Animal", "Animal", "Cor", "Animal", "Animal",
                "Animal", "Profissão", "Profissão", "Profissão", "Cor", "Profissão", "Cor", "Cor", "Animal",
                "Profissão", "Cor", "Profissão", "Profissão", "Animal", "Profissão", "Profissão", "Profissão",
                "Animal", "Profissão", "Cor", "Profissão", "Profissão", "Profissão", "Animal", "Profissão",
                "Profissão", "Profissão", "Animal", "Profissão", "Cor", "Animal", "Animal", "Cor", "Animal",
                "Profissão", "Cor", "Cor", "Animal", "Animal", "Profissão", "Profissão", "Profissão", "Profissão",
                "Animal", "Cor", "Profissão", "Animal", "Profissão", "Profissão", "Profissão", "Profissão", "Animal",
                "Animal", "Profissão", "Animal", "Animal", "Profissão", "Cor", "Profissão", "Animal", "Profissão",
                "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Animal", "Profissão",
                "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão",
                "Profissão", "Profissão", "Cor", "Animal", "Profissão", "Animal", "Profissão", "Animal", "Profissão",
                "Profissão", "Animal", "Profissão", "Tem na Sala", "Animal", "Profissão", "Animal", "Profissão",
                "Profissão", "Profissão", "Animal", "Osso do membro superior", "Profissão", "Profissão",
                "Profissão", "Animal", "Animal", "Animal", "Profissão", "Profissão", "Profissão", "Profissão",
                "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Animal", "Profissão",
                "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Animal", "Profissão", "Animal",
                "Profissão", "Cor", "Tem na Sala", "Tem na Cozinha", "Animal", "Profissão", "Animal", "Animal",
                "Animal", "Profissão", "Osso da Face", "Cor", "Profissão", "Animal", "Profissão", "Animal",
                "Profissão", "Profissão", "Cor", "Osso do membro inferior", "Animal", "Animal", "Profissão",
                "Animal", "Tem na Sala", "Animal", "Animal", "Tem na Sala", "Profissão", "Animal", "Profissão",
                "Profissão", "Profissão", "Profissão", "Animal", "Animal", "Profissão", "Profissão", "Profissão",
                "Profissão", "Profissão", "Profissão", "Animal", "Animal", "Profissão", "Animal", "Profissão",
                "Profissão", "Cor", "Animal", "Cor", "Profissão", "Profissão", "Animal", "Tem na Cozinha", "Cor",
                "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão", "Profissão",
                "Profissão", "Osso do membro inferior");

        String dica = minhaListaDicas.get(posicaoLista);

        txtDica.setText("A dica é: " + dica);

        return nomeSelecionado;

    }

    private void digitaLetra(){

        letra_1 = txtLetraMontada1.getText().toString();
        letra_2 = txtLetraMontada2.getText().toString();
        letra_3 = txtLetraMontada3.getText().toString();
        letra_4 = txtLetraMontada4.getText().toString();
        letra_5 = txtLetraMontada5.getText().toString();
        letra_6 = txtLetraMontada6.getText().toString();
        letra_7 = txtLetraMontada7.getText().toString();
        letra_8 = txtLetraMontada8.getText().toString();
        letra_9 = txtLetraMontada9.getText().toString();
        letra_10 = txtLetraMontada10.getText().toString();
        letra_11 = txtLetraMontada11.getText().toString();
        letra_12 = txtLetraMontada12.getText().toString();
        letra_13 = txtLetraMontada13.getText().toString();
        letra_14 = txtLetraMontada14.getText().toString();
        letra_15 = txtLetraMontada15.getText().toString();
        letra_16 = txtLetraMontada16.getText().toString();
        letra_17 = txtLetraMontada17.getText().toString();
        letra_18 = txtLetraMontada18.getText().toString();
        letra_19 = txtLetraMontada19.getText().toString();
        letra_20 = txtLetraMontada20.getText().toString();
        letra_21 = txtLetraMontada21.getText().toString();
        letra_22 = txtLetraMontada22.getText().toString();
        letra_23 = txtLetraMontada23.getText().toString();
        letra_24 = txtLetraMontada24.getText().toString();
        letra_25 = txtLetraMontada25.getText().toString();
        letra_26 = txtLetraMontada26.getText().toString();

        //if - se
        if (letra_1.equals("_")){
            txtLetraMontada1.setText(letraDigitada);
            letra_1 = txtLetraMontada1.getText().toString();
        }else if (letra_2.equals("_")){
            txtLetraMontada2.setText(letraDigitada);
            letra_2 = txtLetraMontada2.getText().toString();
        }else if (letra_3.equals("_")){
            txtLetraMontada3.setText(letraDigitada);
            letra_3 = txtLetraMontada3.getText().toString();
        }else if (letra_4.equals("_")){
            txtLetraMontada4.setText(letraDigitada);
            letra_4 = txtLetraMontada4.getText().toString();
        }else if (letra_5.equals("_")){
            txtLetraMontada5.setText(letraDigitada);
            letra_5 = txtLetraMontada5.getText().toString();
        }else if (letra_6.equals("_")){
            txtLetraMontada6.setText(letraDigitada);
            letra_6 = txtLetraMontada6.getText().toString();
        }else if (letra_7.equals("_")){
            txtLetraMontada7.setText(letraDigitada);
            letra_7 = txtLetraMontada7.getText().toString();
        }else if (letra_8.equals("_")){
            txtLetraMontada8.setText(letraDigitada);
            letra_8 = txtLetraMontada8.getText().toString();
        }else if (letra_9.equals("_")){
            txtLetraMontada9.setText(letraDigitada);
            letra_9 = txtLetraMontada9.getText().toString();
        }else if (letra_10.equals("_")){
            txtLetraMontada10.setText(letraDigitada);
            letra_10 = txtLetraMontada10.getText().toString();
        }else if (letra_11.equals("_")){
            txtLetraMontada11.setText(letraDigitada);
            letra_11 = txtLetraMontada11.getText().toString();
        }else if (letra_12.equals("_")){
            txtLetraMontada12.setText(letraDigitada);
            letra_12 = txtLetraMontada12.getText().toString();
        }else if (letra_13.equals("_")){
            txtLetraMontada13.setText(letraDigitada);
            letra_13 = txtLetraMontada13.getText().toString();
        }else if (letra_14.equals("_")){
            txtLetraMontada14.setText(letraDigitada);
            letra_14 = txtLetraMontada14.getText().toString();
        }else if (letra_15.equals("_")){
            txtLetraMontada15.setText(letraDigitada);
            letra_15 = txtLetraMontada15.getText().toString();
        }else if (letra_16.equals("_")){
            txtLetraMontada16.setText(letraDigitada);
            letra_16 = txtLetraMontada16.getText().toString();
        }else if (letra_17.equals("_")){
            txtLetraMontada17.setText(letraDigitada);
            letra_17 = txtLetraMontada17.getText().toString();
        }else if (letra_18.equals("_")){
            txtLetraMontada18.setText(letraDigitada);
            letra_18 = txtLetraMontada18.getText().toString();
        }else if (letra_19.equals("_")){
            txtLetraMontada19.setText(letraDigitada);
            letra_19 = txtLetraMontada19.getText().toString();
        }else if (letra_20.equals("_")){
            txtLetraMontada20.setText(letraDigitada);
            letra_20 = txtLetraMontada20.getText().toString();
        }else if (letra_21.equals("_")){
            txtLetraMontada21.setText(letraDigitada);
            letra_21 = txtLetraMontada21.getText().toString();
        }else if (letra_22.equals("_")){
            txtLetraMontada22.setText(letraDigitada);
            letra22 = txtLetraMontada22.getText().toString();
        }else if (letra_23.equals("_")){
            txtLetraMontada23.setText(letraDigitada);
            letra_23 = txtLetraMontada23.getText().toString();
        }else if (letra_24.equals("_")){
            txtLetraMontada24.setText(letraDigitada);
            letra_24 = txtLetraMontada24.getText().toString();
        }else if (letra_25.equals("_")){
            txtLetraMontada25.setText(letraDigitada);
            letra_25 = txtLetraMontada25.getText().toString();
        }else if (letra_26.equals("_")){
            txtLetraMontada26.setText(letraDigitada);
            letra_26 = txtLetraMontada26.getText().toString();
        }

        verificaSeVenceu();

    }

    private void verificaSeVenceu(){

        String pDigitada = letra_1 + letra_2 + letra_3 +  letra_4 + letra_5 + letra_6 + letra_7 + letra_8 + letra_9 + letra_10 + letra_11 + letra_12 + letra_13 + letra_14 + letra_15 + letra_16 + letra_17 + letra_18 + letra_19 + letra_20 + letra_21 + letra_22 + letra_23 + letra_24 + letra_25 + letra_26;

        String substituiAnderline = pDigitada.replace("_", "");
        String substituiEspacoVazio = substituiAnderline.replace(" ", "");

        String tamanhoPalavraSemEdicao = String.valueOf(palavraSemEdicao.length());
        String tamanhoPalavraDigitada = String.valueOf(substituiEspacoVazio.length());

        //if - se
        //Verificando se as palavras tem a mesma quantidade de letras
        if (tamanhoPalavraSemEdicao.equals(tamanhoPalavraDigitada)){

            if (substituiEspacoVazio.equals(palavraSemEdicao)){

                salvarPontos();

                Intent AbreTelaPonto = new Intent(getApplication(), TelaPontoActivity.class);
                AbreTelaPonto.putExtra("palavra", palavraSemEdicao);
                AbreTelaPonto.putExtra("status", "acertou");
                startActivity(AbreTelaPonto);

            }else {

                Toast.makeText(this, "Você não Acertou!", Toast.LENGTH_LONG).show();
                Intent AbreTelaPonto = new Intent(getApplication(), TelaPontoActivity.class);
                AbreTelaPonto.putExtra("palavra", palavraSemEdicao);
                AbreTelaPonto.putExtra("status", "errou");
                startActivity(AbreTelaPonto);

            }

        }
    }

    private void salvarPontos(){

        //SharedPreferences para salvar os dados no celular do usuário
        //Cria um arquivo xml e dentro do arquivo, conseguimos salvar os dados
        //mode 0 - Significa que esse arquivo vai ser lido somente por este app
        SharedPreferences arquivos = getSharedPreferences(dadosApp, 0);

        //if - se
        if (arquivos.contains("pontos")){

            SharedPreferences.Editor editor = arquivos.edit();

            int qtdPontos = arquivos.getInt("pontos", 0);

            //qtdPontos++ = qtdPontos + 1
            //0 + 1
            //1 + 1
            qtdPontos++;

            editor.putInt("pontos", qtdPontos);
            editor.commit();

            txtTotalPontos.setText("Pontos: " + qtdPontos );

        }else {

            SharedPreferences.Editor editor = arquivos.edit();


            editor.putInt("pontos", 0);
            editor.commit();

            txtTotalPontos.setText("Pontos: 0");

        }

    }

    private void novoJogo(){

        txtTotalPontos = findViewById(R.id.txtTotalPontos);

        //SharedPreferences para salvar os dados no celular do usuário
        //Cria um arquivo xml e dentro do arquivo, conseguimos salvar os dados
        //mode 0 - Significa que esse arquivo vai ser lido somente por este app
        SharedPreferences arquivos = getSharedPreferences(dadosApp, 0);

        //if - se
        if (arquivos.contains("pontos")){

            Integer resultado = arquivos.getInt("pontos", 0);
            txtTotalPontos.setText("Pontos: " + resultado );

        }else {

            SharedPreferences.Editor editor = arquivos.edit();
            editor.putInt("pontos", 0);
            editor.commit();

            txtTotalPontos.setText("Pontos: 0" );

        }

        txtDica = findViewById(R.id.txtDica);

        txtLetraMontada1 = findViewById(R.id.txtLetraMontada1);
        txtLetraMontada2 = findViewById(R.id.txtLetraMontada2);
        txtLetraMontada3 = findViewById(R.id.txtLetraMontada3);
        txtLetraMontada4 = findViewById(R.id.txtLetraMontada4);
        txtLetraMontada5 = findViewById(R.id.txtLetraMontada5);
        txtLetraMontada6 = findViewById(R.id.txtLetraMontada6);
        txtLetraMontada7 = findViewById(R.id.txtLetraMontada7);
        txtLetraMontada8 = findViewById(R.id.txtLetraMontada8);
        txtLetraMontada9 = findViewById(R.id.txtLetraMontada9);
        txtLetraMontada10 = findViewById(R.id.txtLetraMontada10);
        txtLetraMontada11 = findViewById(R.id.txtLetraMontada11);
        txtLetraMontada12 = findViewById(R.id.txtLetraMontada12);
        txtLetraMontada13 = findViewById(R.id.txtLetraMontada13);
        txtLetraMontada14 = findViewById(R.id.txtLetraMontada14);
        txtLetraMontada15 = findViewById(R.id.txtLetraMontada15);
        txtLetraMontada16 = findViewById(R.id.txtLetraMontada16);
        txtLetraMontada17 = findViewById(R.id.txtLetraMontada17);
        txtLetraMontada18 = findViewById(R.id.txtLetraMontada18);
        txtLetraMontada19 = findViewById(R.id.txtLetraMontada19);
        txtLetraMontada20 = findViewById(R.id.txtLetraMontada20);
        txtLetraMontada21 = findViewById(R.id.txtLetraMontada21);
        txtLetraMontada22 = findViewById(R.id.txtLetraMontada22);
        txtLetraMontada23 = findViewById(R.id.txtLetraMontada23);
        txtLetraMontada24 = findViewById(R.id.txtLetraMontada24);
        txtLetraMontada25 = findViewById(R.id.txtLetraMontada25);
        txtLetraMontada26 = findViewById(R.id.txtLetraMontada26);

        buttonLetra1 = findViewById(R.id.buttonLetra1);
        buttonLetra2 = findViewById(R.id.buttonLetra2);
        buttonLetra3 = findViewById(R.id.buttonLetra3);
        buttonLetra4 = findViewById(R.id.buttonLetra4);
        buttonLetra5 = findViewById(R.id.buttonLetra5);
        buttonLetra6 = findViewById(R.id.buttonLetra6);
        buttonLetra7 = findViewById(R.id.buttonLetra7);
        buttonLetra8 = findViewById(R.id.buttonLetra8);
        buttonLetra9 = findViewById(R.id.buttonLetra9);
        buttonLetra10 = findViewById(R.id.buttonLetra10);
        buttonLetra11 = findViewById(R.id.buttonLetra11);
        buttonLetra12 = findViewById(R.id.buttonLetra12);
        buttonLetra13 = findViewById(R.id.buttonLetra13);
        buttonLetra14 = findViewById(R.id.buttonLetra14);
        buttonLetra15 = findViewById(R.id.buttonLetra15);
        buttonLetra16 = findViewById(R.id.buttonLetra16);
        buttonLetra17 = findViewById(R.id.buttonLetra17);
        buttonLetra18 = findViewById(R.id.buttonLetra18);
        buttonLetra19 = findViewById(R.id.buttonLetra19);
        buttonLetra20 = findViewById(R.id.buttonLetra20);
        buttonLetra21 = findViewById(R.id.buttonLetra21);
        buttonLetra22 = findViewById(R.id.buttonLetra22);
        buttonLetra23 = findViewById(R.id.buttonLetra23);
        buttonLetra24 = findViewById(R.id.buttonLetra24);
        buttonLetra25 = findViewById(R.id.buttonLetra25);
        buttonLetra26 = findViewById(R.id.buttonLetra26);

        btnEmbaralhar = findViewById(R.id.btnEmbaralhar);
        btnSair = findViewById(R.id.btnSair);


        zeraLetras();

        palavra = listaNomes();
        palavraSemEdicao = palavra.toUpperCase(); //Deixa todas as letras em maiúscula

        String texto = embaralharPalavra(palavra);
        palavraEmbaralhada = texto.toUpperCase();

        buttonLetra1.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra2.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra3.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra4.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra5.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra6.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra7.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra8.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra9.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra10.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra11.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra12.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra13.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra14.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra15.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra16.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra17.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra18.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra19.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra20.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra21.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra22.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra23.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra24.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra25.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra26.setBackgroundColor(Color.parseColor("#C9C9C9"));

        tiraAcentos();
        tiraAcentosPalavraSemEdicao();

        colocaLetrasNosBotoes();
        ocultarBotoes();

    }

    private void ocultarBotoes(){

        int totalLetras = palavraEmbaralhada.length();
        String quantidadeLetras = String.valueOf(totalLetras);

        //if - se
        if (quantidadeLetras.equals("1")){
            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.GONE);
            buttonLetra3.setVisibility(View.GONE);
            buttonLetra4.setVisibility(View.GONE);
            buttonLetra5.setVisibility(View.GONE);
            buttonLetra6.setVisibility(View.GONE);
            buttonLetra7.setVisibility(View.GONE);
            buttonLetra8.setVisibility(View.GONE);
            buttonLetra9.setVisibility(View.GONE);
            buttonLetra10.setVisibility(View.GONE);
            buttonLetra11.setVisibility(View.GONE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);
            buttonLetra14.setVisibility(View.GONE);
            buttonLetra15.setVisibility(View.GONE);
            buttonLetra16.setVisibility(View.GONE);
            buttonLetra17.setVisibility(View.GONE);
            buttonLetra18.setVisibility(View.GONE);
            buttonLetra19.setVisibility(View.GONE);
            buttonLetra20.setVisibility(View.GONE);
            buttonLetra21.setVisibility(View.GONE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.GONE);
            txtLetraMontada3.setVisibility(View.GONE);
            txtLetraMontada4.setVisibility(View.GONE);
            txtLetraMontada5.setVisibility(View.GONE);
            txtLetraMontada6.setVisibility(View.GONE);
            txtLetraMontada7.setVisibility(View.GONE);
            txtLetraMontada8.setVisibility(View.GONE);
            txtLetraMontada9.setVisibility(View.GONE);
            txtLetraMontada10.setVisibility(View.GONE);
            txtLetraMontada11.setVisibility(View.GONE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);
            txtLetraMontada14.setVisibility(View.GONE);
            txtLetraMontada15.setVisibility(View.GONE);
            txtLetraMontada16.setVisibility(View.GONE);
            txtLetraMontada17.setVisibility(View.GONE);
            txtLetraMontada18.setVisibility(View.GONE);
            txtLetraMontada19.setVisibility(View.GONE);
            txtLetraMontada20.setVisibility(View.GONE);
            txtLetraMontada21.setVisibility(View.GONE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("2")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.GONE);
            buttonLetra4.setVisibility(View.GONE);
            buttonLetra5.setVisibility(View.GONE);
            buttonLetra6.setVisibility(View.GONE);
            buttonLetra7.setVisibility(View.GONE);
            buttonLetra8.setVisibility(View.GONE);
            buttonLetra9.setVisibility(View.GONE);
            buttonLetra10.setVisibility(View.GONE);
            buttonLetra11.setVisibility(View.GONE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);
            buttonLetra14.setVisibility(View.GONE);
            buttonLetra15.setVisibility(View.GONE);
            buttonLetra16.setVisibility(View.GONE);
            buttonLetra17.setVisibility(View.GONE);
            buttonLetra18.setVisibility(View.GONE);
            buttonLetra19.setVisibility(View.GONE);
            buttonLetra20.setVisibility(View.GONE);
            buttonLetra21.setVisibility(View.GONE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.GONE);
            txtLetraMontada4.setVisibility(View.GONE);
            txtLetraMontada5.setVisibility(View.GONE);
            txtLetraMontada6.setVisibility(View.GONE);
            txtLetraMontada7.setVisibility(View.GONE);
            txtLetraMontada8.setVisibility(View.GONE);
            txtLetraMontada9.setVisibility(View.GONE);
            txtLetraMontada10.setVisibility(View.GONE);
            txtLetraMontada11.setVisibility(View.GONE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);
            txtLetraMontada14.setVisibility(View.GONE);
            txtLetraMontada15.setVisibility(View.GONE);
            txtLetraMontada16.setVisibility(View.GONE);
            txtLetraMontada17.setVisibility(View.GONE);
            txtLetraMontada18.setVisibility(View.GONE);
            txtLetraMontada19.setVisibility(View.GONE);
            txtLetraMontada20.setVisibility(View.GONE);
            txtLetraMontada21.setVisibility(View.GONE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("3")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.GONE);
            buttonLetra5.setVisibility(View.GONE);
            buttonLetra6.setVisibility(View.GONE);
            buttonLetra7.setVisibility(View.GONE);
            buttonLetra8.setVisibility(View.GONE);
            buttonLetra9.setVisibility(View.GONE);
            buttonLetra10.setVisibility(View.GONE);
            buttonLetra11.setVisibility(View.GONE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);
            buttonLetra14.setVisibility(View.GONE);
            buttonLetra15.setVisibility(View.GONE);
            buttonLetra16.setVisibility(View.GONE);
            buttonLetra17.setVisibility(View.GONE);
            buttonLetra18.setVisibility(View.GONE);
            buttonLetra19.setVisibility(View.GONE);
            buttonLetra20.setVisibility(View.GONE);
            buttonLetra21.setVisibility(View.GONE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.GONE);
            txtLetraMontada5.setVisibility(View.GONE);
            txtLetraMontada6.setVisibility(View.GONE);
            txtLetraMontada7.setVisibility(View.GONE);
            txtLetraMontada8.setVisibility(View.GONE);
            txtLetraMontada9.setVisibility(View.GONE);
            txtLetraMontada10.setVisibility(View.GONE);
            txtLetraMontada11.setVisibility(View.GONE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);
            txtLetraMontada14.setVisibility(View.GONE);
            txtLetraMontada15.setVisibility(View.GONE);
            txtLetraMontada16.setVisibility(View.GONE);
            txtLetraMontada17.setVisibility(View.GONE);
            txtLetraMontada18.setVisibility(View.GONE);
            txtLetraMontada19.setVisibility(View.GONE);
            txtLetraMontada20.setVisibility(View.GONE);
            txtLetraMontada21.setVisibility(View.GONE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("4")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.GONE);
            buttonLetra6.setVisibility(View.GONE);
            buttonLetra7.setVisibility(View.GONE);
            buttonLetra8.setVisibility(View.GONE);
            buttonLetra9.setVisibility(View.GONE);
            buttonLetra10.setVisibility(View.GONE);
            buttonLetra11.setVisibility(View.GONE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);
            buttonLetra14.setVisibility(View.GONE);
            buttonLetra15.setVisibility(View.GONE);
            buttonLetra16.setVisibility(View.GONE);
            buttonLetra17.setVisibility(View.GONE);
            buttonLetra18.setVisibility(View.GONE);
            buttonLetra19.setVisibility(View.GONE);
            buttonLetra20.setVisibility(View.GONE);
            buttonLetra21.setVisibility(View.GONE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.GONE);
            txtLetraMontada6.setVisibility(View.GONE);
            txtLetraMontada7.setVisibility(View.GONE);
            txtLetraMontada8.setVisibility(View.GONE);
            txtLetraMontada9.setVisibility(View.GONE);
            txtLetraMontada10.setVisibility(View.GONE);
            txtLetraMontada11.setVisibility(View.GONE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);
            txtLetraMontada14.setVisibility(View.GONE);
            txtLetraMontada15.setVisibility(View.GONE);
            txtLetraMontada16.setVisibility(View.GONE);
            txtLetraMontada17.setVisibility(View.GONE);
            txtLetraMontada18.setVisibility(View.GONE);
            txtLetraMontada19.setVisibility(View.GONE);
            txtLetraMontada20.setVisibility(View.GONE);
            txtLetraMontada21.setVisibility(View.GONE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("5")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.GONE);
            buttonLetra7.setVisibility(View.GONE);
            buttonLetra8.setVisibility(View.GONE);
            buttonLetra9.setVisibility(View.GONE);
            buttonLetra10.setVisibility(View.GONE);
            buttonLetra11.setVisibility(View.GONE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);
            buttonLetra14.setVisibility(View.GONE);
            buttonLetra15.setVisibility(View.GONE);
            buttonLetra16.setVisibility(View.GONE);
            buttonLetra17.setVisibility(View.GONE);
            buttonLetra18.setVisibility(View.GONE);
            buttonLetra19.setVisibility(View.GONE);
            buttonLetra20.setVisibility(View.GONE);
            buttonLetra21.setVisibility(View.GONE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.GONE);
            txtLetraMontada7.setVisibility(View.GONE);
            txtLetraMontada8.setVisibility(View.GONE);
            txtLetraMontada9.setVisibility(View.GONE);
            txtLetraMontada10.setVisibility(View.GONE);
            txtLetraMontada11.setVisibility(View.GONE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);
            txtLetraMontada14.setVisibility(View.GONE);
            txtLetraMontada15.setVisibility(View.GONE);
            txtLetraMontada16.setVisibility(View.GONE);
            txtLetraMontada17.setVisibility(View.GONE);
            txtLetraMontada18.setVisibility(View.GONE);
            txtLetraMontada19.setVisibility(View.GONE);
            txtLetraMontada20.setVisibility(View.GONE);
            txtLetraMontada21.setVisibility(View.GONE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("6")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.GONE);
            buttonLetra8.setVisibility(View.GONE);
            buttonLetra9.setVisibility(View.GONE);
            buttonLetra10.setVisibility(View.GONE);
            buttonLetra11.setVisibility(View.GONE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);
            buttonLetra14.setVisibility(View.GONE);
            buttonLetra15.setVisibility(View.GONE);
            buttonLetra16.setVisibility(View.GONE);
            buttonLetra17.setVisibility(View.GONE);
            buttonLetra18.setVisibility(View.GONE);
            buttonLetra19.setVisibility(View.GONE);
            buttonLetra20.setVisibility(View.GONE);
            buttonLetra21.setVisibility(View.GONE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.GONE);
            txtLetraMontada8.setVisibility(View.GONE);
            txtLetraMontada9.setVisibility(View.GONE);
            txtLetraMontada10.setVisibility(View.GONE);
            txtLetraMontada11.setVisibility(View.GONE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);
            txtLetraMontada14.setVisibility(View.GONE);
            txtLetraMontada15.setVisibility(View.GONE);
            txtLetraMontada16.setVisibility(View.GONE);
            txtLetraMontada17.setVisibility(View.GONE);
            txtLetraMontada18.setVisibility(View.GONE);
            txtLetraMontada19.setVisibility(View.GONE);
            txtLetraMontada20.setVisibility(View.GONE);
            txtLetraMontada21.setVisibility(View.GONE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("7")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.GONE);
            buttonLetra9.setVisibility(View.GONE);
            buttonLetra10.setVisibility(View.GONE);
            buttonLetra11.setVisibility(View.GONE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);
            buttonLetra14.setVisibility(View.GONE);
            buttonLetra15.setVisibility(View.GONE);
            buttonLetra16.setVisibility(View.GONE);
            buttonLetra17.setVisibility(View.GONE);
            buttonLetra18.setVisibility(View.GONE);
            buttonLetra19.setVisibility(View.GONE);
            buttonLetra20.setVisibility(View.GONE);
            buttonLetra21.setVisibility(View.GONE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.GONE);
            txtLetraMontada9.setVisibility(View.GONE);
            txtLetraMontada10.setVisibility(View.GONE);
            txtLetraMontada11.setVisibility(View.GONE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);
            txtLetraMontada14.setVisibility(View.GONE);
            txtLetraMontada15.setVisibility(View.GONE);
            txtLetraMontada16.setVisibility(View.GONE);
            txtLetraMontada17.setVisibility(View.GONE);
            txtLetraMontada18.setVisibility(View.GONE);
            txtLetraMontada19.setVisibility(View.GONE);
            txtLetraMontada20.setVisibility(View.GONE);
            txtLetraMontada21.setVisibility(View.GONE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("8")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.GONE);
            buttonLetra10.setVisibility(View.GONE);
            buttonLetra11.setVisibility(View.GONE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);
            buttonLetra14.setVisibility(View.GONE);
            buttonLetra15.setVisibility(View.GONE);
            buttonLetra16.setVisibility(View.GONE);
            buttonLetra17.setVisibility(View.GONE);
            buttonLetra18.setVisibility(View.GONE);
            buttonLetra19.setVisibility(View.GONE);
            buttonLetra20.setVisibility(View.GONE);
            buttonLetra21.setVisibility(View.GONE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.GONE);
            txtLetraMontada10.setVisibility(View.GONE);
            txtLetraMontada11.setVisibility(View.GONE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);
            txtLetraMontada14.setVisibility(View.GONE);
            txtLetraMontada15.setVisibility(View.GONE);
            txtLetraMontada16.setVisibility(View.GONE);
            txtLetraMontada17.setVisibility(View.GONE);
            txtLetraMontada18.setVisibility(View.GONE);
            txtLetraMontada19.setVisibility(View.GONE);
            txtLetraMontada20.setVisibility(View.GONE);
            txtLetraMontada21.setVisibility(View.GONE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("9")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.GONE);
            buttonLetra11.setVisibility(View.GONE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);
            buttonLetra14.setVisibility(View.GONE);
            buttonLetra15.setVisibility(View.GONE);
            buttonLetra16.setVisibility(View.GONE);
            buttonLetra17.setVisibility(View.GONE);
            buttonLetra18.setVisibility(View.GONE);
            buttonLetra19.setVisibility(View.GONE);
            buttonLetra20.setVisibility(View.GONE);
            buttonLetra21.setVisibility(View.GONE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.GONE);
            txtLetraMontada11.setVisibility(View.GONE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);
            txtLetraMontada14.setVisibility(View.GONE);
            txtLetraMontada15.setVisibility(View.GONE);
            txtLetraMontada16.setVisibility(View.GONE);
            txtLetraMontada17.setVisibility(View.GONE);
            txtLetraMontada18.setVisibility(View.GONE);
            txtLetraMontada19.setVisibility(View.GONE);
            txtLetraMontada20.setVisibility(View.GONE);
            txtLetraMontada21.setVisibility(View.GONE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("10")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.GONE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);
            buttonLetra14.setVisibility(View.GONE);
            buttonLetra15.setVisibility(View.GONE);
            buttonLetra16.setVisibility(View.GONE);
            buttonLetra17.setVisibility(View.GONE);
            buttonLetra18.setVisibility(View.GONE);
            buttonLetra19.setVisibility(View.GONE);
            buttonLetra20.setVisibility(View.GONE);
            buttonLetra21.setVisibility(View.GONE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.GONE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);
            txtLetraMontada14.setVisibility(View.GONE);
            txtLetraMontada15.setVisibility(View.GONE);
            txtLetraMontada16.setVisibility(View.GONE);
            txtLetraMontada17.setVisibility(View.GONE);
            txtLetraMontada18.setVisibility(View.GONE);
            txtLetraMontada19.setVisibility(View.GONE);
            txtLetraMontada20.setVisibility(View.GONE);
            txtLetraMontada21.setVisibility(View.GONE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("11")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.VISIBLE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);
            buttonLetra14.setVisibility(View.GONE);
            buttonLetra15.setVisibility(View.GONE);
            buttonLetra16.setVisibility(View.GONE);
            buttonLetra17.setVisibility(View.GONE);
            buttonLetra18.setVisibility(View.GONE);
            buttonLetra19.setVisibility(View.GONE);
            buttonLetra20.setVisibility(View.GONE);
            buttonLetra21.setVisibility(View.GONE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.VISIBLE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);
            txtLetraMontada14.setVisibility(View.GONE);
            txtLetraMontada15.setVisibility(View.GONE);
            txtLetraMontada16.setVisibility(View.GONE);
            txtLetraMontada17.setVisibility(View.GONE);
            txtLetraMontada18.setVisibility(View.GONE);
            txtLetraMontada19.setVisibility(View.GONE);
            txtLetraMontada20.setVisibility(View.GONE);
            txtLetraMontada21.setVisibility(View.GONE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("12")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.VISIBLE);
            buttonLetra12.setVisibility(View.VISIBLE);
            buttonLetra13.setVisibility(View.GONE);
            buttonLetra14.setVisibility(View.GONE);
            buttonLetra15.setVisibility(View.GONE);
            buttonLetra16.setVisibility(View.GONE);
            buttonLetra17.setVisibility(View.GONE);
            buttonLetra18.setVisibility(View.GONE);
            buttonLetra19.setVisibility(View.GONE);
            buttonLetra20.setVisibility(View.GONE);
            buttonLetra21.setVisibility(View.GONE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.VISIBLE);
            txtLetraMontada12.setVisibility(View.VISIBLE);
            txtLetraMontada13.setVisibility(View.GONE);
            txtLetraMontada14.setVisibility(View.GONE);
            txtLetraMontada15.setVisibility(View.GONE);
            txtLetraMontada16.setVisibility(View.GONE);
            txtLetraMontada17.setVisibility(View.GONE);
            txtLetraMontada18.setVisibility(View.GONE);
            txtLetraMontada19.setVisibility(View.GONE);
            txtLetraMontada20.setVisibility(View.GONE);
            txtLetraMontada21.setVisibility(View.GONE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("13")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.VISIBLE);
            buttonLetra12.setVisibility(View.VISIBLE);
            buttonLetra13.setVisibility(View.VISIBLE);
            buttonLetra14.setVisibility(View.GONE);
            buttonLetra15.setVisibility(View.GONE);
            buttonLetra16.setVisibility(View.GONE);
            buttonLetra17.setVisibility(View.GONE);
            buttonLetra18.setVisibility(View.GONE);
            buttonLetra19.setVisibility(View.GONE);
            buttonLetra20.setVisibility(View.GONE);
            buttonLetra21.setVisibility(View.GONE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.VISIBLE);
            txtLetraMontada12.setVisibility(View.VISIBLE);
            txtLetraMontada13.setVisibility(View.VISIBLE);
            txtLetraMontada14.setVisibility(View.GONE);
            txtLetraMontada15.setVisibility(View.GONE);
            txtLetraMontada16.setVisibility(View.GONE);
            txtLetraMontada17.setVisibility(View.GONE);
            txtLetraMontada18.setVisibility(View.GONE);
            txtLetraMontada19.setVisibility(View.GONE);
            txtLetraMontada20.setVisibility(View.GONE);
            txtLetraMontada21.setVisibility(View.GONE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("14")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.VISIBLE);
            buttonLetra12.setVisibility(View.VISIBLE);
            buttonLetra13.setVisibility(View.VISIBLE);
            buttonLetra14.setVisibility(View.VISIBLE);
            buttonLetra15.setVisibility(View.GONE);
            buttonLetra16.setVisibility(View.GONE);
            buttonLetra17.setVisibility(View.GONE);
            buttonLetra18.setVisibility(View.GONE);
            buttonLetra19.setVisibility(View.GONE);
            buttonLetra20.setVisibility(View.GONE);
            buttonLetra21.setVisibility(View.GONE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.VISIBLE);
            txtLetraMontada12.setVisibility(View.VISIBLE);
            txtLetraMontada13.setVisibility(View.VISIBLE);
            txtLetraMontada14.setVisibility(View.VISIBLE);
            txtLetraMontada15.setVisibility(View.GONE);
            txtLetraMontada16.setVisibility(View.GONE);
            txtLetraMontada17.setVisibility(View.GONE);
            txtLetraMontada18.setVisibility(View.GONE);
            txtLetraMontada19.setVisibility(View.GONE);
            txtLetraMontada20.setVisibility(View.GONE);
            txtLetraMontada21.setVisibility(View.GONE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("15")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.VISIBLE);
            buttonLetra12.setVisibility(View.VISIBLE);
            buttonLetra13.setVisibility(View.VISIBLE);
            buttonLetra14.setVisibility(View.VISIBLE);
            buttonLetra15.setVisibility(View.VISIBLE);
            buttonLetra16.setVisibility(View.GONE);
            buttonLetra17.setVisibility(View.GONE);
            buttonLetra18.setVisibility(View.GONE);
            buttonLetra19.setVisibility(View.GONE);
            buttonLetra20.setVisibility(View.GONE);
            buttonLetra21.setVisibility(View.GONE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.VISIBLE);
            txtLetraMontada12.setVisibility(View.VISIBLE);
            txtLetraMontada13.setVisibility(View.VISIBLE);
            txtLetraMontada14.setVisibility(View.VISIBLE);
            txtLetraMontada15.setVisibility(View.VISIBLE);
            txtLetraMontada16.setVisibility(View.GONE);
            txtLetraMontada17.setVisibility(View.GONE);
            txtLetraMontada18.setVisibility(View.GONE);
            txtLetraMontada19.setVisibility(View.GONE);
            txtLetraMontada20.setVisibility(View.GONE);
            txtLetraMontada21.setVisibility(View.GONE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("16")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.VISIBLE);
            buttonLetra12.setVisibility(View.VISIBLE);
            buttonLetra13.setVisibility(View.VISIBLE);
            buttonLetra14.setVisibility(View.VISIBLE);
            buttonLetra15.setVisibility(View.VISIBLE);
            buttonLetra16.setVisibility(View.VISIBLE);
            buttonLetra17.setVisibility(View.GONE);
            buttonLetra18.setVisibility(View.GONE);
            buttonLetra19.setVisibility(View.GONE);
            buttonLetra20.setVisibility(View.GONE);
            buttonLetra21.setVisibility(View.GONE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.VISIBLE);
            txtLetraMontada12.setVisibility(View.VISIBLE);
            txtLetraMontada13.setVisibility(View.VISIBLE);
            txtLetraMontada14.setVisibility(View.VISIBLE);
            txtLetraMontada15.setVisibility(View.VISIBLE);
            txtLetraMontada16.setVisibility(View.VISIBLE);
            txtLetraMontada17.setVisibility(View.GONE);
            txtLetraMontada18.setVisibility(View.GONE);
            txtLetraMontada19.setVisibility(View.GONE);
            txtLetraMontada20.setVisibility(View.GONE);
            txtLetraMontada21.setVisibility(View.GONE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("17")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.VISIBLE);
            buttonLetra12.setVisibility(View.VISIBLE);
            buttonLetra13.setVisibility(View.VISIBLE);
            buttonLetra14.setVisibility(View.VISIBLE);
            buttonLetra15.setVisibility(View.VISIBLE);
            buttonLetra16.setVisibility(View.VISIBLE);
            buttonLetra17.setVisibility(View.VISIBLE);
            buttonLetra18.setVisibility(View.GONE);
            buttonLetra19.setVisibility(View.GONE);
            buttonLetra20.setVisibility(View.GONE);
            buttonLetra21.setVisibility(View.GONE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.VISIBLE);
            txtLetraMontada12.setVisibility(View.VISIBLE);
            txtLetraMontada13.setVisibility(View.VISIBLE);
            txtLetraMontada14.setVisibility(View.VISIBLE);
            txtLetraMontada15.setVisibility(View.VISIBLE);
            txtLetraMontada16.setVisibility(View.VISIBLE);
            txtLetraMontada17.setVisibility(View.VISIBLE);
            txtLetraMontada18.setVisibility(View.GONE);
            txtLetraMontada19.setVisibility(View.GONE);
            txtLetraMontada20.setVisibility(View.GONE);
            txtLetraMontada21.setVisibility(View.GONE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("18")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.VISIBLE);
            buttonLetra12.setVisibility(View.VISIBLE);
            buttonLetra13.setVisibility(View.VISIBLE);
            buttonLetra14.setVisibility(View.VISIBLE);
            buttonLetra15.setVisibility(View.VISIBLE);
            buttonLetra16.setVisibility(View.VISIBLE);
            buttonLetra17.setVisibility(View.VISIBLE);
            buttonLetra18.setVisibility(View.VISIBLE);
            buttonLetra19.setVisibility(View.GONE);
            buttonLetra20.setVisibility(View.GONE);
            buttonLetra21.setVisibility(View.GONE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.VISIBLE);
            txtLetraMontada12.setVisibility(View.VISIBLE);
            txtLetraMontada13.setVisibility(View.VISIBLE);
            txtLetraMontada14.setVisibility(View.VISIBLE);
            txtLetraMontada15.setVisibility(View.VISIBLE);
            txtLetraMontada16.setVisibility(View.VISIBLE);
            txtLetraMontada17.setVisibility(View.VISIBLE);
            txtLetraMontada18.setVisibility(View.VISIBLE);
            txtLetraMontada19.setVisibility(View.GONE);
            txtLetraMontada20.setVisibility(View.GONE);
            txtLetraMontada21.setVisibility(View.GONE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("19")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.VISIBLE);
            buttonLetra12.setVisibility(View.VISIBLE);
            buttonLetra13.setVisibility(View.VISIBLE);
            buttonLetra14.setVisibility(View.VISIBLE);
            buttonLetra15.setVisibility(View.VISIBLE);
            buttonLetra16.setVisibility(View.VISIBLE);
            buttonLetra17.setVisibility(View.VISIBLE);
            buttonLetra18.setVisibility(View.VISIBLE);
            buttonLetra19.setVisibility(View.VISIBLE);
            buttonLetra20.setVisibility(View.GONE);
            buttonLetra21.setVisibility(View.GONE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.VISIBLE);
            txtLetraMontada12.setVisibility(View.VISIBLE);
            txtLetraMontada13.setVisibility(View.VISIBLE);
            txtLetraMontada14.setVisibility(View.VISIBLE);
            txtLetraMontada15.setVisibility(View.VISIBLE);
            txtLetraMontada16.setVisibility(View.VISIBLE);
            txtLetraMontada17.setVisibility(View.VISIBLE);
            txtLetraMontada18.setVisibility(View.VISIBLE);
            txtLetraMontada19.setVisibility(View.VISIBLE);
            txtLetraMontada20.setVisibility(View.GONE);
            txtLetraMontada21.setVisibility(View.GONE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("20")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.VISIBLE);
            buttonLetra12.setVisibility(View.VISIBLE);
            buttonLetra13.setVisibility(View.VISIBLE);
            buttonLetra14.setVisibility(View.VISIBLE);
            buttonLetra15.setVisibility(View.VISIBLE);
            buttonLetra16.setVisibility(View.VISIBLE);
            buttonLetra17.setVisibility(View.VISIBLE);
            buttonLetra18.setVisibility(View.VISIBLE);
            buttonLetra19.setVisibility(View.VISIBLE);
            buttonLetra20.setVisibility(View.VISIBLE);
            buttonLetra21.setVisibility(View.GONE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.VISIBLE);
            txtLetraMontada12.setVisibility(View.VISIBLE);
            txtLetraMontada13.setVisibility(View.VISIBLE);
            txtLetraMontada14.setVisibility(View.VISIBLE);
            txtLetraMontada15.setVisibility(View.VISIBLE);
            txtLetraMontada16.setVisibility(View.VISIBLE);
            txtLetraMontada17.setVisibility(View.VISIBLE);
            txtLetraMontada18.setVisibility(View.VISIBLE);
            txtLetraMontada19.setVisibility(View.VISIBLE);
            txtLetraMontada20.setVisibility(View.VISIBLE);
            txtLetraMontada21.setVisibility(View.GONE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("21")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.VISIBLE);
            buttonLetra12.setVisibility(View.VISIBLE);
            buttonLetra13.setVisibility(View.VISIBLE);
            buttonLetra14.setVisibility(View.VISIBLE);
            buttonLetra15.setVisibility(View.VISIBLE);
            buttonLetra16.setVisibility(View.VISIBLE);
            buttonLetra17.setVisibility(View.VISIBLE);
            buttonLetra18.setVisibility(View.VISIBLE);
            buttonLetra19.setVisibility(View.VISIBLE);
            buttonLetra20.setVisibility(View.VISIBLE);
            buttonLetra21.setVisibility(View.VISIBLE);
            buttonLetra22.setVisibility(View.GONE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.VISIBLE);
            txtLetraMontada12.setVisibility(View.VISIBLE);
            txtLetraMontada13.setVisibility(View.VISIBLE);
            txtLetraMontada14.setVisibility(View.VISIBLE);
            txtLetraMontada15.setVisibility(View.VISIBLE);
            txtLetraMontada16.setVisibility(View.VISIBLE);
            txtLetraMontada17.setVisibility(View.VISIBLE);
            txtLetraMontada18.setVisibility(View.VISIBLE);
            txtLetraMontada19.setVisibility(View.VISIBLE);
            txtLetraMontada20.setVisibility(View.VISIBLE);
            txtLetraMontada21.setVisibility(View.VISIBLE);
            txtLetraMontada22.setVisibility(View.GONE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("22")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.VISIBLE);
            buttonLetra12.setVisibility(View.VISIBLE);
            buttonLetra13.setVisibility(View.VISIBLE);
            buttonLetra14.setVisibility(View.VISIBLE);
            buttonLetra15.setVisibility(View.VISIBLE);
            buttonLetra16.setVisibility(View.VISIBLE);
            buttonLetra17.setVisibility(View.VISIBLE);
            buttonLetra18.setVisibility(View.VISIBLE);
            buttonLetra19.setVisibility(View.VISIBLE);
            buttonLetra20.setVisibility(View.VISIBLE);
            buttonLetra21.setVisibility(View.VISIBLE);
            buttonLetra22.setVisibility(View.VISIBLE);
            buttonLetra23.setVisibility(View.GONE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.VISIBLE);
            txtLetraMontada12.setVisibility(View.VISIBLE);
            txtLetraMontada13.setVisibility(View.VISIBLE);
            txtLetraMontada14.setVisibility(View.VISIBLE);
            txtLetraMontada15.setVisibility(View.VISIBLE);
            txtLetraMontada16.setVisibility(View.VISIBLE);
            txtLetraMontada17.setVisibility(View.VISIBLE);
            txtLetraMontada18.setVisibility(View.VISIBLE);
            txtLetraMontada19.setVisibility(View.VISIBLE);
            txtLetraMontada20.setVisibility(View.VISIBLE);
            txtLetraMontada21.setVisibility(View.VISIBLE);
            txtLetraMontada22.setVisibility(View.VISIBLE);
            txtLetraMontada23.setVisibility(View.GONE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("23")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.VISIBLE);
            buttonLetra12.setVisibility(View.VISIBLE);
            buttonLetra13.setVisibility(View.VISIBLE);
            buttonLetra14.setVisibility(View.VISIBLE);
            buttonLetra15.setVisibility(View.VISIBLE);
            buttonLetra16.setVisibility(View.VISIBLE);
            buttonLetra17.setVisibility(View.VISIBLE);
            buttonLetra18.setVisibility(View.VISIBLE);
            buttonLetra19.setVisibility(View.VISIBLE);
            buttonLetra20.setVisibility(View.VISIBLE);
            buttonLetra21.setVisibility(View.VISIBLE);
            buttonLetra22.setVisibility(View.VISIBLE);
            buttonLetra23.setVisibility(View.VISIBLE);
            buttonLetra24.setVisibility(View.GONE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.VISIBLE);
            txtLetraMontada12.setVisibility(View.VISIBLE);
            txtLetraMontada13.setVisibility(View.VISIBLE);
            txtLetraMontada14.setVisibility(View.VISIBLE);
            txtLetraMontada15.setVisibility(View.VISIBLE);
            txtLetraMontada16.setVisibility(View.VISIBLE);
            txtLetraMontada17.setVisibility(View.VISIBLE);
            txtLetraMontada18.setVisibility(View.VISIBLE);
            txtLetraMontada19.setVisibility(View.VISIBLE);
            txtLetraMontada20.setVisibility(View.VISIBLE);
            txtLetraMontada21.setVisibility(View.VISIBLE);
            txtLetraMontada22.setVisibility(View.VISIBLE);
            txtLetraMontada23.setVisibility(View.VISIBLE);
            txtLetraMontada24.setVisibility(View.GONE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("24")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.VISIBLE);
            buttonLetra12.setVisibility(View.VISIBLE);
            buttonLetra13.setVisibility(View.VISIBLE);
            buttonLetra14.setVisibility(View.VISIBLE);
            buttonLetra15.setVisibility(View.VISIBLE);
            buttonLetra16.setVisibility(View.VISIBLE);
            buttonLetra17.setVisibility(View.VISIBLE);
            buttonLetra18.setVisibility(View.VISIBLE);
            buttonLetra19.setVisibility(View.VISIBLE);
            buttonLetra20.setVisibility(View.VISIBLE);
            buttonLetra21.setVisibility(View.VISIBLE);
            buttonLetra22.setVisibility(View.VISIBLE);
            buttonLetra23.setVisibility(View.VISIBLE);
            buttonLetra24.setVisibility(View.VISIBLE);
            buttonLetra25.setVisibility(View.GONE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.VISIBLE);
            txtLetraMontada12.setVisibility(View.VISIBLE);
            txtLetraMontada13.setVisibility(View.VISIBLE);
            txtLetraMontada14.setVisibility(View.VISIBLE);
            txtLetraMontada15.setVisibility(View.VISIBLE);
            txtLetraMontada16.setVisibility(View.VISIBLE);
            txtLetraMontada17.setVisibility(View.VISIBLE);
            txtLetraMontada18.setVisibility(View.VISIBLE);
            txtLetraMontada19.setVisibility(View.VISIBLE);
            txtLetraMontada20.setVisibility(View.VISIBLE);
            txtLetraMontada21.setVisibility(View.VISIBLE);
            txtLetraMontada22.setVisibility(View.VISIBLE);
            txtLetraMontada23.setVisibility(View.VISIBLE);
            txtLetraMontada24.setVisibility(View.VISIBLE);
            txtLetraMontada25.setVisibility(View.GONE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("25")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.VISIBLE);
            buttonLetra12.setVisibility(View.VISIBLE);
            buttonLetra13.setVisibility(View.VISIBLE);
            buttonLetra14.setVisibility(View.VISIBLE);
            buttonLetra15.setVisibility(View.VISIBLE);
            buttonLetra16.setVisibility(View.VISIBLE);
            buttonLetra17.setVisibility(View.VISIBLE);
            buttonLetra18.setVisibility(View.VISIBLE);
            buttonLetra19.setVisibility(View.VISIBLE);
            buttonLetra20.setVisibility(View.VISIBLE);
            buttonLetra21.setVisibility(View.VISIBLE);
            buttonLetra22.setVisibility(View.VISIBLE);
            buttonLetra23.setVisibility(View.VISIBLE);
            buttonLetra24.setVisibility(View.VISIBLE);
            buttonLetra25.setVisibility(View.VISIBLE);
            buttonLetra26.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.VISIBLE);
            txtLetraMontada12.setVisibility(View.VISIBLE);
            txtLetraMontada13.setVisibility(View.VISIBLE);
            txtLetraMontada14.setVisibility(View.VISIBLE);
            txtLetraMontada15.setVisibility(View.VISIBLE);
            txtLetraMontada16.setVisibility(View.VISIBLE);
            txtLetraMontada17.setVisibility(View.VISIBLE);
            txtLetraMontada18.setVisibility(View.VISIBLE);
            txtLetraMontada19.setVisibility(View.VISIBLE);
            txtLetraMontada20.setVisibility(View.VISIBLE);
            txtLetraMontada21.setVisibility(View.VISIBLE);
            txtLetraMontada22.setVisibility(View.VISIBLE);
            txtLetraMontada23.setVisibility(View.VISIBLE);
            txtLetraMontada24.setVisibility(View.VISIBLE);
            txtLetraMontada25.setVisibility(View.VISIBLE);
            txtLetraMontada26.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("26")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.VISIBLE);
            buttonLetra12.setVisibility(View.VISIBLE);
            buttonLetra13.setVisibility(View.VISIBLE);
            buttonLetra14.setVisibility(View.VISIBLE);
            buttonLetra15.setVisibility(View.VISIBLE);
            buttonLetra16.setVisibility(View.VISIBLE);
            buttonLetra17.setVisibility(View.VISIBLE);
            buttonLetra18.setVisibility(View.VISIBLE);
            buttonLetra19.setVisibility(View.VISIBLE);
            buttonLetra20.setVisibility(View.VISIBLE);
            buttonLetra21.setVisibility(View.VISIBLE);
            buttonLetra22.setVisibility(View.VISIBLE);
            buttonLetra23.setVisibility(View.VISIBLE);
            buttonLetra24.setVisibility(View.VISIBLE);
            buttonLetra25.setVisibility(View.VISIBLE);
            buttonLetra26.setVisibility(View.VISIBLE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.VISIBLE);
            txtLetraMontada12.setVisibility(View.VISIBLE);
            txtLetraMontada13.setVisibility(View.VISIBLE);
            txtLetraMontada14.setVisibility(View.VISIBLE);
            txtLetraMontada15.setVisibility(View.VISIBLE);
            txtLetraMontada16.setVisibility(View.VISIBLE);
            txtLetraMontada17.setVisibility(View.VISIBLE);
            txtLetraMontada18.setVisibility(View.VISIBLE);
            txtLetraMontada19.setVisibility(View.VISIBLE);
            txtLetraMontada20.setVisibility(View.VISIBLE);
            txtLetraMontada21.setVisibility(View.VISIBLE);
            txtLetraMontada22.setVisibility(View.VISIBLE);
            txtLetraMontada23.setVisibility(View.VISIBLE);
            txtLetraMontada24.setVisibility(View.VISIBLE);
            txtLetraMontada25.setVisibility(View.VISIBLE);
            txtLetraMontada26.setVisibility(View.VISIBLE);

        }

    }

    private void colocaLetrasNosBotoes(){

        String minhaPalavra = palavraEmbaralhada;

        try {

            letra0 = String.valueOf(minhaPalavra.charAt(0));
            letra1 = String.valueOf(minhaPalavra.charAt(1));
            letra2 = String.valueOf(minhaPalavra.charAt(2));
            letra3 = String.valueOf(minhaPalavra.charAt(3));
            letra4 = String.valueOf(minhaPalavra.charAt(4));
            letra5 = String.valueOf(minhaPalavra.charAt(5));
            letra6 = String.valueOf(minhaPalavra.charAt(6));
            letra7 = String.valueOf(minhaPalavra.charAt(7));
            letra8 = String.valueOf(minhaPalavra.charAt(8));
            letra9 = String.valueOf(minhaPalavra.charAt(9));
            letra10 = String.valueOf(minhaPalavra.charAt(10));
            letra11 = String.valueOf(minhaPalavra.charAt(11));
            letra12 = String.valueOf(minhaPalavra.charAt(12));
            letra13 = String.valueOf(minhaPalavra.charAt(13));
            letra14 = String.valueOf(minhaPalavra.charAt(14));
            letra15 = String.valueOf(minhaPalavra.charAt(15));
            letra16 = String.valueOf(minhaPalavra.charAt(16));
            letra17 = String.valueOf(minhaPalavra.charAt(17));
            letra18 = String.valueOf(minhaPalavra.charAt(18));
            letra19 = String.valueOf(minhaPalavra.charAt(19));
            letra20 = String.valueOf(minhaPalavra.charAt(20));
            letra21 = String.valueOf(minhaPalavra.charAt(21));
            letra22 = String.valueOf(minhaPalavra.charAt(22));
            letra23 = String.valueOf(minhaPalavra.charAt(23));
            letra24 = String.valueOf(minhaPalavra.charAt(24));
            letra25 = String.valueOf(minhaPalavra.charAt(25));


        }catch (Exception e){
            e.printStackTrace();
        }

        if(letra0 != null){
            buttonLetra1.setText(letra0);
        }

        if(letra1 != null){
            buttonLetra2.setText(letra1);
        }

        if(letra2 != null){
            buttonLetra3.setText(letra2);
        }

        if(letra3 != null){
            buttonLetra4.setText(letra3);
        }

        if(letra4 != null){
            buttonLetra5.setText(letra4);
        }

        if(letra5 != null){
            buttonLetra6.setText(letra5);
        }

        if(letra6 != null){
            buttonLetra7.setText(letra6);
        }

        if(letra7 != null){
            buttonLetra8.setText(letra7);
        }

        if(letra8 != null){
            buttonLetra9.setText(letra8);
        }

        if(letra9 != null){
            buttonLetra10.setText(letra9);
        }

        if(letra10 != null){
            buttonLetra11.setText(letra10);
        }

        if(letra11 != null){
            buttonLetra12.setText(letra11);
        }

        if(letra12 != null){
            buttonLetra13.setText(letra12);
        }

        if(letra13 != null){
            buttonLetra14.setText(letra13);
        }

        if(letra14 != null){
            buttonLetra15.setText(letra14);
        }

        if(letra15 != null){
            buttonLetra16.setText(letra15);
        }

        if(letra16 != null){
            buttonLetra17.setText(letra16);
        }

        if(letra17 != null){
            buttonLetra18.setText(letra17);
        }

        if(letra18 != null){
            buttonLetra19.setText(letra18);
        }

        if(letra19 != null){
            buttonLetra20.setText(letra19);
        }

        if(letra20 != null){
            buttonLetra21.setText(letra20);
        }

        if(letra21 != null){
            buttonLetra22.setText(letra21);
        }

        if(letra22 != null){
            buttonLetra23.setText(letra22);
        }

        if(letra23 != null){
            buttonLetra24.setText(letra23);
        }

        if(letra24 != null){
            buttonLetra25.setText(letra24);
        }

        if(letra25 != null){
            buttonLetra26.setText(letra25);
        }


    }

    private void zeraLetras(){

        clickBtn1 = "nao";
        clickBtn2 = "nao";
        clickBtn3 = "nao";
        clickBtn4 = "nao";
        clickBtn5 = "nao";
        clickBtn6 = "nao";
        clickBtn7 = "nao";
        clickBtn8 = "nao";
        clickBtn9 = "nao";
        clickBtn10 = "nao";
        clickBtn11 = "nao";
        clickBtn12 = "nao";
        clickBtn13 = "nao";
        clickBtn14 = "nao";
        clickBtn15 = "nao";
        clickBtn16 = "nao";
        clickBtn17 = "nao";
        clickBtn18 = "nao";
        clickBtn19 = "nao";
        clickBtn20 = "nao";
        clickBtn21 = "nao";
        clickBtn22 = "nao";
        clickBtn23 = "nao";
        clickBtn24 = "nao";
        clickBtn25 = "nao";
        clickBtn26 = "nao";

        txtLetraMontada1.setText("_");
        txtLetraMontada2.setText("_");
        txtLetraMontada3.setText("_");
        txtLetraMontada4.setText("_");
        txtLetraMontada5.setText("_");
        txtLetraMontada6.setText("_");
        txtLetraMontada7.setText("_");
        txtLetraMontada8.setText("_");
        txtLetraMontada9.setText("_");
        txtLetraMontada10.setText("_");
        txtLetraMontada11.setText("_");
        txtLetraMontada12.setText("_");
        txtLetraMontada13.setText("_");
        txtLetraMontada14.setText("_");
        txtLetraMontada15.setText("_");
        txtLetraMontada16.setText("_");
        txtLetraMontada17.setText("_");
        txtLetraMontada18.setText("_");
        txtLetraMontada19.setText("_");
        txtLetraMontada20.setText("_");
        txtLetraMontada21.setText("_");
        txtLetraMontada22.setText("_");
        txtLetraMontada23.setText("_");
        txtLetraMontada24.setText("_");
        txtLetraMontada25.setText("_");
        txtLetraMontada26.setText("_");


    }

    private String embaralharPalavra(String palavra){

        List<String> letras = Arrays.asList(palavra.split(""));
        Collections.shuffle(letras);
        String palavraEmbaralhada = "";

        //for - para
        for (String letra : letras){

            palavraEmbaralhada += letra;

        }

        return palavraEmbaralhada;

    }

    @Override
    protected void onStart() {
        super.onStart();

        novoJogo();

    }

    private void tiraAcentos(){

        String palavraa = palavraEmbaralhada;

        String caracter1 = palavraa.replace("Á", "A");
        String caracter2 = caracter1.replace("Â", "A");
        String caracter3 = caracter2.replace("À", "A");
        String caracter4 = caracter3.replace("Ã", "A");
        String caracter5 = caracter4.replace("Ä", "A");
        String caracter6 = caracter5.replace("Å", "A");
        String caracter7 = caracter6.replace("É", "E");
        String caracter8 = caracter7.replace("Ê", "E");
        String caracter9 = caracter8.replace("È", "E");
        String caracter10 = caracter9.replace("Ë", "E");
        String caracter11 = caracter10.replace("Ð", "D");
        String caracter12 = caracter11.replace("Í", "I");
        String caracter13 = caracter12.replace("Î", "I");
        String caracter14 = caracter13.replace("Ì", "I");
        String caracter15 = caracter14.replace("Ï", "I");
        String caracter16 = caracter15.replace("Ó", "O");
        String caracter17 = caracter16.replace("Ô", "O");
        String caracter18 = caracter17.replace("Ò", "O");
        String caracter19 = caracter18.replace("Ø", "O");
        String caracter20 = caracter19.replace("Õ", "O");
        String caracter21 = caracter20.replace("Ö", "O");
        String caracter22 = caracter21.replace("Ú", "U");
        String caracter23 = caracter22.replace("Û", "U");
        String caracter24 = caracter23.replace("Ù", "U");
        String caracter25 = caracter24.replace("Ü", "U");
        String caracter26 = caracter25.replace("Ç", "C");
        String caracter27 = caracter26.replace("Ñ", "N");
        String caracter28 = caracter27.replace("Ý", "Y");
        String caracter29 = caracter28.replace(" ", "-");

        palavraEmbaralhada = caracter29;


    }

    private void tiraAcentosPalavraSemEdicao(){

        String palavraa = palavraSemEdicao;

        String caracter1 = palavraa.replace("Á", "A");
        String caracter2 = caracter1.replace("Â", "A");
        String caracter3 = caracter2.replace("À", "A");
        String caracter4 = caracter3.replace("Ã", "A");
        String caracter5 = caracter4.replace("Ä", "A");
        String caracter6 = caracter5.replace("Å", "A");
        String caracter7 = caracter6.replace("É", "E");
        String caracter8 = caracter7.replace("Ê", "E");
        String caracter9 = caracter8.replace("È", "E");
        String caracter10 = caracter9.replace("Ë", "E");
        String caracter11 = caracter10.replace("Ð", "D");
        String caracter12 = caracter11.replace("Í", "I");
        String caracter13 = caracter12.replace("Î", "I");
        String caracter14 = caracter13.replace("Ì", "I");
        String caracter15 = caracter14.replace("Ï", "I");
        String caracter16 = caracter15.replace("Ó", "O");
        String caracter17 = caracter16.replace("Ô", "O");
        String caracter18 = caracter17.replace("Ò", "O");
        String caracter19 = caracter18.replace("Ø", "O");
        String caracter20 = caracter19.replace("Õ", "O");
        String caracter21 = caracter20.replace("Ö", "O");
        String caracter22 = caracter21.replace("Ú", "U");
        String caracter23 = caracter22.replace("Û", "U");
        String caracter24 = caracter23.replace("Ù", "U");
        String caracter25 = caracter24.replace("Ü", "U");
        String caracter26 = caracter25.replace("Ç", "C");
        String caracter27 = caracter26.replace("Ñ", "N");
        String caracter28 = caracter27.replace("Ý", "Y");
        String caracter29 = caracter28.replace(" ", "-");

        palavraSemEdicao = caracter29;


    }

}