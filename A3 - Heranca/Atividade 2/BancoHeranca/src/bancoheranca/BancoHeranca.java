package bancoheranca;

import java.util.Scanner;

public class BancoHeranca {

    public static void main(String[] args) {
        /*
        Tive imprevistos e ficaram algumas coisas a resolver
        como quando o usuario não digita o tipo certo da variavel
        E eu não tenho certeza se a Conta Especial está com o calculo correto(pq eu n testei nesse codigo)
        ,mas... na logica ta certo e 
        Eu testei a mesma logica em outro codigo e funcionou, então provavelmente deve estar, mas n garanto nada
        E por ultimo, eu n tenho experiencia com ArrayList, então se tiver alguma coisa errada por favor
        Especifique na correção, pq eu fiquei meio perdido algumas horas
        */
        
        ContaCorrente contaC = new ContaCorrente();
        ContaPoupanca contaP = new ContaPoupanca();
        ContaEmpresarial contaEm = new ContaEmpresarial();
        ContaEspecial contaEs = new ContaEspecial();
        
        Scanner ler = new Scanner(System.in);
        
        int escolha;
        int cpf;
        int rg;
        int cnpj;
        String nome;
        String numero;
        double valor;
        int contaUser;
        int contaTransf;
        
        do{
            System.out.println("--------------------");
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
            System.out.println("--------------------");
            
            escolha = ler.nextInt();
            double chequeEspecial;
            int tipoConta;
            
            switch(escolha){
                case 1://Criar Conta Corrente
                    ler.nextLine();
                    System.out.println("Digite Nome");
                    nome = ler.nextLine();
                    System.out.println("Digite cpf");
                    cpf = ler.nextInt();
                    System.out.println("Digite rg");
                    rg = ler.nextInt();
                    System.out.println("Digite Numero");
                    numero = ler.nextLine();
                    
                    PesFisica pFis = new PesFisica(cpf,rg,nome,numero);
                    ContaCorrente cor = new ContaCorrente(contaC.conta.size(),pFis);
                    contaC.conta.add(cor);
                    break;
                case 2://Criar Conta Poupanca
                    System.out.println("Digite Nome");
                    nome = ler.nextLine();
                    System.out.println("Digite cpf");
                    cpf = ler.nextInt();
                    System.out.println("Digite rg");
                    rg = ler.nextInt();
                    System.out.println("Digite Numero");
                    numero = ler.nextLine();
                    
                    PesFisica pFis2 = new PesFisica(cpf,rg,nome,numero);
                    ContaPoupanca pou = new ContaPoupanca(contaP.conta.size(),pFis2);
                    contaP.conta.add(pou);
                    break;
                case 3://Criar Conta Especial
                    System.out.println("Digite Nome");
                    nome = ler.nextLine();
                    System.out.println("Digite cpf");
                    cpf = ler.nextInt();
                    System.out.println("Digite rg");
                    rg = ler.nextInt();
                    System.out.println("Digite Numero");
                    numero = ler.nextLine();
                    
                    PesFisica pFis3 = new PesFisica(cpf,rg,nome,numero);
                    
                    System.out.println("Digite o Valor do Cheque Especial");//Só pra teste, isso ficaria em outro case, e fora desse construtor
                    chequeEspecial = ler.nextDouble();
                    ContaEspecial esp = new ContaEspecial(chequeEspecial,contaEs.conta.size(),pFis3);
                    contaEs.conta.add(esp);
                    break;
                case 4://Criar conta Empresarial
                    System.out.println("Digite Nome");
                    nome = ler.nextLine();
                    System.out.println("Digite cnpj");
                    cnpj = ler.nextInt();
                    System.out.println("Digite Numero");
                    numero = ler.nextLine();
                    
                    PesJuridica pJur = new PesJuridica(cnpj,nome,numero);
                    System.out.println("Digite o Valor do Cheque Especial");//Só pra teste, isso ficaria em outro case, e fora desse construtor
                    chequeEspecial = ler.nextDouble();
                    ContaEmpresarial emp = new ContaEmpresarial(chequeEspecial,contaEm.conta.size(),pJur);
                    contaEm.conta.add(emp);
                    break;
                case 5://Depositar
                    System.out.println("Digite o Valor de Saque");
                    valor = ler.nextDouble();
                    System.out.println("Digite o numero da conta");
                    contaUser = ler.nextInt();
                    
                    contaC.depositar(valor, contaC.conta.get(contaUser));
                    break;
                case 6://Saque
                    System.out.println("Digite o Valor de Saque");
                    valor = ler.nextDouble();
                    System.out.println("Digite o numero da conta");
                    contaUser = ler.nextInt();
                    
                    contaC.sacar(valor, contaC.conta.get(contaUser));
                case 7://Transferencia
                    System.out.println("Digite o Valor de transferencia");
                    valor = ler.nextDouble();
                    System.out.println("Digite a Conta do Usuario");
                    contaUser = ler.nextInt();
                    System.out.println("Digite a Conta para enviar o Dinheiro");
                    contaTransf = ler.nextInt();
                    contaC.transferir(contaC.conta.get(contaUser), contaC.conta.get(contaTransf), valor);
                case 8:
                    System.out.println("Digite a Conta do Usuario");
                    contaUser = ler.nextInt();
                    contaC.dados(contaC.conta.get(contaUser));
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
