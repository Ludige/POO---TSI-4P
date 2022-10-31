package biblioteca;

import java.util.ArrayList;
import java.util.Calendar;

public abstract class Publicacoes{
    private String titulo;
    private ArrayList<Publicacoes> pubList = new ArrayList();
    private ArrayList<Autor> autores = new ArrayList();
    private boolean emprestado;
    private double multa;
    private double baseMultaAtraso;
    private double multaAtraso;
    
    //GSetters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Publicacoes> getPubList() {
        return pubList;
    }

    public void setPubList(ArrayList<Publicacoes> pubList) {
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

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getMultaAtraso() {
        return multaAtraso;
    }

    public void setMultaAtraso(double multaAtraso) {
        this.multaAtraso = multaAtraso;
    }

    public double getBaseMultaAtraso() {
        return baseMultaAtraso;
    }

    public void setBaseMultaAtraso(double baseMultaAtraso) {
        this.baseMultaAtraso = baseMultaAtraso;
    }
    
    //Metodos
    public boolean addAutor(Autor autor){
        this.autores.add(autor);
        System.out.println("Autor "+autor+" adicionado a obra");
        return true;
    }
    
    public boolean removeAutor(Autor autor){
        this.autores.remove(autor);
        System.out.println("Autor "+autor+" removido da obra");
        return true;
    }
    
    public boolean addRef(Publicacoes pub){
        this.pubList.add(pub);
        System.out.println("Referencia "+ pub.titulo+ "adicionada a obra");
        return true;
    }
    
    public boolean removeRef(Publicacoes pub){
        this.pubList.remove(pub);
        System.out.println("Referencia "+ pub.titulo+ "removida da obra");
        return true;
    }
    
    public void emprestar(Usuario user){
        if(user.getQtdEmprestimos() < user.getLimiteEmprestimos() && !this.isEmprestado()){
            user.fazerEmprestimo();
            this.setEmprestado(true);
        }else{
            System.out.println("Impossivel emprestar, Usuario atingiu o limite ou Obra emprestada");
            System.out.println("Quantidade de emprestimos do usuario: "+user.getQtdEmprestimos());
        }
        
    }
    
    public void devolver(Usuario user){
        if(this.isEmprestado()){
            user.devolverEmp();
            this.setEmprestado(false);
        }
    }
    //Construtores
    public Publicacoes(String titulo, double multa,double baseAtraso) {
        this.titulo = titulo;
        this.emprestado = false;
        this.baseMultaAtraso = baseAtraso;
        this.multa = multa;
        //
        System.out.println("publicacao adicionada:"+this.titulo);
    }
}
