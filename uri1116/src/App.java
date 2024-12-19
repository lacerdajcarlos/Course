import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
       

        for(int i = 0; i < n; i++){
            int numerador = sc.nextInt();
            int denominador = sc.nextInt();

            if (denominador == 0){
                System.out.println("divisao impossivel");

            }else{
                double resultado =(double) numerador/denominador;
                System.out.printf("%.1f%n", resultado);
            }
            

        }



    }
}
