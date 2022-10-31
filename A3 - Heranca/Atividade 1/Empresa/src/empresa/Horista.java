package empresa;

public class Horista extends Funcionario{
    private double salarioPorHora;
    private float horasTrabalhadas;
    //GSetter
    public void setSalarioPorHora(double salarioPorHora){
        this.salarioPorHora = salarioPorHora;
    }
    
    public double getSalarioPorHora(){
        return salarioPorHora;
    }

    public void setHoraTrabalhada(float horaTrabalhada){
        this.horasTrabalhadas = horaTrabalhada;
    }
    
    public float getHoraTrabalhada(){
        return horasTrabalhadas;
    }
    //metodos   
    public void calcularSalario(){
        setSalarioTotal(this.horasTrabalhadas * this.salarioPorHora);
    }
    
    public void MostrarDados(){
        System.out.println(this.getNome());
        System.out.println(this.getIdade());
        System.out.println(this.getCpf());
        calcularSalario();
        System.out.println(this.getSalarioTotal());
    }
    
    //Construtores
    public Horista(){
        System.out.println("Vazio, igual a vida");
    }

    public Horista(String nome,String idade,String cpf,double salarioPorHora, float horasTrabalhadas,int posicao){
        this.setNome(nome);
        this.setIdade(idade);
        this.setCpf(cpf);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.setCodigoFunc(posicao);
    }
    
    
}
