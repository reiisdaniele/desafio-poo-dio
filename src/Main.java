import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        // cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Sintaxe, tipos e controle de fluxo");
        curso1.setCargaHoraria(8);

        Curso qaFundamentos = new Curso();
        qaFundamentos.setTitulo("Fundamentos de QA");
        qaFundamentos.setDescricao("Testes manuais, casos e relatórios");
        qaFundamentos.setCargaHoraria(6);

        Conteudo conteudo = new Curso();

        // mentoria
        Mentoria mentoriaCarreira = new Mentoria();
        mentoriaCarreira.setTitulo("Mentoria de Carreira em QA");
        mentoriaCarreira.setDescricao("Dicas para estágio/júnior");
        mentoriaCarreira.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(qaFundamentos);
        System.out.println(mentoriaCarreira);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(qaFundamentos);
        bootcamp.getConteudos().add(mentoriaCarreira);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joao" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Joao" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Joao" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
}
