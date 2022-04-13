import java.util.ArrayList;

public class Loja {

    private ArrayList<String> funcionarios = new ArrayList<>();
    private String nomeLoja;
    private int qtdFuncionarios = 0;

    public Loja() {}

    public Loja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public ArrayList<String> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<String> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public void setQtdFuncionarios(int qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public boolean addFuncionario(String funcionario) {
        funcionarios.add(funcionario);
        this.qtdFuncionarios++;
        return true;
    }
}
