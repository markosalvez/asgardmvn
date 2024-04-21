/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ap.main;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Menú de diálogo que permite al jugador elegir entre
 * <ul>
 *  <li>Volver al juego</li>
 *  <li>Cambiar el idioma</li>
 *  <li>Salir del juego</li>
 * </ul>
 * 
 * @author Sergio
 * @version 1.0, 6 Jun 2014
 */
public final class DialogoMenu extends javax.swing.JDialog {
   
    final PanelJuego panelJuego;
    private final Main main;
    
    /**
     * Constructor de <code>DialogoMenu</code>
     * 
     * @param parent <code>Frame</code> padre del diálogo
     * @param modal
     */
    public DialogoMenu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.main = (Main) parent;
        panelJuego = ((Main) parent).getPanelJuego();
        initComponents();
        initMoreComponents();
        configurarIdioma();
    }
    
    /**
     * Ajusta, al idioma seleccionado, el texto de las diversas opciones
     */
    public void configurarIdioma(){
        btVolver.setText (ResourceBundle.getBundle("localizacion.Menus", com.ap.configuracion.Parametros.getInstance().getLocalizacion()).getString("volver_juego"));
        btOpciones.setText (ResourceBundle.getBundle("localizacion.Menus", com.ap.configuracion.Parametros.getInstance().getLocalizacion()).getString("opciones"));
        btSalir.setText (ResourceBundle.getBundle("localizacion.Menus", com.ap.configuracion.Parametros.getInstance().getLocalizacion()).getString("salir"));
    }
    
    /**
     * Configura la fuente y el tamaño del texto a mostrar
     */
    public void initMoreComponents(){
        try {
            //FUENTE CC-BY --> http://fontstruct.com/fontstructions/show/pixel_unicode
            InputStream is = getClass().getResourceAsStream("/fonts/Pixel-UniCode.ttf");
            Font fuenteDialogo = Font.createFont(Font.TRUETYPE_FONT, is);
            Libs.getInstance().formatearComponente(this.btVolver,fuenteDialogo,24);
            Libs.getInstance().formatearComponente(this.btOpciones,fuenteDialogo,24);
            Libs.getInstance().formatearComponente(this.btSalir,fuenteDialogo,24);
                    
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(DialogoMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btVolver = new javax.swing.JButton();
        btOpciones = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        btVolver.setText("Volver al Juego");
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });

        btOpciones.setText("Opciones");
        btOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOpcionesActionPerformed(evt);
            }
        });

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btOpciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Cierra el diálogo y retorna al juego
     * @param evt 
     */
    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverActionPerformed
        panelJuego.getPersonaje().setHayDialogo(false);
        this.dispose();
    }//GEN-LAST:event_btVolverActionPerformed

    /**
     * Sale del juego
     * @param evt 
     */
    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSalirActionPerformed

    /**
     * Cierra el diálogo y retorna al juego, si se pulsa la tecla ESC
     * @param evt 
     */
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE){
            panelJuego.getPersonaje().setHayDialogo(false);
            this.dispose();
        }
    }//GEN-LAST:event_formKeyPressed

    /**
     * Instancia y muestra un nuevo diálogo de tipo <code>dialogoOpciones</code>, 
     * con opciones de idioma.
     * @param evt 
     */
    private void btOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpcionesActionPerformed
        DialogoOpciones dialogoOpciones = new DialogoOpciones(main,false);
        dialogoOpciones.setDialogoMenu(this);
        dialogoOpciones.setLocationRelativeTo(panelJuego);
        
        dialogoOpciones.setVisible(true);
        this.panelJuego.getPersonaje().setHayDialogo(true);
        dialogoOpciones.requestFocus();
    }//GEN-LAST:event_btOpcionesActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DialogoMenu dialog = new DialogoMenu(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btOpciones;
    private javax.swing.JButton btSalir;
    private javax.swing.JButton btVolver;
    // End of variables declaration//GEN-END:variables
}
