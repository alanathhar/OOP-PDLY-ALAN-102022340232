// Don't delete any comments below!!!
// Todo: Import Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

    }
        // Todo : Create ManajemenInventaris Object and Scanner
        Scanner scanner = new Scanner(System.in);
        ManajemenInventaris manajemenInventaris = new ManajemenInventaris()
        

        // Todo : Create Loop list menu
        while (true) {
            System.out.println(" ===== Menu Inventaris Makanan EAD ===== ");
            System.out.println(" 1. Tambah Makanan Kering \n 2. Tambah Makanan Basah \n 3. Tampilkan Semua Makanan \n 4. keluar");
            System.out.print("Pilih Menu: ");
            int menu = scanner.nextInt();

        switch (menu) {
            case 1 :
            manajemenInventaris.tambahMakananKering();
            break;

            case 2:
            manajemenInventaris.tambahMakananBasah();
            break;

            case 3:
            manajemenInventaris.tampilkanSemuaMakanan();
            break;

            case 4:
            break;

            default: 
                    
            
        }
    }
}

