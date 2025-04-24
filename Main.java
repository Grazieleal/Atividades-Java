import estoque.EmprestimoException;
import modelo.Livro;
import modelo.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(1, "Mariazinha");
        Livro livro = new Livro(101, "Java para coitados", "Graziele A.");

        usuario.mostrarDados();
        livro.mostrarDetalhes();

        try {
            livro.emprestar();
            livro.emprestar();
        } catch (EmprestimoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        livro.devolver();
        livro.mostrarDetalhes();
    }
}
