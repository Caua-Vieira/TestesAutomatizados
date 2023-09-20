package Main;

import Modelos.Operacoes;

public class TesteMultiplicacao {

	public static void main(String[] args) {
		
		Operacoes multiplica = new Operacoes();

        //Cenário de teste 1: Multiplicação de dois valores
        int calcula = multiplica.multiplicacao(2, 2);
        System.out.println(calcula);

        //Cenário de teste 2: Multiplicação de dois valores sendo um deles o número 0
        calcula = multiplica.multiplicacao(2, 0);
        System.out.println(calcula);

        //Cenário de teste 3: Multiplicação de dois valores sendo que ambos são zero
        calcula = multiplica.multiplicacao(0,0);
        System.out.println(calcula);

        //Cenário de teste 4: Multiplicação de dois valores sendo um negativo
        calcula = multiplica.multiplicacao(3, -2);
        System.out.println(calcula);

        //Cenário de teste 5: Multiplicação de dois valores sendo os dois negativos
        calcula = multiplica.multiplicacao(-3, -2);
        System.out.println(calcula);
    }


}
