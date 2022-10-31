package biblioteca;

import java.util.Calendar;

public class Tese extends Artigo{//Por conta do resumo
    private int nroPag;
    private String dataDef;
    private String institution;

    public int getNroPag() {
        return nroPag;
    }

    public void setNroPag(int nroPag) {
        this.nroPag = nroPag;
    }

    public String getDataDef() {
        return dataDef;
    }

    public void setDataDef(String dataDef) {
        this.dataDef = dataDef;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }
    //Construtor

    public Tese(int nroPag, String dataDef, String institution, String resumo, String titulo, double multa,double baseAtraso) {
        super(resumo, titulo, multa, baseAtraso);
        this.nroPag = nroPag;
        this.dataDef = dataDef;
        this.institution = institution;
    }

}
