package edu.giovane.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;

    // LinkedHashSet<>(); = Coleção que só permite a adição de elementos únicos
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        // Pega tudo que está dentro do Set bootcamp.getConteudos e add em conteudosInscritos
        this.conteudosInscritos.addAll(bootcamp.getConteudos());

        // Adiciona o Dev inscrito ao Bootcamp
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        // Optional serve para resolver retornos null
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();

        // Tira conteúdo de inscrito para concluídos
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());

        // Caso não tenha... (lista vazia)
        } else {
            // Mensagem de erro
            System.err.println("Você não está matriculado em nenhum conteúdo!");

        }
    }

    public double calcularTotalXp() {
        // Pega o Xp de cada conteúdo e Soma
      return this.conteudosConcluidos
              .stream()
              .mapToDouble(conteudo -> conteudo.calcularXP())
              .sum();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }


}
