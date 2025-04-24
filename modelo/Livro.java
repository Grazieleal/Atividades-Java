package modelo;

import estoque.EmprestimoException;

public class Livro extends ItemBiblioteca implements Emprestavel {
    private String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor) {
        super(titulo);
        this.autor = autor;
        this.emprestado = false;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Livro: " + titulo + " | Autor: " + autor);
    }

    @Override
    public void emprestar() throws EmprestimoException {
        if (emprestado) {
            throw new EmprestimoException("Livro já emprestado: " + titulo);
        }
        emprestado = true;
        System.out.println("Livro emprestado com sucesso: " + titulo);
    }

    @Override
    public void devolver() {
        emprestado = false;
        System.out.println("Livro devolvido: " + titulo);
    }
}