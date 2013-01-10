/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aplikasi.entity;

/**
 *
 * @author denni
 */
public class Anggota {

    private String idanggota;
    private String nama;
    private String alamat;
    private String idtransaksi;
    private String nopinjam;
    private String nosimpan;


    public Anggota(){
    }

    public Anggota(String idanggota,String nama,String alamat,String idtransaksi,String nopinjam,String nosimpan){
         this.idanggota =idanggota;
         this.nama = nama;
         this.alamat = alamat;
         this.idtransaksi = idtransaksi;
         this.nopinjam = nopinjam;
         this.nosimpan = nosimpan;
     }


    //1
    public String getIdanggota() {
        return idanggota;
    }

    public void setIdanggota(String idanggota) {
        this.idanggota = idanggota;
    }


    //2
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    //3
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }



    //4
    public String getIdtransaksi() {
        return idtransaksi;
    }

    public void setIdtransaksi(String idtransaksi) {
        this.idtransaksi = idtransaksi;
    }


    //5
    public String getNopinjam() {
        return nopinjam;
    }

    public void setNopinjam(String nopinjam) {
        this.nopinjam = nopinjam;
    }


    //6
    public String getNosimpan() {
        return nosimpan;
    }

    public void setNosimpan(String nosimpan) {
        this.nosimpan = nosimpan;
    }

}
