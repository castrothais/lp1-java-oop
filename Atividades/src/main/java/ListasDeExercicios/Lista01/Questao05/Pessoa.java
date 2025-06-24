package ListasDeExercicios.Lista01.Questao05;

public class Pessoa {
    private String sexo;
    private float  peso;
    private float altura;

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        if(sexo == null || !sexo.toLowerCase().equals("feminino") && !sexo.toLowerCase().equals("masculino")) {
            throw new IllegalArgumentException("Sexo é obrigatório!");
        }

        this.sexo = sexo.toLowerCase();
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        if(peso <=0f) {
            throw new IllegalArgumentException("Peso inválido!");
        }
        this.peso = peso;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        if(altura<=0f) {
            throw new IllegalArgumentException("Altura inválida!");
        }
        this.altura = altura;
    }

    public float calcularIndiceMassaCorporal() {
        return this.peso/(this.altura * this.altura);
    }

    public String classificarIMC() {
        String condicao;
        float IMC = this.calcularIndiceMassaCorporal();
        if(this.sexo.equals("feminino")) {
            if(IMC <19.1) {
                condicao = "abaixo do peso";
            } else if(IMC <25.8) {
                    condicao = "no peso normal";
                } else if(IMC < 27.3) {
                    condicao = "marginalmente acima do peso";
                } else if( IMC < 32.3) {
                    condicao = "acima do peso ideal";
                } else {
                    condicao = "obeso";
                }

        } else {
            if(IMC < 20.7) {
                condicao = "abaixo do peso";
            } else if(IMC < 26.4) {
                condicao = "no peso normal";
            } else if(IMC < 27.8) {
                condicao = "marginalmente acima do peso";
            } else if(IMC < 31.1) {
                condicao = "acima do peso ideal";
            } else {
                condicao = "obeso";
            }
        }
        return condicao;
    }
}
