package tugaskampus;

import java.util.Scanner;

public class Karyawan {

  public static void main(String[] args) {
    Karyawan karyawan = new Karyawan();
    karyawan.tampil();
  }

  String Nip;
  String nama;

  int gol;
  double gapok;
  double tunjangan;
  double totalgaji;

  Scanner input = new Scanner(System.in);

  public Karyawan() {
    System.out.println("Masukkan Nama : ");
    nama = input.nextLine();

    System.out.println("Masukkan NIP : ");
    Nip = input.nextLine();

    System.out.println("Masukkan Golongan : ");
    gol = input.nextInt();

    switch (gol) {
      case 1:
        gapok = 1486500;
        tunjangan = 250000;
        break;
      case 2:
        gapok = 1926000;
        tunjangan = 300000;
        break;
      case 3:
        gapok = 2456700;
        tunjangan = 350000;
        break;
      case 4:
        gapok = 2899500;
        tunjangan = 400000;
        break;
      default:
        gapok = 0;
        tunjangan = 0;
    }
    totalgaji = (tunjangan + gapok);
  }

  public void tampil() {
    System.out.println("Nama Karyawan adalah : " + this.nama);
    System.out.println("NIP Karyawan adalah : " + this.Nip);
    System.out.println("Golongan Karyawan Adalah : " + this.gol);
    System.out.println("Gaji Karyawan Adalah : " + this.gapok);
    System.out.println("Tunjangan Karyawan Adalah : " + this.tunjangan);
    System.out.println("Total Gaji Berdasarkan Golongan : " + this.totalgaji);
  }
}
