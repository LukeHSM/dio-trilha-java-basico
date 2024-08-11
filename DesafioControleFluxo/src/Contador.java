import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.printf("Digite o primeiro parâmetro: %n");
		int parametroUm = terminal.nextInt();
		System.out.printf("%nDigite o segundo parâmetro: %n");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroDois<parametroUm) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

		//realizar o for para imprimir os números com base na variável contagem
        for(int i=contagem; i>=0; i--){
            System.out.println(i);
        }
	}
}
