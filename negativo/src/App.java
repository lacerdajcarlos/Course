import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if  (x >= 0){
            System.out.println("NAO NEGATIVO");
        }
        else{
            System.out.println("NEGATIVO");
        }

    }
}
