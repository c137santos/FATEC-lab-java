public class img05droga {
    private String nome;
    private Double posologia;
    private Double preco;

    public img05droga(String nome, Double posologia, Double preco) {
        this.nome = nome;
        this.posologia = posologia;
        this.preco = preco;
    }

    public double overdosar() {
        // implementation goes here
        return 10.0;
    };
    public String usar() {
        // implementation goes here
        return "Sim";
    };

    public boolean legalizar() {
        // implementation goes here
        return true;
    }
    
}
