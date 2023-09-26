package desafio_dio_poo;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição Curso Java");
		curso1.setCargaHoraria(50);
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descrição Curso JavaScript");
		curso2.setCargaHoraria(4);
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição Mentoria Java");
		mentoria.setData(LocalDate.now());
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());
		devCamila.progredir();
		System.out.println("- - - - -");
		devCamila.progredir();

		System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Camila:" + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularXP());

		System.out.println("- - - - -");

		Dev devWenio = new Dev();
		devWenio.setNome("Wenio");
		devWenio.inscreverBootcamp(bootcamp);

		System.out.println("Conteudos Inscritos Wenio:" + devWenio.getConteudosInscritos());
		devWenio.progredir();
		System.out.println("- - - - -");
		System.out.println("Conteudos Inscritos Wenio:" + devWenio.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Wenio:" + devWenio.getConteudosConcluidos());
		System.out.println("XP: " + devWenio.calcularXP());

		
		
		
		
		
		
	}

}
