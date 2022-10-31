package bancoheranca;

public class ContaCorrente extends Conta{
    public ContaCorrente(){
    }

    //Saldo > 0
    public ContaCorrente(int nroConta, PesFisica clienteFis) {
        super(nroConta, clienteFis);
    }
}
