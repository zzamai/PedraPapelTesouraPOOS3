import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Random;
import java.util.Scanner;

public class Jogo {


    public String novoJogo(){

        Scanner escolheModo = new Scanner(System.in);
        Scanner escolhePartida = new Scanner(System.in);


        System.out.println(" Escolha o modo de jogo \n" +
                " 1-) Jogador x Maquina \n" +
                " 2-) Maquina x Maquina");

        Integer escolha = escolheModo.nextInt();

        System.out.println(" Escolha quantas partidas: \n" +
                "1-) Unitário \n" +
                "2-) Melhor de 3");

        Integer escolhe = escolhePartida.nextInt();


        if(escolhe == 1){

            return executaOGame(escolha);

        }else{

            Integer cont = 0;

            do{

                System.out.println(executaOGame(escolha));
                cont++;

            }while(cont < 2);

            return executaOGame(escolha);

        }

    }


    public String executaOGame(Integer escolha){


        Scanner escolheItem = new Scanner(System.in);

        String[] maquina1 = new String[3];
        maquina1[0] = "PE";
        maquina1[1] = "PA";
        maquina1[2] = "TE";
        Random escolhaDaMaquina = new Random();
        Integer randomEscolha = escolhaDaMaquina.nextInt(3);
        System.out.println(randomEscolha);
        String maquina = maquina1[randomEscolha];

        if(escolha.equals(1)){

            Jogador newPlayer = new Jogador();
            Jogador newMaquina = new Jogador();

            System.out.println("Escolha entre Pedra (PE), Papel (PA) ou Tesoura (TE)");
            String objeto = escolheItem.nextLine().toUpperCase();

            newPlayer.setObjeto(objeto);
            newMaquina.setObjeto(maquina);

            return testaVencedor(newPlayer, newMaquina);

        }else if(escolha.equals(2)){

            Random escolhaDaMaquina2 = new Random();
            String maquina2 = maquina1[escolhaDaMaquina2.nextInt(3)];

            Jogador newMaquina1 = new Jogador();
            Jogador newMaquina2 = new Jogador();

            newMaquina1.setObjeto(maquina);
            newMaquina2.setObjeto(maquina2);

            return testaVencedor(newMaquina1, newMaquina2);

        }else{
            return "Opção inválida";
        }

    }

    public String testaVencedor(Jogador p1, Jogador p2){

        if(p1.getObjeto() instanceof Pedra){
            Pedra vencedor = new Pedra();
            return vencedor.vencedor(p1, p2);
        }else if(p1.getObjeto() instanceof  Papel){
            Papel vencedor = new Papel();
            return vencedor.vencedor(p1, p2);
        }else if(p1.getObjeto() instanceof Tesoura){
            Tesoura vencedor = new Tesoura();
            return vencedor.vencedor(p1, p2);
        }
        else return "";
    }


}
