

package Boletin31_3;

import java.util.ArrayList;

/**
 *
 * @author clamascabaleiro
 */
public class Boletin31_3 {

 
    public static void main(String[] args) {
           
        // Usamos un ArrayList de tipo SeleccionFutbol para poder engadir todas as demás clases xa que extenden de esta
        ArrayList<SeleccionFutbolHM> lSelec = new ArrayList<>();

        FutbolistaHM fut = new FutbolistaHM(94, "delantero", 1, "Karim", "Benzema", 22);
        EntrenadorHM ent = new EntrenadorHM(124, 2, "Zidane", "Zidedine", 35);
        MasajistaHM mas = new MasajistaHM("Master", 10, 3, "Pintus", "Pintus", 45);
        
        lSelec.add(fut);
        lSelec.add(ent);
        lSelec.add(mas);

//        for (SeleccionFutbolHM z : lSelec) {
//
//            System.out.println(z);
//
//        }
        System.out.println("*************************");
        fut.entrenar();
        fut.concentrarse();
        ent.jugarPartido();
        ent.viajar();
    }
    }

