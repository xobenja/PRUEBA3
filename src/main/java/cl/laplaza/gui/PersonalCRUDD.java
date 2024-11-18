package cl.laplaza.gui;

import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JOptionPane;
//import cl.harrys.gc.dao.DAOPersonal;
import cl.harrys.gc.neg.Negocio;
import javax.swing.JFrame;
import cl.harrys.gen.Rutinas;
import cl.laplaza.model.Personal;




public class PersonalCRUDD extends javax.swing.JFrame {
    JPanel centralPanel = new JPanel(new GridLayout(0,2));

    private javax.swing.JButton btActualizar = new javax.swing.JButton();
    private javax.swing.JButton btAgregar = new javax.swing.JButton();
    private javax.swing.JButton btEliminar = new javax.swing.JButton();
    private javax.swing.JButton btLeer = new javax.swing.JButton();
    private javax.swing.JButton btLimpiar = new javax.swing.JButton();
    private javax.swing.JButton btListar = new javax.swing.JButton();    private javax.swing.JTextField txtNumrunAdm = new javax.swing.JTextField();
    private javax.swing.JLabel lblNumrunAdm = new javax.swing.JLabel();
    private javax.swing.JTextField txtDvrunAdm = new javax.swing.JTextField();
    private javax.swing.JLabel lblDvrunAdm = new javax.swing.JLabel();
    private javax.swing.JTextField txtPnombreAdm = new javax.swing.JTextField();
    private javax.swing.JLabel lblPnombreAdm = new javax.swing.JLabel();
    private javax.swing.JTextField txtSnombreAdm = new javax.swing.JTextField();
    private javax.swing.JLabel lblSnombreAdm = new javax.swing.JLabel();
    private javax.swing.JTextField txtAppaternoAdm = new javax.swing.JTextField();
    private javax.swing.JLabel lblAppaternoAdm = new javax.swing.JLabel();
    private javax.swing.JTextField txtApmaternoAdm = new javax.swing.JTextField();
    private javax.swing.JLabel lblApmaternoAdm = new javax.swing.JLabel();
    private javax.swing.JTextField txtFotoAdm = new javax.swing.JTextField();
    private javax.swing.JLabel lblFotoAdm = new javax.swing.JLabel();

    //private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1;

    public PersonalCRUDD() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);        lblNumrunAdm.setText("NumrunAdm");
        //lblNumrunAdm.setSize(new Dimension(        txtNumrunAdm.setText("");
        txtNumrunAdm.setEnabled(false);
        txtNumrunAdm.setSize(new Dimension(1400,20));
        txtNumrunAdm.setPreferredSize(new Dimension(400,20));
        this.centralPanel.add(lblNumrunAdm);
        this.centralPanel.add(txtNumrunAdm);
        lblDvrunAdm.setText("DvrunAdm");
        //lblDvrunAdm.setSize(new Dimension(        txtDvrunAdm.setText("");
        txtDvrunAdm.setEnabled(false);
        txtDvrunAdm.setSize(new Dimension(1400,20));
        txtDvrunAdm.setPreferredSize(new Dimension(400,20));
        this.centralPanel.add(lblDvrunAdm);
        this.centralPanel.add(txtDvrunAdm);
        lblPnombreAdm.setText("PnombreAdm");
        //lblPnombreAdm.setSize(new Dimension(        txtPnombreAdm.setText("");
        txtPnombreAdm.setEnabled(false);
        txtPnombreAdm.setSize(new Dimension(1400,20));
        txtPnombreAdm.setPreferredSize(new Dimension(400,20));
        this.centralPanel.add(lblPnombreAdm);
        this.centralPanel.add(txtPnombreAdm);
        lblSnombreAdm.setText("SnombreAdm");
        //lblSnombreAdm.setSize(new Dimension(        txtSnombreAdm.setText("");
        txtSnombreAdm.setEnabled(false);
        txtSnombreAdm.setSize(new Dimension(1400,20));
        txtSnombreAdm.setPreferredSize(new Dimension(400,20));
        this.centralPanel.add(lblSnombreAdm);
        this.centralPanel.add(txtSnombreAdm);
        lblAppaternoAdm.setText("AppaternoAdm");
        //lblAppaternoAdm.setSize(new Dimension(        txtAppaternoAdm.setText("");
        txtAppaternoAdm.setEnabled(false);
        txtAppaternoAdm.setSize(new Dimension(1400,20));
        txtAppaternoAdm.setPreferredSize(new Dimension(400,20));
        this.centralPanel.add(lblAppaternoAdm);
        this.centralPanel.add(txtAppaternoAdm);
        lblApmaternoAdm.setText("ApmaternoAdm");
        //lblApmaternoAdm.setSize(new Dimension(        txtApmaternoAdm.setText("");
        txtApmaternoAdm.setEnabled(false);
        txtApmaternoAdm.setSize(new Dimension(1400,20));
        txtApmaternoAdm.setPreferredSize(new Dimension(400,20));
        this.centralPanel.add(lblApmaternoAdm);
        this.centralPanel.add(txtApmaternoAdm);
        lblFotoAdm.setText("FotoAdm");
        //lblFotoAdm.setSize(new Dimension(        txtFotoAdm.setText("");
        txtFotoAdm.setEnabled(false);
        txtFotoAdm.setSize(new Dimension(1400,20));
        txtFotoAdm.setPreferredSize(new Dimension(400,20));
        this.centralPanel.add(lblFotoAdm);
        this.centralPanel.add(txtFotoAdm);

        this.setTitle("PersonalCRUD");
        btLeer.setBackground(new java.awt.Color(255, 0, 51));
        btLeer.setText("Leer");
        btLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLeerActionPerformed(evt);
            }
        });

        btAgregar.setBackground(new java.awt.Color(0, 255, 255));
        btAgregar.setText("Agregar");
        btAgregar.setEnabled(false);
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });

        btActualizar.setBackground(new java.awt.Color(102, 255, 153));
        btActualizar.setText("Actualizar");
        btActualizar.setEnabled(false);
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        btLimpiar.setBackground(new java.awt.Color(255, 204, 51));
        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        btEliminar.setBackground(new java.awt.Color(51, 51, 255));
        btEliminar.setText("Eliminar");
        btEliminar.setEnabled(false);
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btListar.setBackground(new java.awt.Color(255, 204, 51));
        btListar.setText("Listar JTable Simple");
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarActionPerformed(evt);
            }
        });
        this.btLeer.setSize(new Dimension(80, 10));
        this.btEliminar.setSize(new Dimension(80, 10));
        this.btActualizar.setSize(new Dimension(80, 10));
        this.btAgregar.setSize(new Dimension(80, 10));
        this.btLimpiar.setSize(new Dimension(80, 10));
        this.setLayout(new FlowLayout());
        this.add(centralPanel);
        this.add(btLimpiar);
        this.add(btLeer);
        this.add(btEliminar);
        this.add(btActualizar);
        this.add(btAgregar);
        this.add(btListar);
        this.setSize(500,500);
        this.setPreferredSize(new Dimension(900, 600));
        btLimpiarActionPerformed(null);

        pack();
    }
    private void btLeerActionPerformed(java.awt.event.ActionEvent evt) {                                       
        leerBoton();
    }
    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {                                                   int numrunAdm = Integer.parseInt(txtNumrunAdm.getText());
        Object[] options = {"Si", "No"};
        int n = JOptionPane.showOptionDialog(null,
                "Desea eliminar el registro?",
                "Eliminacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);
//if (n == JOptionPane.YES_OPTION) {} else if (n == JOptionPane.NO_OPTION) {} else {}
        if (n == JOptionPane.NO_OPTION) {
            return;
        }

        //int rut = Integer.parseInt(txtRut.getText());
        //int rut = 1
        Personal registro = new Personal( Integer.parseInt(txtNumrunAdm.getText()));

        int respuesta = Negocio.eliminarPersonal(registro);
        if (respuesta == 0) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo eliminar el Personal");
            return;
        }
        JOptionPane.showMessageDialog(null, "Personal eliminado correctamente");
        btLimpiarActionPerformed(null);
    }      
    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        //$$XCOL$$_frcrud_obj_get.java    
        Personal registro = new Personal( Integer.parseInt(txtNumrunAdm.getText()), txtDvrunAdm.getText(), txtPnombreAdm.getText(), txtSnombreAdm.getText(), txtAppaternoAdm.getText(), txtApmaternoAdm.getText());
        int respuesta = Negocio.actualizarPersonal(registro);
        if (respuesta == 0) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo Actualizar el Personal");
            return;
        }
        JOptionPane.showMessageDialog(null, "Personal Actualizado Correctamente");
        btLimpiarActionPerformed(null);
   
    }   
    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        //$$XCOL$$_frcrud_obj_get.java    
        Personal registro = new Personal( Integer.parseInt(txtNumrunAdm.getText()), txtDvrunAdm.getText(), txtPnombreAdm.getText(), txtSnombreAdm.getText(), txtAppaternoAdm.getText(), txtApmaternoAdm.getText());

        int respuesta = Negocio.agregarPersonal(registro);
        if (respuesta == 0) {
            JOptionPane.showMessageDialog(null, "Personal no se pudo agregar el Registro");
            return;
        }
        JOptionPane.showMessageDialog(null, "Personal Agregado Correctamente");
        btLimpiarActionPerformed(null);
    }   
    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        txtDvrunAdm.setText("");
        txtDvrunAdm.setEnabled(false);
        txtPnombreAdm.setText("");
        txtPnombreAdm.setEnabled(false);
        txtSnombreAdm.setText("");
        txtSnombreAdm.setEnabled(false);
        txtAppaternoAdm.setText("");
        txtAppaternoAdm.setEnabled(false);
        txtApmaternoAdm.setText("");
        txtApmaternoAdm.setEnabled(false);
        txtFotoAdm.setText("");
        txtFotoAdm.setEnabled(false);
        txtNumrunAdm.setText("");
        txtNumrunAdm.setEnabled(true);
        btLeer.setEnabled(true);
        btEliminar.setEnabled(false);
        btAgregar.setEnabled(false);
        btActualizar.setEnabled(false);

    }                                         
    public void inicio(Personal administrador) {
        leerBoton();
    }
    private void leerBoton() {
        // TODO add your handling code here:
        //$$XCOLPK$$_frcrud_obj_get.java    
        //int rut = Integer.parseInt(txtRut.getText());
        Personal registro = new Personal( Integer.parseInt(txtNumrunAdm.getText()));

        Personal cladministrador = Negocio.buscarByPkPersonal(registro);
        txtDvrunAdm.setText("");
        txtDvrunAdm.setEnabled(true);
        txtPnombreAdm.setText("");
        txtPnombreAdm.setEnabled(true);
        txtSnombreAdm.setText("");
        txtSnombreAdm.setEnabled(true);
        txtAppaternoAdm.setText("");
        txtAppaternoAdm.setEnabled(true);
        txtApmaternoAdm.setText("");
        txtApmaternoAdm.setEnabled(true);
        txtFotoAdm.setText("");
        txtFotoAdm.setEnabled(true);

        if (cladministrador == null) {
            JOptionPane.showMessageDialog(null, "Error: Personal no existe");
            btEliminar.setEnabled(false);
            btActualizar.setEnabled(false);
            btAgregar.setEnabled(true);
            return;
        }
        btEliminar.setEnabled(true);
        btActualizar.setEnabled(true);
        btAgregar.setEnabled(false);        txtNumrunAdm.setText("");
        txtNumrunAdm.setEnabled(false);
        txtNumrunAdm.setText(cladministrador.getNumrunAdm()+"");
        txtDvrunAdm.setText(cladministrador.getDvrunAdm()+"");
        txtPnombreAdm.setText(cladministrador.getPnombreAdm()+"");
        txtSnombreAdm.setText(cladministrador.getSnombreAdm()+"");
        txtAppaternoAdm.setText(cladministrador.getAppaternoAdm()+"");
        txtApmaternoAdm.setText(cladministrador.getApmaternoAdm()+"");
        //txtFotoAdm.setText(cladministrador.getFotoAdm()+"");
        //txtNombre.setText(a1.getNombres());
    }      

    
}