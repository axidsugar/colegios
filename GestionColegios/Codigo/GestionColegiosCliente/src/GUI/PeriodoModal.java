/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Code.Business.AuxiliaresBusiness;
import Code.Business.InstitucionEducativaBusiness;
import Code.Business.JornadaBusiness;
import Code.Business.PeriodoBusiness;
import Code.Business.SedeBusiness;
import Code.Domain.InstitucionEducativa;
import Code.Domain.Jornada;
import Code.Domain.Periodo;
import GUI.Util.ControllerComboPeriodo;
import GUI.Util.ControllerComboSede;
import java.awt.Dimension;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author laynegranadosmogollon
 */
public class PeriodoModal extends javax.swing.JDialog {

    
    private boolean ALLOW_ROW_SELECTION = true;
    
    ControllerComboPeriodo controller;
    PeriodoBusiness periodoBusiness;
    InstitucionEducativaBusiness institucionEducativaBusiness;
    AuxiliaresBusiness auxiliaresBusiness;
    Periodo periodoActual;
    InstitucionEducativa actualColegio;
    ArrayList<Periodo> periodos;
    JornadaBusiness jornadaBusiness;
    
    final String[] columnNames = {"ID", "Jornada ID","Jornada", "Fecha_Inicio", "Fecha_Fin", "Comentario"};
    
    /**
     * Creates new form PeriodoModal
     */
    public PeriodoModal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        periodos = new ArrayList<Periodo>();
        this.controller = new ControllerComboPeriodo(this);
        this.periodoBusiness = new PeriodoBusiness();
        this.jornadaBusiness = new JornadaBusiness();
        this.auxiliaresBusiness = new AuxiliaresBusiness();
        
        this.institucionEducativaBusiness = new InstitucionEducativaBusiness();
        this.actualColegio = this.institucionEducativaBusiness.selectColegio();
        this.periodos = this.periodoBusiness.getTodosLosPeriodos();
        
        this.periodoActual = new Periodo();
        
        JTable jtable = this.createJTable(this.dataTable());
        this.scrollPaneListadoPeriodo.setViewportView(jtable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbJornadaPeriodo = new GUI.Util.JComboBox();
        txtFechaInicioPeriodo = new javax.swing.JTextField();
        txtFechaFinalPeriodo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentarioPeriodo = new javax.swing.JTextArea();
        btnLimparCamposPeriodo = new javax.swing.JButton();
        btnGuardarCamposPeriodo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblIdPeriodo = new javax.swing.JLabel();
        scrollPaneListadoPeriodo = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Agregar o Modificar un Periodo Escolar");

        jLabel2.setText("Jornada");

        jLabel3.setText("Fecha Inicio");

        jLabel4.setText("Fecha Final");

        jLabel5.setText("Comentario");

        cmbJornadaPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJornadaPeriodoActionPerformed(evt);
            }
        });

        txtComentarioPeriodo.setColumns(20);
        txtComentarioPeriodo.setRows(5);
        jScrollPane1.setViewportView(txtComentarioPeriodo);

        btnLimparCamposPeriodo.setText("Nuevo Periodo");
        btnLimparCamposPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposPeriodoActionPerformed(evt);
            }
        });

        btnGuardarCamposPeriodo.setText("Guardar");
        btnGuardarCamposPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCamposPeriodoActionPerformed(evt);
            }
        });

        jLabel6.setText("Id");

        lblIdPeriodo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimparCamposPeriodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarCamposPeriodo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFechaInicioPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(lblIdPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbJornadaPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaFinalPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneListadoPeriodo, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIdPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbJornadaPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFechaInicioPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaFinalPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCamposPeriodo)
                    .addComponent(btnLimparCamposPeriodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPaneListadoPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbJornadaPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJornadaPeriodoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbJornadaPeriodoActionPerformed

    private void btnGuardarCamposPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCamposPeriodoActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Format formatterString = new SimpleDateFormat("dd/mm/yyyy");
        Object jorn = this.controller.getObjetoSeleccionado((GUI.Util.JComboBox)this.cmbJornadaPeriodo);
        this.periodoActual.setJornada(((Jornada)jorn));
        String feStr = ((String)(this.txtFechaInicioPeriodo.getText()));
            try {
		Date fechaI = formatter.parse(feStr);
                this.periodoActual.setFechaInicio(fechaI);
            } catch (ParseException e) {
		e.printStackTrace();
            }
            
        feStr = ((String)(this.txtFechaFinalPeriodo.getText()));
            try {
		Date fechaF = formatter.parse(feStr);
                this.periodoActual.setFechaFin(fechaF);
            } catch (ParseException e) {
		e.printStackTrace();
            }
        
        this.periodoActual.setComentario(this.txtComentarioPeriodo.getText());
        
        if(this.periodoActual.getId()>0){
            this.periodoActual = this.periodoBusiness.updatePeriodo(periodoActual);
            for(int i=0; i<this.periodos.size();i++){
                Periodo peri = this.periodos.get(i);
                if(peri.getId()==this.periodoActual.getId()){
                    this.periodos.set(i, this.periodoActual);
                }
            }
        }else{
            this.periodoActual = this.periodoBusiness.guardarPeriodo(this.periodoActual);
            this.periodos.add(this.periodoActual);
        }
        this.lblIdPeriodo.setText(String.valueOf(this.periodoActual.getId()));
        
        
        JTable jTable2 = this.createJTable(this.dataTable());
        this.scrollPaneListadoPeriodo.setViewportView(jTable2);
    }//GEN-LAST:event_btnGuardarCamposPeriodoActionPerformed

    private void btnLimparCamposPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposPeriodoActionPerformed
        // TODO add your handling code here:
        this.controller = new ControllerComboPeriodo(this);
        this.periodoActual= new Periodo();
        this.lblIdPeriodo.setText("");
        this.txtFechaInicioPeriodo.setText("");
        this.txtFechaFinalPeriodo.setText("");
        this.txtComentarioPeriodo.setText("");
        
    }//GEN-LAST:event_btnLimparCamposPeriodoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PeriodoModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeriodoModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeriodoModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeriodoModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PeriodoModal dialog = new PeriodoModal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarCamposPeriodo;
    private javax.swing.JButton btnLimparCamposPeriodo;
    public javax.swing.JComboBox<String> cmbJornadaPeriodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdPeriodo;
    private javax.swing.JScrollPane scrollPaneListadoPeriodo;
    private javax.swing.JTextArea txtComentarioPeriodo;
    private javax.swing.JTextField txtFechaFinalPeriodo;
    private javax.swing.JTextField txtFechaInicioPeriodo;
    // End of variables declaration//GEN-END:variables

    private Object[][] dataTable(){
        int tamPeriodo = this.periodos.size();
        Object[][] data = new Object [tamPeriodo][6];
        
        for (int i=0; i<periodos.size();i++){
            Periodo p = periodos.get(i);
            data[i][0] = p.getId();
            data[i][1] = p.getJornada().getId();
            data[i][2] = p.getJornada().getNombre();
            data[i][3] = p.getFechaInicio();
            data[i][4] = p.getFechaFin();
            data[i][5] = p.getComentario();
        }
        return data;
    }
    
    private JTable createJTable (Object [][] data){
        JTable jTable = new JTable(data, this.columnNames);
        jTable.setPreferredScrollableViewportSize(new Dimension(500, 70));
        jTable.setFillsViewportHeight(true);
        jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        if(this.ALLOW_ROW_SELECTION){
            ListSelectionModel rowSM = jTable.getSelectionModel();
            rowSM.addListSelectionListener(new ListSelectionListener() {
                public void valueChanged(ListSelectionEvent e) {
                    
                    if (e.getValueIsAdjusting()) 
                        return;

                    ListSelectionModel lsm = (ListSelectionModel)e.getSource();
                    if (!lsm.isSelectionEmpty()) {
                        getPeriodoSelected(jTable, lsm.getMinSelectionIndex());
                    }
                }
            });
        } else {
            jTable.setRowSelectionAllowed(false);
        }
        
        return jTable;
            
    }
    
    private void getPeriodoSelected (JTable table, int row){
        
        int numRows = table.getRowCount();
        
        if(row<numRows){
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Format formatterString = new SimpleDateFormat("dd/mm/yyyy");
            javax.swing.table.TableModel model = table.getModel();
            this.periodoActual = new Periodo();
            
                       
            this.periodoActual.setId((Integer)(model.getValueAt(row, 0)));
            int idJornada = ((Integer)model.getValueAt(row, 1));
            Jornada j = this.jornadaBusiness.JornadaPorId(idJornada);
            this.periodoActual.setJornada(j);
            Date f1 = (Date)(model.getValueAt(row, 3));
            //String feStr = ((String)(model.getValueAt(row, 3)));
            //try {
//		Date fechaI = formatter.parse(feStr);
//                this.periodoActual.setFechaInicio(fechaI);
                this.periodoActual.setFechaInicio(f1);
//            } catch (ParseException e) {
//		e.printStackTrace();
//            }
            
            
            Date f2 = ((Date)(model.getValueAt(row, 4)));
        
                this.periodoActual.setFechaInicio(f2);
        
            this.periodoActual.setComentario((String)(model.getValueAt(row, 5)));
            
            this.lblIdPeriodo.setText(""+this.periodoActual.getId());
            String fechIn = formatter.format(this.periodoActual.getFechaInicio());
            this.txtFechaInicioPeriodo.setText(fechIn);
            String fechFin = formatter.format(this.periodoActual.getFechaInicio());
            this.txtFechaFinalPeriodo.setText(fechFin);
            this.txtComentarioPeriodo.setText(this.periodoActual.getComentario());
            
            Jornada jornada = this.jornadaBusiness.JornadaPorId(this.periodoActual.getJornada().getId());
            
            this.controller=new ControllerComboPeriodo(this);
            this.controller.setSelectItemJornada(jornada);
            
            
        }
    }
}
