
/**
 * Write a description of class calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class calculadora
{
    private int  n1;
    private int  n2;
    
    public int suma (int n1, int n2)
    {  
         int suma = + n1 + n2;
         return suma;
    }
    
    
    public int resta(int n1, int n2)
    {
        int resta = n1 - n2;
        return resta;
    }
    
    public int producto(int n1, int n2)
    {
        int producto = n1 * n2;
        return producto;
    }
    
    
    public double division(double n1, double n2)
    {
        assert n2 != 0 : "no esta definida la division por cero";
        double div = n1 / n2;
        return div;
    }
}
