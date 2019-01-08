package Praktikum_10.MetroUI;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Nyunnyun
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        form_awal(false);
        this.setExtendedState(this.getExtendedState() | Menu.MAXIMIZED_BOTH);
        pSidebar.setVisible(false);
        pDashboard.setVisible(false);
        pPencarian.setVisible(false);
        pSetting.setVisible(false);
        pMsg.setVisible(false);
    }
    
    public void form_awal(boolean xyz){
        panelMenu.setVisible(xyz);
        panelNavigasi.setVisible(xyz);
        lbSetting.setVisible(xyz);
        lbPencarian.setVisible(xyz);
        lbMsg.setVisible(xyz);
    }
    
    public void login(){
        String id_user = txtIDUser.getText();
        String password = txtPassword.getText();
        
        if(id_user.equals("")){
            JOptionPane.showMessageDialog(this, "ID. User belum di isi!", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
        }else if(password.equals("")){
            JOptionPane.showMessageDialog(this, "Password belum di isi!", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
        }else if(!id_user.equals("171530029")||!password.equals("mahasiswa")){
            JOptionPane.showMessageDialog(this, "ID. User dan Password Salah!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }else{
            form_awal(true);
            panelLogin.setVisible(false);
            pDashboard.setVisible(true);
        }
    }
    
    void set_color1(JPanel panel){
        panel.setBackground(Color.DARK_GRAY);
    }
    void set_color2(JPanel panel){
        panel.setBackground(new java.awt.Color(80, 80, 80));
    }
    void set_color3(JPanel panel){
        panel.setBackground(new java.awt.Color(255, 204, 0));
    }
    void set_color4(JPanel panel){
        panel.setBackground(Color.LIGHT_GRAY);
    }
    void set_color5(JPanel panel){
        panel.setBackground(new java.awt.Color(240, 240, 240));
    }
    void set_color6(JPanel panel){
        panel.setBackground(new java.awt.Color(0, 102, 204));
    }
     void set_color7(JPanel panel){
        panel.setBackground(Color.GRAY);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtIDUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        panelMenu = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        mnAdd = new javax.swing.JPanel();
        d = new javax.swing.JLabel();
        mnProfile = new javax.swing.JPanel();
        c = new javax.swing.JLabel();
        mnReport = new javax.swing.JPanel();
        b = new javax.swing.JLabel();
        mnExit = new javax.swing.JPanel();
        a = new javax.swing.JLabel();
        panelNavigasi = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        lbSetting = new javax.swing.JLabel();
        lbPencarian = new javax.swing.JLabel();
        lbMsg = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pSidebar = new javax.swing.JPanel();
        lbSidebar = new javax.swing.JLabel();
        pPencarian = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        pSetting = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        pMsg = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        pDashboard = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mnActivity = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        mnNotif = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mnContacts = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mnTask = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        mnWork = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        mnPending = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jtgl = new javax.swing.JLabel();
        mnDel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mnProduct = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        mnPIP = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        mnApproval = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        mnTracking = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblDashboard = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelLogin.setBackground(java.awt.Color.darkGray);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum_10/lock.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Login User");

        jLabel13.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("ID User");

        txtIDUser.setBackground(java.awt.Color.darkGray);
        txtIDUser.setForeground(java.awt.Color.orange);
        txtIDUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDUser.setText("171530029");
        txtIDUser.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("Password");

        txtPassword.setBackground(java.awt.Color.darkGray);
        txtPassword.setForeground(java.awt.Color.orange);
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setText("mahasiswa");
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnLogin.setBackground(java.awt.Color.orange);
        btnLogin.setForeground(java.awt.Color.white);
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLoginLayout.createSequentialGroup()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13))
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIDUser, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(26, 26, 26))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(5, 5, 5)
                .addComponent(txtIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenu.setBackground(java.awt.Color.darkGray);

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum_10/crystal-wijaya.png"))); // NOI18N

        lblUsername.setBackground(java.awt.Color.white);
        lblUsername.setFont(new java.awt.Font("Bradley Hand ITC", 0, 18)); // NOI18N
        lblUsername.setForeground(java.awt.Color.white);
        lblUsername.setText("Crystal Widjaja");

        mnAdd.setBackground(new java.awt.Color(80, 80, 80));
        mnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnAddMouseExited(evt);
            }
        });

        d.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        d.setForeground(java.awt.Color.white);
        d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum_10/nav-menu.png"))); // NOI18N
        d.setText("Add");

        javax.swing.GroupLayout mnAddLayout = new javax.swing.GroupLayout(mnAdd);
        mnAdd.setLayout(mnAddLayout);
        mnAddLayout.setHorizontalGroup(
            mnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnAddLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(d)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mnAddLayout.setVerticalGroup(
            mnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(d)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnProfile.setBackground(new java.awt.Color(80, 80, 80));
        mnProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnProfileMouseExited(evt);
            }
        });

        c.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        c.setForeground(java.awt.Color.white);
        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum_10/nav-menu.png"))); // NOI18N
        c.setText("Profile");

        javax.swing.GroupLayout mnProfileLayout = new javax.swing.GroupLayout(mnProfile);
        mnProfile.setLayout(mnProfileLayout);
        mnProfileLayout.setHorizontalGroup(
            mnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnProfileLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(c)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mnProfileLayout.setVerticalGroup(
            mnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(c)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnReport.setBackground(new java.awt.Color(80, 80, 80));
        mnReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnReportMouseExited(evt);
            }
        });

        b.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b.setForeground(java.awt.Color.white);
        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum_10/nav-menu.png"))); // NOI18N
        b.setText("Report");

        javax.swing.GroupLayout mnReportLayout = new javax.swing.GroupLayout(mnReport);
        mnReport.setLayout(mnReportLayout);
        mnReportLayout.setHorizontalGroup(
            mnReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnReportLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(b)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mnReportLayout.setVerticalGroup(
            mnReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnExit.setBackground(new java.awt.Color(80, 80, 80));
        mnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnExitMouseExited(evt);
            }
        });

        a.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        a.setForeground(java.awt.Color.orange);
        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum_10/exit.png"))); // NOI18N
        a.setText("Exit");

        javax.swing.GroupLayout mnExitLayout = new javax.swing.GroupLayout(mnExit);
        mnExit.setLayout(mnExitLayout);
        mnExitLayout.setHorizontalGroup(
            mnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnExitLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(a)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mnExitLayout.setVerticalGroup(
            mnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(a)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername)
                    .addComponent(lblFoto))
                .addContainerGap(33, Short.MAX_VALUE))
            .addComponent(mnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mnReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mnReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelNavigasi.setBackground(new java.awt.Color(80, 80, 80));

        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum_10/nav-menu1.png"))); // NOI18N
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelNavigasiLayout = new javax.swing.GroupLayout(panelNavigasi);
        panelNavigasi.setLayout(panelNavigasiLayout);
        panelNavigasiLayout.setHorizontalGroup(
            panelNavigasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNavigasiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMenu)
                .addContainerGap())
        );
        panelNavigasiLayout.setVerticalGroup(
            panelNavigasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNavigasiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(java.awt.Color.white);

        jPanel7.setBackground(java.awt.Color.darkGray);

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum_10/close.png"))); // NOI18N
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        lbSetting.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbSetting.setForeground(java.awt.Color.white);
        lbSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum_10/settings.png"))); // NOI18N
        lbSetting.setText("Settings");
        lbSetting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSettingMouseClicked(evt);
            }
        });

        lbPencarian.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbPencarian.setForeground(new java.awt.Color(255, 255, 255));
        lbPencarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum_10/icons8-detective-24.png"))); // NOI18N
        lbPencarian.setText("Search");
        lbPencarian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbPencarian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPencarianMouseClicked(evt);
            }
        });

        lbMsg.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbMsg.setForeground(new java.awt.Color(255, 255, 255));
        lbMsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum_10/icons8-speech-bubble-24.png"))); // NOI18N
        lbMsg.setText("Message");
        lbMsg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbMsg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMsgMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPencarian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbSetting)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClose))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblClose, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbSetting)
                        .addComponent(lbPencarian)
                        .addComponent(lbMsg)))
                .addGap(0, 0, 0))
        );

        jPanel5.setLayout(new javax.swing.OverlayLayout(jPanel5));

        jPanel2.setOpaque(false);
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        pSidebar.setBackground(java.awt.Color.darkGray);

        lbSidebar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbSidebar.setForeground(new java.awt.Color(255, 255, 255));
        lbSidebar.setText("lbSidebar");

        pPencarian.setBackground(java.awt.Color.darkGray);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum_10/icons8-detective-24.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pPencarianLayout = new javax.swing.GroupLayout(pPencarian);
        pPencarian.setLayout(pPencarianLayout);
        pPencarianLayout.setHorizontalGroup(
            pPencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPencarianLayout.createSequentialGroup()
                .addContainerGap(297, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
            .addGroup(pPencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pPencarianLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(54, Short.MAX_VALUE)))
        );
        pPencarianLayout.setVerticalGroup(
            pPencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPencarianLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(pPencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pPencarianLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(31, Short.MAX_VALUE)))
        );

        pSetting.setBackground(java.awt.Color.darkGray);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(java.awt.Color.white);
        jLabel19.setText("Set Theme");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Darkgray" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setForeground(java.awt.Color.white);
        jLabel35.setText("Language");

        javax.swing.GroupLayout pSettingLayout = new javax.swing.GroupLayout(pSetting);
        pSetting.setLayout(pSettingLayout);
        pSettingLayout.setHorizontalGroup(
            pSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSettingLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, 0, 287, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pSettingLayout.createSequentialGroup()
                        .addGroup(pSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel35))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pSettingLayout.setVerticalGroup(
            pSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSettingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );

        pMsg.setBackground(java.awt.Color.darkGray);

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum_10/icons8-plus-64.png"))); // NOI18N
        jLabel41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("Click here to add");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("No Message");

        javax.swing.GroupLayout pMsgLayout = new javax.swing.GroupLayout(pMsg);
        pMsg.setLayout(pMsgLayout);
        pMsgLayout.setHorizontalGroup(
            pMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMsgLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(pMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMsgLayout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel41)
                        .addGap(33, 33, 33))
                    .addGroup(pMsgLayout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pMsgLayout.setVerticalGroup(
            pMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMsgLayout.createSequentialGroup()
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addGroup(pMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMsgLayout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMsgLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(38, 38, 38))))
        );

        javax.swing.GroupLayout pSidebarLayout = new javax.swing.GroupLayout(pSidebar);
        pSidebar.setLayout(pSidebarLayout);
        pSidebarLayout.setHorizontalGroup(
            pSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSidebarLayout.createSequentialGroup()
                .addGroup(pSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pSidebarLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lbSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
            .addGroup(pSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pSidebarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pSidebarLayout.setVerticalGroup(
            pSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSidebarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbSidebar)
                .addGap(5, 5, 5)
                .addComponent(pPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(pSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pSidebarLayout.createSequentialGroup()
                    .addGap(360, 360, 360)
                    .addComponent(pMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(254, Short.MAX_VALUE)))
        );

        pDashboard.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.darkGray);
        jLabel2.setText("Create");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.darkGray);
        jLabel3.setText("Play");

        mnActivity.setBackground(new java.awt.Color(255, 0, 0));
        mnActivity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnActivityMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnActivityMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("My Office");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/MetroUI/ms-publisher.png"))); // NOI18N

        javax.swing.GroupLayout mnActivityLayout = new javax.swing.GroupLayout(mnActivity);
        mnActivity.setLayout(mnActivityLayout);
        mnActivityLayout.setHorizontalGroup(
            mnActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnActivityLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(mnActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mnActivityLayout.setVerticalGroup(
            mnActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnActivityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        mnNotif.setBackground(new java.awt.Color(0, 153, 204));
        mnNotif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnNotifMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnNotifMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel5.setText("8");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Tuesday");

        javax.swing.GroupLayout mnNotifLayout = new javax.swing.GroupLayout(mnNotif);
        mnNotif.setLayout(mnNotifLayout);
        mnNotifLayout.setHorizontalGroup(
            mnNotifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnNotifLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(mnNotifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mnNotifLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mnNotifLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(20, 20, 20))))
        );
        mnNotifLayout.setVerticalGroup(
            mnNotifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnNotifLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(24, 24, 24))
        );

        mnContacts.setBackground(new java.awt.Color(153, 0, 153));
        mnContacts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnContactsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnContactsMouseExited(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setText("OneNote");
        jLabel37.setIconTextGap(5);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum_10/girl.png"))); // NOI18N

        javax.swing.GroupLayout mnContactsLayout = new javax.swing.GroupLayout(mnContacts);
        mnContacts.setLayout(mnContactsLayout);
        mnContactsLayout.setHorizontalGroup(
            mnContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mnContactsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(mnContactsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mnContactsLayout.setVerticalGroup(
            mnContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mnContactsLayout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        mnTask.setBackground(new java.awt.Color(0, 0, 204));
        mnTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnTaskMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnTaskMouseExited(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setText("See all your mail in one place");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel33.setText("And more....");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel34.setText("Mail");

        javax.swing.GroupLayout mnTaskLayout = new javax.swing.GroupLayout(mnTask);
        mnTask.setLayout(mnTaskLayout);
        mnTaskLayout.setHorizontalGroup(
            mnTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnTaskLayout.createSequentialGroup()
                .addGroup(mnTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mnTaskLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mnTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel34)))
                    .addGroup(mnTaskLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel33)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        mnTaskLayout.setVerticalGroup(
            mnTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addGap(42, 42, 42)
                .addComponent(jLabel34)
                .addContainerGap())
        );

        mnWork.setBackground(new java.awt.Color(0, 255, 0));
        mnWork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnWorkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnWorkMouseExited(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum_10/icons8-schedule-100.png"))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/MetroUI/xbox.png"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Xbox");

        javax.swing.GroupLayout mnWorkLayout = new javax.swing.GroupLayout(mnWork);
        mnWork.setLayout(mnWorkLayout);
        mnWorkLayout.setHorizontalGroup(
            mnWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnWorkLayout.createSequentialGroup()
                .addGroup(mnWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mnWorkLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel22))
                    .addGroup(mnWorkLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel25))
                    .addGroup(mnWorkLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        mnWorkLayout.setVerticalGroup(
            mnWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mnWorkLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jLabel25)
                .addGap(68, 68, 68))
        );

        mnPending.setBackground(new java.awt.Color(0, 102, 204));
        mnPending.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnPendingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnPendingMouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/MetroUI/download.png"))); // NOI18N
        jLabel17.setToolTipText("");

        javax.swing.GroupLayout mnPendingLayout = new javax.swing.GroupLayout(mnPending);
        mnPending.setLayout(mnPendingLayout);
        mnPendingLayout.setHorizontalGroup(
            mnPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mnPendingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mnPendingLayout.setVerticalGroup(
            mnPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnPendingLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jtgl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jtgl.setText("24 NOVEMBER 2018");
        jtgl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtglMouseClicked(evt);
            }
        });

        mnDel.setBackground(new java.awt.Color(0, 0, 0));
        mnDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnDelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnDelMouseExited(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum_10/icons8-increase-100.png"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("NETFLIX");

        javax.swing.GroupLayout mnDelLayout = new javax.swing.GroupLayout(mnDel);
        mnDel.setLayout(mnDelLayout);
        mnDelLayout.setHorizontalGroup(
            mnDelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnDelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(80, 80, 80))
            .addGroup(mnDelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel4)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        mnDelLayout.setVerticalGroup(
            mnDelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mnDelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(19, 19, 19))
        );

        mnProduct.setBackground(new java.awt.Color(0, 102, 204));
        mnProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnProductMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnProductMouseExited(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum_10/icons8-box-64.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Galeri");

        javax.swing.GroupLayout mnProductLayout = new javax.swing.GroupLayout(mnProduct);
        mnProduct.setLayout(mnProductLayout);
        mnProductLayout.setHorizontalGroup(
            mnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnProductLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(mnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel20))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        mnProductLayout.setVerticalGroup(
            mnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnProductLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        mnPIP.setBackground(new java.awt.Color(0, 0, 204));
        mnPIP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnPIPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnPIPMouseExited(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/MetroUI/download.png"))); // NOI18N
        jLabel26.setToolTipText("");

        javax.swing.GroupLayout mnPIPLayout = new javax.swing.GroupLayout(mnPIP);
        mnPIP.setLayout(mnPIPLayout);
        mnPIPLayout.setHorizontalGroup(
            mnPIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mnPIPLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(29, 29, 29))
        );
        mnPIPLayout.setVerticalGroup(
            mnPIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnPIPLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel26)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        mnApproval.setBackground(java.awt.Color.darkGray);
        mnApproval.setForeground(new java.awt.Color(0, 0, 204));
        mnApproval.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnApprovalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnApprovalMouseExited(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel29.setForeground(java.awt.Color.white);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/MetroUI/calculator.png"))); // NOI18N
        jLabel29.setToolTipText("");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setForeground(java.awt.Color.white);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/MetroUI/synchronize.png"))); // NOI18N

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setForeground(java.awt.Color.white);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/MetroUI/marker.png"))); // NOI18N

        javax.swing.GroupLayout mnApprovalLayout = new javax.swing.GroupLayout(mnApproval);
        mnApproval.setLayout(mnApprovalLayout);
        mnApprovalLayout.setHorizontalGroup(
            mnApprovalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnApprovalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(mnApprovalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mnApprovalLayout.setVerticalGroup(
            mnApprovalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnApprovalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(1, 1, 1)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31)
                .addGap(37, 37, 37))
        );

        mnTracking.setBackground(new java.awt.Color(0, 0, 255));
        mnTracking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnTrackingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnTrackingMouseExited(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel40.setForeground(java.awt.Color.white);
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum_10/icons8-fraction-100.png"))); // NOI18N

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/MetroUI/download.png"))); // NOI18N

        javax.swing.GroupLayout mnTrackingLayout = new javax.swing.GroupLayout(mnTracking);
        mnTracking.setLayout(mnTrackingLayout);
        mnTrackingLayout.setHorizontalGroup(
            mnTrackingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnTrackingLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel38)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mnTrackingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        mnTrackingLayout.setVerticalGroup(
            mnTrackingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnTrackingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout pDashboardLayout = new javax.swing.GroupLayout(pDashboard);
        pDashboard.setLayout(pDashboardLayout);
        pDashboardLayout.setHorizontalGroup(
            pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDashboardLayout.createSequentialGroup()
                .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDashboardLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtgl)
                            .addComponent(jLabel2)
                            .addGroup(pDashboardLayout.createSequentialGroup()
                                .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(mnActivity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mnNotif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mnContacts, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mnPending, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDashboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mnTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDashboardLayout.createSequentialGroup()
                        .addComponent(mnDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDashboardLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel3))
                    .addComponent(mnWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mnApproval, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mnPIP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mnTracking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        pDashboardLayout.setVerticalGroup(
            pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDashboardLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jtgl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDashboardLayout.createSequentialGroup()
                        .addComponent(mnPIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mnApproval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(mnTracking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(425, 425, 425))
                    .addGroup(pDashboardLayout.createSequentialGroup()
                        .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mnWork, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pDashboardLayout.createSequentialGroup()
                                .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mnContacts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mnNotif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mnPending, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mnActivity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mnDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mnTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pSidebar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pDashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel2);

        lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum_10/material-design-hd-background.jpg"))); // NOI18N
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 1491, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel1);

        jPanel4.setBackground(java.awt.Color.darkGray);

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Copyright 2019 GOJEK INDONESIA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1153, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelNavigasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelNavigasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        login();
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        panelMenu.setVisible(true);
    }//GEN-LAST:event_lblMenuMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void mnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnExitMouseClicked
        int exit = JOptionPane.showConfirmDialog(this,
                "Apakah anda yakin ingin keluar dari aplikasi? ", "Konfirmasi",
                JOptionPane.YES_NO_OPTION);
        if (exit==JOptionPane.YES_OPTION){
            form_awal(false);
        }
    }//GEN-LAST:event_mnExitMouseClicked

    private void mnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnAddMouseEntered
        set_color1(mnAdd);
    }//GEN-LAST:event_mnAddMouseEntered

    private void mnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnAddMouseExited
        set_color2(mnAdd);
    }//GEN-LAST:event_mnAddMouseExited

    private void mnProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnProfileMouseEntered
        set_color1(mnProfile);
    }//GEN-LAST:event_mnProfileMouseEntered

    private void mnProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnProfileMouseExited
        set_color2(mnProfile);
    }//GEN-LAST:event_mnProfileMouseExited

    private void mnReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnReportMouseEntered
        set_color1(mnReport);
    }//GEN-LAST:event_mnReportMouseEntered

    private void mnReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnReportMouseExited
        set_color2(mnReport);
    }//GEN-LAST:event_mnReportMouseExited

    private void mnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnExitMouseEntered
        set_color1(mnExit);
    }//GEN-LAST:event_mnExitMouseEntered

    private void mnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnExitMouseExited
        set_color2(mnExit);
    }//GEN-LAST:event_mnExitMouseExited

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        panelMenu.setVisible(false);
        panelNavigasi.setVisible(true);
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void lbPencarianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPencarianMouseClicked
        pSidebar.setVisible(true);
        lbSidebar.setText("Search Here");
        pPencarian.setVisible(true);
        pSetting.setVisible(false);
        pMsg.setVisible(false);
    }//GEN-LAST:event_lbPencarianMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        pSidebar.setVisible(false);
        panelMenu.setVisible(false);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jtglMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtglMouseClicked
      
    }//GEN-LAST:event_jtglMouseClicked

    private void lbSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSettingMouseClicked
        pSidebar.setVisible(true);
        lbSidebar.setText("Settings");
        pPencarian.setVisible(false);
        pSetting.setVisible(true);
        pMsg.setVisible(false);
    }//GEN-LAST:event_lbSettingMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void mnNotifMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnNotifMouseEntered
       set_color3(mnNotif);
    }//GEN-LAST:event_mnNotifMouseEntered

    private void mnNotifMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnNotifMouseExited
       set_color4(mnNotif);
    }//GEN-LAST:event_mnNotifMouseExited

    private void mnContactsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnContactsMouseEntered
        set_color3(mnContacts);
    }//GEN-LAST:event_mnContactsMouseEntered

    private void mnContactsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnContactsMouseExited
        set_color5(mnContacts);
    }//GEN-LAST:event_mnContactsMouseExited

    private void mnActivityMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnActivityMouseEntered
        set_color3(mnActivity);
    }//GEN-LAST:event_mnActivityMouseEntered

    private void mnActivityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnActivityMouseExited
        set_color1(mnActivity);
    }//GEN-LAST:event_mnActivityMouseExited

    private void mnPendingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPendingMouseEntered
       set_color3(mnPending);
    }//GEN-LAST:event_mnPendingMouseEntered

    private void mnPendingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPendingMouseExited
        set_color6(mnPending);
    }//GEN-LAST:event_mnPendingMouseExited

    private void mnTaskMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnTaskMouseEntered
        set_color3(mnTask);
    }//GEN-LAST:event_mnTaskMouseEntered

    private void mnTaskMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnTaskMouseExited
        set_color7(mnTask);
    }//GEN-LAST:event_mnTaskMouseExited

    private void mnDelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnDelMouseEntered
        set_color3(mnDel);
    }//GEN-LAST:event_mnDelMouseEntered

    private void mnDelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnDelMouseExited
        set_color4(mnDel);
    }//GEN-LAST:event_mnDelMouseExited

    private void mnProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnProductMouseEntered
        set_color3(mnProduct);
    }//GEN-LAST:event_mnProductMouseEntered

    private void mnProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnProductMouseExited
        set_color6(mnProduct);
    }//GEN-LAST:event_mnProductMouseExited

    private void mnWorkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnWorkMouseEntered
       set_color3(mnWork);
    }//GEN-LAST:event_mnWorkMouseEntered

    private void mnWorkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnWorkMouseExited
       set_color7(mnWork);
    }//GEN-LAST:event_mnWorkMouseExited

    private void mnPIPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPIPMouseEntered
       set_color3(mnPIP);
    }//GEN-LAST:event_mnPIPMouseEntered

    private void mnPIPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPIPMouseExited
        set_color4(mnPIP);
    }//GEN-LAST:event_mnPIPMouseExited

    private void mnApprovalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnApprovalMouseEntered
       set_color3(mnApproval);
    }//GEN-LAST:event_mnApprovalMouseEntered

    private void mnApprovalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnApprovalMouseExited
        set_color1(mnApproval);
    }//GEN-LAST:event_mnApprovalMouseExited

    private void mnTrackingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnTrackingMouseEntered
       set_color3(mnTracking);
    }//GEN-LAST:event_mnTrackingMouseEntered

    private void mnTrackingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnTrackingMouseExited
      set_color4(mnTracking);
    }//GEN-LAST:event_mnTrackingMouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void lbMsgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMsgMouseClicked
        pSidebar.setVisible(true);
        lbSidebar.setText("Message");
        pPencarian.setVisible(false);
        pSetting.setVisible(false);
        pMsg.setVisible(true);
    }//GEN-LAST:event_lbMsgMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel c;
    private javax.swing.JLabel d;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jtgl;
    private javax.swing.JLabel lbMsg;
    private javax.swing.JLabel lbPencarian;
    private javax.swing.JLabel lbSetting;
    private javax.swing.JLabel lbSidebar;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel mnActivity;
    private javax.swing.JPanel mnAdd;
    private javax.swing.JPanel mnApproval;
    private javax.swing.JPanel mnContacts;
    private javax.swing.JPanel mnDel;
    private javax.swing.JPanel mnExit;
    private javax.swing.JPanel mnNotif;
    private javax.swing.JPanel mnPIP;
    private javax.swing.JPanel mnPending;
    private javax.swing.JPanel mnProduct;
    private javax.swing.JPanel mnProfile;
    private javax.swing.JPanel mnReport;
    private javax.swing.JPanel mnTask;
    private javax.swing.JPanel mnTracking;
    private javax.swing.JPanel mnWork;
    private javax.swing.JPanel pDashboard;
    private javax.swing.JPanel pMsg;
    private javax.swing.JPanel pPencarian;
    private javax.swing.JPanel pSetting;
    private javax.swing.JPanel pSidebar;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelNavigasi;
    private javax.swing.JTextField txtIDUser;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
