package bancoheranca;

public class ContaEspecial extends Conta{
    private PesFisica cliente;
    private double chequeEspecial;

    //GSetters
    public PesFisica getCliente() {
        return cliente;
    }

    public void setCliente(PesFisica cliente) {
        this.cliente = cliente;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    //Construtores
    public ContaEspecial(double chequeEspecial, int nroConta,PesFisica cliente) {
        super(nroConta);
        this.cliente = cliente;
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

