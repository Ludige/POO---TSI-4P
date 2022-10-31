package bancoheranca;

public class ContaPoupanca extends Conta{
    
    //+0.5% do saldo
    public void calcularJuros(){
        this.setSaldo(this.getSaldo() * 1.05);
    }
    
    public ContaPoupanca() {
    }

    public ContaPoupanca(int nroConta, PesFisica clienteFis) {
        super(nroConta, clienteFis);
    }
    
}
