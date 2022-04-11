public class ContaCorrente {

    private int numero;
    private float saldo;
    private String nomeTitular;

    public ContaCorrente () {}

    public ContaCorrente(int numero, float saldo, String nomeTitular) {
        this.numero = numero;
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular() { return nomeTitular; }

    public void setNomeTitular(String nomeTitular) { this.nomeTitular = nomeTitular; }

    public int getNumero() { return numero; }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object ref) {
        ContaCorrente conta = (ContaCorrente) ref;
        return (this.getSaldo() == conta.getSaldo() && this.getNumero() == conta.getNumero());
    }

    @Override
    public String toString() {
        return "Conta " + getNumero() + " Saldo " + getSaldo() + " Nome " + getNomeTitular();
    }
}
