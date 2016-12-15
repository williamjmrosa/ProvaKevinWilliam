package com.example.william.provakevinwilliam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Tela1 extends AppCompatActivity {

    private Button btnMeta;
    private static final String TAG = "MeusLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        Log.d(TAG, "Entrou no onCreate");

        //Referencias
        Log.d(TAG, "Entrou nas Referencias");

        btnMeta = (Button) findViewById(R.id.btn_meta);

        btnMeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Tela1.this,Tela2.class);
                startActivity(it);
            }
        });
    }//fecha onCreate
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Entrou no Start");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Entrou no Resume! Usuario pode usar");
    }



    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "pausou");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "parou");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Re estartou");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Destruiu");
    }
}//fecha Classe
