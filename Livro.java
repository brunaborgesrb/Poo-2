
public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        if (anoPublicacaoIsValid(anoPublicacao)) {
            this.anoPublicacao = anoPublicacao;
        } else {
            System.out.println("Ano de publicação inválido.");
            this.anoPublicacao = -1; // Defina um valor padrão ou inválido
        }
    }

    // método privado para verificar se o ano de publicação é válido
    private boolean anoPublicacaoIsValid(int anoPublicacao) {
        int anoAtual = java.time.Year.now().getValue();
        return anoPublicacao <= anoAtual && anoPublicacao >= 0;
    }

    // métodos públicos para acessar os atributos
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacaoIsValid(anoPublicacao)) {
            this.anoPublicacao = anoPublicacao;
            System.out.println("Ano de publicação atualizado com sucesso.");
        } else {
            System.out.println("Ano de publicação inválido.");
        }
    }

    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}

