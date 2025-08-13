import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

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

        // mentoria
        Mentoria mentoriaCarreira = new Mentoria();
        mentoriaCarreira.setTitulo("Mentoria de Carreira em QA");
        mentoriaCarreira.setDescricao("Dicas para estágio/júnior");
        mentoriaCarreira.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(qaFundamentos);
        System.out.println(mentoriaCarreira);


    }
}
