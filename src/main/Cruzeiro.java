package main;

public class Cruzeiro extends Time {
    public Cruzeiro(String nomeTime, int numeroAtacantes, int numeroZagueiros) {
        super(nomeTime, numeroAtacantes, numeroZagueiros);
    }

    @Override
    public float calculaScoreTime() {
        float pontuacaoAtacantes = this.numeroAtacantes * this.jogador.indicaPontuacaoJogador(3, 8);
        float pontuacaoZagueiros = this.numeroZagueiros * this.jogador.indicaPontuacaoJogador(10, 5);

        return pontuacaoAtacantes + pontuacaoZagueiros ;
    }
    
}
