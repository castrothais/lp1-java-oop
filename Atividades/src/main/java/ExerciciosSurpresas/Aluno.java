package ExerciciosSurpresas;

public class Aluno extends Pessoa{
    private int matricula;
    private float nota1;
    private float nota2;


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if(matricula<=0) {
            throw new IllegalArgumentException("Matrícula inválida!");
        }
        this.matricula = matricula;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        if(nota1<0) {
            throw new IllegalArgumentException("Nota inválida!");
        }
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        if(nota2 <0) {
            throw new IllegalArgumentException("Nota 2 inválida!");
        }
        this.nota2 = nota2;
    }

    public float somarNotas() {
        return this.nota1 + this.nota2;
    }

}
