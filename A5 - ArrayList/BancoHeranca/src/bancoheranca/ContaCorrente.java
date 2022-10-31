package bancoheranca;

public class ContaCorrente extends Conta{
    private PesFisica cliente;
    //Saldo > 0
    public ContaCorrente(int nroConta,PesFisica cliente) {
        super(nroConta);
        this.cliente = cliente;
    }

    public PesFisica getCliente() {
        return cliente;
    }

    public void setCliente(PesFisica cliente) {
        this.cliente = cliente;
    }
    
}
