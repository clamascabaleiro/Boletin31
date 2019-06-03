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
interface IntegranteInterface {
     default public void entrenar(){
            System.out.println(this+ " entrena");
        }
    default public void jugarPartido(){
        System.out.println(this+ " juega el partido");
    }
}
