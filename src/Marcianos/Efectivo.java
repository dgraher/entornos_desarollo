/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marcianos;


/**
 *
 * @author jagarcia1980
 */
public abstract class Efectivo {
    
    protected Guerrero[] tripulacion = new Guerrero[10];
    protected String somos;

    public Efectivo() {
    }

    public abstract void recibeDisparo(int i);

    public abstract int generaDisparo(int i);

    public int cuantosQuedan() {
        if (somos.equals("Terricolas")) {
            return Terricola.getTotal();
        } else {
            return Marciano.getTotal();
        }
    }
    
}
