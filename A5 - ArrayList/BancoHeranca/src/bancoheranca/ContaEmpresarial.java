package bancoheranca;

public class ContaEmpresarial extends Conta{
    private PesJuridica cliente;
    private double chequeEspecial;

    //Construtores
    public ContaEmpresarial(double chequeEspecial, int nroConta,PesJuridica cliente) {
        super(nroConta);
        this.chequeEspecial = chequeEspecial;
        this.cliente = cliente;
    }
    
   //GSetters
    public PesJuridica getCliente() {
        return cliente;
    }

    public void setCliente(PesJuridica cliente) {
        this.cliente = cliente;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    //Metodos
    @Override
    public boolean sacar(double valor){
        if(valor <= super.getSaldo() + this.chequeEspecial){
            super.setSaldo(super.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!");
            return true;    
        }else{
            System.out.println("Não foi possível realizar saque! Saldo insuficiente!");
            return false;
        }
    }

}
