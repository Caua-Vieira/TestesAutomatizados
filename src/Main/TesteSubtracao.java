package Main;

import org.junit.jupiter.api.Test;

import Modelos.Operacoes;

import junit.framework.Assert;

public class TesteSubtracao {

		Operacoes subtrair = new Operacoes();
		
		@SuppressWarnings("deprecation")
		@Test
		public void testeSubtracao() {
			//Cenário de teste 1: Subtração de dois valores
			int calcula = subtrair.subtracao(3, 2);
			Assert.assertEquals(1, calcula);
			System.out.println(calcula);

			//Cenário de teste 2: Subtraçãoo de dois valores sendo um deles o número 0
			calcula = subtrair.subtracao(2, 0);
			Assert.assertEquals(calcula, 2);
			System.out.println(calcula);

			//Cenário de teste 3: Subtração de dois valores sendo que ambos são 0
			calcula = subtrair.subtracao(0,0);
			Assert.assertEquals(calcula, 0);
			System.out.println(calcula);

			//Cenário de teste 4: Subtração de dois valores sendo um negativo
			calcula = subtrair.subtracao(2, -3);
			Assert.assertEquals(calcula, 5);
			System.out.println(calcula);

			//Cenário de teste 5: Subtração de dois valores sendo os dois negativos
			calcula = subtrair.subtracao(-4, -5);
			Assert.assertEquals(calcula, 9);
			System.out.println(calcula);

		}
	}

