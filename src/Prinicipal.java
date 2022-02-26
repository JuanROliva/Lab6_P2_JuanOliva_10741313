
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author jr_02
 */
public class Prinicipal extends javax.swing.JFrame {

    DefaultListModel modeloListaPlaneta = new DefaultListModel();
    DefaultListModel modeloListaRaza = new DefaultListModel();
    DefaultComboBoxModel modeloComboRaza = new DefaultComboBoxModel();
    DefaultComboBoxModel modeloComboCobPlaneta = new DefaultComboBoxModel();
    DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("root");
    DefaultTreeModel modeloArbol = new DefaultTreeModel(raiz);
    DefaultListModel aliens = new DefaultListModel();

    public Prinicipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jp_AgregarPlaneta = new javax.swing.JPanel();
        cb_Agua_AgregarPlaneta = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jt_NombrePlaneta_AgregarPlaneta = new javax.swing.JTextField();
        spiner_Temperatura_AgregarPlaneta = new javax.swing.JSpinner();
        spiner_Tamano_AgregarPlaneta = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_Planetas = new javax.swing.JList<>();
        jb_AgregarPlaneta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jp_AgregarRaza = new javax.swing.JPanel();
        cb_ListaPlanetas_Raza = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jt_NombreRaza_AgregarRaza = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_Razas = new javax.swing.JList<>();
        jLabel13 = new javax.swing.JLabel();
        jp_AgregarAlien = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jl_Planetas_AgregarExplorador = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        spinerCantidadHumanos = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jl_Planetas_AgregarExplorador1 = new javax.swing.JList<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jl_Planetas_AgregarExplorador2 = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cb_Amenza_AgregarAlien = new javax.swing.JCheckBox();
        cb_AsignaPlanetaAlien = new javax.swing.JComboBox<>();
        jt_Nombre_AgregarAlien = new javax.swing.JTextField();
        spiner_Edad_AgregarAlien = new javax.swing.JSpinner();
        bt_AgregarAlien = new javax.swing.JButton();
        cb_ListaPlanetas_Raza1 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jb_AgregarAlArbol = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_ListaAliens = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        cb_Agua_AgregarPlaneta.setText("Tiene Agua");

        jLabel1.setText("Nombre del Planeta: ");

        jLabel3.setText("Tamaño:");

        jLabel4.setText("Temperatura: ");

        spiner_Temperatura_AgregarPlaneta.setModel(new javax.swing.SpinnerNumberModel(0, null, 1000, 10));

        spiner_Tamano_AgregarPlaneta.setModel(new javax.swing.SpinnerNumberModel(0, null, 10000, 10));

        jScrollPane1.setViewportView(jl_Planetas);

        jb_AgregarPlaneta.setText("Agregar");
        jb_AgregarPlaneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AgregarPlanetaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setText("Agregar Planeta");

        jLabel5.setText("Lista de Planetas Presentes");

        javax.swing.GroupLayout jp_AgregarPlanetaLayout = new javax.swing.GroupLayout(jp_AgregarPlaneta);
        jp_AgregarPlaneta.setLayout(jp_AgregarPlanetaLayout);
        jp_AgregarPlanetaLayout.setHorizontalGroup(
            jp_AgregarPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_AgregarPlanetaLayout.createSequentialGroup()
                .addGroup(jp_AgregarPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_AgregarPlanetaLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jb_AgregarPlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_AgregarPlanetaLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jp_AgregarPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp_AgregarPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jp_AgregarPlanetaLayout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jt_NombrePlaneta_AgregarPlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jp_AgregarPlanetaLayout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(spiner_Tamano_AgregarPlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jp_AgregarPlanetaLayout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jp_AgregarPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cb_Agua_AgregarPlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(spiner_Temperatura_AgregarPlaneta)))))))
                .addGap(78, 78, 78)
                .addGroup(jp_AgregarPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );
        jp_AgregarPlanetaLayout.setVerticalGroup(
            jp_AgregarPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_AgregarPlanetaLayout.createSequentialGroup()
                .addGroup(jp_AgregarPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_AgregarPlanetaLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_AgregarPlanetaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jp_AgregarPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_AgregarPlanetaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jp_AgregarPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_NombrePlaneta_AgregarPlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jp_AgregarPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spiner_Tamano_AgregarPlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addGroup(jp_AgregarPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(spiner_Temperatura_AgregarPlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cb_Agua_AgregarPlaneta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_AgregarPlaneta)))
                .addContainerGap(192, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Planeta", jp_AgregarPlaneta);

        jLabel6.setText("Seleccion un Planeta");

        jLabel7.setText("Nombre de la Raza");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel8.setText("Agregar Raza");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jl_Razas);

        jLabel13.setText("Razas Conocidas");

        javax.swing.GroupLayout jp_AgregarRazaLayout = new javax.swing.GroupLayout(jp_AgregarRaza);
        jp_AgregarRaza.setLayout(jp_AgregarRazaLayout);
        jp_AgregarRazaLayout.setHorizontalGroup(
            jp_AgregarRazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_AgregarRazaLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jp_AgregarRazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_AgregarRazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_ListaPlanetas_Raza, 0, 231, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jt_NombreRaza_AgregarRaza)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(jp_AgregarRazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        jp_AgregarRazaLayout.setVerticalGroup(
            jp_AgregarRazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_AgregarRazaLayout.createSequentialGroup()
                .addGroup(jp_AgregarRazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_AgregarRazaLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_ListaPlanetas_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_NombreRaza_AgregarRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jp_AgregarRazaLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(208, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Raza", jp_AgregarRaza);

        jScrollPane5.setViewportView(jl_Planetas_AgregarExplorador);

        jScrollPane6.setViewportView(jList2);

        jLabel14.setText("Planetas");

        jLabel15.setText("Planetas Explorados");

        jLabel16.setText("Planeta Favorito");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jTabbedPane2.addTab("Explorador", jPanel6);

        jLabel18.setText("Cantidad Humanos");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinerCantidadHumanos, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(358, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spinerCantidadHumanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Cazador", jPanel7);

        jScrollPane7.setViewportView(jl_Planetas_AgregarExplorador1);

        jLabel19.setText("Planetas");

        jLabel20.setText("Planetas Conquistados");

        jScrollPane8.setViewportView(jList3);

        jButton3.setText("Agregar");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(124, 124, 124))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Conquistador", jPanel8);

        jLabel21.setText("Animal Aducido");

        jLabel22.setText("Lista de Animales Abducidos");

        jScrollPane9.setViewportView(jl_Planetas_AgregarExplorador2);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jTabbedPane2.addTab("Abduzcano", jPanel9);

        jLabel9.setText("Nombre: ");

        jLabel10.setText("Edad: ");

        jLabel11.setText("Raza");

        cb_Amenza_AgregarAlien.setText("Amenaza");

        spiner_Edad_AgregarAlien.setModel(new javax.swing.SpinnerNumberModel(0, 0, 200, 1));

        bt_AgregarAlien.setText("Agregar");
        bt_AgregarAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AgregarAlienActionPerformed(evt);
            }
        });

        jLabel23.setText("Planeta");

        javax.swing.GroupLayout jp_AgregarAlienLayout = new javax.swing.GroupLayout(jp_AgregarAlien);
        jp_AgregarAlien.setLayout(jp_AgregarAlienLayout);
        jp_AgregarAlienLayout.setHorizontalGroup(
            jp_AgregarAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_AgregarAlienLayout.createSequentialGroup()
                .addGroup(jp_AgregarAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_AgregarAlienLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_AgregarAlienLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jp_AgregarAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp_AgregarAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_ListaPlanetas_Raza1, 0, 122, Short.MAX_VALUE)
                            .addComponent(jt_Nombre_AgregarAlien)
                            .addComponent(spiner_Edad_AgregarAlien))
                        .addGap(29, 29, 29)
                        .addGroup(jp_AgregarAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_AgregarAlienLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_AsignaPlanetaAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_AgregarAlienLayout.createSequentialGroup()
                                .addComponent(cb_Amenza_AgregarAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                                .addComponent(bt_AgregarAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(52, 52, 52))
        );
        jp_AgregarAlienLayout.setVerticalGroup(
            jp_AgregarAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_AgregarAlienLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jp_AgregarAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(cb_AsignaPlanetaAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Nombre_AgregarAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_AgregarAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_AgregarAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(spiner_Edad_AgregarAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_AgregarAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_Amenza_AgregarAlien)
                        .addComponent(bt_AgregarAlien)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jp_AgregarAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_ListaPlanetas_Raza1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("Agregar Alien", jp_AgregarAlien);

        jScrollPane3.setViewportView(jl_ListaAliens);

        jLabel12.setText("Lista de Aliens");

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane4.setViewportView(jTree1);

        jLabel17.setText("Arbol");

        javax.swing.GroupLayout jb_AgregarAlArbolLayout = new javax.swing.GroupLayout(jb_AgregarAlArbol);
        jb_AgregarAlArbol.setLayout(jb_AgregarAlArbolLayout);
        jb_AgregarAlArbolLayout.setHorizontalGroup(
            jb_AgregarAlArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jb_AgregarAlArbolLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jb_AgregarAlArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jb_AgregarAlArbolLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jb_AgregarAlArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        jb_AgregarAlArbolLayout.setVerticalGroup(
            jb_AgregarAlArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jb_AgregarAlArbolLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jb_AgregarAlArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17))
                .addGroup(jb_AgregarAlArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jb_AgregarAlArbolLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jb_AgregarAlArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jb_AgregarAlArbolLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jButton2)))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Arbol", jb_AgregarAlArbol);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_AgregarPlanetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_AgregarPlanetaActionPerformed
        agregarPlaneta();
    }//GEN-LAST:event_jb_AgregarPlanetaActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        int pestaniaSeleccionada = jTabbedPane1.getSelectedIndex();
        if (pestaniaSeleccionada == 1) {
            cargarDatosModeloComboBoxPlaneta();
            cb_ListaPlanetas_Raza.setModel(modeloComboCobPlaneta);
        }

        if (pestaniaSeleccionada == 2) {
            modeloComboRaza = new DefaultComboBoxModel();
            cargarDatosModeloComboBoxPlaneta();
            cb_ListaPlanetas_Raza1.setModel(modeloComboCobPlaneta);
            Object[] listaRazas = modeloListaRaza.toArray();
            for (Object r : listaRazas) {
                modeloComboRaza.addElement(r);
            }
            cb_AsignaPlanetaAlien.setModel(modeloComboRaza);
        }
        
        


    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agregarRaza();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_AgregarAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AgregarAlienActionPerformed
        int tipoAgregar = jTabbedPane2.getSelectedIndex();
        Alienigena a = new Alienigena();
        switch (tipoAgregar) {
            case 0:

                break;
            case 1:
                System.out.println("Aqui");
                String nombre = jt_Nombre_AgregarAlien.getText();
                int edad = (int)spiner_Edad_AgregarAlien.getValue();
                Raza r = (Raza)cb_AsignaPlanetaAlien.getSelectedItem();
                boolean amenaza = cb_Amenza_AgregarAlien.isSelected();
                int canhumanos = (int) spinerCantidadHumanos.getValue();
                
                a = new Cazador(canhumanos, nombre, r.toString(), edad, amenaza, (Planeta)cb_ListaPlanetas_Raza1.getSelectedItem());
                
                aliens.addElement(a);
                jl_ListaAliens.setModel(aliens);
                
                
                
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_bt_AgregarAlienActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (aliens.getSize()==0) {
            JOptionPane.showMessageDialog(this, "No hay aliens para agregar");
            return;
        }
        if(jl_ListaAliens.isSelectionEmpty()){
            agregarDatosArbol(aliens.get(0));
        }else{
            agregarDatosArbol(aliens.get(jl_ListaAliens.getSelectedIndex()));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Prinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prinicipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_AgregarAlien;
    private javax.swing.JCheckBox cb_Agua_AgregarPlaneta;
    private javax.swing.JCheckBox cb_Amenza_AgregarAlien;
    private javax.swing.JComboBox<String> cb_AsignaPlanetaAlien;
    private javax.swing.JComboBox<String> cb_ListaPlanetas_Raza;
    private javax.swing.JComboBox<String> cb_ListaPlanetas_Raza1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTree jTree1;
    private javax.swing.JPanel jb_AgregarAlArbol;
    private javax.swing.JButton jb_AgregarPlaneta;
    private javax.swing.JList<String> jl_ListaAliens;
    private javax.swing.JList<String> jl_Planetas;
    private javax.swing.JList<String> jl_Planetas_AgregarExplorador;
    private javax.swing.JList<String> jl_Planetas_AgregarExplorador1;
    private javax.swing.JList<String> jl_Planetas_AgregarExplorador2;
    private javax.swing.JList<String> jl_Razas;
    private javax.swing.JPanel jp_AgregarAlien;
    private javax.swing.JPanel jp_AgregarPlaneta;
    private javax.swing.JPanel jp_AgregarRaza;
    private javax.swing.JTextField jt_NombrePlaneta_AgregarPlaneta;
    private javax.swing.JTextField jt_NombreRaza_AgregarRaza;
    private javax.swing.JTextField jt_Nombre_AgregarAlien;
    private javax.swing.JSpinner spinerCantidadHumanos;
    private javax.swing.JSpinner spiner_Edad_AgregarAlien;
    private javax.swing.JSpinner spiner_Tamano_AgregarPlaneta;
    private javax.swing.JSpinner spiner_Temperatura_AgregarPlaneta;
    // End of variables declaration//GEN-END:variables

    public void agregarPlaneta() {
        String nombrePlaneta = jt_NombrePlaneta_AgregarPlaneta.getText();
        boolean validacion = nombrePlaneta.isBlank();
        if (validacion) {
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacio");
            return;
        }

        Object[] planetasDisponibles = modeloListaPlaneta.toArray();
        boolean condicion = false;
        for (Object p : planetasDisponibles) {
            Planeta x = (Planeta) p;
            condicion = x.validarNombre(jt_NombrePlaneta_AgregarPlaneta.getText());
            if (condicion) {
                JOptionPane.showMessageDialog(this, "El nombre del Planeta ya esta registrado");
                return;
            }
        }

        Planeta p = new Planeta();
        p.setNombrePlaneta(jt_NombrePlaneta_AgregarPlaneta.getText());
        p.setTamanoPlaneta((int) spiner_Tamano_AgregarPlaneta.getValue());
        p.setTemperaturaEnCelcius((int) spiner_Temperatura_AgregarPlaneta.getValue());
        p.setAguaPresente(cb_Agua_AgregarPlaneta.isSelected());

        modeloListaPlaneta.addElement(p);
        jl_Planetas.setModel(modeloListaPlaneta);

        jt_NombrePlaneta_AgregarPlaneta.setText("");

    }

    public void cargarDatosModeloComboBoxPlaneta() {
        modeloComboCobPlaneta = new DefaultComboBoxModel();
        int cantidad = modeloListaPlaneta.size();
        if (cantidad <= 0) {
            modeloComboCobPlaneta = new DefaultComboBoxModel();
            return;
        }
        Object[] planetasAgregados = modeloListaPlaneta.toArray();
        ArrayList planetas = new ArrayList();
        for (Object o : planetasAgregados) {
            planetas.add(o);
        }
        modeloComboCobPlaneta.addAll(planetas);
    }

    public void agregarRaza() {
        if (modeloComboCobPlaneta.getSize() == 0 || cb_ListaPlanetas_Raza.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Favor revisar si ha seleccionado un planeta, o si hay planetas agregados");
            return;
        }

        String nombre = jt_NombreRaza_AgregarRaza.getText();
        if (nombre.equals("")) {
            JOptionPane.showMessageDialog(this, "Favor agregue un nombre de la raza");
            return;
        }

        boolean condicion = false;

        Raza nueva = new Raza();

        if (modeloListaRaza.getSize() == 0) {
            nueva.setPlanetaPrimordial((Planeta) cb_ListaPlanetas_Raza.getSelectedItem());
            nueva.setNombreRaza(nombre);
            modeloListaRaza.addElement(nueva);
            jl_Razas.setModel(modeloListaRaza);
        } else {
            for (Object o : modeloListaRaza.toArray()) {
                condicion = ((Raza) o).getNombreRaza().equals(nombre);
                if (condicion) {
                    JOptionPane.showMessageDialog(this, "La raza ya ha sido agregado anteriormente");
                    return;
                }
            }
            modeloListaRaza.addElement(nueva);
            jl_Razas.setModel(modeloListaRaza);
        }
    }

    public void agregarDatosArbol(Object o) {
        DefaultMutableTreeNode planeta;
        DefaultMutableTreeNode tipoAlien;
        DefaultMutableTreeNode alien;

        Planeta p = ((Alienigena) o).getPlaneta();
        String tipo = "";
        if (((Alienigena) o) instanceof Explorador) {
            tipo = "Explorador";
        }

        if (((Alienigena) o) instanceof Cazador) {
            tipo = "Cazador";
        }

        if (((Alienigena) o) instanceof Conquistador) {
            tipo = "Conquistador";
        }

        if (((Alienigena) o) instanceof Abduzcan) {
            tipo = "Abduzcanor";
        }

        alien = new DefaultMutableTreeNode((Alienigena) o);

        if (raiz.getChildCount() == 0) {
            planeta = new DefaultMutableTreeNode(p);
            tipoAlien = new DefaultMutableTreeNode(tipo);
        } else {
            DefaultMutableTreeNode planetaEnTree = new DefaultMutableTreeNode();
            boolean hayPlanetaenTree = false;
            for (int i = 0; i < raiz.getChildCount(); i++) {
                planetaEnTree = (DefaultMutableTreeNode) raiz.getChildAt(i);
                if (planetaEnTree.toString().equals(p.toString())) {
                    hayPlanetaenTree = true;
                    break;
                }
            }

            if (!hayPlanetaenTree) {
                planeta = new DefaultMutableTreeNode(p);
            } else {
                planeta = planetaEnTree;
            }

            DefaultMutableTreeNode tipoEnTree = new DefaultMutableTreeNode();
            boolean hayTipoenTree = false;
            for (int i = 0; i < planeta.getChildCount(); i++) {
                tipoEnTree = (DefaultMutableTreeNode) planeta.getChildAt(i);
                if (tipoEnTree.toString().equals(tipo)) {
                    hayTipoenTree = true;
                    break;
                }
            }

            if (!hayTipoenTree) {
                tipoAlien = new DefaultMutableTreeNode(tipo);
            } else {
                tipoAlien = tipoEnTree;
            }

        }

        tipoAlien.add(alien);
        planeta.add(tipoAlien);
        raiz.add(planeta);

        modeloArbol.reload();
        jTree1.setModel(modeloArbol);

    }
}
