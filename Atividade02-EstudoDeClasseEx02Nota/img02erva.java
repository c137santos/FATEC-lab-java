public class img02erva {
    private String nome;
    private String cor;
    private String especie;

    public img02erva(String nome, String cor, String especie) {
        this.nome = nome;
        this.cor = cor;
        this.especie = especie;
    }

    public String alastrar() {
        // implementation goes here
        return "alastrando...";
    }

    public boolean envenenar() {
        if (this.especie.equals("venenosa")) {
            return true;
        }
        return false;
    }

    public boolean crescer() {
        // implementation goes here
        return true;
    }
}
