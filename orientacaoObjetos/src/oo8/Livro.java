package oo8;
/* Representa um livro da biblioteca.
 * @author Angi
 * @version 18.5.2026
 * Um livro inicia disponível.
 * Quando emprestado, deve ficar indisponível.
 * Quando devolvido, deve voltar a ficar disponível.
 */
public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private int codigo;
    private boolean disponivel;
    public Livro (String titulo, String autor, String genero, int codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.codigo = codigo;
    }
    public String getTitulo() {return titulo;}
    public String getAutor() {return autor;}
    public String getGenero() {return genero;}
    public int getCodigo() {return codigo;}
    public boolean getDisponivel() {return disponivel;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setAutor(String autor) {this.autor = autor;}
    public void setGenero(String genero) {this.genero = genero;}
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public void setDisponivel(boolean disponivel) {this.disponivel = disponivel;}
    public void emprestar() {disponivel=false;}
    public void mostrarLivros() {
        System.out.println("Titulo: " + getTitulo() +
                "\nAutor: " + getAutor() +
                "\nGenero: " + getGenero() +
                "\n");
    }
}
