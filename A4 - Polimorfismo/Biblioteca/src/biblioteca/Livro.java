package biblioteca;

public class Livro extends Publications{
    private String nroEdition;
    private String editora;
    private int inbn;
    
    //GSetters

    public String getNroEdition() {
        return nroEdition;
    }

    public void setNroEdition(String nroEdition) {
        this.nroEdition = nroEdition;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getInbn() {
        return inbn;
    }

    public void setInbn(int inbn) {
        this.inbn = inbn;
    }
    
    //Contrutores

    public Livro(String nroEdition, String editora, int inbn, String titulo, double multa, Autor autor) {
        super(titulo, multa, autor);
        this.nroEdition = nroEdition;
        this.editora = editora;
        this.inbn = inbn;
    }
    
}
