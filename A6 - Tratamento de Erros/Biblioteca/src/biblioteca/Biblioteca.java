package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereço;
    private ArrayList<Publicacoes> publicacoes;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Emprestimo> emprestimos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public ArrayList<Publicacoes> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(ArrayList<Publicacoes> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
    
    //Metodos
    public boolean addPublicacao(Publicacoes pub){
        this.publicacoes.add(pub);
        return true;
    }
    
    public boolean removePublicacao(Publicacoes pub){
        this.publicacoes.remove(pub);
        return true;
    }
    
    public Publicacoes buscarPublicacao(String titulo){
        for(Publicacoes pub : this.publicacoes){
            if(pub.getTitulo().equals(titulo)){
                return pub;
            }else{
                System.out.println("Publicacao não encontrada");}
        }
        return null;
    }
    
    public boolean addUsuario(Usuario usuario){
        this.usuarios.add(usuario);
        return true;
    }
    
    public boolean removeUsuario(Usuario usuario){
        this.usuarios.remove(usuario);
        return true;
    }
    
    public Usuario buscarUsuario(String nome){
        for(Usuario usuario:this.usuarios){//Entendi como funciona, não entendi a logica de fazer
            if(usuario.getNome().equals(nome)){
                return usuario;
            }else{
                System.out.println("Usuario não encontrada");
            }
        }
        return null;
    }
    
    public boolean addEmprestimo(Emprestimo emp){
        emp.emprestarPub();
        this.emprestimos.add(emp);
        return true;
    }
    
    public boolean removeEmprestimo(Emprestimo emp){
        emp.devolverPub();
        this.emprestimos.remove(emp);
        return true;
    }
    
    public Emprestimo buscarEmprestimo(int id){
        for(Emprestimo emprestimo:this.emprestimos){
            if(emprestimo.getId() == id){
                return emprestimo;
            }
        }
        return null;
    }
    //Construtores

    public Biblioteca(String nome, String endereço) {
        this.nome = nome;
        this.endereço = endereço;
    }
}
