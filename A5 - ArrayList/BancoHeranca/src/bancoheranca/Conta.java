package bancoheranca;

public abstract class Conta {
    private double saldo;
    private int nroConta;

    
   //GSetters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }

    public int getNroConta(){
        return nroConta;
    }
       
    public void setNroConta(int nroConta){
        this.nroConta = nroConta;
    }
    
  
    //Metodos
    public boolean depositar(double valor){
        if(valor > 0){
            this.setSaldo(this.getSaldo() + valor); //Executa o deposito
            System.out.println("Deposito realizado");
            return true;
        }else{ 
            System.out.println("Não não realizado! Valor deve ser superior a zero!");
            return false;
        }
    }

    public boolean sacar(double valor){
        if(valor <= this.saldo){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!");
            return true;    
        }else{
            System.out.println("Não foi possível realizar saque! Saldo insuficiente!");
            return false;
        }
    }

    public boolean transferir(Conta contaUsuario, Conta contaDestino, double valor){
        if(valor > 0 && valor <= this.saldo){
            contaUsuario.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transfêrencia realizada com sucesso.");
            return true;
        } else{
            System.out.println("Transferencia não realizada! Saldo insuficiente!");
            return false;
        }    
    }
    
    public void dados(){
        System.out.println("--------------------");
        System.out.println("Nro Conta: "+this.nroConta);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("--------------------");
    } 
    
    //Construtores
    public Conta(int nroConta) {
        this.saldo = 0.0;
        this.nroConta = nroConta;
        
        System.out.println("Conta Criada com Sucesso!");
        System.out.println("Numero da Conta:"+nroConta);
    }

}
