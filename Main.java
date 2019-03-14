import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner vaiJogar = new Scanner(System.in);

        System.out.println("Bem vindo ao Pedra-Papel-Tesoura \n" +
                "Deseja jogar? \n" +
                "1-) Sim \n" +
                "2-) Não");

        Integer jogar = vaiJogar.nextInt();

        if(jogar.equals(1)){

            Jogo resultado = new Jogo();

            System.out.println(resultado.novoJogo());

        }else{
            System.out.println("Cya m8");
        }

    }

}
