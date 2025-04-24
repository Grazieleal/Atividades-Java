import Exceção.EmprestimoException;
import modelo.Livro;
import modelo.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Maria");
        Livro livro1 = new Livro("Java para Coitados", "Graziele Silva");

        try {
            System.out.println("Usuário: " + usuario.getNome());
            livro1.mostrarDetalhes();
            livro1.emprestar();
            livro1.emprestar(); 
        } catch (EmprestimoException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            livro1.devolver();
        }
    }
}