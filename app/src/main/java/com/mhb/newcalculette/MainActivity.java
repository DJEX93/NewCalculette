// D'apres Axon Tuto Mobile
//http://www.economie.gouv.fr/dgfip/taux_chancellerie_change_resultat/pays/PS
package com.mhb.newcalculette;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonPlus;
    Button buttonMoins;
    Button buttonDiv;
    Button buttonMul;
    Button buttonC;
    Button buttonEgal;
    Button buttonPoint;
    Button buttonDel;
    Button buttonPM;
    Button buttonPC;
    Button buttonILS;
    Button buttonJOD;
    Button buttonUSD;
    Button buttonEUR;

    TextView ecran;

    double chiffre1;
    boolean clicOperateur = false;
    boolean clicDevise = false;
    boolean update = false;
    String operateur = "";
    double txchancellerie= 0.233;
    int deviseFrom = 0;
    int deviseTo = 0;
    int deviseSelector = 0;

    String[] txUSD = new String[]{"99","0,911286281","3,90879988","0,709548"};
    String[] txEUR = new String[]{"1.09735","99","4,28932155","0,777554"};
    String[] txILS = new String[]{"0,255833","0,233137103","99","0,181385241"};
    String[] txJD = new String[] {"1,41044","1,28531462","5,5131277","99"};
    String[][] tx = {{"99","0.911286281", "3.90879988", "0.709548"}, {"1.09735", "99", "4.28932155", "0.777554"},{"0.255833", "0.233137103", "99", "0.181385241"},{"1.41044", "1.28531462", "5.5131277", "99" }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMoins = (Button) findViewById(R.id.buttonMoins);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEgal = (Button) findViewById(R.id.buttonEgal);
        buttonPoint = (Button) findViewById(R.id.buttonPoint);
        buttonDel = (Button) findViewById(R.id.buttonDel);
        buttonPM = (Button) findViewById(R.id.buttonPM);
        buttonPC = (Button) findViewById(R.id.buttonPC);
        buttonILS = (Button) findViewById(R.id.buttonILS);
        buttonJOD = (Button) findViewById(R.id.buttonJOD);
        buttonUSD = (Button) findViewById(R.id.buttonUSD);
        buttonEUR = (Button) findViewById(R.id.buttonEUR);
        ecran = (TextView) findViewById(R.id.ecran);









        View.OnClickListener Point = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Action du bouton chiffre
                ChiffreClick(".");

            }

        };



        View.OnClickListener chiffre0 = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Action du bouton chiffre
                ChiffreClick("0");

            }

        };

        View.OnClickListener chiffre1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton chiffre
                ChiffreClick("1");

            }

        };

        View.OnClickListener chiffre2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton chiffre
                ChiffreClick("2");

            }

        };

        View.OnClickListener chiffre3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton chiffre
                ChiffreClick("3");

            }

        };

        View.OnClickListener chiffre4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton chiffre
                ChiffreClick("4");

            }

        };

        View.OnClickListener chiffre5 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton chiffre
                ChiffreClick("5");

            }

        };

        View.OnClickListener chiffre6 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton chiffre
                ChiffreClick("6");

            }

        };

        View.OnClickListener chiffre7 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton chiffre
                ChiffreClick("7");

            }

        };

        View.OnClickListener chiffre8 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton chiffre
                ChiffreClick("8");

            }

        };

        View.OnClickListener chiffre9 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton chiffre
                ChiffreClick("9");

            }

        };

        View.OnClickListener Plus = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton +
                plusClick();

            }

        };

        View.OnClickListener Moins = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton -
                moinsClick();

            }

        };

        View.OnClickListener Div = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton /
                divClick();

            }

        };

        View.OnClickListener Mul = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton *
                mulClick();

            }

        };

        View.OnClickListener Clear = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton "c"

                CClick();

            }

        };

        View.OnClickListener Egal = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton =
                egalClick();

            }

        };

        View.OnClickListener Del = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton del
                resetClick();

            }

        };

        View.OnClickListener PM = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton +/-
                //TODO trouver la bonne formule
                PMClick();

            }

        };

        View.OnClickListener PC = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton %

                PCClick();

            }

        };

        View.OnClickListener USD = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton USD
                deviseSelector = 0;
                DeviseClick();
            }

        };

        View.OnClickListener EUR = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton USD
                deviseSelector = 1;

                DeviseClick();
            }

        };

        View.OnClickListener ILS = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton USD
                deviseSelector = 2;
                DeviseClick();
            }

        };

        View.OnClickListener JOD = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action du bouton USD
                deviseSelector = 3;
                DeviseClick();
            }

        };











        button0.setOnClickListener(chiffre0);
        button1.setOnClickListener(chiffre1);
        button2.setOnClickListener(chiffre2);
        button3.setOnClickListener(chiffre3);
        button4.setOnClickListener(chiffre4);
        button5.setOnClickListener(chiffre5);
        button6.setOnClickListener(chiffre6);
        button7.setOnClickListener(chiffre7);
        button8.setOnClickListener(chiffre8);
        button9.setOnClickListener(chiffre9);
        buttonPlus.setOnClickListener(Plus);
        buttonMoins.setOnClickListener(Moins);
        buttonDiv.setOnClickListener(Div);
        buttonMul.setOnClickListener(Mul);
        buttonC.setOnClickListener(Clear);
        buttonEgal.setOnClickListener(Egal);
        buttonPoint.setOnClickListener(Point);
        buttonDel.setOnClickListener(Del);
        buttonPM.setOnClickListener(PM);
        buttonPC.setOnClickListener(PC);
        buttonUSD.setOnClickListener(USD);
        buttonEUR.setOnClickListener(EUR);
        buttonILS.setOnClickListener(ILS);
        buttonJOD.setOnClickListener(JOD);









//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    //voici la méthode qui est exécutée lorsque l'on clique sur un bouton chiffre

    public void ChiffreClick (String str) {
        if(update){
            update = false;
        }else{
            if(!ecran.getText().equals("0"))
                str = ecran.getText() + str;
        }
        ecran.setText(str);
    }

    //voici la méthode qui est  exécutée lorsque l'on clique sur le bouton +
    public void plusClick(){

        if(clicOperateur){
            calcul();
            ecran.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(ecran.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "+";
        update = true;
    }

    //Méthode qui est exécutée lorsque l'on clique sur le bouton -
    public void moinsClick (){
        if(clicOperateur){
            calcul();
            ecran.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(ecran.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "-";
        update = true;
    }

    //Méthode qui est  exécutée lorsque l'on clique sur le bouton *
    public void mulClick(){
        if(clicOperateur){
            calcul();
            ecran.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(ecran.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "*";
        update = true;
    }

    //Méthode qui est  exécutée lorsque l'on clique sur le bouton /
    public void divClick (){
        if(clicOperateur){
            calcul();
            ecran.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(ecran.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "/";
        update = true;
    }

    //voici la méthode qui est  exécutée lorsque l'on clique sur le bouton =
    public void egalClick (){
        calcul();
        update = true;
        clicOperateur = false;
    }

    //Méthode qui est  exécutée lorsque l'on clique sur le bouton C
    public void resetClick (){
        clicOperateur = false;
        clicDevise = false;
        update = true;
        chiffre1 = 0;
        operateur = "";
        ecran.setText("0");
    }

    public void CClick (){
        //TODO trouver la bonne formule pour virer  juste un chiffre
        //clicOperateur = false; //
        //update = true;
        //  operateur = "";
        String tampon = ecran.getText().toString();
        tampon = tampon.substring(0, tampon.length()-1);
        ecran.setText(tampon); //// TODO: 05/03/2016 à Travailler
    }

    public void PCClick (){
        //TODO trouver la bonne formule pour virer  juste un chiffre
        if(clicOperateur){
            calcul();
            ecran.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(ecran.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "%";
        update = true;
    }

    public void PMClick () {
        //todo Method à finir

    }

    public void DeviseClick () {

        if(clicDevise) {
            deviseTo = deviseSelector;
            double resxult;
            resxult = Double.valueOf(ecran.getText().toString()).doubleValue() * Double.parseDouble(tx[deviseFrom][deviseTo]) ;
            ecran.setText(String.valueOf(resxult));
            deviseFrom = deviseSelector;
            //TODO A SUPPR
        } else {
            deviseFrom = deviseSelector ;

            ecran.setText(ecran.getText().toString());
            clicDevise = true;


        }

    }




    //Méthode qui fait le calcul qui a été demandé par l'utilisateur
    private void calcul(){
        if(operateur.equals("+")){
            chiffre1 = chiffre1 + Double.valueOf(ecran.getText().toString()).doubleValue();
            ecran.setText(String.valueOf(chiffre1));
        }



        if(operateur.equals("-")){
            chiffre1 = chiffre1 - Double.valueOf(ecran.getText().toString()).doubleValue();
            ecran.setText(String.valueOf(chiffre1));
        }

        if(operateur.equals("*")){
            chiffre1 = chiffre1 * Double.valueOf(ecran.getText().toString()).doubleValue();
            ecran.setText(String.valueOf(chiffre1));
        }

        if(operateur.equals("/")){
            try{
                chiffre1 = chiffre1 / Double.valueOf(ecran.getText().toString()).doubleValue();
                ecran.setText(String.valueOf(chiffre1));
            }catch(ArithmeticException e){
                ecran.setText("0");
                Toast toastMessage = Toast.makeText(this, "Division par zéro impossible", Toast.LENGTH_LONG);
                toastMessage.show();

            }
        }

        if(operateur.equals("%")){
            try{
                chiffre1 = chiffre1 * Double.valueOf(ecran.getText().toString()).doubleValue()/100;
                ecran.setText(String.valueOf(chiffre1));
            }catch(ArithmeticException e){
                ecran.setText("0");
                Toast toastMessage = Toast.makeText(this, "Division par zéro impossible", Toast.LENGTH_LONG);
                toastMessage.show();

            }
        }






    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            System.exit(0);
        }

        return super.onOptionsItemSelected(item);
    }
}
