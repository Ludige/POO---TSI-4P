package bancoheranca;

public class ContaPoupanca extends ContaCorrente{
    //Construtores
    public ContaPoupanca(int nroConta, PesFisica cliente) {
        super(nroConta, cliente);
    }

    //Metodos
    public void calcularJuros() {
        //+0.5% do saldo
        this.setSaldo(this.getSaldo() * 1.005);
    }
}
