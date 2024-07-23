import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(16);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev dev1 = new Dev();
        dev1.setNome("Dev1");
        dev1.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos Dev1: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteudos Inscritos Dev1: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Dev1: " + dev1.getConteudosConcluidos());
        System.err.println("XP: " + dev1.calcularTotalXp());

        System.err.println("========================================================");
        Dev dev2 = new Dev();
        dev2.setNome("Dev2");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Dev2: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos Inscritos Dev2: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Dev2: " + dev2.getConteudosConcluidos());
        System.err.println("XP: " + dev2.calcularTotalXp());



        
    }
    
}
