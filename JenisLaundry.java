package UKLPBO;
import java.util.ArrayList;
public class JenisLaundry {
    
    private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();
    
    public JenisLaundry(){
        this.jenisLaundry.add("EX");
        this.harga.add(9000);
        this.durasi.add(1);

        this.jenisLaundry.add("Kilat");
        this.harga.add(7000);
        this.durasi.add(2);
        
        this.jenisLaundry.add("Reguler");
        this.harga.add(5000);
        this.durasi.add(3);

        this.jenisLaundry.add("Cuci Kering Seterika");
        this.harga.add(10000);
        this.durasi.add(4);
    }

    public int getJumlahJenisLaundry(){
        return this.jenisLaundry.size();
    }
    public void setJenisLaundry(String jenisLaundry) {
        this.jenisLaundry.add(jenisLaundry);
    }
    public String getJenisLaundry(int idJenisLaundry) {
        return this.jenisLaundry.get(idJenisLaundry);
    }

    public void setDurasi(int durasi) {
        this.durasi.add(durasi);
    }
    public int getDurasi(int idJenisLaundry) {
        return this.durasi.get(idJenisLaundry);
    }

    public void editDurasi(int idJenisLaundry, int durasi){
        this.durasi.set(idJenisLaundry, durasi);
    }
    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idJenisLaundry){
        return this.harga.get(idJenisLaundry);
    }
    
}


