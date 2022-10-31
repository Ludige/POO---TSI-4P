
package banco;

import java.util.Scanner;

public class Banco2 {
    public static void main(String[] args) {
        Conta[] conta = new Conta[10];
        
        Scanner ler = new Scanner(System.in);
        int escolha;
        int x = 0;
        String nome;
        String cpf;
        String nroConta;
        int escolherConta;
        int escolherContaTransf;
        
        
        do{
            if(x == 0){//Se não exitem contar, o usuario é obrigado a criar uma
                System.out.println("Bem Vindo Primeiro Usuario");
                escolha = 1;
            }else{//Caso existam contas
                System.out.println("\nSelecione:\n1:Criar Conta\n2:Depositar\n3:Sacar\n"
                + "4:Transferir(Entre Contas Existentes)\n0: Sair");
                escolha = ler.nextInt();
            }
                        
            switch(escolha){
                case 1://Criar Conta
                    if(x >0){//buffer do teclado
                    ler.nextLine();}
                    //Interface de recolhimento de dados
                    System.out.println("Digite seus Dados:");
                    System.out.print("Nome: ");
                    nome = ler.nextLine();
                    System.out.print("Cpf:");
                    cpf = ler.next();
                    nroConta = ""+x;//nro da conta vira x
                    System.out.println("Numero da Conta:"+nroConta);
                    
                    conta[x] = new Conta(nroConta,nome,cpf);
                    x++;
                    break;
                case 2://Depositar
                    System.out.println("Escolha conta para depositar");
                    escolherConta = ler.nextInt();
                    double valorDep;
                    try{//Peguei no google, não entendi direito, mas ele joga uma exeção para quando for nulo
                        for(int i = 0;i<conta.length;i++){
                            if(conta[escolherConta].verfConta(conta[i].getNroConta())){
                                System.out.println("Digite o Valor de Deposito");
                                valorDep = ler.nextDouble();
                                conta[escolherConta].depositar(valorDep);
                                break;//Para o for
                            }
                        }
                        }catch(NullPointerException e){
                            System.out.println("Essa conta não existe");}
                    break;
                case 3://Sacar
                    System.out.print("Escolha conta de saque:");
                    escolherConta = ler.nextInt();
                    double valorSaq;
                    try{//Peguei no google, não entendi direito, mas ele joga uma exeção para quando for nulo
                        for(int i = 0;i<conta.length;i++){
                            if(conta[escolherConta].verfConta(conta[i].getNroConta())){
                                System.out.print("Digite o Valor de Saque:");
                                valorSaq = ler.nextDouble();
                                conta[escolherConta].depositar(valorSaq);
                                break;//Para o for
                            }
                        }
                    }catch(NullPointerException e){
                            System.out.println("Essa conta não existe");}
                    break;
                case 4://Transferir
                    System.out.print("Escolha sua conta:");
                    escolherConta = ler.nextInt();
                    System.out.print("Escolha conta para transferir:");
                    escolherContaTransf = ler.nextInt();
                    double valorTransf;
                    
                    try{
                        for(int i = 0;i<conta.length;i++){
                            if(conta[escolherConta].verfConta(conta[i].getNroConta())){
                                i = 0;//Reseta o For para outra conta
                                if(conta[escolherContaTransf].verfConta(conta[i].getNroConta())){//Verifica Conta pra onde transferir existe
                                    System.out.print("Digite o Valor de Transf: ");
                                    valorTransf = ler.nextDouble();
                                    conta[escolherConta].transferir(conta[escolherConta], conta[escolherContaTransf], valorTransf);
                                    break;//Para o for
                                }
                            }
                        }
                    }catch(NullPointerException e){
                            System.out.println("Essa conta não existe");}
                    break;
                case 5://Extrato
                    System.out.print("Escolha conta para extrato:");
                    escolherConta = ler.nextInt();
                    try{
                        for(int i = 0;i<conta.length;i++){
                            if(conta[escolherConta].verfConta(conta[i].getNroConta())){
                                System.out.print("Saldo: "+conta[i].getSaldo());
                                System.out.print("Numero da Conta: "+conta[i].getNroConta());
                                break;//Para o for
                            }
                        }
                    }catch(NullPointerException e){
                            System.out.println("Essa conta não existe");}
                    break;
                case 0:
                    System.out.println("Saindo, obrigado por utilizar, volte sempre");
                    break;
                default:
                        System.out.println("Opção Invalida");
                        break;
                    
            }
        }while(escolha != 0);
        
    }
    
}

