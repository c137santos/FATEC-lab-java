public class img04orgaos {
    private String nome;
    private String localidade;
    private String funcao;

    public img04orgaos(String nome, String Localidade, String funcao) {
        this.nome = nome;
        this.localidade = localidade;
        this.funcao = funcao;
    }

    public int regenerar() {
        return 3;
    }

    public String inflamar() {
        return "O" + this.nome + "está sofrendo...";

    }

    public boolean funcionar() {
        return true;
    }
    
}
