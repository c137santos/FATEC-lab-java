class TestadorClasse {
    public static void main(String[] args) {
        img01calopsita cc;
        cc = new img01calopsita();
        System.out.println("Testando a Classe das calopsitas: " + cc);
        System.out.println(cc.cantar());
        System.out.println(cc.voar());

        img02erva ci;

        ci = new img02erva("clara", "amarela", "venenosa");
        System.out.println("Testando a Classe das ervas: " + ci);
        System.out.println(ci.alastrar());
        System.out.println(ci.envenenar());

        img03cogumelo cg;
        cg = new img03cogumelo("cogumelo", "branco", "comestivel");
        System.out.println("Testando a Classe dos cogumelos: " + cg);
        System.out.println(cg.alastrar());
        System.out.println(cg.envenenar());

        img04orgaos co;
        co = new img04orgaos("coracao", "peito", "bombear sangue");
        System.out.println("Testando a Classe dos orgaos: " + co);
        System.out.println(co.regenerar());
        System.out.println(co.inflamar());

        img05droga cd;
        cd = new img05droga("maconha", 1.0, 10.0);
        System.out.println("Testando a Classe das drogas: " + cd);
        System.out.println(cd.overdosar());
        System.out.println(cd.usar());
        
        img06livro cl;
        cl = new img06livro("Marília", 2022, "Aprendendo Java");
        System.out.println("Testando a Classe dos livros: " + cl);
        System.out.println(cl.aberto());
        cl.abrir();

        img07carro c;
        c = new img07carro("Fiat", "Uno", 22.2);
        System.out.println("Testando a Classe dos carros: " + c);
        System.out.println(c.buzinar());
        c.acelerar();
        
        img08signo cs;
        cs = new img08signo();
        System.out.println("Testando a Classe dos signos: " + cs);
        System.out.println(cs.combinar());
        System.out.println(cs.calcularAscendete());

        img09som csom;
        csom = new img09som();
        System.out.println("Testando a Classe dos sons: " + csom);
        System.out.println(csom.tocar());

        img10ovnis co1;
        co1 = new img10ovnis();
        System.out.println("Testando a Classe dos ovnis: " + co1);
        System.out.println(co1.abduzir());

    }
}