package ListasDeExercicios.Lista01.Questao02;

public class Funcionario {
    private float salarioBruto;
    private float valorHoraExtra;
    private float quantidadeHorasExtras;

    public float getSalarioBruto() {
        return this.salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        if(salarioBruto <= 0) {
            throw new IllegalArgumentException("Salário inválido!");
        }
        this.salarioBruto = salarioBruto;
    }

    public float getValorHoraExtra() {
        return this.valorHoraExtra;
    }

    public void setValorHoraExtra(float valorHoraExtra) {
        if(valorHoraExtra <= 0) {
            throw new IllegalArgumentException("Valor de hora extra inválida!");
        }
        this.valorHoraExtra = valorHoraExtra;
    }

    public float getQuantidadeHorasExtras() {
        return this.quantidadeHorasExtras;
    }

    public void setQuantidadeHorasExtras(float quantidadeHorasExtras) {
        if(quantidadeHorasExtras < 0) {
            throw new IllegalArgumentException("Quantidade hora extra inválida!");
        }
        this.quantidadeHorasExtras = quantidadeHorasExtras;
    }

    public float calcularPagamentoHorasExtras() {
        return  this.quantidadeHorasExtras * this.valorHoraExtra;
    }

    public float calculcarSalarioLiquido(){
        float percentualINSS = 0.08f;
        float salarioBrutoTotal = this.calcularPagamentoHorasExtras() + this.salarioBruto;
        return salarioBrutoTotal - salarioBrutoTotal * percentualINSS;
    }
}
