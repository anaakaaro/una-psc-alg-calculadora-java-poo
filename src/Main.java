import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        double num1, num2;
        String operacao, sair;
        do{
            System.out.println("Digite o primeiro valor: ");
            num1 = scanner.nextDouble();

            System.out.println("Escolha a operação: ");
            System.out.println("+ para somar");
            System.out.println("- para subtrair");
            System.out.println("* para multiplicar");
            System.out.println("/ para dividir");
            System.out.println("^ para potência de dois números");
            System.out.println("# para a raiz quadrada do primeiro número");
            operacao = scanner.next();

            System.out.println("Digite o segundo valor: ");
            num2 = scanner.nextDouble();

            double resultado = 0.0;
            switch (operacao) {
            case "+":
                resultado = calculadora.somar(num1, num2);
                break;
            
            case "-":
                resultado = calculadora.subtracao(num1, num2);
                break;

            case "*":
                resultado = calculadora.multiplicacao(num1, num2);
                break;

            case "/":
                resultado = calculadora.divisao(num1, num2);
                break;
            
            case "#":
                resultado = calculadora.raizQuadrada(num1);
                break;

            case "^":
                resultado = calculadora.potencia(num1, num2);
                break;
            }
       System.out.println("Resultado: " + resultado);
       System.out.println("Deseja sair do programa? ");
       sair = scanner.next();

        } while(!sair.equalsIgnoreCase("q"));
    scanner.close();
    }
}
