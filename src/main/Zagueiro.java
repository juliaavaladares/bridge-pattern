package main;

public class Zagueiro implements Jogador {

    @Override
    public float indicaPontuacaoJogador(int numDefesas, int numPartidas) {
        return (float) (1.3*(numDefesas/numPartidas));
    }
    
}
