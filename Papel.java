public class Papel extends Coisa{

    public String vencedor(Jogador jogador1, Jogador jogador2){
        if(jogador1.getObjeto() instanceof Pedra){
            jogador1.setPontos(1);
            System.out.println("Jogador 1 com "+ jogador1.getPontos() + "pontos");
            return "Papel cobriu a Pedra!";
        }else if(jogador1.getObjeto().equals(jogador2.getClass())){
            return "Empatou!";
        }else{
            jogador2.setPontos(1);
            System.out.println("Maquina com " + jogador2.getPontos() + "pontos");
            return "Tesoura corta papel!";
        }
    }

}
