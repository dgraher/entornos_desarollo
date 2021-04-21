package Marcianos;

public class Guerra {
    private Nave nave1, nave2;

    public Guerra(){
        nave1 = new Nave("Terricolas");
        nave2 = new Nave("Marcianos");
        empiezaGuerra();
    }
    
    public void empiezaGuerra(){
        do{    
            for(int i = 0; i<10;i++){
                nave2.recibeDisparo(nave1.generaDisparo(i));
                nave1.recibeDisparo(nave2.generaDisparo(i));
            }
        }while(nave1.cuantosQuedan()>0&&nave2.cuantosQuedan()>0);
        if(nave1.cuantosQuedan()>0){
            System.out.println("GANARON LOS TERRICOLAS!!!!!");
        }
        else if (nave2.cuantosQuedan()>0){
            System.out.println("GANARON LOS MARCIANOS");
        }
    }
    public static void main(String[] args){
        new Guerra();
    }
    
}