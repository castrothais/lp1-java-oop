package ListasDeExercicios.Lista01.Questao01;

public class Funcionario {
    private String nome;
    private float salario;
    private float percentualAumento;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório!");
        }
        this.nome = nome;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        if(salario <= 0) {
            throw new IllegalArgumentException("Salário inválido");
        }
        this.salario = salario;
    }

    public float getPercentualAumento() {
        return this.percentualAumento;
    }

    public void setPercentualAumento(float percentualAumento) {
        if(percentualAumento < 0) {
            throw new IllegalArgumentException("Percentual aumento inválido");
        }
        this.percentualAumento = percentualAumento/100;
    }

    public float calcularAumento() {
        return this.percentualAumento * this.salario;
    }

    public float calculcarNovoSalario() {
        return this.calcularAumento() + this.salario;
    }
}
