package banco;

import java.util.Scanner;

public class Conta {
    private String nroConta; 
    private String nomeUsuario ;
    private String cpf;
    private double saldo;


        public boolean depositar(double valor){
            if(valor > 0){
                this.saldo += valor; //Executa o deposito
                System.out.println("Deposito realizado");
                return true;    
            }else{ 
                System.out.println("Não não realizado! Valor deve ser superior a zero!");
                return false;
            }
        }

        public boolean sacar(double valor){
            if(valor <= this.saldo){
                this.saldo -= valor; //Executa o saque
                System.out.println("Saque realizado com sucesso!");
                return true;    
            }else{
                System.out.println("Não foi possível realizar saque! Saldo insuficiente!");
                return false;
            }
        }

        public boolean transferir(Conta contaUsuario, Conta contaDestino, double valor){
            if(valor > 0 && valor <= this.saldo){
                this.saldo -= valor; //Desconta o valor da conta debitada
                contaUsuario.sacar(valor);//Conta de retirada do dinheiro
                contaDestino.depositar(valor); //Deposita na conta favorecisa
                System.out.println("Transfêrencia realizada com sucesso.");
                return true;
            } else{
                System.out.println("Transferencia não realizada! Saldo insuficiente!");
                return false;
            }    
        }
        
        public boolean verfConta(String nroConta){//Não consegui passar verificação para o nroConta da conta individual :(
            return (nroConta == this.nroConta);//O numero da conta que passa no vetor é o mesmo de uma conta que existe
            
        }

        
    //    
        public void setNroConta(String nroConta){
            this.nroConta = nroConta;
        }
        
        public String getNroConta(){
            return this.nroConta;
        }

    //  
        public void setNomeUsuario(String nome){
            this.nomeUsuario = nome;
        }
        
        public String getNomeUsuario(){
            return this.nomeUsuario;
        }   

    //
        public void setCpf(String cpf){
            this.cpf = cpf;
        }
        
        public String getCpf(){
            return this.cpf;
        }
        
    //
        public double getSaldo(){
            return this.saldo;
        }

    private boolean validarCpf(String cpf){
        return (cpf.length() == 11);
    }
    //VOCE DEIXOU VOID NO SLIDE, MEIA HORA PROCURANDO O ERRO AI FUI VER MINHAS ANOTAÇÔES, TO BEM FELIZ
    Conta(){
        System.out.println("Vazio");
    }
    
    Conta(String nroConta, String nomeUsuario, String cpf){
        this.nroConta = nroConta;
        this.nomeUsuario = nomeUsuario;
        this.cpf = cpf;
        System.out.println("Criando Conta");
    }

    Conta(String nroConta, String nomeUsuario, String cpf, double saldo){
        this.nroConta = nroConta;
        this.nomeUsuario = nomeUsuario;
        this.cpf = cpf;
        this.depositar(saldo);
        System.out.println("Criando Conta");
    }
}


