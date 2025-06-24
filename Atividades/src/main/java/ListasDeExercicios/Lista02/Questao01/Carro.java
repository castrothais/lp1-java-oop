package ListasDeExercicios.Lista02.Questao01;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidadeAtual;
    private boolean estado;

    Carro() {
        this.estado = false;
        this.velocidadeAtual = 0;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {

        return this.ano;
    }

    public void setAno(int ano) {
        if(ano<=0) {
            throw new IllegalArgumentException("Ano informado inválido!");
        }
        this.ano = ano;
    }

    public float getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        if (!this.estado) {
            throw new IllegalStateException("O carro está desligado");
        }
        if(velocidadeAtual < 0) {
            throw new IllegalArgumentException("Velocidade inválida!");
        }
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public void acelerar(float quantidade) {
        if (!this.estado) {
            throw new IllegalStateException("O carro está desligado");
        }
        if(quantidade <0) {
            throw new IllegalArgumentException("Quantidade inválida!");
        }
        this.velocidadeAtual+=quantidade;
    }

    public void frear(float quantidade) {
        if (!this.estado) {
            throw new IllegalStateException("O carro está desligado");
        }
        if (quantidade <= 0 || quantidade > this.velocidadeAtual) {
            throw new IllegalArgumentException("Quantidade inválida para frear!");
        }
        this.velocidadeAtual -= quantidade;
    }

    public void ligar() {
        if (this.estado) {
            throw new IllegalStateException("O carro já está ligado.");
        }
        this.estado = true;
    }

    public void desligar() {
        if(!this.estado) {
            throw new IllegalArgumentException("O carro já está desligado!");
        }
        this.velocidadeAtual = 0;
        this.estado = false;
    }

    public String exibirInformacoesCarro() {
        return String.format("Marca: %s | Modelo: %s | Ano: %d | Velocidade Atual: %.2f | Estado: %s",
                this.marca, this.modelo, this.ano,
                this.velocidadeAtual,
                this.estado ? "Ligado" : "Desligado");
    }

}
