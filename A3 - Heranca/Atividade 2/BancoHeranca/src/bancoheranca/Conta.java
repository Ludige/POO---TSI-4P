package bancoheranca;

import java.util.ArrayList;

public abstract class Conta {
    ArrayList<Conta> conta = new ArrayList();
    
    private double saldo;
    private int nroConta;
    private PesFisica clienteFis;
    private PesJuridica clienteJur;

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
    
  
    public boolean depositar(double valor,Conta conta){
        if(valor > 0){
            conta.setSaldo(conta.getSaldo() + valor); //Executa o deposito
            System.out.println("Deposito realizado");
            return true;
        }else{ 
            System.out.println("Não não realizado! Valor deve ser superior a zero!");
            return false;
        }
    }

    public boolean sacar(double valor,Conta conta){
        if(valor <= this.saldo){
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!");
            return true;    
        }else{
            System.out.println("Não foi possível realizar saque! Saldo insuficiente!");
            return false;
        }
    }

    public boolean transferir(Conta contaUsuario, Conta contaDestino, double valor){
        if(valor > 0 && valor <= this.saldo){
            contaUsuario.sacar(valor,contaUsuario);
            contaDestino.depositar(valor,contaDestino);
            System.out.println("Transfêrencia realizada com sucesso.");
            return true;
        } else{
            System.out.println("Transferencia não realizada! Saldo insuficiente!");
            return false;
        }    
    }
    
    public void dados(Conta conta){
        System.out.println("Nro Conta:"+conta.nroConta);
        System.out.println("Saldo:"+conta.saldo);
    } 
    
    public Conta(int nroConta,PesFisica clienteFis) {
        this.saldo = 0.0;
        this.nroConta = nroConta;
        this.clienteFis = clienteFis;
    }
    
    public Conta(int nroConta,PesJuridica clienteJur) {
        this.saldo = 0.0;
        this.nroConta = nroConta;
        this.clienteJur = clienteJur;
    }

    public Conta() {
    }
    
}
