package modelo;

public abstract class ItemBiblioteca {
    protected String titulo;

    public ItemBiblioteca() {
    
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract void mostrarDetalhes();
}