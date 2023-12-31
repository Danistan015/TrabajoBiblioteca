/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorHistorial;
import Modelo.Historiales;
import Modelo.Usuario;
import java.awt.Color;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.Pdf;

/**
 *
 * @author sotog
 */
public class VistaReporLibros extends javax.swing.JFrame {
Usuario usuario;
ControladorHistorial controH;
    Pdf pdf;
    ArrayList<Historiales> lista;
    /**
     * Creates new form VistaReporLibros
     */
    public VistaReporLibros(Usuario usuario) {
        initComponents();
           setLocationRelativeTo(this);
        this.usuario = usuario;
        controH= new ControladorHistorial();
        pdf = new Pdf();
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnIibro = new javax.swing.JButton();
        btnLibrosCreados = new javax.swing.JButton();
        btnLibrosModificados = new javax.swing.JButton();
        btnLibrosEliminados = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(4, 13, 18));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(24, 61, 61));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/bookshelf-in-library-vector.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(147, 177, 166));
        jLabel1.setText("Reportes del libro:");

        btnIibro.setBackground(new java.awt.Color(24, 61, 61));
        btnIibro.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnIibro.setForeground(new java.awt.Color(147, 177, 166));
        btnIibro.setText("Generar reporte");
        btnIibro.setActionCommand("Inicio");
        btnIibro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnIibroMouseMoved(evt);
            }
        });
        btnIibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIibroActionPerformed(evt);
            }
        });

        btnLibrosCreados.setBackground(new java.awt.Color(24, 61, 61));
        btnLibrosCreados.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnLibrosCreados.setForeground(new java.awt.Color(147, 177, 166));
        btnLibrosCreados.setText("Generar reporte libros creados");
        btnLibrosCreados.setActionCommand("Inicio");
        btnLibrosCreados.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnLibrosCreadosMouseMoved(evt);
            }
        });
        btnLibrosCreados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosCreadosActionPerformed(evt);
            }
        });

        btnLibrosModificados.setBackground(new java.awt.Color(24, 61, 61));
        btnLibrosModificados.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnLibrosModificados.setForeground(new java.awt.Color(147, 177, 166));
        btnLibrosModificados.setText("Generar reporte libros modificados");
        btnLibrosModificados.setActionCommand("Inicio");
        btnLibrosModificados.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnLibrosModificadosMouseMoved(evt);
            }
        });
        btnLibrosModificados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosModificadosActionPerformed(evt);
            }
        });

        btnLibrosEliminados.setBackground(new java.awt.Color(24, 61, 61));
        btnLibrosEliminados.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnLibrosEliminados.setForeground(new java.awt.Color(147, 177, 166));
        btnLibrosEliminados.setText("Generar reporte libros eliminados");
        btnLibrosEliminados.setActionCommand("Inicio");
        btnLibrosEliminados.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnLibrosEliminadosMouseMoved(evt);
            }
        });
        btnLibrosEliminados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosEliminadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnLibrosModificados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLibrosCreados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLibrosEliminados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIibro, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLibrosCreados)
                .addGap(18, 18, 18)
                .addComponent(btnLibrosModificados)
                .addGap(18, 18, 18)
                .addComponent(btnLibrosEliminados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIibro)
                .addGap(41, 41, 41))
        );

        jMenu1.setText("Más");

        jMenuItem2.setText("Volver");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIibroMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIibroMouseMoved
        // TODO add your handling code here:

        btnIibro.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnIibroMouseMoved

    private void btnIibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIibroActionPerformed
        // TODO add your handling code here:
         new VistaFechas(usuario).setVisible(true);
        this.dispose();
   
    }//GEN-LAST:event_btnIibroActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
 
        btnIibro.setForeground(Color.lightGray);


    }//GEN-LAST:event_jPanel1MouseMoved

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new VistaReportes(usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnLibrosCreadosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrosCreadosMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLibrosCreadosMouseMoved

    private void btnLibrosCreadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosCreadosActionPerformed
        // TODO add your handling code here:
        try {
            lista = controH.listaLibrosRegistrados();
            pdf.pdfLibrosAgregados(lista);
            LocalDate fechaActual = LocalDate.now();
            LocalTime horaActual = LocalTime.now();
            Usuario id_usuar = controH.buscarUsuarioPorCedula(usuario.getCedula());
            int usuarioss = id_usuar.getCedula();
               

                String accion = "Se genero un reporte de los libros agregados " ;
                Historiales historial = new Historiales(0, fechaActual, horaActual, usuario.getNombre(), accion, usuarioss);
                controH.agregarRegistroHistorial(historial);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al generar el reporte");
        }
    }//GEN-LAST:event_btnLibrosCreadosActionPerformed

    private void btnLibrosModificadosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrosModificadosMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLibrosModificadosMouseMoved

    private void btnLibrosModificadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosModificadosActionPerformed
        // TODO add your handling code here:
        try {
            lista = controH.listaLibrosModificados();
            pdf.pdfLibrosModificados(lista);
            LocalDate fechaActual = LocalDate.now();
            LocalTime horaActual = LocalTime.now();
            Usuario id_usuar = controH.buscarUsuarioPorCedula(usuario.getCedula());
            int usuarioss = id_usuar.getCedula();
               

                String accion = "Se genero un reporte de los libros modificados " ;
                Historiales historial = new Historiales(0, fechaActual, horaActual, usuario.getNombre(), accion, usuarioss);
                controH.agregarRegistroHistorial(historial);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al generar el reporte");
        }
    }//GEN-LAST:event_btnLibrosModificadosActionPerformed

    private void btnLibrosEliminadosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrosEliminadosMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLibrosEliminadosMouseMoved

    private void btnLibrosEliminadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosEliminadosActionPerformed
        // TODO add your handling code here:
        try {
            lista = controH.listaLibrosEliminados();
            pdf.pdfLibrosEliminados(lista);
            LocalDate fechaActual = LocalDate.now();
            LocalTime horaActual = LocalTime.now();
            Usuario id_usuar = controH.buscarUsuarioPorCedula(usuario.getCedula());
            int usuarioss = id_usuar.getCedula();
               

                String accion = "Se genero un reporte de los libros eliminados " ;
                Historiales historial = new Historiales(0, fechaActual, horaActual, usuario.getNombre(), accion, usuarioss);
                controH.agregarRegistroHistorial(historial);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al generar el reporte");
        }
    }//GEN-LAST:event_btnLibrosEliminadosActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIibro;
    private javax.swing.JButton btnLibrosCreados;
    private javax.swing.JButton btnLibrosEliminados;
    private javax.swing.JButton btnLibrosModificados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
