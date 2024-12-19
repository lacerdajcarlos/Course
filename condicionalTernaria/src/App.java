/*  O ternário é uma forma de escrever uma expressão condicional em uma única linha de código.
 Ele é composto por três partes: a condição, o valor a ser retornado caso a condição seja verdadeira
e o valor a ser retornado caso a condição seja falsa. A sintaxe do ternário é a seguinte:

condição ? valor_se_verdadeiro : valor_se_falso*/

public class App {
    public static void main(String[] args) throws Exception {

        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);   
    }
}
