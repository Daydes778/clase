/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListarDao;
import java.util.List;
import Producto.Cambio;
import java.util.ArrayList;
/**
 *
 * @author José
 */
public class CambioDao {
    private List<Cambio> lista;
    public CambioDao(){
        lista= new ArrayList<> ();
    }
    public void Registrar(Cambio cam){
        lista.add(cam);
    }

    public List<Cambio> getLista() {
        return lista;
    }
    
}
