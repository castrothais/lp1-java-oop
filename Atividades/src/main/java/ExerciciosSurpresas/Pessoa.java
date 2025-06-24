package ExerciciosSurpresas;

public class Pessoa {
    private String nome;
    private String dataNascimento;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório!");
        }
        this.nome = nome;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        if(dataNascimento == null || dataNascimento.isBlank()) {
            throw new IllegalArgumentException("Data de Nascimento é obrigatório");
        }
        this.dataNascimento = dataNascimento;
    }
}
