/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotificadora;
import java.util.Scanner;
import static lotificadora.Proyecto_Lotificacion.Terrenos;
import static lotificadora.Proyecto_Lotificacion.terrenosllenos;
import static lotificadora.Proyecto_Lotificacion.terrenosvacios;

/**
 *
 * @author Juan Zepeda
 */
public class Lotificadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Proyecto_Lotificacion Class2=new Proyecto_Lotificacion();
        Scanner Op=new Scanner(System.in);
        double largo;
        double ancho;
        double precio;
        int x=1;
        do{

        System.out.println("-------------Menu-------------");
        System.out.println(" ");
        System.out.println("1.Venta Terreno");
        System.out.println("2.Consulta/Reportes");
        System.out.println("3.Salir");
        System.out.println(" ");
        int resp=Op.nextInt();
   
        switch (resp) {
            case 1: {

                System.out.println("Ingrese la fila");
                int fila=Op.nextInt();
                System.out.println("Ingrese la columna");
                int columna=Op.nextInt();
                
             if (fila<=5&&columna<=5&&Terrenos[fila][columna]==null){
                System.out.println("Ingrese el Largo");
                largo = Op.nextDouble();
                System.out.println("Ingrese el Ancho");
                ancho = Op.nextDouble();
                System.out.println("Ingrese el Precio");
                precio = Op.nextDouble();
                Class2.Terrenos[fila][columna]=new Terreno(largo,ancho,precio);
             }
             else 
                    System.out.println("No existe");
            break;
            }
            case 2:{
            
                System.out.println("Cantidad de terrenos ocupados");
                System.out.println(terrenosllenos());
                System.out.println("Total(L.)");
                System.out.println(Class2.precios1());
                System.out.println("Cantidad Terrenos Vacios");
               System.out.println(terrenosvacios());
                
            break;
            
            }
    
            case 3:{
            x=0;
            
            
            
            }
    
    
    
    
    
    
        }
      }while (x>=1);
    }

    
    
    
    
    
    
}
