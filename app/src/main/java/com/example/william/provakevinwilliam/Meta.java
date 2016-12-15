package com.example.william.provakevinwilliam;

import java.util.ArrayList;

/**
 * Created by willi on 13/12/2016.
 */

public class Meta {

    private String nome;
    private double pesoAtual;
    private double pesoDesejado;
    private String sexo;
    private ArrayList<String> turno;
    private String treino;

    public Meta() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }

    public double getPesoDesejado() {
        return pesoDesejado;
    }

    public void setPesoDesejado(double pesoDesejado) {
        this.pesoDesejado = pesoDesejado;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public ArrayList<String> getTurno() {
        return turno;
    }

    public void setTurno(ArrayList<String> turno) {
        this.turno = turno;
    }

    public String getTreino() {
        return treino;
    }

    public void setTreino(String treino) {
        this.treino = treino;
    }

    /*public String verificarTreino(){
        if(treino.equals("Leve")){
            return "Leve - Trabalhos domésticos de esforço leve a modreado, caminhadas para atividades relacionadas ao cotidiano e ficar sentado por várias horas.\n" +
                    "Caminhadas além das mesmas atividades relacionadas ao compoartament sednetário. Até 3 horas de atividad física por semana.";
        }else if (treino.equals("Moderado")){
            return "Moderado - Ginástica aeróbica, corrida, natação, jogar tênicas, além das atividades relacionadas ao compoartamente leve. Até 12 horas de atividade física por semana.";
        }else{
            return "Intenso - Ciclismo de intensidade moderada, corrida, pular corda, jogar tênis e além das atividades relacionadas ao comportamento moderado. Acima de 12 horas de atividade física por semana.";
        }
    }*/

    @Override
    public String toString() {

        String x="";
        for (int i=0 ; i<turno.size() ; i++){
            x = x + "\n"+turno.get(i);
        }//fecha for

        return   "Nome: "+nome
                + "\nPeso Atual: "  +pesoAtual+"Kg"
                + "\nPeso Desejado: "+pesoDesejado+ "Kg"
                + "\nSexo: "+sexo
                + "\nTurno: "+x
                + "\nTreino: "+treino;
    }
}
