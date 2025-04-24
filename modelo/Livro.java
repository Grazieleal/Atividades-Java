package modelo;

import estoque.EmprestimoException;

public class Livro extends ItemBiblioteca implements Emprestavel {
    private int id;
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("ID: " + id + " | Livro: " + titulo + " | Autor: " + autor + 
                           " | Emprestado: " + (emprestado ? "Sim" : "Não"));
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
