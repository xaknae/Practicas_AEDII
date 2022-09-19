/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package actividad3;

/**
 *
 * @author xabi
 * @param <E>
 */
public interface ArbolBinario<E> {

    public boolean esVacio();

    public E raiz() throws ArbolVacioException;

    public ArbolBinario<E> hijoIzq() throws ArbolVacioException;

    public ArbolBinario<E> hijoDer() throws ArbolVacioException;

    public boolean esta(E elemento);

    public void setRaiz(E elemRaiz) throws ArbolVacioException;

    public void setHijoIzq(ArbolBinario<E> hi) throws ArbolVacioException, NullPointerException;

    public void setHijoDer(ArbolBinario<E> hd) throws ArbolVacioException, NullPointerException;

    public void suprimir();
}
