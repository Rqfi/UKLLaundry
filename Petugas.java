package UKLPBO;

import java.util.ArrayList;
public class Petugas implements User{

    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    public Petugas(){
        this.namaPetugas.add("mas sam");
        this.alamat.add("Malang");
        this.telepon.add("08173917761");
        this.jabatan.add(0);
    }

    public void setJabatan(int jabatan){
        this.jabatan.add(jabatan);
    }   
    public int getJabatan(int idPetugas){
        return this.jabatan.get(idPetugas);
    }    
    public int getJumlahPetugas(){
        return this.namaPetugas.size();
    }

    @Override
    public void setNama(String namaPetugas){
        this.namaPetugas.add(namaPetugas);
    }
    @Override
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon){
        this.telepon.add(telepon);
    }
    @Override
    public String getNama(int idPetugas){
        return this.namaPetugas.get(idPetugas);
    }
    @Override
    public String getAlamat(int idPetugas){
        return this.alamat.get(idPetugas);
    }
    @Override
    public String getTelepon(int idPetugas){
        return this.telepon.get(idPetugas);
    }
}
