package edu.giovane.desafio.dominio;

/* abstract = Não é possível instanciar o conteúdo.
Esta classe será utilizada como mãe (Herança) das classes Curso e Mentoria
a fim de evitar a repetição de código
 */
public abstract class Conteudo {

    // Constante - todo conteúdo será criado com o xp padrão
    // static = permite acessar o XP_PADRAO fora da classe Conteudo
    // protected = Classes filhas de Conteudo tem acesso ao XP_PADRAO
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXP();


    // GETTERS and SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
