import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição java curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descrição js curso");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria Java");
        mentoria1.setDescricao("mentoria Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        //criação do dev, setando nome, setando a inscrição em um bootcamp
        Dev devWanderson = new Dev();
        devWanderson.setNome("Wanderson");
        devWanderson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devWanderson.getConteudosInscritos());
        devWanderson.progredir();
        devWanderson.progredir();
        System.out.println("*PROGRESSÃO*");
        System.out.println("Conteudos Inscritos" + devWanderson.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devWanderson.getConteudosConcluidos());
        System.out.println("XP:" + devWanderson.calcularXp());

        System.out.println("*-----------------------*");

        Dev devCamilla = new Dev();
        devCamilla.setNome("Camila");
        devCamilla.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devCamilla.getConteudosInscritos());
        devCamilla.progredir();
        devCamilla.progredir();
        devCamilla.progredir();
        System.out.println("*PROGRESSÃO*");
        System.out.println("Conteudos Inscritos" + devCamilla.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devCamilla.getConteudosConcluidos());
        System.out.println("XP:" + devCamilla.calcularXp());


    }
}

