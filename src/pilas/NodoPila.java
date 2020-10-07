/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author bh
 */
public class NodoPila<Tipo> {
    private Tipo elemento;
    private NodoPila siguiente;

    public NodoPila(Tipo elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }
    /**
     * @return the elemento
     */
    public Tipo getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(Tipo elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the siguiente
     */
    public NodoPila getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
    
}
