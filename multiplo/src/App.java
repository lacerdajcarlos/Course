import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        ehMultiplo(x, y);
       
    }

    public static boolean ehMultiplo(int a, int b){
        if(a%b==0||b%a==0){
            System.out.println("Sao Multiplos");
            return true;
        }else{
            System.out.println("Nao sao Multiplos");
            return false;
        }
        
    }
}
