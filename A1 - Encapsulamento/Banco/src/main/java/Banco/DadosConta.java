package Banco;

public class DadosConta {
    private String nome;
    private Integer chaveConta;
    private Integer idade;
    private Integer cpf;
    private float dinheiro = 0;
        
    public void setNome(String nome){
        this.nome = nome;}
    
    public void setChave(Integer chaveConta){
        this.chaveConta = chaveConta;}
    
    public void setIdade(Integer idade){
        this.idade = idade;}
    
    public void setCpf(Integer cpf){
        this.cpf = cpf;}
    
    public void setDinheiro(float dinheiro){
        this.dinheiro = dinheiro;}
    
    public String getNome(){
        return this.nome;}
    
    public Integer getChave(){
        return this.chaveConta;}
    
    public Integer getIdade(){
        return this.idade;}
    
    public Integer getCpf(){
        return this.cpf;}
    
    public float getDinheiro(){
        return this.dinheiro;}
    
}
