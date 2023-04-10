// Importação das classes
import edu.giovane.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // INSTÂNCIAS PARA CURSO
        Curso c1 = new Curso();

        c1.setTitulo("Java");
        c1.setDescricao("Descrição do curso Java");
        c1.setCargaHoraria(8);


        Curso c2 = new Curso();

        c2.setTitulo("JavaScript");
        c2.setDescricao("Descrição do curso JS");
        c2.setCargaHoraria(4);


        // INSTÂNCIAS PARA MENTORIA
        Mentoria m1 = new Mentoria();
        m1.setTitulo("Mentoria de Java");
        m1.setDescricao("Descrição mentoria Java");
        m1.setData(LocalDate.now()); // Pega a data atual do sistema


        // Criação de um Curso a partir de um Conteúdo = Polimorfismo
        //Conteudo c3 = new Curso();

/*
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(m1);
*/

        // Cria bootcamp
        Bootcamp boot1 = new Bootcamp();
        boot1.setNome("Bootcamp Java Developer");
        boot1.setDescricao("Descrição Bootcamp Java Developer");

        // Adiciona os cursos ao Bootcamp 1
        boot1.getConteudos().add(c1);
        boot1.getConteudos().add(c2);
        boot1.getConteudos().add(m1);

        // Cria Devs
        Dev dev1 = new Dev();
        dev1.setNome("Giovane");
        dev1.inscreverBootcamp(boot1); // Realiza inscrição no boot1
        System.out.println("Conteúdos inscritos " + dev1.getNome() + ": " +  dev1.getConteudosInscritos());
        dev1.progredir(); // Conclui conteúdo - remove o curso concluído de inscritos para concluídos
        dev1.progredir(); // Conclui conteúdo - remove o curso concluído de inscritos para concluídos
        System.out.println("-");
        System.out.println("Conteúdos inscritos " + dev1.getNome() + ": " +  dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos " + dev1.getNome() + ": " +  dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());


        System.out.println("-----------");
        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(boot1); // Realiza inscrição no boot1
        System.out.println("Conteúdos inscrito " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        dev2.progredir(); // Conclui conteúdo - remove o curso concluído de inscritos para concluídos
        dev2.progredir(); // Conclui conteúdo - remove o curso concluído de inscritos para concluídos
        dev2.progredir(); // Conclui conteúdo - remove o curso concluído de inscritos para concluídos
        System.out.println("-");
        System.out.println("Conteúdos inscrito " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos " + dev2.getNome() + ": " +  dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());



    }
}
