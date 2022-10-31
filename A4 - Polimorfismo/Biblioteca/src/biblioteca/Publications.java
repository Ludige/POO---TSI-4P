package biblioteca;

import java.util.ArrayList;
import java.util.Calendar;

public abstract class Publications{
    private Calendar data;
    private String titulo;
    private ArrayList<String> pubList = new ArrayList();
    private ArrayList<Autor> autores = new ArrayList();
    private boolean emprestado;
    private int nroRen;
    private int limiteRenov;
    private double multa;
    private double multaTotal;
    
    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getPubList() {
        return pubList;
    }

    public void setPubList(ArrayList<String> pubList) {
        this.pubList = pubList;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public int getLimiteRenov() {
        return limiteRenov;
    }

    public void setLimiteRenov(int limiteRenov) {
        this.limiteRenov = limiteRenov;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getMultaTotal() {
        return multaTotal;
    }

    public void setMultaTotal(double multaTotal) {
        this.multaTotal = multaTotal;
    }

    public int getNroRen() {
        return nroRen;
    }

    public void setNroRen(int nroRen) {
        this.nroRen = nroRen;
    }
    
    //Construtores

    public Publications(String titulo, double multa,Autor autor) {
        this.titulo = titulo;
        this.emprestado = false;
        this.multa = multa;
        this.autores.add(autor);
        System.out.println("publicacao adicionada:"+this.titulo);
    //Tinha que colocar um metodo para adicionar mais autores na obra, mas eu demorei pra perceber isso
    //e pra n entregar atrasado vai assim mesmo
    }
}
