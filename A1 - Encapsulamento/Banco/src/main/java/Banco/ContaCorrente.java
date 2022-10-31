package Banco;

import java.util.Scanner;

public class ContaCorrente {
    DadosConta dc = new DadosConta();
    Scanner ler = new Scanner(System.in);
    
    public float Depositar(float valorDeposito, float saldo){
        //set dinheiro com a quantidade de dinheiro + o deposito
        dc.setDinheiro(dc.getDinheiro() + valorDeposito);
       
        System.out.println("Valor de deposito: "+valorDeposito);
        System.out.println("\n");
            
        return valorDeposito;
    }
    
    public float Sacar(float valorSaque, float saldo){
        if( valorSaque <= dc.getDinheiro()){//valor de saque menor ou igual que o dinheiro 
            dc.setDinheiro(dc.getDinheiro() - valorSaque);
            System.out.println("Dindin sacado: "+valorSaque);
        } else{
            System.out.println("impossivel traferir");
        }
        System.out.println("\n");
        
        return dc.getDinheiro();
    }
    
    public float Transferir(int conta,int conta2, float totalTransf){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digitar total de transferência:");
        totalTransf = ler.nextFloat();
            
        if(totalTransf <= dc.getDinheiro()){
            dc.setDinheiro(dc.getDinheiro() - totalTransf);//dinheiro seta o total - o total de transferencia
        
        DadosConta dc2 = new DadosConta();//contra para transferencia
        
            dc2.setDinheiro(dc2.getDinheiro() + totalTransf);
                
        System.out.println("Transferencia executada com sucesso \nValor: " + totalTransf );
        }else{
            System.out.println("Valor exede o total da conta");
        }          
            
        System.out.println("\n");
            
        return dc.getDinheiro();
    }
    
    public void CriarConta(){
        System.out.println("Digite seu nome:");
        dc.setNome(ler.nextLine());
        System.out.println("Digite sua Idade");
        dc.setIdade(ler.nextInt());
        System.out.println("Digite seu Codigo de Acesso");
        dc.setChave(ler.nextInt());
        System.out.println("Digite seu CPF");
        dc.setCpf(ler.nextInt());
        dc.setDinheiro(0);
        }
}
