package empresa;

import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Horista[] horista = new Horista[100];
        Assalariado[] assalariado = new Assalariado[100];
        
        int escolha;
        double salarioFixo;
        int horasSemanais;
        double salarioHoraExtra;
        float qtdHorasExtra;
        double salarioPorHora;
        float horasTrabalhadas;
        String nome;
        String idade;
        String cpf;
        int h = 0;//Controle dos Vetores;
        int numFunc;
                
        do{
            System.out.println("--------------------");
            System.out.println("\tEscolha:");
            System.out.println("1:Registrar Funcionario Horista");
            System.out.println("2:Registrar Funcionario Assalariado");
            System.out.println("3:Mostrar Dados de Funcionario Horista");
            System.out.println("4:Mostrar Dados de Funcionario Assalariado");
            System.out.println("0:Sair");
            System.out.println("--------------------");
            escolha = ler.nextInt();
            if(h <= 100){
                switch(escolha){
                    case 1://Horista
                        ler.nextLine();//Buffer Teclado
                        System.out.println("Digite nome:");
                        nome = ler.nextLine();
                        System.out.println("Digite idade:");
                        idade = ler.nextLine();
                        System.out.println("Digite cpf:");
                        cpf = ler.nextLine();
                        System.out.println("Digite o Salario por Horas:");
                        salarioPorHora = ler.nextDouble();
                        //Não deveria ser colocado no registro, mas coloquei apenas pelo bem do teste
                        System.out.println("Digite o Total de Horas Trabahadas:");
                        horasTrabalhadas = ler.nextFloat();
                        horista[h] = new Horista(nome,idade,cpf,salarioPorHora,horasTrabalhadas,h);
                        System.out.println("Horista registrado, Numero do Funcionario:"+h);
                        h++;
                        break;
                    case 2://Assalariado
                        ler.nextLine();//Buffer teclado
                        System.out.println("Digite nome:");
                        nome = ler.nextLine();
                        System.out.println("Digite idade:");
                        idade = ler.nextLine();
                        System.out.println("Digite cpf:");
                        cpf = ler.nextLine();
                        System.out.println("Digite o Salario Fixo");
                        salarioFixo = ler.nextDouble();
                        System.out.println("Digite o Total de Horas semanais");
                        horasSemanais = ler.nextInt();
                        //Tbm Não deveria ser colocado no registro, mas coloquei apenas pelo bem do teste
                        System.out.println("Digite o Total de Horas extras");
                        qtdHorasExtra = ler.nextFloat();
                        //podia ter evitado uma variavel se usasse a mesma do Total de horas aqui na main
                        assalariado[h] = new Assalariado(nome,idade,cpf,salarioFixo,horasSemanais,qtdHorasExtra,h);
                        System.out.println("Assalariado registrado, Numero do Funcionario:"+h);
                        h++;
                        break;
                    case 3://Horista
                        if(h > 0){
                            System.out.println("Escolha numero do Funcionario");
                            numFunc = ler.nextInt();
                            try{
                                for(int i = 0;i<horista.length;i++){
                                    if(numFunc == horista[i].getCodigoFunc()){
                                        horista[numFunc].MostrarDados();
                                        break;
                                    }
                                }
                            }catch(NullPointerException e){
                                    System.out.println("Funcionario não encontrado");}
                        }else{
                            System.out.println("Nenhum Funcionario Registrado");
                        }
                        break;
                    case 4://Assalariado
                        if(h > 0){
                            System.out.println("Escolha numero do Funcionario");
                            numFunc = ler.nextInt();
                            try{
                                for(int i = 0;i<assalariado.length;i++){
                                    if(numFunc == assalariado[i].getCodigoFunc()){
                                        assalariado[numFunc].MostrarDados();
                                        break;
                                    }
                                }
                            }catch(NullPointerException e){
                                System.out.println("Funcionario não encontrado");}

                        }else{
                            System.out.println("Nenhum Funcionaro Registrado");}
                        break;
                    case 0:
                        System.out.println("Saindo, obrigado por utilizar");
                        break;
                    default:
                        System.out.println("Opcao invalida");
                        break;
                }
            }else{//h > 100
                System.out.println("Não é possivel contratar mais funcionarios");
            }
        }while(escolha != 0);
    }
}
