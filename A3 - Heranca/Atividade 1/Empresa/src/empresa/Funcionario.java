package empresa;

public class Funcionario extends Pessoa{
    private String cargo;
    private String setor;
    private double salarioTotal;
    private int codigoFunc;
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public String getCargo(){
        return this.cargo;
    }
    
    public void setSetor(String setor){
        this.setor = setor;
    }
    
    public String getSetor(){
        return this.setor;
    }
    
    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }
    
    //Tste

    public int getCodigoFunc() {
        return codigoFunc;
    }

    public void setCodigoFunc(int codigoFunc) {
        this.codigoFunc = codigoFunc;
    }
    
}
