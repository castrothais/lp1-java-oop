package ListasDeExercicios.Lista01.Questao04;

public class Carro {
    private float combustivelConsumido;
    private float quantidadeQuilometragem;

    public float getCombustivelConsumido() {
        return this.combustivelConsumido;
    }

    public void setCombustivelConsumido(float combustivelConsumido) {
        if(combustivelConsumido < 0) {
            throw new IllegalArgumentException("Combustível consumido inválido!");
        }
        this.combustivelConsumido = combustivelConsumido;
    }

    public float getQuantidadeQuilometragem() {
        return this.quantidadeQuilometragem;
    }

    public void setQuantidadeQuilometragem(float quantidadeQuilometragem) {
        if(quantidadeQuilometragem < 0) {
            throw new IllegalArgumentException("Quilometragem inválida!");
        }
        this.quantidadeQuilometragem = quantidadeQuilometragem;
    }

    public float calcularMediaCombustivel() {
        return this.quantidadeQuilometragem /this.combustivelConsumido;
    }
}
