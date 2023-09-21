package Main;

import org.junit.jupiter.api.Test;

import Modelos.Operacoes;
import junit.framework.Assert;

public class TesteSoma {
			
		Operacoes soma = new Operacoes();

		@SuppressWarnings("deprecation")
		@Test
		public void testeSoma() {
			//Cenário de teste 1: Soma de dois valores
			int calcula = soma.somar(4, 4);
			Assert.assertEquals(8, calcula);
			System.out.println(calcula);

			//Cenário de teste 2: Soma de dois valores sendo um deles o número zero
			calcula = soma.somar(0,9);
			Assert.assertEquals(9, calcula);
			System.out.println(calcula);

			//Cenário de teste 3: Soma de dois valores sendo que ambos são zero
			calcula = soma.somar(0,0);
			System.out.println(calcula);

			//Cenário de teste 4: Soma de dois valores sendo um negativo
			calcula = soma.somar(3, -1);
			Assert.assertEquals(2, calcula);
			System.out.println(calcula);

			//Cenário de teste 5: Soma de dois valores sendo os dois negativos
			calcula = soma.somar(-3, -4);
			Assert.assertEquals(-7, calcula);
			System.out.println(calcula);

	}

}
