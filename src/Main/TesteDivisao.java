package Main;

import Modelos.Operacoes;

public class TesteDivisao {

	public static void main(String[] args) {
		
		Operacoes divide = new Operacoes();

        //Cenário de teste 1: Divisão de dois valores
        int calcula = divide.divisao(4, 2);
        System.out.println(calcula);

        //Cenário de teste 2: Divisão de dois números sendo um deles negativo
        calcula = divide.divisao(4, -2);
        System.out.println(calcula);

        //Cenário de teste 3: Divisão de dois números sendo os dois negativos
        calcula = divide.divisao(-2, -2);
        System.out.println(calcula);
        
        //Cenário de teste 4: Divisão de dois números sendo que ambos são 0
        calcula = divide.divisao(0, 0);
        System.out.println(calcula);
        
        //Cenário de teste 5: Divisão de dois números sendo que um deles é o numero 0
        calcula = divide.divisao(2, 0);
        System.out.println(calcula);

	}

}
