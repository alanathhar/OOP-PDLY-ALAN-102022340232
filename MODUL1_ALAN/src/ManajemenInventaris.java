// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();
    public void tambahMakananKering() {
        Scanner scanner = new Scanner(System.in);
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.println("Masukan Nama Makanan: ");
        String nama  = scanner.nextLine();

        System.out.println("Masukan Jumlah Makanan: ");
        int jumlah = scanner.nextInt();

        System.out.println("Masukan Harga Makanan");
        double harga = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Masukan Brand Makanan: ");
        String brand = scanner.nextLine();

        // Todo : Create a new object for MakananKering
        MakananKering makananKering = new MakananKering(nama,jumlah,harga,brand);
        daftarMakananKering.add(makananKering);
        
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        System.out.println("Makanan kering berhasil ditambahkan");
        scanner.close();
      
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan Nama Makanan: ");
        String nama  = scanner.nextLine();

        System.out.println("Masukan Jumlah Makanan: ");
        int jumlah = scanner.nextInt();

        System.out.println("Masukan Harga Makanan");
        double harga = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Masukan Bahan Makanan: ");
        String bahan = scanner.nextLine();

        // Todo : Create a new object for MakananBasah
        MakananBasah makananBasah = new MakananBasah(nama,jumlah,harga,bahan);
        daftarMakananBasah.add(makananBasah);
        
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
        System.out.println("Makanan Basah berhasil ditambahkan ");
        scanner.close();
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
            System.out.println("Tidak ada makanan disini");
        } 
    
            // Todo : Create print notification for Makanan Kering
            
            for (MakananKering makananKering : daftarMakananKering){
                makananKering.ShowData();
            }
            
            // Todo : Create print notification for  Makanan Basah
            for (MakananBasah makananBasah : daftarMakananBasah){
                makananBasah.ShowData();
            }
            }
        }

