package tugaskampus;

public class Person {
  String namaPerson, alamatPerson;
  int umurPerson, tinggiPerson;

  // ini adalah contoh parameterized constructor
  // dengan memberikan nilai awal data member nama_kucing dan berat_badan
  // dengan parameter yang kita tentukan
  public Person(String nama, String alamat, int umur, int tinggi) {
    namaPerson = nama;
    alamatPerson = alamat;
    umurPerson = umur;
    tinggiPerson = tinggi;
  }
}
