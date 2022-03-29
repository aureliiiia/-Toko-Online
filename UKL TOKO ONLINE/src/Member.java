
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
public class Member implements User {
    private ArrayList<String> namaMember = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Member() {
        this.namaMember.add("Aureel");
        this.alamat.add("Tulungagung");
        this.telepon.add("085606428349");
        this.saldo.add(500000);
        
        this.namaMember.add("Orin");
        this.alamat.add("Blitar");
        this.telepon.add("0843126237789");
        this.saldo.add(250000);
        
        this.namaMember.add("Maharani");
        this.alamat.add("Malang");
        this.telepon.add("081335678837");
        this.saldo.add(300000);
    }
    
    public void SetSaldo (int saldo){
        this.saldo.add(saldo);
    }
    public int getSaldo (int idMember){
        return this.saldo.get(idMember);
    }
    public void editSaldo (int idMember, int saldo){
        this.saldo.set(idMember, saldo);
    }
    public int getJumlahMember(){
        return this.saldo.size();
    }

    @Override
    public void setNama(String namaMember) {
        this.namaMember.add(namaMember);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int id) {
        return this.namaMember.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
}
