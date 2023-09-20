package Main;

import Modelos.Operacoes;

public class TesteSoma {

	public static void main(String[] args) {
		
		Operacoes soma = new Operacoes();

        //Cenário de teste 1: Soma de dois valores
        int calcula = soma.somar(4, 4);
        System.out.println(calcula);

        //Cenário de teste 2: Soma de dois valores sendo um deles o número zero
        calcula = soma.somar(0,9);
        System.out.println(calcula);

        //Cenário de teste 3: Soma de dois valores sendo que ambos são zero
        calcula = soma.somar(0,0);
        System.out.println(calcula);

        //Cenário de teste 4: Soma de dois valores sendo um negativo
        calcula = soma.somar(3, -1);
        System.out.println(calcula);

        //Cenário de teste 5: Soma de dois valores sendo os dois negativos
        calcula = soma.somar(-3, -4);
        System.out.println(calcula);

	}

}
