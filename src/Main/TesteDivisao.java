package Main;

import org.junit.jupiter.api.Test;

import Modelos.Operacoes;
import junit.framework.Assert;

public class TesteDivisao {
		
		Operacoes divide = new Operacoes();
		
		@SuppressWarnings("deprecation")
		@Test
		public void testeDivisao() {
			//Cenário de teste 1: Divisão de dois valores
			int calcula = divide.divisao(4, 2);
			Assert.assertEquals(2, calcula);
			System.out.println(calcula);

			//Cenário de teste 2: Divisão de dois números sendo um deles negativo
			calcula = divide.divisao(4, -2);
			Assert.assertEquals(-2, calcula);
			System.out.println(calcula);

			//Cenário de teste 3: Divisão de dois números sendo os dois negativos
			calcula = divide.divisao(-2, -2);
			Assert.assertEquals(1, calcula);
			System.out.println(calcula);
        
			//Cenário de teste 4: Divisão de dois números sendo que ambos são 0
			calcula = divide.divisao(0, 0);
			Assert.assertEquals(0, calcula);
			System.out.println(calcula);
        
			//Cenário de teste 5: Divisão de dois números sendo que um deles é o numero 0
			calcula = divide.divisao(2, 0);
			Assert.assertEquals(0, calcula);
			System.out.println(calcula);

	}

}
