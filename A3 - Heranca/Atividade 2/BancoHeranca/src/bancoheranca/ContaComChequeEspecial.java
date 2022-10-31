package bancoheranca;


public abstract class ContaComChequeEspecial extends Conta{
    private double chequeEspecial;

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    @Override
    public boolean sacar(double valor,Conta conta){
        if(valor <= (this.getSaldo() + this.chequeEspecial)){
            conta.setSaldo(getSaldo() - valor);
            System.out.println("Saque de "+ valor +"R$ realizado com sucesso!");
            return true;    
        }else{
            System.out.println("Não foi possível realizar saque! Saldo insuficiente!");
            return false;
        }
    }

    public ContaComChequeEspecial(double chequeEspecial, int nroConta, PesFisica clienteFis) {
        super(nroConta, clienteFis);
        this.chequeEspecial = chequeEspecial;
    }

    public ContaComChequeEspecial(double chequeEspecial, int nroConta, PesJuridica clienteJur) {
        super(nroConta, clienteJur);
        this.chequeEspecial = chequeEspecial;
    }
    
    public ContaComChequeEspecial(){
    }
    
    
}
