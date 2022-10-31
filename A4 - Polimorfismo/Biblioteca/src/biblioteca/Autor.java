package biblioteca;

public class Autor{
    private String nome;
    private String titulo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor(String nome, String titulo) {
        this.nome = nome;
        this.titulo = titulo;
        System.out.println("Autor adicionado:"+this.nome);
        
    }
    
    //Construtor
    
}
