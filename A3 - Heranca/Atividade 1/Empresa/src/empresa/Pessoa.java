package empresa;

public abstract class Pessoa {//abstract pra não pode cria uma objeto com essa classe sozinha
    private String nome;
    private String idade;
    private String cpf;
    
    public void Envelhecer(){
        this.idade += 1;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setIdade(String idade){
        this.idade = idade;
    }
    
    public String getIdade(){
        return this.idade;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
}
