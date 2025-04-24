package modelo;

import Exceção.EmprestimoException;

public class Livro extends ItemBiblioteca implements Emprestavel {
    private String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor) {
        super(titulo);
        this.autor = autor;
        this.emprestado = false;
    }

    public void mostrarDetalhes() {
        System.out.println("Livro: " + titulo + " | Autor: " + autor);
    }

    public void emprestar() throws EmprestimoException {
        if (emprestado) {
            throw new EmprestimoException("Livro já emprestado: " + titulo);
        }
        emprestado = true;
        System.out.println("Livro emprestado com sucesso: " + titulo);
    }

    public void devolver() {
        emprestado = false;
        System.out.println("Livro devolvido: " + titulo);
    }
}