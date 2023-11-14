package Main;

import org.junit.jupiter.api.Test;

import Modelos.Operacoes;
import junit.framework.Assert;

/*
 * @author: Cauã Vieira
 * Data de Lançamento: 25/09/2023
 * Versão: 1.1
 */

public class TesteMultiplicacao {
		
		// Instância da classe Operacoes para realizar os testes.
		Operacoes multiplica = new Operacoes();
		
		// Utilizando a anotação @SuppressWarnings("deprecation") para evitar alertas de depreciação
		@SuppressWarnings("deprecation")
		@Test
		public void testeMultiplica() {
			// Cenário de teste 1: Multiplicação de dois valores
			int calcula = multiplica.multiplicacao(2, 2);
			Assert.assertEquals(4, calcula);
			System.out.println(calcula);

			// Cenário de teste 2: Multiplicação de dois valores sendo um deles o número 0
			calcula = multiplica.multiplicacao(2, 0);
			Assert.assertEquals(0, calcula);
			System.out.println(calcula);

			// Cenário de teste 3: Multiplicação de dois valores sendo que ambos são zero
			calcula = multiplica.multiplicacao(0, 0);
			Assert.assertEquals(0, calcula);
			System.out.println(calcula);

			// Cenário de teste 4: Multiplicação de dois valores sendo um negativo
			calcula = multiplica.multiplicacao(3, -2);
			Assert.assertEquals(-6, calcula);
			System.out.println(calcula);

        	// Cenário de teste 5: Multiplicação de dois valores sendo os dois negativos
        	calcula = multiplica.multiplicacao(-3, -2);
        	Assert.assertEquals(6, calcula);
        	System.out.println(calcula);
    	}
}

