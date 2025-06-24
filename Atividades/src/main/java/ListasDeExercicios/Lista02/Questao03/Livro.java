package ListasDeExercicios.Lista02.Questao03;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numeroPaginas;
    private int paginaAtual;
    private String genero;
    private boolean estado;

    Livro() {
        this.anoPublicacao = 0;
        this.numeroPaginas = 0;
        this.paginaAtual = 1;
        this.estado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if(anoPublicacao<0) {
            throw new IllegalArgumentException("Ano de publicação inválido!");
        }
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if(numeroPaginas<=0) {
            throw new IllegalArgumentException("Numero de páginas inválido!");
        }
        this.numeroPaginas = numeroPaginas;
    }

    public int getPaginaAtual() {
        return this.paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String abrir() {
        if(this.estado) {
            throw new IllegalArgumentException("O livro já está aberto!");
        }
        this.estado = true;
        return "O livro foi aberto!";
    }

    public String fechar() {
        if(!this.estado) {
            throw new IllegalArgumentException("O livro já está fechado!");
        }
        this.estado = false;
        return "O livro foi fechado!";
    }

    public void marcarPagina(int pagina) {
        if(!this.estado) {
            throw new IllegalArgumentException("O livro está fechado!");
        }
        if(pagina > this.numeroPaginas || pagina <=0) {
            throw new IllegalArgumentException("Página inválida!");
        }
        this.paginaAtual = pagina;
    }

    public void avancarPagina() {
        if(!this.estado) {
            throw new IllegalArgumentException("O livro está fechado!");
        }
        if(this.paginaAtual == this.numeroPaginas) {
            throw new IllegalArgumentException("Você já está na última página!");
        }
        this.paginaAtual++;
    }

    public void retrocederPagina() {
        if (!this.estado) {
            throw new IllegalArgumentException("O livro está fechado!");
        }
        if (this.paginaAtual == 1) {
            throw new IllegalArgumentException("Você já está na primeira página!");
        }
        this.paginaAtual--;
    }

    public String exibirInformacoes() {
        return String.format("Título: %s | Autor: %s | Ano de Publicação: %d | Número de Páginas: %d | Gênero: %s",
                this.titulo, this.autor, this.anoPublicacao, this.numeroPaginas, this.genero);
    }
}
