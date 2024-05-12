import java.util.ArrayList;
/**
 * Write a description of class conversorTemp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class conversorTemp
{
   private ArrayList <Float> temperaturas;
   
   public void Temperaturas()
   {
        temperaturas = new ArrayList<>();
    }
    
   public void cargarTemps(float temp)
    {
        temperaturas.add(temp);
    }
    
   public void mostrarTempsV2()
    {
        for(Float temp : temperaturas){
        
            System.out.println("temperaturas registradas:" + temp);            
        }
    }
     
   public void mostrarTemps()
   {
        int i = 0;
        while(i < temperaturas.size())
        {
            System.out.println(temperaturas.get(i) + "C");
            i++;
        }
    }
    
   public void celsiusAFahrenheit()
    {
        for(Float temp : temperaturas)
        {
            temp = (temp * (9f / 5f)) + 32;
            System.out.println("las temperaturas transformadas son:" + temp);
            
        }    
    }
    
    public void tamaño()
    {
        System.out.println(temperaturas.size());
   }
    
   public void eliminarTemp(int i)
    { 
        temperaturas.remove(i);
    }
}
