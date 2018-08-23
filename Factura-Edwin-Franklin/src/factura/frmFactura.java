
package factura;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmFactura extends javax.swing.JInternalFrame {
    
    float x = 0;
    float y = 0;


    public frmFactura() {
        initComponents();
        actualizarTablaArticulo();
        EstablecerTablaVenta();
    }
    
    private void actualizarTablaArticulo() {
        String[] etiquetasTabla = {"Código Producto", "Nombre Producto",
            "Descripción Producto", "Precio Producto", "Cantidad"};
        Object[][] data = Formulario.Articulo.arregloArticulo();
        DefaultTableModel deftTableModel = new DefaultTableModel(data, etiquetasTabla);
        this.tablaProducto.setModel(deftTableModel);
    }
    
    private void EstablecerTablaVenta() {
        String[] etiquetasTabla1 = {"Código", "Nombre",
            "Descripción", "Precio", "Cantidad", "SubTotal"};
        Object[][] data = Formulario.Articulo.arregloVenta();
        DefaultTableModel deftTableModel = new DefaultTableModel(data, etiquetasTabla1);
        this.tablaVenta.setModel(deftTableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlAgregar_Producto = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblCodPrdct = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        lblNombPrdct = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        lblDescpPrdct = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lblCantdPrdct = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblPrecioPrdct = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnCncl = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        pnlRealizar_Venta = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblNumero_Factura = new javax.swing.JLabel();
        txtNumeroFactura = new javax.swing.JTextField();
        lblFech = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblRtn = new javax.swing.JLabel();
        txtRTN = new javax.swing.JTextField();
        lblNomb = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnRealizar_Encabezado = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtbuscarCodigo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblDescpDet = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblPrVntDet = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCantidad_Vender = new javax.swing.JTextField();
        lblNombPrdcDetll = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        btnIngrArt = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblFctEnc = new javax.swing.JLabel();
        lblFchEnc = new javax.swing.JLabel();
        lblRtnEnc = new javax.swing.JLabel();
        lblNombEnc = new javax.swing.JLabel();
        LblEncabezado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        lblSub_Total = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblIsv = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblTotal_Pagar = new javax.swing.JLabel();

        setVisible(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblCodPrdct.setBackground(new java.awt.Color(153, 153, 255));
        lblCodPrdct.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodPrdct.setText("Código producto:");

        txtCodigoProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCodigoProducto.setText("22");

        lblNombPrdct.setBackground(new java.awt.Color(153, 153, 255));
        lblNombPrdct.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombPrdct.setText("Nombre producto:");

        txtNombreProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNombreProducto.setText("Cama");

        lblDescpPrdct.setBackground(new java.awt.Color(153, 153, 255));
        lblDescpPrdct.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDescpPrdct.setText("Descripción producto:");

        txtDescripcion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtDescripcion.setText("Suaves y duraderas");

        lblCantdPrdct.setBackground(new java.awt.Color(153, 153, 255));
        lblCantdPrdct.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantdPrdct.setText("Cantidad producto:");

        txtCantidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCantidad.setText("50");
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        lblPrecioPrdct.setBackground(new java.awt.Color(153, 153, 255));
        lblPrecioPrdct.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPrecioPrdct.setText("Precio venta:");

        txtPrecio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPrecio.setText("1500");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescpPrdct)
                    .addComponent(lblNombPrdct, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCodPrdct, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPrecioPrdct)
                            .addComponent(lblCantdPrdct))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigoProducto)
                    .addComponent(txtNombreProducto)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(txtCantidad)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodPrdct)
                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombPrdct)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescpPrdct)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantdPrdct)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioPrdct)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnCncl.setBackground(new java.awt.Color(255, 0, 51));
        btnCncl.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        btnCncl.setText("Cancelar");
        btnCncl.setToolTipText("Cancela la operacion");
        btnCncl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCnclActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaProducto);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnGuardar.setBackground(new java.awt.Color(0, 204, 51));
        btnGuardar.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        btnGuardar.setText("Agregar Articulo");
        btnGuardar.setToolTipText("Ingresa el articulo actual");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCncl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCncl)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlAgregar_ProductoLayout = new javax.swing.GroupLayout(pnlAgregar_Producto);
        pnlAgregar_Producto.setLayout(pnlAgregar_ProductoLayout);
        pnlAgregar_ProductoLayout.setHorizontalGroup(
            pnlAgregar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregar_ProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAgregar_ProductoLayout.setVerticalGroup(
            pnlAgregar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregar_ProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Producto", pnlAgregar_Producto);

        pnlRealizar_Venta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel6.setBackground(new java.awt.Color(255, 255, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNumero_Factura.setBackground(new java.awt.Color(255, 255, 0));
        lblNumero_Factura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNumero_Factura.setText("N° Factura:");

        txtNumeroFactura.setText("2521553");

        lblFech.setBackground(new java.awt.Color(255, 255, 0));
        lblFech.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFech.setText("Fecha:");

        txtFecha.setText("21-6-2018");

        lblRtn.setBackground(new java.awt.Color(255, 255, 0));
        lblRtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRtn.setText("RTN:");

        txtRTN.setText("125165165");

        lblNomb.setBackground(new java.awt.Color(255, 255, 0));
        lblNomb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNomb.setText("Nombre:");

        txtNombre.setText("Edwin Olivera");

        btnRealizar_Encabezado.setBackground(new java.awt.Color(51, 255, 51));
        btnRealizar_Encabezado.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btnRealizar_Encabezado.setText("Ingresar Encabezado");
        btnRealizar_Encabezado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizar_EncabezadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRealizar_Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNumero_Factura)
                            .addComponent(lblFech)
                            .addComponent(lblRtn)
                            .addComponent(lblNomb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumeroFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(txtFecha)
                            .addComponent(txtRTN)
                            .addComponent(txtNombre))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRealizar_Encabezado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero_Factura)
                    .addComponent(txtNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFech)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomb)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton5.setBackground(new java.awt.Color(0, 255, 204));
        jButton5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jButton5.setText("Buscar Codigo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 51, 51));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Código Producto:");

        txtbuscarCodigo.setText("22");
        txtbuscarCodigo.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtbuscarCodigo.setEnabled(false);
        txtbuscarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarCodigoActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 51, 51));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Nombre Producto:");

        jLabel13.setBackground(new java.awt.Color(255, 51, 51));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Descripción:");

        jLabel15.setBackground(new java.awt.Color(255, 51, 51));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Precio Venta:");

        jLabel17.setBackground(new java.awt.Color(255, 51, 51));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Cantidad a vender:");

        txtCantidad_Vender.setText("2");
        txtCantidad_Vender.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCantidad_Vender.setEnabled(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDescpDet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPrVntDet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCantidad_Vender)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbuscarCodigo)
                                    .addComponent(lblNombPrdcDetll, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(lblNombPrdcDetll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblDescpDet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lblPrVntDet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtCantidad_Vender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaVenta);

        btnIngrArt.setBackground(new java.awt.Color(51, 153, 0));
        btnIngrArt.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        btnIngrArt.setText("Realizar Venta del Articulo");
        btnIngrArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngrArtActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("N° Factura:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Fecha:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("RTN:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Nombre:");

        LblEncabezado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblEncabezado.setText("ENCABEZADO");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("SubTotal:");

        lblSub_Total.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        lblSub_Total.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSub_Total.setText(" ");
        lblSub_Total.setToolTipText("");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("ISV:");

        lblIsv.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        lblIsv.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIsv.setText(" ");
        lblIsv.setToolTipText("");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Total a pagar:");

        lblTotal_Pagar.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        lblTotal_Pagar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotal_Pagar.setText(" ");
        lblTotal_Pagar.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIsv, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(lblTotal_Pagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSub_Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblSub_Total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblIsv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lblTotal_Pagar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlRealizar_VentaLayout = new javax.swing.GroupLayout(pnlRealizar_Venta);
        pnlRealizar_Venta.setLayout(pnlRealizar_VentaLayout);
        pnlRealizar_VentaLayout.setHorizontalGroup(
            pnlRealizar_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRealizar_VentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRealizar_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRealizar_VentaLayout.createSequentialGroup()
                        .addGroup(pnlRealizar_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRealizar_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRealizar_VentaLayout.createSequentialGroup()
                                .addGroup(pnlRealizar_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlRealizar_VentaLayout.createSequentialGroup()
                                        .addGroup(pnlRealizar_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel27))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlRealizar_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblNombEnc, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                            .addComponent(lblRtnEnc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblFchEnc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblFctEnc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(LblEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(103, 103, 103)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE))
                        .addGap(65, 65, 65))
                    .addGroup(pnlRealizar_VentaLayout.createSequentialGroup()
                        .addComponent(btnIngrArt, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlRealizar_VentaLayout.setVerticalGroup(
            pnlRealizar_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRealizar_VentaLayout.createSequentialGroup()
                .addGroup(pnlRealizar_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRealizar_VentaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlRealizar_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlRealizar_VentaLayout.createSequentialGroup()
                                .addGroup(pnlRealizar_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(lblFctEnc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlRealizar_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(lblFchEnc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlRealizar_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26)
                                    .addComponent(lblRtnEnc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlRealizar_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27)
                                    .addComponent(lblNombEnc))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRealizar_VentaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlRealizar_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRealizar_VentaLayout.createSequentialGroup()
                                .addComponent(LblEncabezado)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlRealizar_VentaLayout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIngrArt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Realizar Venta", pnlRealizar_Venta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
 
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        Articulo articulo = new Articulo();
        if (this.txtCodigoProducto.getText().isEmpty()
                || txtNombreProducto.getText().isEmpty()
                || txtDescripcion.getText().isEmpty()
                || txtPrecio.getText().isEmpty()
                || txtCantidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(pnlAgregar_Producto, "Ha dejado algun campo vacio, tienen que estar lleno todos");
        } else {
            articulo.setCodigoProducto(Integer.parseInt(txtCodigoProducto.getText()));
            articulo.setNombreProducto(txtNombreProducto.getText());
            articulo.setDescripcionProducto(txtDescripcion.getText());
            articulo.setPrecioProducto(Float.parseFloat(txtPrecio.getText()));
            articulo.setCantidadProducto(Integer.parseInt(txtCantidad.getText()));
            Formulario.Articulo.agregarProducto(articulo);
            actualizarTablaArticulo();
            
            
            
        }
         btnCnclActionPerformed(evt);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRealizar_EncabezadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizar_EncabezadoActionPerformed

        boolean f;
        boolean t;
        f = true;
        t = false;
        lblFctEnc.setText(txtNumeroFactura.getText());
        lblFchEnc.setText(txtFecha.getText());
        lblRtnEnc.setText(txtRTN.getText());
        lblNombEnc.setText(txtNombre.getText());
        
        txtCantidad_Vender.enable(f);
        txtbuscarCodigo.enable(f);
        
        
        txtNumeroFactura.enable(t);
        txtFecha.enable(t);
        txtRTN.enable(t);

        txtNombre.enable(t);
        

    }//GEN-LAST:event_btnRealizar_EncabezadoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        Articulo buscArtc = Formulario.Articulo.buscar_producto_objeto(Integer.parseInt(txtbuscarCodigo.getText()));
        lblNombPrdcDetll.setText(buscArtc.getNombreProducto());
        lblDescpDet.setText(buscArtc.getDescripcionProducto());
        lblPrVntDet.setText(String.valueOf(buscArtc.getPrecioProducto()));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnIngrArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngrArtActionPerformed

        Articulo articulo = new Articulo();
        if (txtCantidad_Vender.getText().isEmpty()) {
            JOptionPane.showMessageDialog(pnlAgregar_Producto, "Ha dejado algun campo vacio. Debe llenar todos los campos");
        } else {
            articulo.setSubCodigoProducto(Integer.parseInt(txtbuscarCodigo.getText()));
            articulo.setSubNombreProducto(lblNombPrdcDetll.getText());
            articulo.setSubDescripcionProducto(lblDescpDet.getText());
            articulo.setSubPrecioProducto(Float.parseFloat(lblPrVntDet.getText()));
            articulo.setSubCantidadProducto(Integer.parseInt(txtCantidad_Vender.getText()));
            articulo.setSubTotal(Float.parseFloat(lblPrVntDet.getText()));

            float j = Float.parseFloat(lblPrVntDet.getText());
            float i = Float.parseFloat(txtCantidad_Vender.getText());
            float p = i * j;

            articulo.setSubTotal(p);
            Formulario.Articulo.agregarSubTotalProducto(articulo);
            EstablecerTablaVenta();
            y = articulo.getSubTotal() + x;
            x = y;
            lblSub_Total.setText("Lps. "+String.valueOf(x));
            float k  = (float) (x*0.15);
            lblIsv.setText("Lps. " + String.valueOf(k));
            lblTotal_Pagar.setText("Lps. " + String.valueOf(x+k));
        }
        txtCantidad_Vender.setText("");
        txtbuscarCodigo.setText("");
    }//GEN-LAST:event_btnIngrArtActionPerformed

    private void btnCnclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCnclActionPerformed
        txtCantidad.setText("");
        txtCodigoProducto.setText("");
        txtDescripcion.setText("");
        txtNombreProducto.setText("");
        txtPrecio.setText("");
        
    }//GEN-LAST:event_btnCnclActionPerformed

    private void txtbuscarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarCodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblEncabezado;
    private javax.swing.JButton btnCncl;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIngrArt;
    private javax.swing.JButton btnRealizar_Encabezado;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCantdPrdct;
    private javax.swing.JLabel lblCodPrdct;
    private javax.swing.JLabel lblDescpDet;
    private javax.swing.JLabel lblDescpPrdct;
    private javax.swing.JLabel lblFchEnc;
    private javax.swing.JLabel lblFctEnc;
    private javax.swing.JLabel lblFech;
    private javax.swing.JLabel lblIsv;
    private javax.swing.JLabel lblNomb;
    private javax.swing.JLabel lblNombEnc;
    private javax.swing.JLabel lblNombPrdcDetll;
    private javax.swing.JLabel lblNombPrdct;
    private javax.swing.JLabel lblNumero_Factura;
    private javax.swing.JLabel lblPrVntDet;
    private javax.swing.JLabel lblPrecioPrdct;
    private javax.swing.JLabel lblRtn;
    private javax.swing.JLabel lblRtnEnc;
    private javax.swing.JLabel lblSub_Total;
    private javax.swing.JLabel lblTotal_Pagar;
    private javax.swing.JPanel pnlAgregar_Producto;
    private javax.swing.JPanel pnlRealizar_Venta;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidad_Vender;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtNumeroFactura;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtRTN;
    private javax.swing.JTextField txtbuscarCodigo;
    // End of variables declaration//GEN-END:variables
}
