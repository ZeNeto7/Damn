public class FitasdeVideo{
    private String titulo;
    private double preço;

    public FitasdeVideo(String titulo, double preço){
        this.titulo = titulo;
        this.preço = preço;
    }

    public String getTitulo(){
        return titulo;
    }

    public double getPreço(){
        return preço;
    }

    public double getValorAluguel(int numeroDeDiasAlugada){
        return preço * numeroDeDiasAlugada;
    }

    public String toString(){
        return "o titulo é: " + titulo + "preço do aluguel é: " + preço;
    }
}
