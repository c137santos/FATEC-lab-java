public class img01calopsita {
    private int idade;
    private String cor;
    private String mutacao;

    public img01calopsita(int idade, String cor, String mutacao) {
        this.idade = idade;
        this.cor = cor;
        this.mutacao = mutacao;
    }

    public String cantar() {
        // Implementação do método cantar
        return "A calopsita está cantando!";
    }

    public boolean voar() {
        // Implementação do método voar
        return true;
    }

    public String tipo_racao() {
        // Implementação do método tipo_racao
        return "Ração especial para calopsitas";
    }
}