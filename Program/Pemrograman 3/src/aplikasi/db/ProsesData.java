//Created by Denny Kurniawan-4510210016
//December-2012

package aplikasi.db;

import aplikasi.entity.Anggota;
import aplikasi.model.ImplementAnggota;
import aplikasi.model.TabelModel;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author denni
 */
public class ProsesData extends javax.swing.JFrame {


    ImplementAnggota daoMysql = new ImplementAnggota();
    TabelModel tabelModel;
    List<Anggota> records = new ArrayList<Anggota>();
    
    public ProsesData() {

        super("Proses Data");

  
        initComponents();
       
        loadData();
    }


     void loadData() {
        try {
            daoMysql.connect();
            List list = new ArrayList();
            list = daoMysql.read();
            TableModel tableModel = new TabelModel(list);
            tabelIsiData.setModel(tableModel);
            daoMysql.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ProsesData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

     void kosongkanTeks() {
        Fanggota.setText("");
        Fnama.setText("");
        Falamat.setText("");
        Ftransaksi.setText("");
        Fpinjam.setText("");
        Fsimpan.setText("");
     }

     public TabelModel getTabelModel() {
     return tabelModel;
    }

     public void setTabelModel(TabelModel tabelModel) {
        this.tabelModel = tabelModel;
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Fanggota = new javax.swing.JTextField();
        Fnama = new javax.swing.JTextField();
        Falamat = new javax.swing.JTextField();
        Ftransaksi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Fpinjam = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Fsimpan = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btntambah = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelIsiData = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        Mhelp = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setText("ID Anggota");

        jLabel3.setText("Alamat");

        jLabel4.setText("Nama");

        jLabel5.setText("ID Transaksi");

        jLabel2.setText("No Pinjam");

        jLabel6.setText("No Simpan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Fsimpan)
                    .addComponent(Fpinjam)
                    .addComponent(Ftransaksi)
                    .addComponent(Falamat)
                    .addComponent(Fnama)
                    .addComponent(Fanggota, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Fanggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Falamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Ftransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Fpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Fsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btntambah.setIcon(new javax.swing.ImageIcon("C:\\Users\\denni\\Desktop\\new icon\\add.png")); // NOI18N
        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/icon/edit.png"))); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/icon/delete.png"))); // NOI18N
        btnhapus.setText("Delete");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnhapus, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tabelIsiData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"4510210016", "Denny", "Jakarta", "45", null, ""},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Anggota", "Nama", "Alamat", "ID Transaksi", "No Pinjam", "No Simpan"
            }
        ));
        tabelIsiData.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelIsiDataAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tabelIsiData);

        Mhelp.setText("Help");
        Mhelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MhelpMouseClicked(evt);
            }
        });
        Mhelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MhelpActionPerformed(evt);
            }
        });
        jMenuBar1.add(Mhelp);

        jMenu1.setText("About");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    //action Edit data
    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
     try {
            // TODO add your handling code here:
            daoMysql.connect();
            int index = tabelIsiData.getSelectedRow();
            if (btnedit.getText().equals("Edit")) {
                records = daoMysql.read();
                Anggota anggota = records.get(index);
                String idanggota = anggota.getIdanggota();
                Anggota agt = daoMysql.read(idanggota);
                Fanggota.setText(agt.getIdanggota());
	        Fnama.setText(agt.getNama());
		Falamat.setText(agt.getAlamat());
                Ftransaksi.setText(agt.getIdtransaksi());
	        Fpinjam.setText(agt.getNopinjam());
                Fsimpan.setText(agt.getNosimpan());
                btnedit.setText("Simpan");
            } else {
                Anggota agt = new Anggota();
                agt.setIdanggota(Fanggota.getText());
                agt.setNama(Fnama.getText());
                agt.setAlamat(Falamat.getText());
		agt.setIdtransaksi(Ftransaksi.getText());
                agt.setNopinjam(Fpinjam.getText());
                agt.setNosimpan(Fsimpan.getText());
                if (JOptionPane.showConfirmDialog(this, "apakah anda yakin untuk melakukan update", "konfirmasi update", JOptionPane.OK_CANCEL_OPTION) == 0) {
                    daoMysql.update(records.get(index).getIdanggota(), agt);
                    loadData();
                    this.kosongkanTeks();
                    btnedit.setText("Update");
                    JOptionPane.showMessageDialog(this, "Data berhasil di update");
                }
            }
            daoMysql.disconnect();
            } catch (SQLException ex) {
            Logger.getLogger(ProsesData.class.getName()).log(Level.SEVERE, null, ex);
        }



    }//GEN-LAST:event_btneditActionPerformed
    
    //action  Insert/Tambah data
    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
           if (!Fanggota.getText().isEmpty()
               ) {
            try {
                // TODO add your handling code here:
                daoMysql.connect();
                Anggota agt = new Anggota();
                agt.setIdanggota(Fanggota.getText());
                agt.setNama(Fnama.getText());
                agt.setAlamat(Falamat.getText());
                agt.setIdtransaksi(Ftransaksi.getText());
                agt.setNopinjam(Fpinjam.getText());
                agt.setNosimpan(Fsimpan.getText());
                daoMysql.insert(agt);
                JOptionPane.showMessageDialog(this, "Data berhasil di tambah");
                loadData();
            } catch (SQLException ex) {
                Logger.getLogger(ProsesData.class.getName()).log(Level.SEVERE, null, ex);
                  
            }
        } else {
            JOptionPane.showMessageDialog(null, "Harus diisi semua", "Salah", JOptionPane.ERROR_MESSAGE);
        }
        this.kosongkanTeks();
    }//GEN-LAST:event_btntambahActionPerformed

    //action Delete Data
    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        int index = tabelIsiData.getSelectedRow();
        if (JOptionPane.showConfirmDialog(this, "apakah anda yakin untuk menghapus data", "konfirmasi penghapusan", JOptionPane.OK_CANCEL_OPTION) == 0) {
            try {
                daoMysql.connect();
                records = daoMysql.read();
                daoMysql.delete(records.get(index).getIdanggota());
                JOptionPane.showMessageDialog(this, "data berhasil di hapus");
            } catch (SQLException ex) {
                Logger.getLogger(ProsesData.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "data belum dipilh", "error", JOptionPane.ERROR_MESSAGE);

            }
        }
        loadData();        
    }//GEN-LAST:event_btnhapusActionPerformed

    private void tabelIsiDataAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelIsiDataAncestorAdded
     
    }//GEN-LAST:event_tabelIsiDataAncestorAdded

    private void MhelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MhelpActionPerformed
      
    }//GEN-LAST:event_MhelpActionPerformed

    //action untuk membuka File .*chm
    private void MhelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MhelpMouseClicked
           try {
           Runtime.getRuntime().exec("hh.exe C:/Users/denni/Documents/NetBeansProjects/Pemrograman3/src/aplikasi/manual/usermanual.chm");
         } catch (IOException ex) {
          Logger.getLogger(ProsesData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_MhelpMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProsesData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Falamat;
    private javax.swing.JTextField Fanggota;
    private javax.swing.JTextField Fnama;
    private javax.swing.JTextField Fpinjam;
    private javax.swing.JTextField Fsimpan;
    private javax.swing.JTextField Ftransaksi;
    private javax.swing.JMenu Mhelp;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btntambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelIsiData;
    // End of variables declaration//GEN-END:variables

}
