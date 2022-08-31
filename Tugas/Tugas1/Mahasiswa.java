import java.util.Scanner;

public class Mahasiswa {
    String nim, nama, jenisKelamin, alamat;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("Pengisian biodata mahasiswa");

        System.out.print("Masukkan NIM: ");
        String NIM = input.nextLine();
        
        System.out.print("Masukkan nama: ");
        String Nama = input.nextLine();
        
        System.out.print("Masukkan jenis kelamin: ");
        String JenisKelamin = input.nextLine();
        
        System.out.print("Masukkan alamat: ");
        String Alamat = input.nextLine();
        input.close();

        mahasiswa.isiData(NIM, Nama, JenisKelamin, Alamat);
        mahasiswa.printData();

    }

    public void isiData(String nim, String nama, String jenisKelamin, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    public void printData() {
        System.out.println("\nData Mahasiswa");
        System.out.println("NIM           : "+this.nim);
        System.out.println("Nama          : "+this.nama);
        System.out.println("Jenis Kelamin : "+this.jenisKelamin);
        System.out.println("Alamat        : "+this.alamat);
    }
}
