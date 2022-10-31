package bancoheranca;

public class ContaEmpresarial extends ContaComChequeEspecial{
    
    public ContaEmpresarial(double chequeEspecial, int nroConta, PesJuridica clienteJur) {
        super(chequeEspecial, nroConta, clienteJur);
    }

    public ContaEmpresarial() {
        //VAZIO
    }

}
