package ListasDeExercicios.Lista01.Questao03;

public class ContaEnergia {
    private float quilowattsConsumidos;

    public float getQuilowattsConsumidos() {
        return this.quilowattsConsumidos;
    }

    public void setQuilowattsConsumidos(float quilowattsConsumidos) {
        if(quilowattsConsumidos < 0) {
            throw new IllegalArgumentException("Consumo de quilowatts inválido!");
        }
        this.quilowattsConsumidos = quilowattsConsumidos;
    }

    public float calcularConsumoEnergia() {
        float valorQuilowatt = 0.12f;
        return this.quilowattsConsumidos * valorQuilowatt;
    }

    public float calcularConsumoEnergiaTributos() {
        float valorICMS = 0.18f;
        return this.calcularConsumoEnergia() + valorICMS * this.calcularConsumoEnergia();
    }
}
