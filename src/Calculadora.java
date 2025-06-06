public class Calculadora {

    public double somar(double num1, double num2){
        return num1 + num2;
    }

    public double subtracao(double num1, double num2){
        return num1 - num2;
    }

    public double multiplicacao(double num1, double num2){
        return num1 * num2;
    }

    public double divisao(double num1, double num2){
        if(num2 == 0){
            System.out.println("Impossível realizar uma divisão por zero.");
        }
        return num1 / num2;
    }

    public double potencia(double num1, double num2){
        if(num2 == 0){
            return 1;
        }
        return Math.pow(num1, num2);
    }

    public double raizQuadrada(double num1){
        if(num1 < 0){
            System.out.println("Não existe raiz de número negativo.");
        }
        return Math.sqrt(num1);
    }
     
}
