//import java.util.Scanner;
import java.util.Random;
//import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        //Scanner read = new Scanner(System.in);
        //selecionarCandidatos();
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

		for (String fulaninho : candidatos) {
			entrandoEmContato(fulaninho);
		}
    }

	static void entrandoEmContato(String candidato){
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;

		do {
			// Dependendo do número, a variavel 'atendeu' vai continuar 'false' ou mudará para 'true'...
			atendeu = atender();
			// As duas variaveis são opostas entre si (como observado em suas declarações lá em cima), se 'atendeu' virar 'true', a 'continuarTentando' se tornará 'false'...
			continuarTentando = !atendeu;

			if (continuarTentando) {
				tentativasRealizadas++;
			}else{
				System.out.println("\nContato realizado com sucesso.");
			}
		} while (continuarTentando && tentativasRealizadas<3);

		// Notificando se conseguiu contato com o candidato...
		if (atendeu) {
			System.out.printf("Conseguimos contato com %s após %d tentativa(s).%n", candidato, tentativasRealizadas);
		}else{
			System.out.printf("%nNão conseguimos entrar com %s, mesmo após %d tentativas.%n", candidato, tentativasRealizadas);
		}
	}

	// Método que simula se o candidato atendeu a ligação
	static boolean atender(){
		return new Random().nextInt(3)==1;
	}

	/*
    static void selecionarCandidatos(){
		double salarioBase = 2000.0;
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		int totalSelecionados = 0;
		int proximoCandidato = 0; 
		while(totalSelecionados <5 && proximoCandidato < candidatos.length) {
			String candidato = candidatos[proximoCandidato++];
			double valorPretendido = valorPretendido();
			System.out.printf("O candidato %s está pedindo %.2f.%n",candidato, valorPretendido);
			if(valorPretendido > salarioBase) {
				System.out.printf("QUE PENA!! O candidato %s NÃO foi selecionado.%n%n", candidato);
				
			}else {
				System.out.printf("LEGAL!! O candidato %s foi selecionado.%n%n", candidato);
				totalSelecionados++;
			}
			
		}
		System.out.println("Total de selecionados: " + totalSelecionados);
		System.out.println("Total de consultados: " + proximoCandidato);
	}


    // Método que simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
	*/

}
