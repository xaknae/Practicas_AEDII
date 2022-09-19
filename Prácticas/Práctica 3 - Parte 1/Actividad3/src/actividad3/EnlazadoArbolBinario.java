/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad3;

/**
 *
 * @author xabi
 * @param <E>
 */
public class EnlazadoArbolBinario<E> implements ArbolBinario<E> {
    private ArbolBinario<E> hi;
    private NodoBinario<E> raiz;
    private EnlazadoArbolBinario(NodoBinario<E> n) {
        n = raiz;
    }

    public EnlazadoArbolBinario() {
    }

    public EnlazadoArbolBinario(E elemRaiz, EnlazadoArbolBinario<E> hi, EnlazadoArbolBinario<E> hd) {
        raiz = new NodoBinario<>(elemRaiz, hi.raiz, hd.raiz);
            
    }

    public boolean esVacio() {
        return raiz == null;
    }

    public E raiz() throws ArbolVacioException {
        if (esVacio()) {
            throw new ArbolVacioException("Arbol vacio");
        } else {
            return raiz.getElemento();
        }
    }

    public ArbolBinario<E> hijoIzq() throws ArbolVacioException {
        if (esVacio()) {
            throw new ArbolVacioException("Arbol vacio");
        }
        return new EnlazadoArbolBinario<>(raiz.getIzq());
    }

    public ArbolBinario<E> hijoDer() throws ArbolVacioException {
        if (esVacio()) {
            throw new ArbolVacioException("Arbol vacio");
        }
        return new EnlazadoArbolBinario<>(raiz.getDer());
    }

    public boolean esta(E elemento) {
        if (raiz == null) {
            return false;
        }else if (raiz.getElemento().equals(elemento)){
            return true;
        } 
        
       
    }
    

    public void setRaiz(E elemRaiz) throws ArbolVacioException {
        if (esVacio()) {
            throw new ArbolVacioException("Arbol vacio");
        }
        raiz.setElemento(elemRaiz);
    }

    public void setHijoIzq(ArbolBinario<E> hi) throws ArbolVacioException, NullPointerException {
        if (esVacio()) {
            throw new ArbolVacioException("Arbol vacio");
        }
        if (hi == null) {
            throw new NullPointerException();
        }
        raiz.setIzq(((EnlazadoArbolBinario<E>) hi).raiz);
    }

    public void setHijoDer(ArbolBinario<E> hd) throws ArbolVacioException, NullPointerException {
        if (esVacio()) {
            throw new ArbolVacioException("Arbol vacio");
        }
        if (hd == null) {
            throw new NullPointerException();
        }
        raiz.setDer(((EnlazadoArbolBinario<E>) hd).raiz);
    }

    public void suprimir() {
        raiz = null;
    }
}
