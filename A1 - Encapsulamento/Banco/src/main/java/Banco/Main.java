package Banco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      ContaCorrente cc = new ContaCorrente();
      DadosConta dc = new DadosConta();
      
      int escolha;
      float valorDeposito;
      float valorSaque;
      boolean criacao = false;
      
      Scanner ler = new Scanner(System.in);
      
      if(dc.getDinheiro() >= 0){       
        do{
            System.out.print("OPÇÕES\n1.Criar\n2.Depositar\n3.Sacar\n4.Tranferencia\n5.Extrato\n0.Sair\nOperação: ");
            escolha = ler.nextInt();
            
            System.out.println("\n");
            
            switch (escolha){
                 case 1://Criar Conta
                     if(!criacao){
                        cc.CriarConta();
                        criacao = false;
                        break;
                     }
                     else{
                         System.out.println("Voce ja possui uma conta");
                         break;
                     }
                 case 2://Depositar
                    System.out.print("Digite o valor de deposito: ");
                    valorDeposito = ler.nextInt();
                    dc.setDinheiro(dc.getDinheiro() + valorDeposito);
                    dc.setDinheiro(cc.Depositar(valorDeposito, dc.getDinheiro()));
                    break;
                 case 3://Sacar
                    System.out.println("Digite o valor de saque:");
                    valorSaque = ler.nextInt();
                    dc.setDinheiro(cc.Sacar(valorSaque, dc.getDinheiro()));
                    break;
                 case 4://Transferencia
                    System.out.println("Digite a primeira chave");
                    dc.setChave(ler.nextInt());
                    //Instanciar conta para transferencia
                    DadosConta conta2 = new DadosConta();
                    //Chave para transferencia
                    System.out.println("Digite a segunda chave");
                    conta2.setChave(ler.nextInt());
                    
                    cc.Transferir(dc.getChave(), conta2.getChave(), dc.getDinheiro());
                    break;
                 case 5://Extrado
                     System.out.println(dc.getNome());
                     System.out.println(dc.getChave());
                     System.out.println(dc.getIdade());
                     System.out.println(dc.getDinheiro());
                     System.out.println(dc.getCpf());
                     break;
                 default:
                    System.out.println("Nao selecionada");
                    break;
            }
        }while(escolha != 0);
      }
    }
}
    

