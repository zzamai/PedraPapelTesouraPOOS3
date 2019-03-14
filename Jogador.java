public class Jogador {

    private Coisa objeto;

    private Integer pontos = 0;

    public void setObjeto(String objeto){

        if(objeto.equals("PE")){
            this.objeto = new Pedra();
        }else if(objeto.equals("PA")){
            this.objeto = new Papel();
        }else if(objeto.equals("TE")){
            this.objeto = new Tesoura();
        }

    }

    public Coisa getObjeto() {
        return objeto;
    }

    public void setPontos(Integer pontos) {
        this.pontos += pontos;
    }

    public Integer getPontos() {
        return pontos;
    }
}
