package Marcianos;

public class Terricola extends Guerrero {
    private static int total = 0;

    Terricola(String soy){
        super(soy);
        total++;
    }

    public void recibeDisparo(int i){
        if (vivo && blanco == i){
            vivo = false;
            total--;
            System.out.println (soy + " Muerto por disparo n " +i);
        }
    }
    
    public static int getTotal(){
        return total;
    }
  

}

