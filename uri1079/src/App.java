import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner  sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i =0; i < n; i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

           double media = (a * 2  + b * 3 +  c * 5 )/ 10;

           System.out.printf("%.1f%n", media);

        }
    }
}
