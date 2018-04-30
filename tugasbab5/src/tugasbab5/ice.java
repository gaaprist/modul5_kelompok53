
package tugasbab5;

import java.util.Scanner;

public final class ice {
    int ice;
    float jumlah;
    float jmlice;
    float jmlrp;
    int totalice;
    int totalrupiah;
    int noteid;
    int penyedia;
    String name;
    String pembayaran;
    String alamat;
    operasi ope;
    
        public ice(){ //constructor 
        ope = new operasi(); //inisialisasi obkject ope dari class operasi
        inputData(); //memanggil method input data
    }
    public void inputData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("===== Selamat Datang di Program Penjualan Ice Vainglory =====\n");
        System.out.println("Daftar Jumlah Ice dan Harga");
        System.out.println("1. 2600 Ice    = Rp. 105000");
        System.out.println("2. 5200 Ice    = Rp. 180000");
        System.out.println("3. 7800 Ice    = Rp. 250000");
        System.out.println("4. 9100 Ice    = Rp. 305000");
        System.out.println("5. 10400 Ice   = Rp. 365000");
        System.out.println("6. 14300 Ice   = Rp. 410000");
        System.out.print("Silakan Masukkan Nomor Jumlah Ice yang Anda Inginkan : ");
        ice = scan.nextInt();
        
        
        if (ice == 1) {
            jmlice = 2600;
            ope.jmlice = this.jmlice;
            jmlrp = 105000;
            ope.jmlrp = this.jmlrp;
        } 
        else if (ice == 2){
            jmlice = 5200;
            ope.jmlice = this.jmlice;
            jmlrp = 180000;
            ope.jmlrp = this.jmlrp;
        }
        else if (ice == 3){
            jmlice = 7800;
            ope.jmlice = this.jmlice;
            jmlrp = 250000;
            ope.jmlrp = this.jmlrp;
        }
        else if (ice == 4){
            jmlice = 9100;
            ope.jmlice = this.jmlice;
            jmlrp = 305000;
            ope.jmlrp = this.jmlrp;
        }
        else if (ice == 5){
            jmlice = 10400;
            ope.jmlice = this.jmlice;
            jmlrp = 365000;
            ope.jmlrp = this.jmlrp;
        }
        else if (ice == 6){
            jmlice = 14300;
            ope.jmlice = this.jmlice;
            jmlrp = 410000;
            ope.jmlrp = this.jmlrp;
        }
        else {
        System.out.println("Maaf Input yang Anda Masukkan Salah");
        System.exit(0);
        }
        System.out.print("Jumlah Item yang Anda Inginkan : ");
        jumlah = scan.nextInt ();
        ope.jumlah = this.jumlah;
    }
    
    public void persetujuan(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Apakah Anda ingin melanjutkan ke pembayaran? (Y/T) : ");
        pembayaran = scan.next();
     
        if (pembayaran.equals("y")){
            System.out.print("\nMasukkan nomor ID Anda : ");
            noteid = scan.nextInt();
            System.out.print("\nMasukkan alamat email Anda : ");
            alamat = scan.next ();
        }
        else if (pembayaran.equals("Y")){
            System.out.print("\nMasukkan nomor ID Anda : ");
            noteid = scan.nextInt();
            System.out.print("\nMasukkan alamat email Anda : ");
            alamat = scan.next ();
        }
        
        else if (pembayaran.equals("t")){
            System.exit(0);
        }
        else if (pembayaran.equals("T")){
            System.exit(0);
        }
        
        else {
            System.out.println("Maaf Input Anda salah");
            System.exit (0);
        }
    }
    
    public void totice(){
       totalice = (int) (ope.dikali());
    }
    
    public void totrp(){
       totalrupiah = (int) (ope.kalirp());
    }
    
    public void tampiltotal(){
        System.out.println("\nTotal Ice yang akan Anda beli sebanyak : "+totalice);
        System.out.println("Total yang harus dibayar sebesar : Rp. " +totalrupiah+",-");
    }
    
    public void bayar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPenyedia pembayaran");
        System.out.println("1. Indomaret");
        System.out.println("2. Alfamart");
        System.out.print("Pilihlah angka penyedia : ");
        penyedia = scan.nextInt();
        ope.penyedia = this.penyedia;
    }
    
    public void tampilakhir(){
        name = (ope.namapenyedia());
        System.out.println("\n=====================================");
        System.out.println("\nPembayaran melalui penyedia "+name);
        System.out.println("Kode pembayaran");
        System.out.println(ice+"ice"+noteid+jumlah);
        System.out.println("Jumlah total sebesar : Rp. "+totalrupiah+",-");
        System.out.println("Kode akan dikirm setelah pembayaran ke alamat email : "+alamat);
        System.out.println("Kami Cakrawati 21120117120019 dan Gagah Pristiyaputra 21120117130053 menunggu pembayaran Anda");
        System.out.println("Terima Kasih");
    }
}
