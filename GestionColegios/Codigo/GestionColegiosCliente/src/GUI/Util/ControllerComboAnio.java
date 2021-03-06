/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Util;

import Code.Business.AuxiliaresBusiness;
import Code.Business.CertificacionBusiness;
import Code.Business.ConfiguracionBusiness;
import Code.Business.EstudianteBusiness;
import Code.Business.MatriculaBusiness;
import Code.Business.PersonaBusiness;
import Code.Business.SedeBusiness;
import Code.Domain.Departamento;
import Code.Domain.Municipio;
import Code.Domain.Sede;
import GUI.AnioModal;
import GUI.SedeModal;
import java.util.ArrayList;

/**
 *
 * @author laygrana
 */
public class ControllerComboAnio {
    
    private AnioModal myAnio;
    private SedeModal mySede;
    public CertificacionBusiness certificacionBusiness;
    public ConfiguracionBusiness configuracionBusiness;
    public MatriculaBusiness matriculaBusiness;
    public EstudianteBusiness estudianteBusiness;
    public PersonaBusiness personaBusiness;
    public AuxiliaresBusiness auxiliaresBusiness;
    public SedeBusiness sedeBusiness;

    public ControllerComboAnio(AnioModal myAnio) {
        this.myAnio = myAnio;
        /** INICIALIZACION DE OBJETOS DEL NEGOCIO**/
        certificacionBusiness = new CertificacionBusiness();
        configuracionBusiness = new ConfiguracionBusiness();
        matriculaBusiness = new MatriculaBusiness();
        auxiliaresBusiness= new AuxiliaresBusiness();
        personaBusiness=new PersonaBusiness();
        this.estudianteBusiness = new EstudianteBusiness();
        this.sedeBusiness = new SedeBusiness();
        
        this.llenarCombos();
    }
    
    
    private void llenarCombos() {
        ArrayList<Sede> sedes = this.sedeBusiness.selectAllSedes(this.myAnio.getActualColegio().getId());
        this.myAnio.cmbSedeAnio.setModel(new ToComboBoxModel(sedes, "getNombre"));
    }

    public Object getObjetoSeleccionado(JComboBox combo) {
        return ((JComboBox) combo).getObjectSelected();
    }
    
    public void setSelectedItemSede(Sede sede){        
        ToComboBoxModel to = (ToComboBoxModel)this.myAnio.cmbSedeAnio.getModel();
        to.setSelectedItemCustomize(sede);
        this.myAnio.cmbSedeAnio.setModel(to);
        this.myAnio.cmbSedeAnio.requestFocusInWindow();
    }
    
    public void setSelectedItemMunicipio(Municipio mun){
    }
    
}
