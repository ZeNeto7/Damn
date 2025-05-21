public class Calendariomain{
    public static void main(String[] args){
        Calendario c = new Calendario(25 ,11 ,2000);
        Calendario d = new Calendario(12 ,6 ,2004);

        c.mostrarData();
        c.anoBissexto();
        d.mostrarData();
        d.anoBissexto();
    }
    
}
