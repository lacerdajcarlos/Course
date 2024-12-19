import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

       double x = sc.nextDouble();

       if(x < 0.0 || x > 100.0){
        System.out.println("Fora do Intervalo");
       }
       else if (x <= 0.25) {
        System.out.println("Intervalo [0.25]");
       }
       else if (x <= 25.50) {
        System.out.println("Intervalo [25.50]");
        
       }
       else if (x <= 50.75) {
        System.out.println("Intervalo [50.75]");
        
       }
       else  {
        System.out.println("Intervalo [75.100]");
        
       }

       sc.close();


      
    }
}
