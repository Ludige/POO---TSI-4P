package biblioteca;

import java.util.Calendar;

public class Artigo extends Publicacoes{
    private String resumo;

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    //Construtor

    public Artigo(String resumo, String titulo, double multa,double baseAtraso) {
        super(titulo, multa,baseAtraso);
        this.resumo = resumo;
    }
}
