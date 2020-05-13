/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.akhir;

/**
 *
 * @author Angga
 */

import java.util.*;
import javax.swing.*;
import java.text.*;
import javax.swing.table.DefaultTableModel;

public class MainApp extends javax.swing.JFrame {

    /**
     * Creates new form MainApp
     */
    public MainApp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNama = new javax.swing.JLabel();
        colon = new javax.swing.JLabel();
        lbNoid = new javax.swing.JLabel();
        colon1 = new javax.swing.JLabel();
        getNama = new javax.swing.JTextField();
        getNoid = new javax.swing.JTextField();
        lbAlamat = new javax.swing.JLabel();
        colon2 = new javax.swing.JLabel();
        lbJeniskelamin = new javax.swing.JLabel();
        colon3 = new javax.swing.JLabel();
        inputAlamat = new javax.swing.JTextField();
        cbJeniskelamin = new javax.swing.JComboBox<>();
        lbKeluhan = new javax.swing.JLabel();
        colon4 = new javax.swing.JLabel();
        lbIsidata = new javax.swing.JLabel();
        lbTanggal = new javax.swing.JLabel();
        colon5 = new javax.swing.JLabel();
        cbTgl = new javax.swing.JComboBox<>();
        slash = new javax.swing.JLabel();
        cbBln = new javax.swing.JComboBox<>();
        slash1 = new javax.swing.JLabel();
        bDaftar = new javax.swing.JButton();
        lbJampraktek = new javax.swing.JLabel();
        colon6 = new javax.swing.JLabel();
        tahun = new javax.swing.JLabel();
        inputKeluhan = new javax.swing.JTextField();
        cbJampraktek = new javax.swing.JComboBox<>();
        wib = new javax.swing.JLabel();
        bHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePasien = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        colon8 = new javax.swing.JLabel();
        lbAntrian = new javax.swing.JLabel();
        ketTabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNama.setText("Nama");

        colon.setText(":");

        lbNoid.setText("No. ID");

        colon1.setText(":");

        getNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getNamaActionPerformed(evt);
            }
        });

        getNoid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getNoidActionPerformed(evt);
            }
        });

        lbAlamat.setText("Alamat");

        colon2.setText(":");

        lbJeniskelamin.setText("Jenis Kelamin");

        colon3.setText(":");

        cbJeniskelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Pria", "Wanita", "Belum Diketahui" }));

        lbKeluhan.setText("Keluhan");

        colon4.setText(":");

        lbIsidata.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbIsidata.setText("Isi Kelengkapan Data :");

        lbTanggal.setText("Tanggal");

        colon5.setText(":");

        cbTgl.setMaximumRowCount(31);
        cbTgl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        slash.setText("/");

        cbBln.setMaximumRowCount(12);
        cbBln.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        slash1.setText("/");

        bDaftar.setText("Daftar");
        bDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDaftarActionPerformed(evt);
            }
        });

        lbJampraktek.setText("Jam Praktek");

        colon6.setText(":");

        tahun.setText("2020");

        cbJampraktek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "10.00-12.00", "14.00-16.00", "18.00-20.00" }));

        wib.setText("WIB");

        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        tablePasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nomor", "Nama", "No. ID", "Alamat", "Jenis Kelamin", "Keluhan", "Tanggal", "Bulan", "Jam Praktek"
            }
        ));
        tablePasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePasienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePasien);

        jLabel2.setText("No. Antrian");

        colon8.setText(":");

        lbAntrian.setText("1");

        ketTabel.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        ketTabel.setText("*klik baris pada tabel untuk mengeprint struk antrian");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIsidata)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addComponent(colon8)
                        .addGap(18, 18, 18)
                        .addComponent(lbAntrian))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbTanggal)
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbJampraktek)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(colon5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slash)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbBln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slash1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tahun))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(colon6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbJampraktek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wib))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bDaftar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bHapus))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbNama, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbJeniskelamin)
                                    .addComponent(lbAlamat)
                                    .addComponent(lbNoid)))
                            .addComponent(lbKeluhan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(colon2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputAlamat))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(colon3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbJeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(colon1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(getNoid))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(colon4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputKeluhan, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(colon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(getNama, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ketTabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ketTabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbIsidata)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(colon8)
                            .addComponent(lbAntrian))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNama)
                            .addComponent(colon)
                            .addComponent(getNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNoid)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(colon1)
                                .addComponent(getNoid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAlamat)
                            .addComponent(colon2)
                            .addComponent(inputAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbJeniskelamin)
                            .addComponent(colon3)
                            .addComponent(cbJeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbKeluhan)
                            .addComponent(colon4)
                            .addComponent(inputKeluhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colon5)
                            .addComponent(slash)
                            .addComponent(cbBln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slash1)
                            .addComponent(tahun)
                            .addComponent(lbTanggal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(colon6)
                            .addComponent(cbJampraktek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJampraktek)
                            .addComponent(wib))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bDaftar)
                            .addComponent(bHapus))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getNamaActionPerformed

    private void getNoidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getNoidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getNoidActionPerformed

    private void bDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDaftarActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tbl= (DefaultTableModel)tablePasien.getModel();
        
        if(getNama.getText().isEmpty() || getNoid.getText().isEmpty() || inputAlamat.getText().isEmpty() || inputKeluhan.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Mohon masukkan semua data.");
        }
//        else if(getNama.getText().equals(tbl.getValueAt(0,1).toString()))
//        {
//            JOptionPane.showMessageDialog(null, "Data sudah terdaftar.");
//        }
        else
        {
            String data[] = {lbAntrian.getText(),
            getNama.getText(),
            getNoid.getText(),
            inputAlamat.getText(),
            (String)cbJeniskelamin.getSelectedItem(),
            inputKeluhan.getText(),
            (String)cbTgl.getSelectedItem(),
            (String)cbBln.getSelectedItem(),
            (String)cbJampraktek.getSelectedItem()};
            
            tbl.addRow(data);
            
            int noAntrian = Integer.parseInt(lbAntrian.getText());
            noAntrian++;
                
            String antrian = String.valueOf(noAntrian);
            lbAntrian.setText(antrian);
        
            String reset = "";
            String resetCb1 = "--";
            String resetCb2 = "1";
            
            getNama.setText(reset);
            getNoid.setText(reset);
            inputAlamat.setText(reset);
            cbJeniskelamin.setSelectedItem(resetCb1);
            inputKeluhan.setText(reset);
            cbTgl.setSelectedItem(resetCb2);
            cbBln.setSelectedItem(resetCb2);
            cbJampraktek.setSelectedItem(resetCb1);
            }
        
    }//GEN-LAST:event_bDaftarActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        // TODO add your handling code here:
        String reset = "";
        String resetCb1 = "--";
        String resetCb2 = "1";
        
        getNama.setText(reset);
        getNoid.setText(reset);
        inputAlamat.setText(reset);
        cbJeniskelamin.setSelectedItem(resetCb1);
        inputKeluhan.setText(reset);
        cbTgl.setSelectedItem(resetCb2);
        cbBln.setSelectedItem(resetCb2);
        cbJampraktek.setSelectedItem(resetCb1);
    }//GEN-LAST:event_bHapusActionPerformed

    private void tablePasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePasienMouseClicked
        // TODO add your handling code here:
//        DefaultTableModel tbl= (DefaultTableModel)tablePasien.getModel();
//        int antrianPasien = tablePasien.getSelectedRow();
//        
//        lbAntrian.setText(tbl.getValueAt(antrianPasien, 0).toString());
//        getNama.setText(tbl.getValueAt(antrianPasien, 1).toString());
//        getNoid.setText(tbl.getValueAt(antrianPasien, 2).toString());
//        inputAlamat.setText(tbl.getValueAt(antrianPasien, 3).toString());
//        cbJeniskelamin.setSelectedItem(tbl.getValueAt(antrianPasien, 4).toString());
//        inputKeluhan.setText(tbl.getValueAt(antrianPasien, 5).toString());
//        cbTgl.setSelectedItem(tbl.getValueAt(antrianPasien, 6).toString());
//        cbBln.setSelectedItem(tbl.getValueAt(antrianPasien, 7).toString());
//        cbJampraktek.setSelectedItem(tbl.getValueAt(antrianPasien, 8).toString());
//        

        PrintApp objPrint = new PrintApp();
        
        DefaultTableModel tbl= (DefaultTableModel)tablePasien.getModel();
        int antrianPasien = tablePasien.getSelectedRow();
        
        objPrint.printAntrian.setText(tbl.getValueAt(antrianPasien, 0).toString());
        objPrint.printNama.setText(tbl.getValueAt(antrianPasien, 1).toString());
        objPrint.printNoid.setText(tbl.getValueAt(antrianPasien, 2).toString());
        objPrint.printAlamat.setText(tbl.getValueAt(antrianPasien, 3).toString());
        objPrint.printJk.setText(tbl.getValueAt(antrianPasien, 4).toString());
        objPrint.printKeluhan.setText(tbl.getValueAt(antrianPasien, 5).toString());
        objPrint.printTgl.setText(tbl.getValueAt(antrianPasien, 6).toString());
        objPrint.printBln.setText(tbl.getValueAt(antrianPasien, 7).toString());
        objPrint.printJam.setText(tbl.getValueAt(antrianPasien, 8).toString());
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        PrintApp.realTime.setText(sdf.format(date));
        
        objPrint.setVisible(true);
    }//GEN-LAST:event_tablePasienMouseClicked

    
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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDaftar;
    private javax.swing.JButton bHapus;
    public static javax.swing.JComboBox<String> cbBln;
    public static javax.swing.JComboBox<String> cbJampraktek;
    public static javax.swing.JComboBox<String> cbJeniskelamin;
    public static javax.swing.JComboBox<String> cbTgl;
    private javax.swing.JLabel colon;
    private javax.swing.JLabel colon1;
    private javax.swing.JLabel colon2;
    private javax.swing.JLabel colon3;
    private javax.swing.JLabel colon4;
    private javax.swing.JLabel colon5;
    private javax.swing.JLabel colon6;
    private javax.swing.JLabel colon8;
    public static javax.swing.JTextField getNama;
    public static javax.swing.JTextField getNoid;
    public static javax.swing.JTextField inputAlamat;
    public static javax.swing.JTextField inputKeluhan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel ketTabel;
    private javax.swing.JLabel lbAlamat;
    public static javax.swing.JLabel lbAntrian;
    private javax.swing.JLabel lbIsidata;
    private javax.swing.JLabel lbJampraktek;
    private javax.swing.JLabel lbJeniskelamin;
    private javax.swing.JLabel lbKeluhan;
    private javax.swing.JLabel lbNama;
    private javax.swing.JLabel lbNoid;
    private javax.swing.JLabel lbTanggal;
    private javax.swing.JLabel slash;
    private javax.swing.JLabel slash1;
    private javax.swing.JTable tablePasien;
    private javax.swing.JLabel tahun;
    private javax.swing.JLabel wib;
    // End of variables declaration//GEN-END:variables
}
