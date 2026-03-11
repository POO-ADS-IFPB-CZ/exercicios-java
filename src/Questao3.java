public class Questao3 {

    public static void main(String[] args){
        int numero = 24;
        if(ehPerfeito(numero)){
            System.out.println("É perfeito");
        }else{
            System.out.println("Não é perfeito");
        }
    }
    public static boolean ehPerfeito(int numero){
        int acumulador = 0;
        for(int i=1;i<numero;i++){
            if(numero%i==0) acumulador+=i;
        }
        return acumulador == numero;
    }

}
