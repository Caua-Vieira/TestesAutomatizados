package Main;

import Modelos.Operacoes;

public class TesteSubtracao {

	public static void main(String[] args) {

		Operacoes subtrair = new Operacoes();

        //Cenário de teste 1: Subtração de dois valores
        int calcula = subtrair.subtracao(3, 2);
        System.out.println(calcula);

        //Cenário de teste 2: Subtraçãoo de dois valores sendo um deles o número 0
        calcula = subtrair.subtracao(2, 0);
        System.out.println(calcula);

        //Cenário de teste 3: Subtração de dois valores sendo que ambos são 0
        calcula = subtrair.subtracao(0,0);
        System.out.println(calcula);

        //Cenário de teste 4: Subtração de dois valores sendo um negativo
        calcula = subtrair.subtracao(2, -3);
        System.out.println(calcula);

        //Cenário de teste 5: Subtração de dois valores sendo os dois negativos
        calcula = subtrair.subtracao(-4, -5);
        System.out.println(calcula);

	}

}
