/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aplikasi.model;

import aplikasi.entity.Anggota;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelModel extends AbstractTableModel  {

    List<Anggota> list = new ArrayList<Anggota>();

    public TabelModel(List list) {
        this.list=list;
    }


    public int getRowCount() {
        return this.list.size();
    }

    public int getColumnCount() {
        return 6;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getIdanggota();
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getAlamat();
            case 3:
                return list.get(rowIndex).getIdtransaksi();
            case 4:
                return list.get(rowIndex).getNopinjam();
            case 5:
                return list.get(rowIndex).getNosimpan();
            default:
                return null;
        }
     }

    @Override
     public String getColumnName(int column) {
          switch (column) {
            case 0:
                return "Idanggota";
            case 1:
                return "Nama";
            case 2:
                return "Alamat";
            case 3:
                return "Idtransaksi";
            case 4:
                return "Idpinjam";
            case 5:
                  return "Idsimpan";
            default:
                return null;
        }


     }
    public Anggota select(int index) {
        return list.get(index);
    }



}
