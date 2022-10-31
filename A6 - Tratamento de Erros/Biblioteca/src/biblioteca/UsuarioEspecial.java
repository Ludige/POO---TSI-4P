package biblioteca;

public class UsuarioEspecial extends Usuario{

    public UsuarioEspecial(String nome, int telefone, String email) {
        super(nome, telefone, email, 5, -1);
    }
}