

package aplikasi.model;


import aplikasi.entity.Anggota;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImplementAnggota implements AnggotaInterface {
    private String dbHost = "jdbc:mysql://localhost:3306/koperasi";
    private String dbUser = "root";
    private String dbPass = "";
    private Connection conn;


       public ImplementAnggota() {
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (InstantiationException ex) {
                Logger.getLogger(ImplementAnggota.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ImplementAnggota.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ImplementAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ImplementAnggota(Connection conn) {
        this.conn = conn;
    }

     public void connect() throws SQLException {
        this.conn = DriverManager.getConnection(dbHost, dbUser, dbPass);

    }

     public void disconnect() throws SQLException {
        this.conn.close();
    }

     public List read() throws SQLException {
        Statement st = conn.createStatement();
        String sql = "select * from anggota";
        ResultSet rs = st.executeQuery(sql);
        List list = new ArrayList();
        while (rs.next()) {
            Anggota agt = new Anggota();
            agt.setIdanggota(rs.getString("idanggota"));
            agt.setNama(rs.getString("nama"));
            agt.setAlamat(rs.getString("alamat"));
            agt.setIdtransaksi(rs.getString("idtransaksi"));
            agt.setNopinjam(rs.getString("nopinjam"));
            agt.setNosimpan(rs.getString("nosimpan"));
            list.add(agt);
        }
        return list;



    }

    public void insert(Anggota anggota) throws SQLException {

        String sql = "insert into anggota (idanggota, nama, alamat,idtransaksi,nopinjam,nosimpan) values(?,?,?,?,?,?);";
        PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.setString(1, anggota.getIdanggota());
        ps.setString(2, anggota.getNama());
        ps.setString(3, anggota.getAlamat());
        ps.setString(4, anggota.getIdtransaksi());
        ps.setString(5, anggota.getNopinjam());
        ps.setString(6, anggota.getNosimpan());
        ps.executeUpdate();

    }



    public void update(String idanggota, Anggota anggota) throws SQLException {
    String sql = "update anggota set idanggota=?,nama=?,alamat=?,idtransaksi=?,nopinjam=?,nosimpan=? where idanggota=?";
      PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.setString(1, anggota.getIdanggota());
        ps.setString(2, anggota.getNama());
        ps.setString(3, anggota.getAlamat());
        ps.setString(4, anggota.getIdtransaksi());
        ps.setString(5, anggota.getNopinjam());
        ps.setString(6, anggota.getNosimpan());
        ps.setString(7, idanggota);
        ps.executeUpdate();


    }

    public void delete(String idanggota) throws SQLException {
    String sql = "delete from anggota where idanggota=?";
        PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.setString(1, idanggota);
        ps.executeUpdate();

    }

    public Anggota read(String idanggota) throws SQLException {
     String sql = "select *from anggota where idanggota = ?";
        PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.setString(1, idanggota);
        ResultSet rs = ps.executeQuery();
        Anggota anggota = new Anggota();
        while (rs.next()) {
            anggota.setIdanggota(rs.getString("idanggota"));
            anggota.setNama(rs.getString("nama"));
            anggota.setAlamat(rs.getString("alamat"));
             anggota.setIdtransaksi(rs.getString("idtransaksi"));
              anggota.setNopinjam(rs.getString("nopinjam"));
               anggota.setNosimpan(rs.getString("nosimpan"));
        }
        return anggota;

    }
 }


