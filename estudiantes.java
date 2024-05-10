import java.util.ArrayList;
/**
 * Write a description of class estudiantes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class estudiantes
{
    private ArrayList <String> NombresDeEstudiantes;
    private String nombre;
    
    
    public estudiantes()
    {
         NombresDeEstudiantes = new ArrayList<String>();
    }
    
    public void cargarEstudiante(String nombre)
    {
        NombresDeEstudiantes.add(nombre);
    }
    
    public void mostrarNombresDeEstudiantes ()
    {
        for(String nombre : NombresDeEstudiantes)
        {
            System.out.println("el nombre del alumno es: " + nombre);
        }        
    }
    
    public void mostrarNombresDeEstudiantesV2()
    {
        int i = 0;
        while(i <= NombresDeEstudiantes.size())
        {
            System.out.println("el nombre del alumno es:" + NombresDeEstudiantes.get(i));
            i++;
        }    
    }
}
