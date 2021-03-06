/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code.Business;

import Code.DAO.JornadaDAOImpl;
import Code.Domain.Jornada;
import java.util.ArrayList;

/**
 *
 * @author laygrana
 */
public class JornadaBusiness {
    
    JornadaDAOImpl jornadaDAOImpl;

    public JornadaBusiness() {
        this.jornadaDAOImpl = new JornadaDAOImpl();
    }
    
    public Jornada JornadaPorId(int id_jor){
        return this.jornadaDAOImpl.getJornadaPorId(id_jor);
    }
    
    public Jornada guardarJornada(Jornada j) {      
       return this.jornadaDAOImpl.guardarJornada(j);
    }
    
    public ArrayList<Jornada> selectAllJornadaPorAnio(int anio){
        return this.jornadaDAOImpl.selectAllJornadaPorAnio(anio);
    }
    
    public Jornada updateJornada(Jornada j) {
        return this.jornadaDAOImpl.updateJornada(j);
    }
    
    public ArrayList<Jornada> getTodasLasJornadas(){
        return this.jornadaDAOImpl.getTodasLasJornadas();
    }
     
}