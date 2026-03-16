import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor de A:");
        double a = scanner.nextDouble();
        System.out.print("Informe o valor de B:");
        double b = scanner.nextDouble();
        System.out.print("Informe o valor de C:");
        double c = scanner.nextDouble();

        double delta = delta(a,b,c);

        if(delta<0) System.out.println("Não possui raizes reais");
        if(delta==0) System.out.printf("Só possui uma raiz: %.2f",(-b)/(2*a));
        if(delta>0){
            System.out.printf("x1 = %.2f\n",(-b+Math.sqrt(delta))/(2*a));
            System.out.printf("x2 = %.2f",(-b-Math.sqrt(delta))/(2*a));
        }

    }
    public static double delta(double a,double b,double c){
        return Math.pow(b,2)-4*a*c;
    }

}