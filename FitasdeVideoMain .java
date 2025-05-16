public FitasdeVideoMain{
    public static void main(String[] args){
        FitasdeVideo fdv1 = new FitasdeVideo("Tak Jaken", 15.00);
        FitasdeVideo fdv2 = new FitasdeVideo("As crônicas de GBA", 37.10);
        FitasdeVideo fdv3 = new FitasdeVideos("Gigante de Aço 2", 20.00);

        System.out.println("FitasdeVideo: ");
        System.out.println(fdv1);
        System.out.println(fdv2);
        System.out.println(fdv3);

        System.out.println("Aluguel R$: ");
        System.out.println(fdv1.getTitulo() + ": aluguel: " + fv1.getValorAluguel(3));
        System.out.println(fdv2.getTitulo() + ": aluguel: " + fv2.getValorAluguel(2));
        System.out.println(fdv3.getTitulo() + ": aluguel: " + fv3.getValorAluguel(3));
    
    }
    
}
