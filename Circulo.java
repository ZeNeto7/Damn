public class Circulo {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }
    
    public double calcularArea(){
       return 3.141516 * raio * raio;
    }

    public double calcularPerimetro(){
       return 2 * 3.141516 * raio;
    }
    
    public void Imprimir(){
        System.out.printf("Raio %2f, Area %2f, Perimetro: %2f \n", raio, calcularArea(), calcularPerimetro());
    }
}
