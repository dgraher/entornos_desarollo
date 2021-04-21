package Marcianos;

public class Marciano extends Guerrero {
    private static int total = 0;

    Marciano(String soy){
        super(soy);
        total++;
        
    }
    
    public void recibeDisparo(int i){
        if (vivo && blanco == i){
            vivo = false;
            total--;
            System.out.println (soy + "Muerto por disparo num " +i);
        }
    }
    
    public static int getTotal(){
        return total;
    }
    
}
