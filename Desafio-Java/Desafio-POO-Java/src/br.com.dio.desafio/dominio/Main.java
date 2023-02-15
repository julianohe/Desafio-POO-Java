import java.time.LocalDate;

import br.com.dio.desafio.dominio.dev;

public class  Main{
    
    public static  void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descriçao curso java");
        curso1.setCargaHoraria("8");

        Curso curso2 = new Curso();

        curso2.setTitulo("curso js");
        curso2.setDescricao("descriçao curso js");
        curso2.setCargaHoraria("4");

        

        Mentoria mentoria = new mentoria();

        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());



        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        dev devCamilla = new Dev();
        devCamilla.setNome("Camila");
        System.out.println("Conteúdo Inscritos" + devCamilla.getConteudosInscritos());
        devCamilla.progredir();
        System.out.println("-");
        System.out.println("Conteúdo Inscritos Camilla:" + devCamilla.getConteudosInscritos());
        System.out.println("Conteúdo Concluido Camilla:" + devCamilla.getConteudosInscritos());
        System.out.println("XP" + devCamilla.calcularTotalXp());


        System.out.println("-------");

        dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdo Inscritos Joao:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdo Concluido Joao:" + devJoao.getConteudosInscritos());
        System.out.println("XP" + devJoao.calcularTotalXp());




        





    }

}