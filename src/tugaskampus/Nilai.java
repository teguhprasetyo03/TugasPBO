package tugaskampus;

public class Nilai {

  String nama = "Andi Teguh";
  int nilaiuts = 95;
  int nilaitugas = 88;
  int nilaiupm = 77;
  int nilaiakhir;

  public static void main(String[] args) {
    Nilai nilai = new Nilai();
    System.out.println("Nama Siswa : " + nilai.tampil());
    System.out.println("Nama Akhir Siswa: " + nilai.hasil());
  }

  String tampil() {
    return nama;
  }

  int hasil() {
    nilaiakhir = (nilaiuts + nilaitugas + nilaiupm) / 3;
    return nilaiakhir;
  }

}
