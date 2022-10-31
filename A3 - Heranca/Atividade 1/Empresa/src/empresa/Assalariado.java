package empresa;

public class Assalariado extends Funcionario{
    private float qtdHorasExtra;
    private double salarioFixo;
    private double salarioHoraExtra;
    private int horasSemanais;
    
    //GSetter
    public void setQtdHorasExtra(float qtdHorasExtra){
        this.qtdHorasExtra = qtdHorasExtra;
    }
    
    public float getQtdHorasExtra(){
        return qtdHorasExtra;
    }
    
    public void setHorasSemanais(int horasSemanais){
        this.horasSemanais = horasSemanais;
    }
    
    public int getHorasSemanais(){
        return horasSemanais;
    }
    
    public void setSalarioFixo(double salarioFixo){
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo(){
        return salarioFixo;
    }

    public double getSalarioHoraExtra() {
        return salarioHoraExtra;
    }

    public void setSalarioHoraExtra(double salarioHoraExtra) {
        this.salarioHoraExtra = salarioHoraExtra;
    }
    
    //Metodos
    public void calcularHoraExtra(){
        double valorHora = this.salarioFixo / (this.horasSemanais*5);
        double valorHoraExtra = valorHora + (valorHora * 0.5);
        this.salarioHoraExtra = valorHoraExtra * this.qtdHorasExtra;
    }
        
    
    public double calcularSalario(){
        return this.salarioFixo + this.salarioHoraExtra;
    }
    
    public void MostrarDados(){
        System.out.println(this.getNome());
        System.out.println(this.getIdade());
        System.out.println(this.getCpf());
        System.out.println(this.salarioFixo);
        calcularSalario();
        System.out.println(this.getSalarioTotal());
    }
    //Construtores

    public Assalariado() {
        System.out.println("Vazio");
    }

    public Assalariado(String nome,String idade,String cpf,double salarioFixo, int horasSemanais, double salarioHoraExtra,int posicao) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setCpf(cpf);
        this.qtdHorasExtra = 0;//Evitar ponteiro null para horas extras
        this.salarioFixo = salarioFixo;
        this.horasSemanais = horasSemanais;
        this.setCodigoFunc(posicao);
    }

    public Assalariado(String nome,String idade,String cpf,double salarioFixo, int horasSemanais,float qtdHorasExtra,int posicao) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setCpf(cpf);
        this.qtdHorasExtra = qtdHorasExtra;
        this.salarioFixo = salarioFixo;
        this.horasSemanais = horasSemanais;
        this.setCodigoFunc(posicao);
    }
    
    
}
