package ListasDeExercicios.Lista02.Questao04;

import java.nio.channels.FileLockInterruptionException;

public class Pessoa {
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    Pessoa() {
        this.idade = 0;
        this.peso = 0.1f;
        this.altura = 0.1f;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if(idade<0) {
            throw new IllegalArgumentException("Idade inválida!");
        }
        this.idade = idade;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        if(peso<=0) {
            throw new IllegalArgumentException("Peso inválido!");
        }
        this.peso = peso;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        if(altura<=0) {
            throw new IllegalArgumentException("Peso inválido!");
        }
        this.altura = altura;
    }
    public void envelhecer() {
        this.idade++;
    }

    public void crescer(float centimetros) {
        if(centimetros<=0 || this.idade >= 21) {
            throw new IllegalArgumentException("valor informado inválido!");
        }
        this.altura+=(centimetros/100);
    }
}
