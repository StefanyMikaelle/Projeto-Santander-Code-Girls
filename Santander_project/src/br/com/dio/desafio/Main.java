package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso();
		curso1.setTitulo("Preparação p/ Bootcamp Hard Skills");
		curso1.setDescricao("Descrição da preparação p/ Bootcamp Hard Skills:"
				+ " MÓDULO 0:Prepare-se para a jornada"
				+ " Boas-Vindas ao Santander Code Girls"
				+ " Conheça as Oportunidades da DIO"
				+ " Seja Protagonista Neste Bootcamp"
				+ " Mentoria: Santander Code Girls"
				+ " MÓDULO I: Princípios de Desenvolvimento de Software"
				+ " Introdução à programação e pensamento computacional"
				+ " Introdução ao Git e ao GitHub"
				+ " Criando seu primeiro repositório no GitHub para compartilhar seu progresso"
				+ " MÓDULO II: Começando a programar em Java"
				+ " Dominando IDEs Java"
				+ " Variáveis, Tipos de Dados e Operadores Matemáticos em Java"
				+ " Entendendo métodos Java"
				+ " Trabalhando com Collections Java"
				+ " Desafios Básico Java - Code Girls Santander"
				+ " MÓDULO III: Dominando Java"
				+ " Programação Orientada a Objetos"
				+ " Praticando orientação a Objetos com Java"
				+ " Debugging Java"
				+ " Tratamento de Exceções em Java"
				+ " Desafios Intermediários Java - Code Girls Santander"
				+ " Abstraindo um Bootcamp Usando Orientação a Objetos em Java"
				+ " MÓDULO IV: Introdução ao Spring Framework"
				+ " Principais protocolos de comunicação da Internet"
				+ " Gerenciamento de Dependências e Build em Java com Maven"
				+ " Introdução ao Spring Framework"
				);
		curso1.setCargaHoraria(62);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Preparação p/ Bootcamp Soft Skills");
		curso2.setDescricao("Descrição da preparação p/ Bootcamp Soft Skills:"
				+ " MATCH SANTANDER (Live)"
				+ " 1- Capacidade de adaptação"
				+ " 2- Curiosidade"
				+ " 3- Estar atenta as oportunidades"
				+ " 4- Atitude"
				+ " 5- Senso de dono"
				+ " DESAFIOS DA FUNÇÃO"
				+ " 1- Ambiente dinâmico"
				+ " 2- Lutar contra si mesmo constantemente em busca de melhoria contínua. ");
		curso2.setCargaHoraria(8);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria da F1rst Santander ");
		mentoria.setDescricao("Descrição mentoria Santander");
		mentoria.setData(LocalDate.now());
		
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		*/
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer - My dream job <3 ");
		bootcamp.setDescricao("Stefany,continue sua jornada na trilha de Java, "
				+ "assista as aulas, faça os desafios de códigos e projetos e conclua "
				+ "as atividades. Todas as graduadas receberão certificado e terá a chance "
				+ "de ingressar no mercado de trabalho! ");
		
		
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devStefany = new Dev();
		devStefany.setNome("Stefany Mikaelle");
		devStefany.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos:" + devStefany.getConteudosInscritos());
		devStefany.progredir();
		System.out.println("----ATUALIZAÇÃO----");
		System.out.println("Conteúdos Inscritos:" + devStefany.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos:" + devStefany.getConteudosConcluidos());
		System.out.println("XP:" + devStefany.calcularTotalXp());
		devStefany.progredir();
		System.out.println("----ATUALIZAÇÃO----");
		System.out.println("Conteúdos Inscritos:" + devStefany.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos:" + devStefany.getConteudosConcluidos());
		System.out.println("XP:" + devStefany.calcularTotalXp());
		

	}

}
