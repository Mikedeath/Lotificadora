/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotificadora;

/**
 *
 * @author sanch
 */
public class Proyecto_Lotificacion {
    
    Proyecto_Lotificacion(){}
   Terreno classterreno=new Terreno();
  Lotificadora lotif=new Lotificadora();
    public static Terreno Terrenos[][]= new Terreno [5][5];
    public static int ward=0;
   public static int ward2=0;
   public static double ward3=0;
    public static int terrenosvacios(){
        for (int i = 0; i < Terrenos.length; i++) {
            
            for (int j = 0; j < Terrenos.length; j++) {
                if (Terrenos[i][j]==null)
                    ward=ward+1;
            }
        }
        return ward;
    
    
    
    
    }
    
    public static int terrenosllenos(){
    for (int i = 0; i < Terrenos.length; i++) {
            
            for (int j = 0; j < Terrenos.length; j++) {
                if (Terrenos[i][j]!=null)
                    ward2=ward2+1;
            }
        }
        return ward2;
    
    }
    
    public static double precios1() {
        for (int i = 0; i < Terrenos.length; i++) {

            for (int j = 0; j < Terrenos.length; j++) {
                if (Terrenos[i][j] != null) {
                    ward3 += Terrenos[i][j].getPrecioTotal();
                }

            }

        }
        return ward3;
    }
}
    
   
     