
import calculos.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insira um valor X: ");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Insira um valor Y: ");
        int y = Integer.parseInt(reader.readLine());
        System.out.println("Escolha seu tipo de operação:\n\"+\" para adição, \"-\" para subtração, \"\\\" para divisão ou \"*\" para multiplicação. ");
        char op = reader.readLine().charAt(0);

        int valor = 0;
        switch (op){
            case '+':
                valor = Calculator.addition(x,y);
                break;
            case '-':
                valor = Calculator.subtraction(x,y);
                break;
            case '/':
                valor = Calculator.division(x,y);
                break;
            case '*':
                valor = Calculator.multiplication(x,y);
                break;
        }
        System.out.println("Valor: " + valor);
    }

}
