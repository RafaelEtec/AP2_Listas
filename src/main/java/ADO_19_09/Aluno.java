package ADO_19_09;

import java.io.Serializable;
import ADO_19_09.Humano;

/** 
   por Rafael Ferreira Goulart
**/

public class Aluno implements Humano, Serializable {
    private static final long serialVersionUID = -911770391334640100L;
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private int passos;
    private String curso;
    private int serie;
    private double valorCurso;
    private String periodo;

    public Aluno() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int andar() {
        passos++;
        return passos;
    }

    public void falar(String frase) {
        System.out.println(frase);
    }	

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPassos() {
        return passos;
    }

    public void setPassos(int passos) {
        this.passos = passos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public double getValorCurso() {
        return valorCurso;
    }

    public void setValorCurso(double valorCurso) {
        this.valorCurso = valorCurso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}