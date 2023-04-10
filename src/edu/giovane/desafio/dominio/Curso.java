package edu.giovane.desafio.dominio;

// Classe Curso passa a ser filha da Conteudo (herda tudo de conteúdo)
public class Curso extends Conteudo {
    // Atributos
    private int cargaHoraria;


    // CONSCTRUCTOR
    public Curso() {
    }

    // Pega o valor do XP_PADRÃO e realiza uma multiplicação ao criar um curso e chamar este método
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    //    GETTERS and SETTERS

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    //    ToString
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
