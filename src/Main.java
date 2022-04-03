import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(8);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rafael" + devRafael.getConteudosInscritos());

        devRafael.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos Rafael" + devRafael.getConteudosConcluidos());
        System.out.println("Conteúdos Concluídos Rafael" + devRafael.getConteudosConcluidos());
        System.out.println("XP:" + devRafael.calcularTotalXp());

        System.out.println("------");

        Dev devAudrey = new Dev();
        devAudrey.setNome("Audrey");
        devAudrey.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Audrey" + devAudrey.getConteudosInscritos());
        devAudrey.progredir();
        devAudrey.progredir();
        devAudrey.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos Audrey" + devAudrey.getConteudosConcluidos());
        System.out.println("Conteúdos Concluídos Audrey" + devAudrey.getConteudosConcluidos());
        System.out.println("XP:" + devAudrey.calcularTotalXp());




    }

}
