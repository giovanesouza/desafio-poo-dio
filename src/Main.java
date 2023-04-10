// Importação das classes
import edu.giovane.desafio.dominio.Curso;
import edu.giovane.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // INSTÂNCIAS PARA CURSO
        Curso c1 = new Curso();

        c1.setTitulo("Java");
        c1.setDescricao("Descrição do curso Java");
        c1.setCargaHoraria(8);


        Curso c2 = new Curso();

        c1.setTitulo("JavaScript");
        c1.setDescricao("Descrição do curso JS");
        c1.setCargaHoraria(4);


        // INSTÂNCIAS PARA MENTORIA
        Mentoria m1 = new Mentoria();
        m1.setTitulo("Mentoria de Java");
        m1.setDescricao("Descrição mentoria Java");
        m1.setData(LocalDate.now()); // Pega a data atual do sistema


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(m1);


    }
}
