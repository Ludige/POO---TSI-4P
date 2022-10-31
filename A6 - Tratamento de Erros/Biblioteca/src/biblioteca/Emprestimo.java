package biblioteca;

import java.util.Calendar;

public class Emprestimo {
    private static int contador = 0;
    private int id;
    private Usuario user;
    private Publicacoes pub;
    private Calendar dataEmp;
    private Calendar dataDev;
    private double multa;
    private double multaAtraso;
    private int qtdRenov;
    private int i = 0;
    //Metodos
    public void calcularMulta(){
        this.multa = this.pub.getMulta() * (this.qtdRenov - this.user.getLimiteEmprestimos()) + this.calcularMultaAtraso();
        System.out.println("Multa Total: "+this.multa);
    }
    
    public double calcularMultaAtraso(){
        if(dataDev.DAY_OF_MONTH <= dataEmp.DAY_OF_MONTH + 7){
            this.multaAtraso = (dataDev.DAY_OF_MONTH - dataEmp.DAY_OF_MONTH) * this.pub.getBaseMultaAtraso();
        }else{
            this.multaAtraso = 0;
        }
        return this.multaAtraso;
    }
        
    public boolean emprestarPub(){
        this.id = this.i;
        this.dataEmp.getTime();
        this.dataDev.add(dataDev.DAY_OF_MONTH, 7);
        this.pub.emprestar(this.user);
        this.i++;
        return true;
    }
    
    public boolean devolverPub(){
        this.pub.devolver(this.user);
        this.calcularMulta();
        return true;
    }
    

    //GStters
    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Emprestimo.contador = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Publicacoes getPub() {
        return pub;
    }

    public void setPub(Publicacoes pub) {
        this.pub = pub;
    }

    public Calendar getDataEmp() {
        return dataEmp;
    }

    public void setDataEmp(Calendar dataEmp) {
        this.dataEmp = dataEmp;
    }

    public Calendar getDataDev() {
        return dataDev;
    }

    public void setDataDev(Calendar dataDev) {
        this.dataDev = dataDev;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public int getQtdRenov() {
        return qtdRenov;
    }

    public void setQtdRenov(int qtdRenov) {
        this.qtdRenov = qtdRenov;
    }

    public double getMultaAtraso() {
        return multaAtraso;
    }

    public void setMultaAtraso(double multaAtraso) {
        this.multaAtraso = multaAtraso;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    //Construtores

    public Emprestimo(Usuario user, Publicacoes pub) {
        this.user = user;
        this.pub = pub;
        this.dataEmp = dataEmp.getInstance();
        this.qtdRenov = 0;
    }
    
}
