import java.util.ArrayList;

/**
 * Write a description of class MusicOrganizer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicOrganizer
{
    private ArrayList<String> Canciones;
    
    public void crearPlayList()
    {
        Canciones = new ArrayList<>();
    }
    
    public void agregarCancion(String tema)
    {
        assert Canciones != null : "playlist no creada";
        Canciones.add(tema);
    }
    
    public String eliminarCancion(String tema)
    {   
        int i = 0;
        while(i < Canciones.size())
        {
            if(Canciones.get(i) == tema)
            {
                Canciones.remove(i);
                return "cancion eliminada!";
            }else{
                i++;
            }
        }
        return "cancion no encontrada";
    } 
    
    public void mostrarPlayList()
    {
        for(String cancion : Canciones){
            System.out.println(cancion + ".mp3");
        }
    }
}
