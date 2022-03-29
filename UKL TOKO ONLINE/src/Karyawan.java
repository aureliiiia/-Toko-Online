
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Karyawan implements User{
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    public Karyawan() {
        this.namaKaryawan.add("Aureel");
        this.alamat.add("Tulungagung");
        this.telepon.add("085606428349");
        this.jabatan.add(0);

        this.namaKaryawan.add("Orin");
        this.alamat.add("Blitar");
        this.telepon.add("0843126237789");
        this.jabatan.add(2);

        this.namaKaryawan.add("Maharani");
        this.alamat.add("Malang");
        this.telepon.add("081335678837");
        this.jabatan.add(1);
    }
    
    public void setJabatan(int jabatan){
        this.jabatan.add(jabatan);
    }
    public int getJabatan(int id){
        return this.jabatan.get(id);
    }
    public int getJumlahKaryawan(){
        return this.namaKaryawan.size();
    }
    
    @Override
    public void setNama (String namaKaryawan){
        this.namaKaryawan.add(namaKaryawan);
    }
    
    @Override
    public void setAlamat (String alamat){
        this.alamat.add(alamat);
    }
    
    @Override
    public void setTelepon (String telepon){
        this.alamat.add(telepon);
    }
    
    @Override
    public String getNama (int idKaryawan){
        return this.namaKaryawan.get(idKaryawan);
    }
    
    @Override
    public String getAlamat (int idKaryawan){
        return this.alamat.get(idKaryawan);
    }
    
    @Override
    public String getTelepon (int idKaryawan){
        return this.telepon.get(idKaryawan);
    }
}
