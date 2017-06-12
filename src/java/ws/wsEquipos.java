package ws;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import modelo.Equipo;
import modelo.Modo;
import org.springframework.web.bind.annotation.*;

@RestController
public class wsEquipos {
    
    
    @RequestMapping(value = "findEquipos")
    public static List<Equipo> findEquipos()
    {
        List<Equipo> listadoEquipos = new ArrayList<Equipo>();
        
        String jpql = "SELECT e FROM Equipo e";
        
        listadoEquipos = dao.DAOEclipse.findAllByJPQL(jpql);
        
        return listadoEquipos;
    }
    @RequestMapping(value = "addEquipo")
    public static boolean addEquipo(@RequestParam(value = "equipoRAW") String equipoRAW)
    {
        boolean agrego = false;
        
        Equipo equipoParseado = null;
        if(equipoRAW != null)
        {
            equipoParseado = new Gson().fromJson(equipoRAW,Equipo.class);
            equipoParseado.setModo((Modo) dao.DAOEclipse.get(Modo.class, 1));
            
            if(equipoParseado != null) 
            {
                Equipo equipo = equipoParseado;
                
                agrego = dao.DAOEclipse.update(equipo);
            }
        }
        
        
        return agrego;
    }
    
}
