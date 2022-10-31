package bancoheranca;

import java.util.ArrayList;
import java.util.Scanner;

public class BancoHeranca {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        ArrayList<Conta> conta = new ArrayList();
        
        int escolha;
        int cpf;
        int rg;
        int cnpj;
        String nome;
        String numero;
        double valor;
        int contaUser;
        int contaTransf;
        double chequeEspecial;
        
        do{
            System.out.println("-------------------------");
            System.out.println("Menu:");
            System.out.println("1: Criar nova Conta Corrente");
            System.out.println("2: Criar nova Conta Poupança");
            System.out.println("3: Criar nova Conta Espacial");
            System.out.println("4: Criar nova Conta Empresarial");
            System.out.println("5: Depositar em conta");
            System.out.println("6: Sacar de conta");
            System.out.println("7: Transferir entre contas");
            System.out.println("8: Consultar dados da Conta");
            System.out.println("0: Sair");
            System.out.println("-------------------------");
            
            escolha = ler.nextInt();

            
            switch(escolha){
                case 1://Criar Conta Corrente
                    ler.nextLine();
                    System.out.println("Digite Nome");
                    nome = ler.nextLine();
                    System.out.println("Digite cpf");
                    cpf = ler.nextInt();
                    System.out.println("Digite rg");
                    rg = ler.nextInt();
                    System.out.println("Digite Numero Telefonico");
                    numero = ler.nextLine();
                    ler.next();
                    
                    PesFisica pFis = new PesFisica(cpf,rg,nome,numero);
                    ContaCorrente cor = new ContaCorrente(conta.size(),pFis);
                    conta.add(cor);
                    break;
                    
                case 2://Criar Conta Poupanca
                    ler.nextLine();
                    System.out.println("Digite Nome");
                    nome = ler.nextLine();
                    System.out.println("Digite cpf");
                    cpf = ler.nextInt();
                    System.out.println("Digite rg");
                    rg = ler.nextInt();
                    System.out.println("Digite Numero");
                    numero = ler.nextLine();
                    ler.next();
                    
                    pFis = new PesFisica(cpf,rg,nome,numero);
                    ContaPoupanca pou = new ContaPoupanca(conta.size(),pFis);
                    conta.add(pou);
                    break;
                    
                case 3://Criar Conta Especial
                    ler.nextLine();
                    System.out.println("Digite Nome");
                    nome = ler.nextLine();
                    System.out.println("Digite cpf");
                    cpf = ler.nextInt();
                    System.out.println("Digite rg");
                    rg = ler.nextInt();
                    System.out.println("Digite Numero");
                    numero = ler.nextLine();
                    ler.next();
                    
                    pFis = new PesFisica(cpf,rg,nome,numero);
                    
                    System.out.println("Digite o Valor do Cheque Especial");//Só pra teste, isso ficaria em outro case, e fora desse construtor
                    chequeEspecial = ler.nextDouble();
                    ContaEspecial esp = new ContaEspecial(chequeEspecial,conta.size(),pFis);
                    conta.add(esp);
                    break;
                    
                case 4://Criar conta Empresarial
                    ler.nextLine();
                    System.out.println("Digite Nome");
                    nome = ler.nextLine();
                    System.out.println("Digite cnpj");
                    cnpj = ler.nextInt();
                    System.out.println("Digite Numero");
                    numero = ler.nextLine();
                    ler.next();
                    
                    PesJuridica pJur = new PesJuridica(cnpj,nome,numero);
                    
                    System.out.println("Digite o Valor do Cheque Especial");//Só pra teste, isso ficaria em outro case, e fora desse construtor
                    chequeEspecial = ler.nextDouble();
                    ContaEmpresarial emp = new ContaEmpresarial(chequeEspecial,conta.size(),pJur);
                    conta.add(emp);
                    break;
                    
                case 5://Depositar
                    System.out.println("Digite o Valor de Deposito");
                    valor = ler.nextDouble();
                    System.out.println("Digite o numero da conta");
                    contaUser = ler.nextInt();
                    
                    try{
                        conta.get(contaUser).depositar(valor);
                    }catch(IndexOutOfBoundsException e){
                        System.out.println("Conta Invalida, Impossivel depositar");
                    }
                    break;
                    
                case 6://Saque
                    System.out.println("Digite o Valor de Saque");
                    valor = ler.nextDouble();
                    System.out.println("Digite o numero da conta");
                    contaUser = ler.nextInt();
                    
                    try{
                        conta.get(contaUser).sacar(valor);
                    }catch(IndexOutOfBoundsException e){
                        System.out.println("Conta Invalida, Impossivel sacar");
                    }
                    
                    break;
                    
                case 7://Transferencia
                    System.out.println("Digite o Valor de transferencia");
                    valor = ler.nextDouble();
                    
                    try{
                        System.out.println("Digite a Conta do Usuario");
                        contaUser = ler.nextInt();
                        System.out.println("Digite a Conta para enviar o Dinheiro");
                        contaTransf = ler.nextInt();
                        conta.get(contaUser).transferir(conta.get(contaUser), conta.get(contaTransf), valor);
                    }catch(IndexOutOfBoundsException e){
                        System.out.println("Alguma das contas esta errada, Impossivel transferir");
                    }
                    
                    break;
                    
                case 8://Verificar Dados do Usuario
                    System.out.println("Digite a Conta do Usuario");
                    contaUser = ler.nextInt();
                    
                    if(conta.contains(conta.get(contaUser))){
                        conta.get(contaUser).dados();
                    }else{
                        System.out.println("Conta Invalida");
                    }
                    
                    break;
                    
                case 0:
                    System.out.println("Obrigado por utilizar");
                    break;
                    
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
        }while(escolha != 0);
        
    }
}
