package biblioteca;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        ArrayList<Publicacoes> publicacao = new ArrayList<>();
        ArrayList<Usuario> usuario = new ArrayList<>();
        ArrayList<Autor> autores = new ArrayList<>();
            
        int escolha;
        //Biblioteca
        String nomeBib;
        String endereco;
        //Autor
        String nome;
        String titulo;
        //Artigo
        String tituloObra;
        double multa;
        double baseAtraso;
        //Livro
        String nroEdt;
        String editora;
        int isbn;
        //Tese
        int nroPag;
        String dataDef;
        String institution;
        String resumo;
        //Usuario
        int telefone;
        String email;
        int escolhaUser;
        String escolhaNomeUsuario;
        String escolhaTituloPublicacao;
        
        //
        System.out.println("Criação da Biblioteca:");
        System.out.println("Digite o nome da Biblioteca:");
        nomeBib = ler.nextLine();
        System.out.println("Digite o endereco:");
        endereco = ler.nextLine();
        Biblioteca bib = new Biblioteca(nomeBib, endereco);
        System.out.println("Biblioteca inaugurada");
        
        do{
            System.out.println("-------------------------");
            System.out.println("\t =-MENU-=");
            System.out.println("1: Registrar Autor");
            //Publicacao
            System.out.println("2: Registrar Publicacao na biblioteca");
            if(!publicacao.isEmpty()){//não vazia
            System.out.println("3: Remover Publicacao da biblioteca");
            System.out.println("4: Buscar Publicacao na biblioteca");
            }
            //Usuario
            System.out.println("5: Registrar Usuario na biblioteca");
            if(!usuario.isEmpty()){
            System.out.println("6: Remover Usuario da biblioteca");
            System.out.println("7: Buscar Usuario na biblioteca");
            }
            //Emprestimo
            if(!publicacao.isEmpty() && !usuario.isEmpty()){
                System.out.println("8: Emprestar Publicacao");
                System.out.println("9: Buscar Emprestimo");
                System.out.println("10: Devolver Publicacao");
            }
            System.out.println("0: Sair");
            System.out.println("-------------------------");
            try{
                escolha = ler.nextInt();
            }catch(InputMismatchException e){
                ler.nextLine();
                escolha = ler.nextInt();
                System.out.println("Tipo de dado invalido");
            }
            
            switch(escolha){
                case 1://Adicionar Autores
                    ler.nextLine();
                    System.out.println("Digite o nome do autor:");
                    nome = ler.nextLine();
                    System.out.println("Digite o titulo do autor:");
                    titulo = ler.nextLine();
                    Autor autor = new Autor(nome,titulo);
                    autores.add(autor);
                    break;
                case 2://Registrar Publicacao
                    int escolhaTese;
                    try{
                        System.out.println("Escolher tipo de publicacao");
                        System.out.println("1: Livro");
                        System.out.println("2: Tese");
                        System.out.println("3: Artigo");
                        escolhaTese = ler.nextInt();

                        ler.nextLine();
                        System.out.println("Digite o Titulo da Obra");
                        tituloObra = ler.nextLine();
                        System.out.println("Digite o valor da multa");
                        multa = ler.nextDouble();
                        System.out.println("Digite o valor base da multa de atraso");
                        baseAtraso = ler.nextDouble();
                    }catch(InputMismatchException e){
                        System.out.println("Tipo de Dado invalido");
                        break;
                    }
                    
                    switch(escolhaTese){
                        case 1://Livro
                            try{
                                ler.nextLine();
                                System.out.println("Digite o nome da Editora:");
                                editora = ler.nextLine();
                                System.out.println("Digite o numero da editora:");
                                nroEdt = ler.nextLine();
                                System.out.println("Digite o isbn:");
                                isbn = ler.nextInt();
                                Livro livro = new Livro(nroEdt,editora,isbn,tituloObra,multa,baseAtraso);
                                publicacao.add(livro);
                                break;
                            }catch(InputMismatchException e){
                                System.out.println("Tipo de Dado errado");}
                        case 2://Tese
                            try{
                                System.out.println("Digite o numero de Paginas:");
                                nroPag = ler.nextInt();
                                System.out.println("Digite a data de defesa:");
                                dataDef = ler.nextLine();
                                System.out.println("Digite o nome da instituicao:");
                                institution = ler.nextLine();
                                System.out.println("Digite o resumo:");
                                resumo = ler.nextLine();
                                Tese tese = new Tese(nroPag,dataDef,institution,resumo,tituloObra,multa,baseAtraso);
                                publicacao.add(tese);
                                break;
                            }catch(InputMismatchException e){
                                System.out.println("Tipo de Dado errado");}
                        case 3://Artigo
                            try{
                                System.out.println("Digite o Resumo");
                                resumo = ler.nextLine();
                                Artigo artg = new Artigo(resumo,tituloObra,multa,baseAtraso);
                                publicacao.add(artg);
                                break;
                            }catch(InputMismatchException e){
                                System.out.println("Tipo de Dado errado");}
                    }
                    break;
                case 3://Remover Pub
                    int escolhaPub;
                    if(!publicacao.isEmpty()){
                        System.out.println("Escolha a publicacão para excluir");
                        int i;
                        for(i = 0;i < publicacao.size();i++){
                            System.out.println(i+": "+publicacao.get(i).getTitulo());
                        }
                        try{
                            System.out.println("Escolha: ");
                            escolhaPub = ler.nextInt();
                        }catch(InputMismatchException e){
                            System.out.println("Tipo de dado incorreto");}
                        //
                        try{
                            bib.removePublicacao(publicacao.get(i));
                        }catch(IndexOutOfBoundsException e){
                            System.out.println("Publicacao inexistente");
                        }
                        break;
                    }else{
                        System.out.println("Comando invalido");
                        break;
                    }
                case 4://Buscar Publicacao
                    if(!publicacao.isEmpty()){
                        try{
                            System.out.println("Digite o titulo da publicacao:");
                            tituloObra = ler.nextLine();
                            bib.buscarPublicacao(tituloObra);
                            break;
                        }catch(InputMismatchException e){
                            System.out.println("Tipo de dado invalido");}
                    }else{
                        System.out.println("Comando invalido");
                        break;
                    }
                case 5://Registrar usuario
                    try{
                        System.out.println("Digite o nome do Usuario:");
                        nome = ler.nextLine();
                        System.out.println("Digite o numero de telefone:");
                        telefone = ler.nextInt();
                        System.out.println("Digite o email");
                        email = ler.nextLine();
                        System.out.println("Escolha o tipo de usuario");
                        System.out.println("1: Usuario Especial");
                        System.out.println("Outro numero: Usuario Normal");
                        escolhaUser = ler.nextInt();

                        if(escolhaUser == 1){
                            UsuarioEspecial user = new UsuarioEspecial(nome, telefone, email);
                            usuario.add(user);//Por motivos de preguiça de refazer uma parte do codigo pq eu n percebi que biblioteca ja tinha a array de Usuarios
                            bib.addUsuario(user);
                        }else{
                            UsuarioNormal user = new UsuarioNormal(nome, telefone, email);
                            usuario.add(user);
                            bib.addUsuario(user);
                        }
                        break;
                    }catch(InputMismatchException e){
                        System.out.println("Tipo de dado invalido");
                    }
                case 6://Remover Usuario
                    if(!usuario.isEmpty()){
                        System.out.println("Escolha o Usuario para excluir");
                        int i;
                        for(i = 0;i < usuario.size();i++){
                            System.out.println(i+": "+usuario.get(i).getNome());
                        }
                        try{
                            System.out.println("Escolha: ");
                            escolhaUser = ler.nextInt();
                        }catch(InputMismatchException e){
                            System.out.println("Tipo de dado invalido");
                        }
                        //
                        try{
                            bib.removeUsuario(usuario.get(i));
                        }catch(IndexOutOfBoundsException e){
                            System.out.println("Usuario nao encontrado");
                        }
                        break;
                    }else{
                        System.out.println("Comando invalido");
                        break;
                    }
                    
                case 7://Buscar Usuario
                    if(!usuario.isEmpty()){
                        try{
                            System.out.println("Digite o nome do Usuario:");
                            nome = ler.nextLine();
                            try{
                                bib.buscarUsuario(nome);
                            }catch(IndexOutOfBoundsException e){
                                System.out.println("Usuario não encontrado");
                            }
                        }catch(InputMismatchException e){
                            System.out.println("Tipo de dado invalido");}
                        
                        break;
                    }else{
                        System.out.println("Comando invalido");
                        break;
                    }
                case 8://Emprestar Publicacao
                    if(!usuario.isEmpty() && !publicacao.isEmpty()){
                        try{
                            System.out.println("Escolha um usuario (nome)");
                            escolhaNomeUsuario = ler.nextLine();
                            System.out.println("Escolha uma Publicacao (titulo)");
                            escolhaTituloPublicacao = ler.nextLine();

                            try{
                                Emprestimo emprestimo = new Emprestimo(bib.buscarUsuario(escolhaNomeUsuario), bib.buscarPublicacao(escolhaTituloPublicacao));
                                bib.addEmprestimo(emprestimo);
                            }catch(IndexOutOfBoundsException e){
                                System.out.println("Publicacao ou Usuario incorretos");
                            }
                        }catch(InputMismatchException e){
                            System.out.println("Tipo de dado invalido");
                        }
                    }else{
                        System.out.println("Comando invalido");
                        break;
                    }
                    break;
                case 9://Buscar
                    if(!usuario.isEmpty() && !publicacao.isEmpty()){
                        try{
                            System.out.println("Digite o id do Emprestimo");
                            escolhaUser = ler.nextInt();
                            try{
                                bib.buscarEmprestimo(escolhaUser);
                            }catch(IndexOutOfBoundsException e){
                                System.out.println("Publicacao nao existente");
                            }
                        }catch(InputMismatchException e){
                            System.out.println("Tipo de dado invalido");}
                    }else{
                        System.out.println("Comando invalido");
                        break;
                    }
                    break;
                case 10://Devolver Publicacao
                    if(!usuario.isEmpty() && !publicacao.isEmpty()){
                        try{
                            System.out.println("Digite a ID do emprestimo: ");
                            escolhaUser = ler.nextInt();
                            try{
                                bib.removeEmprestimo(bib.buscarEmprestimo(escolhaUser));
                            }catch(IndexOutOfBoundsException e){
                                System.out.println("Emprestimo não encontrado");}
                            
                        }catch(InputMismatchException e){
                            System.out.println("Tipo de dado invalido");
                        }
                    }else{
                        System.out.println("Comando invalido");
                        break;
                    }
                    break;
                case 11:
                    break;
                case 0:
                    System.out.println("Saindo, Obrigado por utilizar");
                    break;
                default:
                    System.out.println("Comando invalido");
                    break;
            }
        }while(escolha != 0);
    }
}
