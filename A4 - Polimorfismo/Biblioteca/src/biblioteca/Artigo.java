package biblioteca;

public class Artigo extends Publications{
    private String resumo;

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    //Construtor

    public Artigo(String resumo, String titulo, double multa, Autor autor) {
        super(titulo, multa, autor);
        this.resumo = resumo;
    }
    
}
