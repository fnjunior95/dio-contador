
import java.util.Scanner;

public class contador {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
                    System.out.println("Digite o primeiro parâmetro");
                    int parametroUm = sc.nextInt();
                    System.out.println("Digite o segundo parâmetro");
                    int parametroDois = sc.nextInt();
                    try {
                        contar(parametroUm, parametroDois);
                    }catch (ParametrosInvalidosException e) {
                        System.err.println("O segundo parametro deve ser maior que o primeiro");
                    }
		}
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }else {
        int contagem = parametroDois - parametroUm;
		for(int i=0; i< contagem; i++) {
            System.out.println("Imprimindo o numero " + (i+1));
        }
        }
	}
}
