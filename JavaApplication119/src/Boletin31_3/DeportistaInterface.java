/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin31_3;

/**
 *
 * @author clamascabaleiro
 */
interface DeportistaInterface {
    default public void concentrarse(){
         System.out.println(this+ " se concentra");
     }
    default public void viajar(){
        System.out.println(this+ " viaja");
    }
}
