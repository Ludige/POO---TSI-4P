package biblioteca;

import java.util.Calendar;

public class Tese extends Artigo{//Pelo resumo
    private int nroPag;
    private Calendar dataDef;
    private String institution;//se tem caracter especial eu vo por ingles, pra facilitar a vida de todo mundo

    public int getNroPag() {
        return nroPag;
    }

    public void setNroPag(int nroPag) {
        this.nroPag = nroPag;
    }

    public Calendar getDataDef() {
        return dataDef;
    }

    public void setDataDef(Calendar dataDef) {
        this.dataDef = dataDef;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }
    //Construtor

    public Tese(int nroPag, Calendar dataDef, String institution, String resumo, String titulo, double multa,Autor autor) {
        super(resumo, titulo, multa,autor);
        this.nroPag = nroPag;
        this.dataDef = dataDef;
        this.institution = institution;
    }
    
    
}
