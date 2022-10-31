package biblioteca;

import java.util.Calendar;

public class Livro extends Publicacoes{
    private String nroEdition;
    private String editora;
    private int isbn;
    
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
        return isbn;
    }

    public void setInbn(int inbn) {
        this.isbn = inbn;
    }
    
    //Contrutores

    public Livro(String nroEdition, String editora, int isbn, String titulo, double multa,double baseAtraso) {
        super(titulo, multa,baseAtraso);
        this.nroEdition = nroEdition;
        this.editora = editora;
        this.isbn = isbn;
    }

}
