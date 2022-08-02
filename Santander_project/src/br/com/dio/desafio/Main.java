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
		curso1.setTitulo("Prepara��o p/ Bootcamp Hard Skills");
		curso1.setDescricao("Descri��o da prepara��o p/ Bootcamp Hard Skills:"
				+ " M�DULO 0:Prepare-se para a jornada"
				+ " Boas-Vindas ao Santander Code Girls"
				+ " Conhe�a as Oportunidades da DIO"
				+ " Seja Protagonista Neste Bootcamp"
				+ " Mentoria: Santander Code Girls"
				+ " M�DULO I: Princ�pios de Desenvolvimento de Software"
				+ " Introdu��o � programa��o e pensamento computacional"
				+ " Introdu��o ao Git e ao GitHub"
				+ " Criando seu primeiro reposit�rio no GitHub para compartilhar seu progresso"
				+ " M�DULO II: Come�ando a programar em Java"
				+ " Dominando IDEs Java"
				+ " Vari�veis, Tipos de Dados e Operadores Matem�ticos em Java"
				+ " Entendendo m�todos Java"
				+ " Trabalhando com Collections Java"
				+ " Desafios B�sico Java - Code Girls Santander"
				+ " M�DULO III: Dominando Java"
				+ " Programa��o Orientada a Objetos"
				+ " Praticando orienta��o a Objetos com Java"
				+ " Debugging Java"
				+ " Tratamento de Exce��es em Java"
				+ " Desafios Intermedi�rios Java - Code Girls Santander"
				+ " Abstraindo um Bootcamp Usando Orienta��o a Objetos em Java"
				+ " M�DULO IV: Introdu��o ao Spring Framework"
				+ " Principais protocolos de comunica��o da Internet"
				+ " Gerenciamento de Depend�ncias e Build em Java com Maven"
				+ " Introdu��o ao Spring Framework"
				);
		curso1.setCargaHoraria(62);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Prepara��o p/ Bootcamp Soft Skills");
		curso2.setDescricao("Descri��o da prepara��o p/ Bootcamp Soft Skills:"
				+ " MATCH SANTANDER (Live)"
				+ " 1- Capacidade de adapta��o"
				+ " 2- Curiosidade"
				+ " 3- Estar atenta as oportunidades"
				+ " 4- Atitude"
				+ " 5- Senso de dono"
				+ " DESAFIOS DA FUN��O"
				+ " 1- Ambiente din�mico"
				+ " 2- Lutar contra si mesmo constantemente em busca de melhoria cont�nua. ");
		curso2.setCargaHoraria(8);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria da F1rst Santander ");
		mentoria.setDescricao("Descri��o mentoria Santander");
		mentoria.setData(LocalDate.now());
		
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		*/
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer - My dream job <3 ");
		bootcamp.setDescricao("Stefany,continue sua jornada na trilha de Java, "
				+ "assista as aulas, fa�a os desafios de c�digos e projetos e conclua "
				+ "as atividades. Todas as graduadas receber�o certificado e ter� a chance "
				+ "de ingressar no mercado de trabalho! ");
		
		
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devStefany = new Dev();
		devStefany.setNome("Stefany Mikaelle");
		devStefany.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos:" + devStefany.getConteudosInscritos());
		devStefany.progredir();
		System.out.println("----ATUALIZA��O----");
		System.out.println("Conte�dos Inscritos:" + devStefany.getConteudosInscritos());
		System.out.println("Conte�dos Conclu�dos:" + devStefany.getConteudosConcluidos());
		System.out.println("XP:" + devStefany.calcularTotalXp());
		devStefany.progredir();
		System.out.println("----ATUALIZA��O----");
		System.out.println("Conte�dos Inscritos:" + devStefany.getConteudosInscritos());
		System.out.println("Conte�dos Conclu�dos:" + devStefany.getConteudosConcluidos());
		System.out.println("XP:" + devStefany.calcularTotalXp());
		

	}

}
