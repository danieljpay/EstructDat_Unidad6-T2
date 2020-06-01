/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExploraciónCuadrática;

/**
 *
 * @author plupy
 */
public class pruebaExplorCuadr {
    public static void main(String[] args) {
        CasaRural casita = new CasaRural();
        TablaDispersa tablita = new TablaDispersa();
        String codigo=casita.elCodigo();
        
        long codigoHash = tablita.transformaCadena(codigo);
        int direccion= tablita.direccion(codigo);
        
        //código
        System.out.println(codigo + " hasheado: " + codigoHash);
        tablita.buscar(codigo);
                
        //posición
        System.out.println("se encuentra en la posición: " + direccion);
        tablita.eliminar(codigo);
    }
}
