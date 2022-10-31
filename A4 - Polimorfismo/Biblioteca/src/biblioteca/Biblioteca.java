package biblioteca;

import java.util.Calendar;

public class Biblioteca {
    public static void main(String[] args) {
        Calendar data = Calendar.getInstance();
        Autor autorA = new Autor("Cereza","Mestre");//sim
        Autor autorB = new Autor("Jeanne","Doutor");
        
        System.out.println("");
        
        Artigo art1 = new Artigo("Esse texto é claramente um resumo","Claramente o Titulo",10.5,autorA);
        Artigo art2 = new Artigo("Fly me to the moon","And let me play among the stars",1.5,autorB);
        Tese tes1 = new Tese(250,data,"Pixar Studio de Animacao","Filme Shrek em 60 segundos","Shrek 3 é ruim",5.2,autorA);
        Tese tes2 = new Tese(250,data,"Parsley, Sage, Rosemary e Thyme","Scarborough Tese","Salsa,Salvia,Alecrim e Tomilho",6.66,autorB);
        Livro liv1 = new Livro("100.58.47","Bottle",74540540,"I see it",8.21,autorB);
        Livro liv2 = new Livro("100.48.47","Bottle",745540548,"I want it",8.81,autorA);
        
        System.out.println("");
        
        Usuario user1 = new Usuario("Luka", 92928282, "babidi@gmail.com", 7854, false);
        Usuario user2 = new Usuario("Rodin", 92987852, "hellgate@gmail.com", 78554, true);
        
        System.out.println("");
        
        user1.emprestimo(art1);
        
        user1.renovar(art1);
        user1.renovar(art1);
        user1.renovar(art1);
        user1.renovar(art1);
        
        System.out.println("");
        user2.emprestimo(art1);
        System.out.println("");
        
        user1.devolution(art1);
        
        System.out.println("");
        
        user2.emprestimo(art1);
        user2.emprestimo(art2);
        user2.emprestimo(tes1);
        user2.emprestimo(tes2);
        
        user2.renovar(art2);
        
        user2.devolution(art1);
        user2.devolution(art2);
        user2.devolution(tes1);
        user2.devolution(tes2);
   }
}
