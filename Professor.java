public class Professor {
    private int matricula;
    private String nomedoProfessor;
    private String nomedoDepartamento;

    public Professor(int matricula, String nomedoProfessor, String nomedoDepartamento){
        this.matricula = matricula;
        this.nomedoProfessor = nomedoProfessor;
        this.nomedoDepartamento = nomedoDepartamento;
    }

    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getNomedoProfessor(){
        return nomedoProfessor;
    }
    public void setNomedoProfessor(String nomedoProfessor){
        this.nomedoProfessor = nomedoProfessor;
    }

    public String getNomedoDepartamento(){
        return nomedoDepartamento;
    }
    public void setNomedoDepartamento(String nomedoDepartamento){
        this.nomedoDepartamento = nomedoDepartamento;
    }
    
    public void imprimir(){
        System.out.println("Professor: " + nomedoProfessor + "Matricula" + matricula + "Departamento" + nomedoDepartamento);
    }
    
}
