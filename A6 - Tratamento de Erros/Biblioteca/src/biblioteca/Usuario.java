package biblioteca;

import java.util.Calendar;

public abstract class Usuario{
    private String nome;
    private int telefone;
    private String email;
    private int limiteEmprestimos;
    private int limiteRenov;
    private int qtdEmprestimos;
    
    //Metodos

    //Construtores

    public Usuario(String nome, int telefone, String email, int limiteEmprestimos, int limiteRenov) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.limiteRenov = limiteRenov;
        this.limiteEmprestimos = limiteEmprestimos;
        this.qtdEmprestimos = 0;
    }

    //Metodos
    public boolean fazerEmprestimo(){
        if(this.qtdEmprestimos < this.limiteEmprestimos 
        || this.limiteEmprestimos == -1){
            this.qtdEmprestimos++;
            return true;
        }
        return false;
    }
    
    public boolean devolverEmp(){
        this.qtdEmprestimos--;
        return true;
    }
    //GSetters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLimiteEmprestimos() {
        return limiteEmprestimos;
    }

    public void setLimiteEmprestimos(int limiteEmprestimos) {
        this.limiteEmprestimos = limiteEmprestimos;
    }

    public int getLimiteRenov() {
        return limiteRenov;
    }

    public void setLimiteRenov(int limiteRenov) {
        this.limiteRenov = limiteRenov;
    }

    public int getQtdEmprestimos() {
        return qtdEmprestimos;
    }

    public void setQtdEmprestimos(int qtdEmprestimos) {
        this.qtdEmprestimos = qtdEmprestimos;
    }
    
    
}
