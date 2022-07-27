package UKLPBO;

import java.util.ArrayList;

public class Client implements User{ 

    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Client(){
        this.namaClient.add("rafi");
        this.alamat.add("Karangploso");
        this.telepon.add("082250960864");
        this.saldo.add(150000);

        this.namaClient.add("kurni");
        this.alamat.add("Batu       ");
        this.telepon.add("082209366150");
        this.saldo.add(300000);

        this.namaClient.add("yoga");
        this.alamat.add("Sawojajar  ");
        this.telepon.add("081298334450");
        this.saldo.add(280000);
        
        this.namaClient.add("nanda");
        this.alamat.add("Pakis      ");
        this.telepon.add("081438993028");
        this.saldo.add(100000);
    }

    
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    public int getSaldo(int id){
        return this.saldo.get(id);
    }

    public void editSaldo(int id, int saldo){
        this.saldo.set(id, saldo);

    }
    public int getJumlahClient(){
        return this.saldo.size();
    }

    @Override
    public void setNama(String namaClient){
        this.namaClient.add(namaClient);
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
    public String getNama(int idClient){
        return this.namaClient.get(idClient);
    }
    @Override
    public String getAlamat(int idClient){
        return this.alamat.get(idClient);
    }
    @Override
    public String getTelepon(int idClient){
        return this.telepon.get(idClient);
    }
}
