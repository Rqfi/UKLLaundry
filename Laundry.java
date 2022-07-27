package UKLPBO;

public class Laundry {
    static JenisLaundry laundry = new JenisLaundry();
    static Client client = new Client();
    static Petugas petugas = new Petugas();
    static Transaksi transaksi = new Transaksi();
    static Laporan laporan = new Laporan();
        
    public static void main(String[] args) {
        laporan.laporan(client);
        laporan.laporan(laundry);
        transaksi.inputTransaksi(client, laundry);
        transaksi.prosesTransaksi(client, transaksi, laundry);
        laporan.laporan(petugas);
        laporan.laporan(transaksi, laundry);
    }
    
}