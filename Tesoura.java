public class Tesoura extends Coisa {

    public String vencedor(Jogador jogador1, Jogador jogador2){
        if(jogador1.getObjeto() instanceof Papel){
            jogador1.setPontos(1);
            System.out.println("Jogador 1 com "+ jogador1.getPontos() + "pontos");
            return "Tesoura corta o Papel!";
        }else if(jogador1.getObjeto().equals(jogador2.getClass())){
            return "Empatou!";
        }else{
            jogador2.setPontos(1);
            System.out.println("Maquina com " + jogador2.getPontos() + "pontos");
            return "Pedra esmaga Tesoura!";
        }
    }

}
