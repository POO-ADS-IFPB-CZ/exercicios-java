import java.util.Scanner;

public class Main{
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
        if(delta==0) System.out.println("Só possui uma raiz: "+(-b)/(2*a));
        if(delta>0){
            System.out.println("x1 = "+(-b+Math.sqrt(delta))/(2*a));
            System.out.println("x2 = "+(-b-Math.sqrt(delta))/(2*a));
        }

    }
    public static double delta(double a,double b,double c){
        return Math.pow(b,2)-4*a*c;
    }

}