/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aplikasi.model;

import aplikasi.entity.Anggota;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author denni
 */
public interface AnggotaInterface {
    public void connect() throws SQLException;
    public void disconnect() throws SQLException;
    public List  read() throws SQLException;
    public void insert(Anggota anggota) throws  SQLException;
    public void update(String idanggota, Anggota anggota) throws SQLException;
    public void delete(String idanggota) throws SQLException;
    public Anggota read(String idanggota) throws  SQLException;

}
