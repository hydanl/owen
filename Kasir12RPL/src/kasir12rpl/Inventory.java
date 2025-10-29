
package kasir12rpl;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane; // Opsional, untuk pesan error/sukses
import java.io.FileWriter; // Untuk menulis ke file
import java.io.IOException; // Untuk menangani error I/O
import java.io.BufferedReader; // Untuk membaca file
import java.io.FileReader;    // Untuk membaca file

public class Inventory extends javax.swing.JFrame {
    
     public Inventory() {
        initComponents();
        tbl.setAutoCreateRowSorter(true);
        loadInventoryData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btncancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnubah = new javax.swing.JButton();
        btnhps = new javax.swing.JButton();
        btnsim = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btncari = new javax.swing.JButton();
        txtkode = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtstuan = new javax.swing.JTextField();
        txtjnsbrng = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtstok = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory");
        setPreferredSize(new java.awt.Dimension(1162, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btncancel.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("Kode Barang :");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setText("Harga :");

        btnubah.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        btnubah.setText("Ubah");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });

        btnhps.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        btnhps.setText("Hapus");
        btnhps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhpsActionPerformed(evt);
            }
        });

        btnsim.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        btnsim.setText("Simpan");
        btnsim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimActionPerformed(evt);
            }
        });

        tbl.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "KODE", "NAMA BARANG", "HARGA", "SATUAN", "JENIS BARANG", "STOK"
            }
        ));
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Nama Barang :");

        btnsave.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btncari.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        txtkode.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtkode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodeActionPerformed(evt);
            }
        });

        txtnama.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtnama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        txtharga.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtharga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setText("Satuan :");

        txtstuan.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtstuan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtstuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstuanActionPerformed(evt);
            }
        });

        txtjnsbrng.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtjnsbrng.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtjnsbrng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjnsbrngActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel6.setText("Jenis Barang :");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel7.setText("Stok :");

        txtstok.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtstok.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtstok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(23, 23, 23))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnubah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtstuan, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtjnsbrng, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtstok, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnsim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnhps, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncari, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncari, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtstuan, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtjnsbrng, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtstok, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnubah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsim, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnhps, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(260, Short.MAX_VALUE))
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

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        Kasir kasir = new Kasir();
        kasir.setVisible(true);

        // Tutup form sekarang
        this.dispose();
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
    String filePath = "inventory_data.csv";
    FileWriter writer = null;
    
    try {
        writer = new FileWriter(filePath);
        
        // 1. Tulis Header Kolom ke File (Opsional)
        for (int i = 0; i < model.getColumnCount(); i++) {
            writer.write(model.getColumnName(i) + (i == model.getColumnCount() - 1 ? "" : ","));
        }
        writer.write(System.getProperty("line.separator")); // Baris baru
        
        // 2. Tulis Data Setiap Baris
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                // Ambil data dan tambahkan koma sebagai pemisah (CSV)
                writer.write(model.getValueAt(i, j).toString() + (j == model.getColumnCount() - 1 ? "" : ","));
            }
            writer.write(System.getProperty("line.separator")); // Baris baru
        }
        
        JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke file: " + filePath, "Sukses", JOptionPane.INFORMATION_MESSAGE);
        
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Gagal menyimpan data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException e) {
                // Abaikan error saat menutup file
            }
        }
    }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void txtkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkodeActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
      String kodeCari = txtkode.getText().trim();
    
    // 2. Cek apakah kode pencarian kosong
    if (kodeCari.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Masukkan Kode Barang yang ingin dicari.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // 3. Dapatkan Model Tabel
    DefaultTableModel model = (DefaultTableModel) tbl.getModel();
    
    // 4. Cari baris yang cocok
    boolean ditemukan = false;
    for (int i = 0; i < model.getRowCount(); i++) {
        // Ambil nilai dari kolom KODE (kolom ke-0)
        String kodeTabel = model.getValueAt(i, 0).toString();
        
        if (kodeTabel.equalsIgnoreCase(kodeCari)) {
            // Data ditemukan!
            
            // Pilih baris tersebut
            tbl.setRowSelectionInterval(i, i);
            
            // Scroll ke baris yang ditemukan (opsional)
            tbl.scrollRectToVisible(tbl.getCellRect(i, 0, true));
            
            ditemukan = true;
            
            // Isi Text Field dengan data yang ditemukan (sama seperti tblMouseClicked)
            txtnama.setText(model.getValueAt(i, 1).toString());
            txtharga.setText(model.getValueAt(i, 2).toString());
            txtstuan.setText(model.getValueAt(i, 3).toString());
            txtjnsbrng.setText(model.getValueAt(i, 4).toString());
            txtstok.setText(model.getValueAt(i, 5).toString());
            
            JOptionPane.showMessageDialog(this, "Kode Barang " + kodeCari + " ditemukan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            break; // Hentikan perulangan setelah ditemukan
        }
    }
    
    // 5. Jika tidak ditemukan
    if (!ditemukan) {
        JOptionPane.showMessageDialog(this, "Kode Barang " + kodeCari + " tidak ditemukan di tabel.", "Info", JOptionPane.INFORMATION_MESSAGE);
        // Kosongkan Text Field selain kode yang dicari
        txtnama.setText("");
        txtharga.setText("");
        txtstuan.setText("");
        txtjnsbrng.setText("");
        txtstok.setText("");
        // Hapus seleksi di tabel
        tbl.clearSelection();
    }
    }//GEN-LAST:event_btncariActionPerformed

    private void btnsimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimActionPerformed
      DefaultTableModel model = (DefaultTableModel) tbl.getModel();
    
    // 2. Ambil data dari Text Field (memperbaiki pengambilan data)
    String kodeBarang = txtkode.getText();
    String namaBarang = txtnama.getText();
    String harga = txtharga.getText(); // Kolom baru: HARGA
    String satuan = txtstuan.getText();
    String jenisBarang = txtjnsbrng.getText();
    String stok = txtstok.getText();// Kolom baru: STOK (Menggunakan txtstok1)
    
    // 3. Validasi sederhana
    if (kodeBarang.isEmpty() || namaBarang.isEmpty() || harga.isEmpty() || satuan.isEmpty() || jenisBarang.isEmpty() || stok.isEmpty()) { // Tambahkan validasi harga dan stok
        JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // 4. Buat array objek untuk baris baru (4 Kolom: KODE, NAMA, HARGA, STOK)
    Object[] row = {kodeBarang, namaBarang, harga, satuan, jenisBarang, stok}; // Tambahkan harga dan stok
    
    model.addRow(row); 
    
    // 6. Bersihkan Text Field setelah data disimpan
    txtkode.setText("");
    txtnama.setText("");
    txtharga.setText(""); // Bersihkan Harga
    txtstuan.setText("");
    txtjnsbrng.setText("");
    txtstok.setText("");// Bersihkan Stok
    
    JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan ke tabel!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnsimActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
       int barisTerpilih = tbl.getSelectedRow();
    
    // 2. Cek apakah ada baris yang dipilih
    if (barisTerpilih == -1) {
        JOptionPane.showMessageDialog(this, "Pilih baris yang ingin diubah terlebih dahulu.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // 3. Ambil data baru dari Text Field
    String kodeBaru = txtkode.getText();
    String namaBaru = txtnama.getText();
    String hargaBaru = txtharga.getText();
    String satuanBaru = txtstuan.getText();
    String jenisBaru = txtjnsbrng.getText();
    String stokBaru = txtstok.getText();
    
    // 4. Validasi sederhana
    if (kodeBaru.isEmpty() || namaBaru.isEmpty() || hargaBaru.isEmpty() || satuanBaru.isEmpty() || jenisBaru.isEmpty() || stokBaru.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // 5. Dapatkan Model Tabel
    DefaultTableModel model = (DefaultTableModel) tbl.getModel();
    
    // 6. Ubah nilai pada baris terpilih
    model.setValueAt(kodeBaru, barisTerpilih, 0); 
    model.setValueAt(namaBaru, barisTerpilih, 1); 
    model.setValueAt(hargaBaru, barisTerpilih, 2);
    model.setValueAt(satuanBaru, barisTerpilih, 3);
    model.setValueAt(jenisBaru, barisTerpilih, 4);
    model.setValueAt(stokBaru, barisTerpilih, 5);
    
    // 7. Bersihkan Text Field
    txtkode.setText("");
    txtnama.setText("");
    txtharga.setText("");
    txtstuan.setText("");
    txtjnsbrng.setText("");
    txtstok.setText("");
    
    JOptionPane.showMessageDialog(this, "Data berhasil diubah!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnubahActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        int baris = tbl.getSelectedRow();
    
    // 2. Jika baris dipilih (indeks >= 0)
    if (baris >= 0) {
        // 3. Ambil nilai dari tabel berdasarkan kolom
        // Perhatikan INDEKS KOLOM: 0=Kode, 1=Nama, 2=Harga, 3=Stok
        String kode = tbl.getValueAt(baris, 0).toString();
        String nama = tbl.getValueAt(baris, 1).toString();
        String harga = tbl.getValueAt(baris, 2).toString(); // Ambil Harga (Kolom 2)
        String satuan = tbl.getValueAt(baris, 3).toString(); 
        String jenis = tbl.getValueAt(baris, 4).toString();
        String stok = tbl.getValueAt(baris, 5).toString();// ***Ini adalah nilai STOK (Kolom 3)***
        
        // 4. Isi Text Field dengan data yang diambil
        txtkode.setText(kode);
        txtnama.setText(nama);
        txtharga.setText(harga); // Isi Harga ke txtharga
        txtstuan.setText(satuan); 
        txtjnsbrng.setText(jenis);
        txtstok.setText(stok);// ***Koreksi: Isi Stok ke txtstok1***
    }
    }//GEN-LAST:event_tblMouseClicked

    private void btnhpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhpsActionPerformed
        int barisTerpilih = tbl.getSelectedRow();
    
    // 2. Cek apakah ada baris yang dipilih
    if (barisTerpilih == -1) {
        JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus terlebih dahulu.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // 3. Konfirmasi penghapusan
    int konfirmasi = JOptionPane.showConfirmDialog(this, 
                                                "Yakin ingin menghapus data ini?", 
                                                "Konfirmasi Hapus", 
                                                JOptionPane.YES_NO_OPTION);
    
    // 4. Jika pengguna memilih YES (Ya)
    if (konfirmasi == JOptionPane.YES_OPTION) {
        // 5. Dapatkan Model Tabel
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        
        // 6. Hapus baris dari model
        model.removeRow(barisTerpilih);
        
        // 7. Bersihkan Text Field (Opsional)
        txtkode.setText("");
        txtnama.setText("");
        txtharga.setText("");
        txtstuan.setText("");
        txtjnsbrng.setText("");
        txtstok.setText("");
        
        JOptionPane.showMessageDialog(this, "Data berhasil dihapus dari tabel.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btnhpsActionPerformed

    private void txtstuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstuanActionPerformed

    private void txtjnsbrngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjnsbrngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjnsbrngActionPerformed

    private void txtstokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstokActionPerformed

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
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnhps;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsim;
    private javax.swing.JButton btnubah;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjnsbrng;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtstok;
    private javax.swing.JTextField txtstuan;
    // End of variables declaration//GEN-END:variables

    private void loadInventoryData() {
        String filePath = "inventory_data.csv";
    DefaultTableModel model = (DefaultTableModel) tbl.getModel();
    
    // 1. Kosongkan baris yang sudah ada (biar tidak dobel)
    model.setRowCount(0); 
    
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        
        // 2. Lewati baris header (KODE, NAMA BARANG, HARGA, STOK)
        reader.readLine(); 
        
        // 3. Baca setiap baris data
        while ((line = reader.readLine()) != null) {
            // Pisahkan data menggunakan koma sebagai delimiter
            String[] data = line.split(","); 
            
            // 4. Tambahkan baris data ke tabel jika data LENGKAP (4 kolom)
            if (data.length == model.getColumnCount()) {
                model.addRow(data);
            }
        }
        
    } catch (IOException e) {
        // Blok ini akan dijalankan jika file belum ada atau gagal dibaca
        System.out.println("Peringatan: File " + filePath + " belum ditemukan atau gagal dibaca.");
    }
}
}
