package bancoheranca;

public class PesFisica extends Pessoa{
    private int cpf;
    private int rg;

    public int getCpf(){
        return cpf;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public int getRg(){
        return rg;
    }

    public void setRg(int rg){
        this.rg = rg;
    }
    
    public PesFisica(int cpf, int rg, String nome, String numero) {
        super(nome, numero);
        this.cpf = cpf;
        this.rg = rg;
    }

}
