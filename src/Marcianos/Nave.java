package Marcianos;

public class Nave extends Efectivo {

    public Nave (String somos){
        this.somos = somos;
        for (int i = 0; i<10; i++){
            if (somos.equals("Terricolas")){
                tripulacion [i] = new Terricola(somos);
            }
            else{
                tripulacion [i] = new Marciano(somos);
                
            }
        }
        System.out.println("Creada nave de " + somos);
    }
    
    public void recibeDisparo(int i){
        for (int j=0; j<10;j++){
            if (somos.equals("Terricolas")){
                ((Terricola)(tripulacion[j])).recibeDisparo(i);
            }
            else{
                ((Marciano)(tripulacion[j])).recibeDisparo(i);
            
            }
            
        }
    }
    
    public int generaDisparo(int i){
        return tripulacion[i].dispara();
    }
    
    
}