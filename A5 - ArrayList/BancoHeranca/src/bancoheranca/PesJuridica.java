package bancoheranca;

public class PesJuridica extends Pessoa{
    private int cnpj;

    public int getCnpj(){
        return cnpj;
    }

    public void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }

    public PesJuridica(int cnpj, String nome, String numero) {
        super(nome, numero);
        this.cnpj = cnpj;
    }
    
}
