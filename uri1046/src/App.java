import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        
        int duracao;

        if (horaInicial < horaFinal){
            duracao = horaFinal - horaFinal;
        }
        else{
            duracao = 24 -horaInicial + horaFinal;
        }
        System.out.println("O JOGO DUROU " + duracao +" HORA(S)");

        sc.close();

    }
}
