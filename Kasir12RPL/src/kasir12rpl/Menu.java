
package kasir12rpl;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        zxbaksob = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtapesan = new javax.swing.JTextArea();
        btn_save = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        cbbaksob = new javax.swing.JCheckBox();
        btn_reset = new javax.swing.JButton();
        cbesteh = new javax.swing.JCheckBox();
        cbesjrk = new javax.swing.JCheckBox();
        sbbaksoj = new javax.swing.JCheckBox();
        cbbaksok = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbbaksou = new javax.swing.JCheckBox();
        zxbaksob1 = new javax.swing.JLabel();
        cbbaksot = new javax.swing.JCheckBox();
        zxbaksob2 = new javax.swing.JLabel();
        cbtehangt = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        cbjrkangt = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        spin1 = new javax.swing.JSpinner();
        spin2 = new javax.swing.JSpinner();
        spin3 = new javax.swing.JSpinner();
        spin4 = new javax.swing.JSpinner();
        spin5 = new javax.swing.JSpinner();
        spin6 = new javax.swing.JSpinner();
        spin7 = new javax.swing.JSpinner();
        spin8 = new javax.swing.JSpinner();
        spin9 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Makanan");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1162, 800));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel7.setText("Rp. 6.000");

        zxbaksob.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        zxbaksob.setText("Rp. 12.000");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("Rp. 15.000");

        txtapesan.setColumns(20);
        txtapesan.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        txtapesan.setRows(5);
        jScrollPane1.setViewportView(txtapesan);

        btn_save.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setText("MENU MINUMAN");

        btn_cancel.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        cbbaksob.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        cbbaksob.setText("Bakso biasa");

        btn_reset.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        cbesteh.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        cbesteh.setText("Es Teh");

        cbesjrk.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        cbesjrk.setText("Es Jeruk");

        sbbaksoj.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        sbbaksoj.setText("Bakso Jumbo");
        sbbaksoj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbbaksojActionPerformed(evt);
            }
        });

        cbbaksok.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        cbbaksok.setText("Bakso Kikil");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel6.setText("Rp. 5.000");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Rp. 5.000");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel8.setText("MENU MAKANAN");

        cbbaksou.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        cbbaksou.setText("Bakso Urat");

        zxbaksob1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        zxbaksob1.setText("Rp. 10.000");

        cbbaksot.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        cbbaksot.setText("Bakso Telur");

        zxbaksob2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        zxbaksob2.setText("Rp. 10.000");

        cbtehangt.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        cbtehangt.setText("Teh Anget");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel9.setText("Rp. 4.000");

        cbjrkangt.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        cbjrkangt.setText("Jeruk Anget");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel10.setText("Rp. 3.000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel5)
                        .addGap(871, 871, 871))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbbaksob)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sbbaksoj)
                                            .addComponent(cbbaksok)
                                            .addComponent(cbbaksou)
                                            .addComponent(cbbaksot))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(zxbaksob)
                                        .addComponent(zxbaksob1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(zxbaksob2, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbesteh)
                                            .addComponent(cbesjrk))
                                        .addGap(211, 211, 211)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbtehangt)
                                            .addComponent(cbjrkangt))
                                        .addGap(187, 187, 187)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))))
                                .addGap(24, 24, 24)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(spin6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(spin1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spin2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spin3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spin4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(spin5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(spin7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(spin8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(spin9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(139, 139, 139)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel8)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbaksob)
                            .addComponent(jLabel2)
                            .addComponent(spin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sbbaksoj)
                                    .addComponent(jLabel3))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(zxbaksob)
                                        .addComponent(spin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbbaksok))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(zxbaksob1)
                                    .addComponent(cbbaksou)
                                    .addComponent(spin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbbaksot)
                                    .addComponent(zxbaksob2)
                                    .addComponent(spin5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(spin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbesteh)
                    .addComponent(jLabel6)
                    .addComponent(spin6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbesjrk)
                    .addComponent(jLabel7)
                    .addComponent(spin7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbtehangt)
                    .addComponent(spin8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbjrkangt)
                    .addComponent(jLabel10)
                    .addComponent(spin9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sbbaksojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbbaksojActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sbbaksojActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        cbbaksob.setSelected(false);
        sbbaksoj.setSelected(false);
        cbbaksok.setSelected(false);
        cbbaksou.setSelected(false);
        cbbaksot.setSelected(false);
        cbesteh.setSelected(false);
        cbesjrk.setSelected(false);
        cbtehangt.setSelected(false);
        cbjrkangt.setSelected(false);

        spin1.setValue(0);
        spin2.setValue(0);
        spin3.setValue(0);
        spin4.setValue(0);
        spin5.setValue(0);
        spin6.setValue(0);
        spin7.setValue(0);
        spin8.setValue(0);
        spin9.setValue(0);

        txtapesan.setText("");
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        Kasir kasir = new Kasir();
        kasir.setVisible(true);

        // Tutup form sekarang
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        String tampil;
        tampil = "";
        int bayar = 0;
        if (cbbaksob.isSelected()) {
            int jumlah = (Integer) spin1.getValue();
            int total;
            total = jumlah * 5000;
            bayar = bayar + total;
            tampil +=cbbaksob.getText() + " Rp.5000" + " x " + jumlah + " = " + total + "\n";
        }if (sbbaksoj.isSelected()) {
            int jumlah = (Integer) spin2.getValue();
            int total;
            total = jumlah * 10000;
            bayar = bayar + total;
            tampil +=sbbaksoj.getText() + " Rp.10000" + " x " + jumlah + " = " + total + "\n";
        }if (cbbaksok.isSelected()) {
            int jumlah = (Integer) spin3.getValue();
            int total;
            total = jumlah * 12000;
            bayar = bayar + total;
            tampil +=cbbaksok.getText() + " Rp.10000" + " x " + jumlah + " = " + total + "\n";
        }if (cbbaksou.isSelected()) {
            int jumlah = (Integer) spin4.getValue();
            int total;
            total = jumlah * 10000;
            bayar = bayar + total;
            tampil +=cbbaksou.getText() + " Rp.10000" + " x " + jumlah + " = " + total + "\n";
        }if (cbbaksot.isSelected()) {
            int jumlah = (Integer) spin5.getValue();
            int total;
            total = jumlah * 10000;
            bayar = bayar + total;
            tampil +=cbbaksot.getText() + " Rp.10000" + " x " + jumlah + " = " + total + "\n";
        }if (cbesteh.isSelected()) {
            int jumlah = (Integer) spin6.getValue();
            int total;
            total = jumlah * 3000;
            bayar = bayar + total;
            tampil +=cbesteh.getText() + " Rp.3000" + " x " + jumlah + " = " + total + "\n";
        }if (cbesjrk.isSelected()) {
            int jumlah = (Integer) spin7.getValue();
            int total;
            total = jumlah * 4000;
            bayar = bayar + total;
            tampil +=cbesjrk.getText() + " Rp.3000" + " x " + jumlah + " = " + total + "\n";
        }if (cbjrkangt.isSelected()) {
            int jumlah = (Integer) spin8.getValue();
            int total;
            total = jumlah * 3000;
            bayar = bayar + total;
            tampil +=cbjrkangt.getText() + " Rp.3000" + " x " + jumlah + " = " + total + "\n";
        }if (cbtehangt.isSelected()) {
            int jumlah = (Integer) spin9.getValue();
            int total;
            total = jumlah * 4000;
            bayar = bayar + total;
            tampil +=cbtehangt.getText() + " Rp.4000" + " x " + jumlah + " = " + total + "\n";
        }
        txtapesan.setText(tampil+"================="+"\n"+"Total Bayar = "+bayar);
    }//GEN-LAST:event_btn_saveActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_save;
    private javax.swing.JCheckBox cbbaksob;
    private javax.swing.JCheckBox cbbaksok;
    private javax.swing.JCheckBox cbbaksot;
    private javax.swing.JCheckBox cbbaksou;
    private javax.swing.JCheckBox cbesjrk;
    private javax.swing.JCheckBox cbesteh;
    private javax.swing.JCheckBox cbjrkangt;
    private javax.swing.JCheckBox cbtehangt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox sbbaksoj;
    private javax.swing.JSpinner spin1;
    private javax.swing.JSpinner spin2;
    private javax.swing.JSpinner spin3;
    private javax.swing.JSpinner spin4;
    private javax.swing.JSpinner spin5;
    private javax.swing.JSpinner spin6;
    private javax.swing.JSpinner spin7;
    private javax.swing.JSpinner spin8;
    private javax.swing.JSpinner spin9;
    private javax.swing.JTextArea txtapesan;
    private javax.swing.JLabel zxbaksob;
    private javax.swing.JLabel zxbaksob1;
    private javax.swing.JLabel zxbaksob2;
    // End of variables declaration//GEN-END:variables
}
