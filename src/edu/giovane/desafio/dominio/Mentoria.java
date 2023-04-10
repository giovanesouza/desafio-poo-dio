package edu.giovane.desafio.dominio;

import java.time.LocalDate;

// Classe Mentoria passa a ser filha da Conteudo (herda tudo de conteúdo)
public class Mentoria extends Conteudo {

    // Atributos
    private LocalDate data;

    // CONSCTRUCTOR
    public Mentoria() {
    }


    // Pega o valor do XP_PADRÃO e realiza uma adição ao criar uma mentoria e chamar este método
    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    //    GETTERS and SETTERS
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }



    // ToString


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}
