package br.com.etecia.testerecyclevie;

public class ObjetoModelo {
    private String titulo;
    private int imagem;

    public ObjetoModelo(String titulo, int imagem) {
        this.titulo = titulo;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
