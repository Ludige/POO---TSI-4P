package bancoheranca;

public class ContaEspecial extends ContaComChequeEspecial{

    public ContaEspecial(double chequeEspecial, int nroConta, PesFisica clienteFis) {
        super(chequeEspecial, nroConta, clienteFis);
    }

    public ContaEspecial(){
    }
    
}
