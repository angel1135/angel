
/**
 * Write a description of class pruebaEquals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pruebaEquals
{
   public void comparacion()
   {
       String msj1 = "hola";
       String msj2 = "hola";
       if(msj1 == msj2){
            System.out.println("cadenas iguales");
        }else {
            System.out.println("cadenas distintas");
        }
   }
   
   public void comparacionV2()
   {    
       String msj1 = "hola";
       String msj2 = "hola";
       if (msj1.equals(msj2)){
            System.out.println("cadenas iguales");
        }else{
            System.out.println("cadenas distintas");
        }
    }
    
   public boolean cadenasIguales(String msj1,  String msj2)
   { 
      if(msj1 == msj2){
            return true;
        }else{
            return false;
        }
    } 
    
    
   public boolean cadenasIgualesV2(String msj1,  String msj2){
        if(msj1.equals(msj2)){
            return true;
        }else{
            return false;
        }
    } 
}