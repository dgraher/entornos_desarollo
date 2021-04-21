package Marcianos;
public abstract class Guerrero {

    protected int blanco;
    protected boolean vivo;
    protected final String soy;
    
    public Guerrero (String soy){
        blanco = generaBlanco();
        this.soy = soy;
        this.vivo = true;
    }
    
    public int dispara (){
        if (vivo){
            int disparo = ((int)(Math.random()*10));
            System.out.println(soy + "Dispara num " +disparo);
            return  disparo;
        }
        else 
        return 100;
    }

    public int getBlanco(){
        return blanco;
    }
    
    private int generaBlanco (){
        return ((int)(Math.random()*10));
    }
    
}
    