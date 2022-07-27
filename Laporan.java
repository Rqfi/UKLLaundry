package UKLPBO;

public class Laporan {

    public void laporan(Petugas petugas) {
        System.out.println();
        System.out.println("Tabel Petugas");
        System.out.println("================");
        System.out.println("Yang Bertugas : " + petugas.getNama(0));
        System.out.println("Telp          : " + petugas.getTelepon(0));
        String jabatan = (petugas.getJabatan(0) == 0)? "Pemilik" : "Pegawai";
        System.out.println("Status        : " + jabatan);
    }

    public void laporan(Client client){
        int x = client.getJumlahClient();

        System.out.println();
        System.out.println("Tabel Client");
        System.out.println("===============");
        System.out.println("ID \tNama \tAlamat\t \tTelepon \tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(i + "\t" + client.getNama(i) + "\t" 
            + client.getAlamat(i) + "\t" + client.getTelepon(i) + "\t" 
            + client.getSaldo(i));
        }
    }


    public void laporan(JenisLaundry laundry){
        int x = laundry.getJumlahJenisLaundry();

        System.out.println();
        System.out.println("Tabel Laundry");
        System.out.println("================");
        System.out.println("ID \tJenis Laundry \tDurasi(hari) \tHarga(/kg)");
        for (int i = 0; i < x; i++) {
            System.out.println(i + "\t" + laundry.getJenisLaundry(i) 
            + "\t\t" + laundry.getDurasi(i) + "hari" + "\t\t" + laundry.getHarga(i) + "/kg");
        }
    }

    public void laporan(Transaksi transaksi, JenisLaundry laundry) {
        int x = transaksi.getJumlahTransaksi();

        System.out.println();
        System.out.println();
        System.out.println("Laporan Transaksi");
        System.out.println("====================");
        System.out.println("Jenis laundry \tBerat \tHarga \t\tTotal");

        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = transaksi.getBanyak(i) * laundry.getHarga(transaksi.getIdJenisLaundry(i));
            total += jumlah;

            System.out.println(laundry.getJenisLaundry(transaksi.getIdJenisLaundry(i)) 
            + "\t\t" + transaksi.getBanyak(i)+ "kg" + "\t" + "Rp" + laundry.getHarga(transaksi.getIdJenisLaundry(i)) + "/kg" + "\t" 
            + jumlah);
        }
        System.out.println();
        System.out.println("Total Omset =  Rp" + total);
        System.out.println();
    }

}
