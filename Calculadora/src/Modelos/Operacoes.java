package Modelos;

/*
 * @author: Cauã Vieira
 * Data de Lançamento: 25/09/2023
 * Versão: 1.1
 */

public class Operacoes {
    
    /**
     * Realiza a multiplicação de dois números.
     *
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return O resultado da multiplicação.
     */
    public int multiplicacao(int a, int b) {
        return a * b;
    }
    
    /**
     * Realiza a divisão de dois números.
     *
     * @param a O numerador.
     * @param b O denominador.
     * @return O resultado da divisão.
     */
    public int divisao(int a, int b){
        return a / b;
    }
    
    /**
     * Realiza a soma de dois números.
     *
     * @param a O primeiro número a ser somado.
     * @param b O segundo número a ser somado.
     * @return O resultado da soma.
     */
    public int somar(int a, int b) {
        return a + b;
    }
    
    /**
     * Realiza a subtração de dois números.
     *
     * @param a O número do qual será subtraído.
     * @param b O número a ser subtraído.
     * @return O resultado da subtração.
     */
    public int subtracao(int a, int b) {
        return a - b;
    }
}

