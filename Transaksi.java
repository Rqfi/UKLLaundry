package UKLPBO;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi{

    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();

    Scanner scanner = new Scanner(System.in);
    int globalTemp = 0;

    public int getJumlahTransaksi(){
        return idClient.size();
    }

    public void inputTransaksi(Client client, JenisLaundry laundry) {
        System.out.println();
        System.out.print("Masukkan ID Client : ");
        int idClientTemp = scanner.nextInt();
        System.out.println("Nama Client = " + client.getNama(idClientTemp));
        System.out.println();
        System.out.print("Masukkan ID Jenis Laundry : ");
        int idJenisTemp = scanner.nextInt();
        System.out.println("Jenis Laundry yang anda pilih = " + laundry.getJenisLaundry(idJenisTemp));
        System.out.println();
        System.out.print("Masukkan berat laundry : ");
        int idBeratTemp = scanner.nextInt();
        System.out.println();

        this.idClient.add(idClientTemp);
        this.idJenisLaundry.add(idJenisTemp);
        this.banyak.add(idBeratTemp);
    }

    public int getBanyak(int id){
        return this.banyak.get(id);
    }

    public void prosesTransaksi(Client client, Transaksi transaksi, JenisLaundry laundry) {
        System.out.println();
        System.out.println("========Data Client========");
        System.out.println("Nama          : " + client.getNama(idClient.get(0)));
        System.out.println("Alamat        : " + client.getAlamat(idClient.get(0)));
        System.out.println("Telepon       : " + client.getTelepon(idClient.get(0)));
        System.out.println("Saldo         : " + client.getSaldo(idClient.get(0)));
        System.out.println("Jenis Laundry : " + laundry.getJenisLaundry(idJenisLaundry.get(0)));
        System.out.println("Harga         : " + laundry.getHarga(idJenisLaundry.get(0)));
        System.out.println("Durasi        : " + laundry.getDurasi(idJenisLaundry.get(0)));
        System.out.println("Harga Total   : " + laundry.getHarga(idJenisLaundry.get(0)) * banyak.get(0));

        globalTemp = client.getSaldo(idClient.get(0)) - (laundry.getHarga(idJenisLaundry.get(0)) * banyak.get(0));

        System.out.println("Saldo akhir   : " + globalTemp);
    }

    public void setTransaksi(JenisLaundry jenisLaundry, int idClient, int idJenisLaundry, int banyak) {
        this.idClient.add(idClient);
        this.idJenisLaundry.add(idJenisLaundry);
        this.banyak.add(banyak);
        jenisLaundry.editDurasi(idJenisLaundry, jenisLaundry.getDurasi(idJenisLaundry));
    }

    public int getIdJenisLaundry(int id){
        return this.idJenisLaundry.get(id);
    }

    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }

    public int getJmlTransaksi() {
        return this.idClient.size();
    }
    
}
