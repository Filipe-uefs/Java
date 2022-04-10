public class GuardadorDeContas {

    private ContaCorrente[] referencias;
    private int ponteiro;
    public GuardadorDeContas() {
        this.referencias = new ContaCorrente[5];
        this.ponteiro = 0;
    }

    public void adicionar(ContaCorrente conta) {
        this.referencias[this.ponteiro] = conta;
        this.ponteiro++;
    }

    public int getQuantidadeDeElementos() {
        return this.ponteiro;
    }

    public ContaCorrente getReferencia(int posicao) {
        return this.referencias[posicao];
    }
}
