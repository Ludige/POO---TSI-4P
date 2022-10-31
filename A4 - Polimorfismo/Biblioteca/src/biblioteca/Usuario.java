package biblioteca;

import java.util.Calendar;

public class Usuario{
    private String nome;
    private int telefone;
    private String email; //Existe tipo de dado pra email? tipo Mail,ou sei la? procurei e n achei
    private int Cpf;
    private boolean userSpecial;
    //Emprestimo
    private int limiteUser;
    private int limiteEmprestimo;
    private int qtdEmprestimo;
    private int diaEmp;
    private int diaDev;
    private int devDefinitiva;
    private Calendar dia;
    
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

    public int getCpf() {
        return Cpf;
    }

    public void setCpf(int Cpf) {
        this.Cpf = Cpf;
    }

    public boolean isUserSpecial() {
        return userSpecial;
    }

    public void setUserSpecial(boolean userSpecial) {
        this.userSpecial = userSpecial;
    }

    public int getQtdEmprestimo() {
        return limiteEmprestimo;
    }

    public void setQtdEmprestimo(int qtdEmprestimo) {
        if(!userSpecial){
            this.limiteEmprestimo = 3;}
    }

    public int getDiaEmp() {
        return diaEmp;
    }

    public void setDiaEmp(int diaEmp) {
        this.diaEmp = diaEmp;
    }

    public int getDiaDev() {
        return diaDev;
    }

    public void setDiaDev(int diaDev) {
        this.diaDev = diaDev;
    }

    public Calendar getDia() {
        return dia;
    }

    public void setDia(Calendar dia) {
        this.dia = dia;
    }

    public int getDevDefinitiva() {
        return devDefinitiva;
    }

    public void setDevDefinitiva(int devDefinitiva) {
        this.devDefinitiva = devDefinitiva;
    }

    public int getLimiteUser() {
        return limiteUser;
    }

    public void setLimiteUser(){
         if(isUserSpecial()){
            this.limiteUser = 5;
         }else{
            this.limiteUser = 3;
         }
    }
    
    //Metodos
    public boolean emprestimo(Publications pub){
        if(pub.isEmprestado()){
            System.out.println("Publication indisponivel");
            return false;
            }
        else if(!userSpecial && this.qtdEmprestimo <= this.limiteEmprestimo || userSpecial) {//Tentando usar Calendar, se tiver errado me informe
            setDiaEmp(getDia().DATE);//Data do dia de emprestimo
            setDiaDev(getDiaEmp() + 7);//Uma semana pra devolução
            
            if(isUserSpecial()){//Limite de renovar a publicação
                pub.setLimiteRenov(5);}
            else{
                pub.setLimiteRenov(3);
        }
            pub.setNroRen(0);
            this.qtdEmprestimo--;
            System.out.println("Emprestado:"+pub.getTitulo());
            pub.setEmprestado(true);//Deixa indisponivel
            return true;
        }
        return pub.isEmprestado();
    }
    
    public void devolution(Publications pub){
        if(getDia().DATE <= getDiaDev()){//Dia de devolução menor que o dia atual
            setDevDefinitiva(getDiaDev());
            pub.setEmprestado(false);
            calcMulta(pub);
            this.qtdEmprestimo++;
            System.out.println("Livro devolvido:"+pub.getTitulo());
            if(pub.getMultaTotal() > 0){
            System.out.println("Multa: "+pub.getMultaTotal());}
            else{
                System.out.println("Sem multas");
            }
            
        }else{//Data ja passou
            renovar(pub);
        }
    }
    
    public void renovar(Publications pub){
        if(pub.getLimiteRenov() > 0){
            pub.setLimiteRenov(pub.getLimiteRenov() - 1);
            pub.setNroRen(pub.getNroRen()+1); 
            System.out.println("Renovado:"+pub.getTitulo());
        }else{
            System.out.println("Impossivel renovar:"+pub.getTitulo());
        }
    }
    
    public double calcMulta(Publications pub){
        //Se n renovar, n tem multa de renovação e.e
        pub.setMultaTotal((pub.getNroRen() - limiteUser)* pub.getMulta());
        return pub.getMultaTotal();
    }
    
    //Construtores

    public Usuario(String nome, int telefone, String email, int Cpf, boolean userSpecial) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.Cpf = Cpf;
        this.userSpecial = userSpecial;
        System.out.println("Usuario Adicionado:"+this.nome);
    }

    public Usuario() {
        //Vazio
    }
    
    
    
}
