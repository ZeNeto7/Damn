public class FuncionarioMain {
    public static void main(String[] args){
        Funcionario f = new Funcionario("007", "Jonh Paul", "167.238.532-03", "João Pessoa", "(83) 4002-8922", "32", "40, 3456.789");

        System.out.printfl("Dados iniciais do funcionário: ");
        System.out.printfl(f);

        f.setSalaraio(1324.00);

        System.out.printfl("\nNovos dados do funcionário: ");
        System.out.printfl(f);
        System.out.printfl("Salário líquido  R$ %.2f\n", f.calculaSalarioLiquido());
    }
    
}
