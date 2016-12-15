package com.example.william.provakevinwilliam;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;

public class Tela2 extends AppCompatActivity {

    private EditText etNome;
    private EditText etPesoAtual;
    private EditText etPesoDesejado;
    private RadioGroup grupoSexo;
    private RadioButton rbMasculino;
    private RadioButton rbFeminino;
    private CheckBox cbManha;
    private CheckBox cbTarde;
    private CheckBox cbNoite;
    private Spinner spTreino;
    private Button btnCadastrar;
    private static final String TAG = "MeusLogs";
    private Meta meta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Log.d(TAG, "Entrou no onCreate");
        //Referencias
        Log.d(TAG, "Entrou nas Referencias");
        etNome = (EditText) findViewById(R.id.tc_et_nome);
        etPesoAtual = (EditText) findViewById(R.id.tc_et_peso_atual);
        etPesoDesejado = (EditText) findViewById(R.id.tc_et_peso_desejado);
        grupoSexo = (RadioGroup) findViewById(R.id.tc_grupo_sexo);
        rbFeminino = (RadioButton) findViewById(R.id.tc_rb_feminino);
        rbMasculino = (RadioButton) findViewById(R.id.tc_rb_masculino);
        cbManha = (CheckBox) findViewById(R.id.tc_cb_manha);
        cbTarde = (CheckBox) findViewById(R.id.tc_cb_tarde);
        cbNoite = (CheckBox) findViewById(R.id.tc_cb_noite);
        spTreino = (Spinner) findViewById(R.id.tc_sp_treino);
        btnCadastrar = (Button) findViewById(R.id.tc_btn_cadastrar);


        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spTreino.getSelectedItemId() == 0){
                    AlertDialog.Builder msg = new AlertDialog.Builder(Tela2.this);
                    msg.setTitle("Erro");
                    msg.setMessage("Selecione seu Treino");
                    msg.setIcon(R.drawable.erro);
                    msg.setNeutralButton("OK",null);
                    msg.show();
                }else{
                    meta = new Meta();
                    meta.setNome(etNome.getText().toString());
                    meta.setPesoAtual(Double.parseDouble(etPesoAtual.getText().toString()));
                    meta.setPesoDesejado(Double.parseDouble(etPesoDesejado.getText().toString()));
                    if(grupoSexo.getCheckedRadioButtonId() == rbMasculino.getId()){
                        meta.setSexo(rbMasculino.getText().toString());
                    }else{
                        meta.setSexo(rbFeminino.getText().toString());
                    }//fecha else sexo
                    ArrayList<String> turno = new ArrayList<String>();
                    if(cbManha.isChecked()){
                        turno.add(cbManha.getText().toString());
                    }//fecha if cbManha
                    if(cbTarde.isChecked()){
                        turno.add(cbTarde.getText().toString());
                    }//fecha if cbTarde
                    if(cbNoite.isChecked()){
                        turno.add(cbNoite.getText().toString());
                    }//fecha if cbNoite
                    meta.setTurno(turno);
                    if(spTreino.getSelectedItemId() == 1){
                        meta.setTreino((String) getResources().getText(R.string.leve));
                    }else if(spTreino.getSelectedItemId() == 2){
                        meta.setTreino((String) getResources().getText(R.string.moderado));
                    }else{
                        meta.setTreino((String) getResources().getText(R.string.intenso));
                    }
                    AlertDialog.Builder msg = new AlertDialog.Builder(Tela2.this);
                    msg.setTitle("Suas Informações");
                    msg.setMessage(meta.toString());
                    msg.setIcon(R.mipmap.ic_launcher);
                    msg.setNeutralButton("OK", null);
                    msg.show();

                }//fecha else
                Log.d(TAG, "Saiu das Referencias");
            }//fecha onClick
        });//fecha setOnClickListener
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
}//fecha classe
