package main;

public class Atacante implements Jogador {

    @Override
    public float indicaPontuacaoJogador(int numGols, int numPartidas) {
        return numGols/numPartidas;
    }
    
}
