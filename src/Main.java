import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição mentoria java");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRapha = new Dev();
        devRapha.setNome("Raphael");
        devRapha.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscrito Raphael:" + devRapha.getConteudosInscritos());
        devRapha.progredir();
        devRapha.progredir();
        System.out.println("-");
        System.out.println("Conteúdo Inscritos Raphael:" + devRapha.getConteudosInscritos());
        System.out.println("Conteúdo Concluidos Raphael:" + devRapha.getConteudosConcluidos());
        System.out.println("XP : " + devRapha.calcularTotalXp());

        System.out.println("-------------------");

        Dev devThy = new Dev();
        devThy.setNome("thy");
        devThy.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscrito thy:" + devThy.getConteudosInscritos());
        devThy.progredir();
        devThy.progredir();
        System.out.println("-");
        System.out.println("Conteúdo Inscrito thy:" + devThy.getConteudosInscritos());
        System.out.println("Conteúdo Concluídos thy:" + devThy.getConteudosConcluidos());
        System.out.println("XP : " + devThy.calcularTotalXp());

    }
}
