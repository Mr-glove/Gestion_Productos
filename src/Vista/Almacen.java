package Vista;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import Controlador.ConAlmacen;
import Modelo.dtoSessionManager;
import java.sql.Timestamp;
import java.util.Date;

public class Almacen extends javax.swing.JFrame {

    int xMouse,yMouse;
    Color text_black = new Color(255, 255, 255);
    ConAlmacen conAlm = new ConAlmacen();
    
    static String titulo[]={"Id","Nombre","Cantidad","Precio Unitario","Descripción"};
    public static DefaultTableModel modelo= new DefaultTableModel(null,titulo);
    
    
    // fecha y hora
    Date date = new Date();
    Timestamp tiempo = new Timestamp(date.getTime());
    
    public Almacen() {
        initComponents();
        Iniciar();
    }
    
    
    //metodo el cual te el dia y hora actual
    public Timestamp tiempo(){
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        return timestamp;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        pnlExit = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        btnBack = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlm = new javax.swing.JTable();
        lblId = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblPrecioUnitario = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCantida = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIngresar = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        taObservacion = new javax.swing.JTextArea();
        lblObservacion = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        taDescripcion = new javax.swing.JTextArea();
        pnlRetirar = new javax.swing.JPanel();
        lblRetirar = new javax.swing.JLabel();
        pnlIngresar = new javax.swing.JPanel();
        lblIngresar = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnlHeader.setBackground(new java.awt.Color(255, 255, 255));
        pnlHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlHeaderMouseDragged(evt);
            }
        });
        pnlHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlHeaderMousePressed(evt);
            }
        });

        pnlExit.setBackground(new java.awt.Color(255, 255, 255));

        lblCerrar.setBackground(new java.awt.Color(255, 255, 255));
        lblCerrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(0, 0, 0));
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("X");
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlExitLayout = new javax.swing.GroupLayout(pnlExit);
        pnlExit.setLayout(pnlExitLayout);
        pnlExitLayout.setHorizontalGroup(
            pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );
        pnlExitLayout.setVerticalGroup(
            pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_icon.png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_pressed.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tblAlm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblAlm.setModel(modelo);
        tblAlm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlmMouseClicked(evt);
            }
        });
        tblAlm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblAlmKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlm);

        lblId.setText("Id");

        lblNombre.setText("Nombre");

        lblDescripcion.setText("Descripcion");

        lblCantidad.setText("Cantidad");

        lblPrecioUnitario.setText("Precio Unitario");

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(255, 255, 255));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));

        txtCantida.setBackground(new java.awt.Color(255, 255, 255));

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Ingresar / Retirar");

        txtIngresar.setBackground(new java.awt.Color(255, 255, 255));

        taObservacion.setBackground(new java.awt.Color(255, 255, 255));
        taObservacion.setColumns(20);
        taObservacion.setRows(5);
        jScrollPane3.setViewportView(taObservacion);

        lblObservacion.setText("Observacion");

        taDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        taDescripcion.setColumns(20);
        taDescripcion.setRows(5);
        jScrollPane4.setViewportView(taDescripcion);

        pnlRetirar.setBackground(new java.awt.Color(0, 153, 204));
        pnlRetirar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblRetirar.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lblRetirar.setForeground(new java.awt.Color(255, 255, 255));
        lblRetirar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRetirar.setText("Retirar");
        lblRetirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRetirarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRetirarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRetirarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlRetirarLayout = new javax.swing.GroupLayout(pnlRetirar);
        pnlRetirar.setLayout(pnlRetirarLayout);
        pnlRetirarLayout.setHorizontalGroup(
            pnlRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRetirarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlRetirarLayout.setVerticalGroup(
            pnlRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlIngresar.setBackground(new java.awt.Color(0, 153, 204));
        pnlIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIngresar.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lblIngresar.setForeground(new java.awt.Color(255, 255, 255));
        lblIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngresar.setText("Ingresar");
        lblIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIngresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlIngresarLayout = new javax.swing.GroupLayout(pnlIngresar);
        pnlIngresar.setLayout(pnlIngresarLayout);
        pnlIngresarLayout.setHorizontalGroup(
            pnlIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlIngresarLayout.setVerticalGroup(
            pnlIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIngresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsuario.setText("Usuario: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(lblObservacion))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(pnlIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(pnlRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCantidad)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(lblId)
                                                    .addGap(34, 34, 34))
                                                .addComponent(lblNombre)))
                                        .addGap(49, 49, 49))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPrecioUnitario)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecio)
                                    .addComponent(txtCantida)
                                    .addComponent(txtNombre)
                                    .addComponent(txtId)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescripcion)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(lblUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUsuario)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCantidad))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecioUnitario))
                        .addGap(28, 28, 28)
                        .addComponent(lblDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblObservacion)
                        .addGap(39, 39, 39))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseEntered
        pnlExit.setBackground(Color.RED);
    }//GEN-LAST:event_lblCerrarMouseEntered

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseExited
        pnlExit.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblCerrarMouseExited

    private void pnlHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);

    }//GEN-LAST:event_pnlHeaderMouseDragged

    private void pnlHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnlHeaderMousePressed

    private void lblRetirarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRetirarMouseClicked
            conAlm.RetirarProductos(Integer.parseInt(txtId.getText()),
                                      Integer.parseInt(txtIngresar.getText()),
                                      dtoSessionManager.getIdUser(),
                                      tiempo(), 
                                      taObservacion.getText());

    }//GEN-LAST:event_lblRetirarMouseClicked

    private void lblRetirarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRetirarMouseEntered
        pnlRetirar.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_lblRetirarMouseEntered

    private void lblRetirarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRetirarMouseExited
        pnlRetirar.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_lblRetirarMouseExited

    private void lblIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarMouseClicked
        
        ConAlmacen conAlm = new ConAlmacen();
        conAlm.IngresarProductos(Integer.parseInt(txtId.getText()),
                                   Integer.parseInt(txtIngresar.getText()),
                                  dtoSessionManager.getIdUser(), 
                                  tiempo(), 
                                       taObservacion.getText());
        
        conAlm.LLenarTabla();
    }//GEN-LAST:event_lblIngresarMouseClicked

    private void lblIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarMouseEntered
        pnlIngresar.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_lblIngresarMouseEntered

    private void lblIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarMouseExited
        pnlIngresar.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_lblIngresarMouseExited

    private void tblAlmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAlmKeyPressed
        
    }//GEN-LAST:event_tblAlmKeyPressed

    private void tblAlmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlmMouseClicked
        int fila=tblAlm.getSelectedRow();
        txtId.setText(tblAlm.getValueAt(fila,0).toString());
        txtNombre.setText(tblAlm.getValueAt(fila,1).toString());
        txtCantida.setText(tblAlm.getValueAt(fila,2).toString());
        txtPrecio.setText(tblAlm.getValueAt(fila,3).toString());
        taDescripcion.setText(tblAlm.getValueAt(fila,4).toString());
        
        conAlm.LLenarTabla();
    }//GEN-LAST:event_tblAlmMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if(!dtoSessionManager.getRol().equals("administrador")){
            dtoSessionManager.setUser("", 0,"");
            Login log = new Login();
            log.setVisible(true);
            this.setVisible(false);
        }else{
            Menu men = new Menu();
            men.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    
    public void Iniciar(){
        conAlm.LLenarTabla();
        lblUsuario.setText("Usuario: "+ dtoSessionManager.getUsername());
    }
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
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Almacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBack;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIngresar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblObservacion;
    private javax.swing.JLabel lblPrecioUnitario;
    private javax.swing.JLabel lblRetirar;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlIngresar;
    private javax.swing.JPanel pnlRetirar;
    private javax.swing.JTextArea taDescripcion;
    private javax.swing.JTextArea taObservacion;
    public static javax.swing.JTable tblAlm;
    private javax.swing.JTextField txtCantida;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIngresar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
