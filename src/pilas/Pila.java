/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 * @author bh
 */
public class Pila<Tipo> {

    NodoPila<Tipo> inicial;
    private int tamanio = 0;

    public Pila() {
        this.inicial = null;
    }

    //apilar(insertar por el inicio)
    public Pila push(Tipo datoI) {
        NodoPila nuevo = new NodoPila(datoI);
        if (!empty()) {
            nuevo.setSiguiente(inicial);
        }
        inicial = nuevo;
        setTamanio(getTamanio() + 1);
        return this;
    }

    //desapilar
    public Pila pop() throws Exception {
        exceptionListaVacia("La pila esta vacia");
        NodoPila aux = inicial;
        inicial = aux.getSiguiente();
        aux.setSiguiente(null);
        setTamanio(getTamanio() - 1);
        return this;
    }

    //cima
    public Tipo topEl() throws Exception {
        exceptionListaVacia("No hay elementos en la pila");
        return inicial.getElemento();
    }

    //empty
    public boolean empty() {
        return inicial == null;
    }

    //clear
    public void clear() {
        inicial = null;
    }

    /* -----------------------METODOS-----------------------------------------*/
    private void exceptionListaVacia(String msg) throws Exception {
        if (empty()) {
            throw new Exception(msg);
        }
    }

    @Override
    public String toString() {
        String salida;
        if (!empty()) {
            salida = "cima -> ";
            NodoPila aux = inicial;
            while (aux != null) {
                salida = salida + aux.getElemento() + "\n\t";
                aux = aux.getSiguiente();
            }
        } else {
            salida = "La pila esta vacia";
        }

        return salida;
    }

    public Pila reverseNewPila(Pila<Tipo> pilaOutput) throws Exception {
        exceptionListaVacia("la pila esta vacia no se puede revertir");
        NodoPila auxCadaElemento = inicial;
        while (auxCadaElemento.getSiguiente() != null) {
            pilaOutput.push((Tipo) auxCadaElemento.getElemento());
            auxCadaElemento = auxCadaElemento.getSiguiente();
        }
        pilaOutput.push((Tipo) auxCadaElemento.getElemento());
        return pilaOutput;
    }
    public Pila reverse() throws Exception {
        exceptionListaVacia("la pila esta vacia no se puede revertir");
        Pila pilaOutput = new Pila();
        NodoPila auxCadaElemento = inicial;
        while (auxCadaElemento.getSiguiente() != null) {
            pilaOutput.push((Tipo) auxCadaElemento.getElemento());
            auxCadaElemento = auxCadaElemento.getSiguiente();
        }
        pilaOutput.push((Tipo) auxCadaElemento.getElemento());
        
        clear();
        inicial = pilaOutput.inicial;
        return this;
    }
    public Pila removeNodo(Tipo datoE) throws Exception{
        exceptionListaVacia("La lista esta vacia");
        NodoPila aux1AntesBuscado = inicial;
        aux1AntesBuscado = recorrerUnoAntesBuscado(aux1AntesBuscado, datoE);
        if (aux1AntesBuscado.getElemento().equals(datoE)) {
            pop();
        }else if(aux1AntesBuscado.getSiguiente().getSiguiente() == null){
            aux1AntesBuscado.setSiguiente(null);
            setTamanio(getTamanio() - 1);
        }else{
            NodoPila auxB = aux1AntesBuscado.getSiguiente();
            aux1AntesBuscado.setSiguiente(auxB.getSiguiente());
            auxB.setSiguiente(null);
            setTamanio(getTamanio() - 1);
        }
        return this;
    }
    
    private NodoPila recorrerUnoAntesBuscado(NodoPila aux1AntesB, Tipo datoB) throws Exception{
        if (!aux1AntesB.getElemento().equals(datoB)) {
            while (aux1AntesB.getSiguiente() != null && !aux1AntesB.getSiguiente().getElemento().equals(datoB)) {                
                aux1AntesB = aux1AntesB.getSiguiente();
            }
            if (aux1AntesB.getSiguiente() == null) {
                throw new Exception("No se encontro el elemento buscado");
            }
        }
        /*si el elemento buscado es el primero retornamos ese sino se busaca y se retorna*/
        return aux1AntesB;
    }
    
    public Tipo getDatoIndex(int index){
        NodoPila actual = inicial;
        int contador = 0;

        while(contador < index){
            actual = actual.getSiguiente();
            contador++;
        }
        
        return (Tipo) actual.getElemento();
    }
    
    /**
     * @return the tamanio
     */
    public int getTamanio() {
        return tamanio;
    }

    /**
     * @param tamanio the tamanio to set
     */
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
