package tugaskampus;

import java.util.Scanner;

public class MencariNlai {
  static String nama, nim;

  static double nilaitugas, nilaiuts, nilaikuis, nilaiuas, nilaiakhir;

  public static void main(String[] args) {
    String yesno;
    do {
      Scanner input = new Scanner(System.in);

      System.out.println("===== Menghitung Nilai Mahasiswa===== \n");

      System.out.print("Masukan nama : ");
      nama = input.nextLine();

      System.out.print("Masukan NIM : ");
      nim = input.nextLine();

      System.out.print("Nilai tugas : ");
      nilaitugas = input.nextInt();

      System.out.print("Nilai kuis : ");
      nilaikuis = input.nextInt();

      System.out.print("Nilai uts : ");
      nilaiuts = input.nextInt();

      System.out.print("Nilai uas : ");
      nilaiuas = input.nextInt();

      hitung_n_akhir();
      System.out.println(nama + " dengan NIM " + nim + " memiliki nilai akhir " + nilaiakhir);

      System.out.println("Ingin Mengulang [T/Y]? ");
      Scanner input3 = new Scanner(System.in);
      yesno = input3.next();
      switch (yesno) {
        case "y":
        case "Y":
          break;
        case "t":
        case "T":
          break;
      }
    } while (yesno.equals("y") || yesno.equals("Y"));
  }

  public static double hitung_n_akhir() {
    nilaiakhir = (0.20 * nilaitugas + 0.20 * nilaikuis + 0.30 * nilaiuts + 0.50 * nilaiuas);
    return nilaiakhir;

  }

}
