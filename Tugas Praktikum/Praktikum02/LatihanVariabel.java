public class LatihanVariabel {
    public static void main(String[] args) {
    int a = 10;
    double b = 3.0;
    float c = 4.3f;

    // ubah variabel a dan c ke tipe data double
    double a_konversi = Double.valueOf(a);
    double c_konversi = Double.valueOf(c);

    // jumlahkan variabel a, b, dan c
    double jumlah = a_konversi + b + c_konversi;

    // tampilkan hasil penjumlahan ketiga variabel
    System.out.println("Hasil penjumlahan ketiga variabel adalah : "+jumlah);
    }
}