//import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        //Scanner read = new Scanner(System.in);
        selecionarCandidatos();
    }

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
}
