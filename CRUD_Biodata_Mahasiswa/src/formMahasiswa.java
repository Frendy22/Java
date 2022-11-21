import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import koneksi.konek;
import javax.swing.table.DefaultTableModel;

public class formMahasiswa extends javax.swing.JFrame {

    public formMahasiswa() {
        initComponents();
        datatable();
    }

    public void datatable() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("NIM");
        tbl.addColumn("Nama");
        tbl.addColumn("Tgl_lahir");
        tbl.addColumn("Agama");
        tbl.addColumn("Phone");
        tbl.addColumn("Institusi");
        tbl.addColumn("Prog_Studi");
        tabel.setModel(tbl);
        try {
            Statement statement = (Statement) konek.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM mahasiswa");
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("nim"),
                    res.getString("nama"),
                    res.getString("tgl_lahir"),
                    res.getString("agama"),
                    res.getString("phone"),
                    res.getString("institusi"),
                    res.getString("prog_studi")
                });
                tabel.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "salah");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnim = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        tgllahir = new com.toedter.calendar.JDateChooser();
        txtalamat = new javax.swing.JTextField();
        txtcari = new javax.swing.JTextField();
        cbinstitusi = new javax.swing.JComboBox<>();
        cbagama = new javax.swing.JComboBox<>();
        cbprog_studi = new javax.swing.JComboBox<>();
        rbpria = new javax.swing.JRadioButton();
        rbwanita = new javax.swing.JRadioButton();
        btnedit = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        btnhapus = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NIM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setText("Nama");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setText("Tgl Lahir");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setText("Agama");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel5.setText("Jenis Kelamin");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel6.setText("Alamat");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel7.setText("Phone");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jLabel8.setText("Institusi");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jLabel9.setText("Program Studi");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        txtnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnimActionPerformed(evt);
            }
        });
        jPanel1.add(txtnim, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 91, -1));

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 91, -1));
        jPanel1.add(tgllahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        txtalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalamatActionPerformed(evt);
            }
        });
        jPanel1.add(txtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 130, -1));

        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        jPanel1.add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 137, -1));

        cbinstitusi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...Pilih..", "Fakultas Ilmu Komputer", "Fakultas Bisnis" }));
        jPanel1.add(cbinstitusi, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        cbagama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...Pilih..", "Islam", "Kristen", "Hindu", "Budha", "Khong Hu Cu" }));
        cbagama.setToolTipText("");
        jPanel1.add(cbagama, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 91, -1));

        cbprog_studi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...Pilih..", "Teknik Informatika", "Sistem Informasi", "Akuntansi", "Manajemen" }));
        jPanel1.add(cbprog_studi, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 136, -1));

        buttonGroup1.add(rbpria);
        rbpria.setText("Pria");
        rbpria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbpriaActionPerformed(evt);
            }
        });
        jPanel1.add(rbpria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        buttonGroup1.add(rbwanita);
        rbwanita.setText("Wanita");
        rbwanita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbwanitaActionPerformed(evt);
            }
        });
        jPanel1.add(rbwanita, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        btnedit.setText("Edit");
        jPanel1.add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        btnbatal.setText("Batal");
        jPanel1.add(btnbatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 60, -1));

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 70, -1));

        jLabel10.setText("Cari Data");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });
        jPanel1.add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 130, -1));

        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        jPanel1.add(btnkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabel);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 232));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Form Data Mahasiswa");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnimActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txtalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalamatActionPerformed

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariActionPerformed

    private void rbpriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbpriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbpriaActionPerformed

    private void rbwanitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbwanitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbwanitaActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        String tampilan ="yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tgllhr = String.valueOf(fm.format(tgllahir.getDate()));
        String nim = txtnim.getText();
        String nama = txtnama.getText();
        String agama = (String) cbagama.getSelectedItem();
        String jeniskelamin = null;
        if (rbpria.isSelected()) {
            jeniskelamin = "Pria";
        } else if (rbwanita.isSelected()) {
            jeniskelamin = "Wanita";
        }
        String alamat = txtalamat.getText();
        String nohp = txtphone.getText();
        String institusi = (String) cbinstitusi.getSelectedItem();
        String studi = (String) cbprog_studi.getSelectedItem();
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        System.out.println(tgllhr);
        try {
            Statement statement = (Statement) konek.GetConnection().createStatement();
            statement.executeUpdate("INSERT INTO mahasiswa (`NIM`, `Nama`, `Tgl_lahir`, `Agama`, `Js_kelamin`, `Alamat`, `Phone`, `Institusi`, `Prog_Studi`) VALUES ('" + nim + "','" + nama + "','" + tgllhr + "','" + agama + "','" + jeniskelamin + "','" + alamat + "','" + nohp + "','" + institusi + "','" + studi + "');");
            statement.close();
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
        } catch (HeadlessException | SQLException t) {
            JOptionPane.showMessageDialog(null, "data gagal disimpan");
        }

        datatable();
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        String nim = txtnim.getText();
        try {
            Statement statement = (Statement) konek.GetConnection().createStatement();
            statement.executeUpdate("DELETE from mahasiswa WHERE NIM=('" + nim + "');");
            JOptionPane.showMessageDialog(null, "Data berhasil di hapus");
            txtnim.setText("");
            txtnama.setText("");
            tgllahir.setDate(null);
            cbagama.setSelectedItem("");
            if (rbpria.isSelected()) {
                JOptionPane.showMessageDialog(rootPane, "Pria");
            } else if (rbwanita.isSelected()) {
                JOptionPane.showMessageDialog(rootPane, "Wanita");
            }
            txtalamat.setText("");
            txtphone.setText("");
            cbinstitusi.setSelectedItem("");
            cbprog_studi.setSelectedItem("");
            txtnim.requestFocus();
        } catch (Exception t) {
            JOptionPane.showMessageDialog(null, "Data gagal di hapus");
        }
        datatable();
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

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
            java.util.logging.Logger.getLogger(formMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbagama;
    private javax.swing.JComboBox<String> cbinstitusi;
    private javax.swing.JComboBox<String> cbprog_studi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbpria;
    private javax.swing.JRadioButton rbwanita;
    private javax.swing.JTable tabel;
    private com.toedter.calendar.JDateChooser tgllahir;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
