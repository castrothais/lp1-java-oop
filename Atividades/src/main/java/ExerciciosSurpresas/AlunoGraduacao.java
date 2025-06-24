package ExerciciosSurpresas;

public class AlunoGraduacao extends Aluno {
    private float mediaNota;

    public float getMediaNota() {
        return mediaNota;
    }

    public void setMediaNota(float mediaNota) {
        this.mediaNota = mediaNota;
    }

    public String alunoAprovado() {
        float notaTotal = this.somarNotas();
        float mediaNota = notaTotal/2;
        if(mediaNota >=7) {
            return "APROVADO!";
        } else {
            return "REPROVADO!";
        }
    }
}
