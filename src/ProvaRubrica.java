import rubrica.Rubrica;

public class ProvaRubrica {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Rubrica r = new Rubrica("Nome");
        
        r.aggiungi("X","Y","1");
        r.aggiungi("A","Y","1");
        r.aggiungi("X","Y","1");
        r.aggiungi("X","Y","2");
        r.aggiungi("A","B","4");

    }

}
