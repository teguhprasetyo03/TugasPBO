package tugaskampus;

import java.util.Scanner;

public class HitungLuas {

  public static void main(String[] args) {

    // Inisiasi Object
    HitungLuas hitung = new HitungLuas();
    hitung.hitungalas();
    hitung.hitungtinggi();
    hitung.hitunghasil();
  }

  // Inisiasi Variabel
  Double a, t;
  Double luas;
  Scanner sc = new Scanner(System.in);

  // Inisiasi Constructor
  public HitungLuas() {
    System.out.println("====PROGRAM HITUNG LUAS====");
  }

  void hitungalas() {
    System.out.println("Masukkan alas : ");
    a = sc.nextDouble();
  }

  void hitungtinggi() {
    System.out.println("Masukkan Tinggi : ");
    t = sc.nextDouble();
  }

  void hitunghasil() {
    System.out.println("Hasil dari Luas Segitiga Adalah : " + (luas = a * t * 0.5));
  }

  double getAlas() {
    return a;
  }

  double getTinggi() {
    return t;
  }

  double getLuas() {
    return luas;
  }

}