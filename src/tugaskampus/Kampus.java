package tugaskampus;

public class Kampus {

    String namaMhs, Npm;
    String namaDosen, Nidn;

    public static void main(String[] args)  {
        Kampus person = new Kampus();
        System.out.println("====DOSEN====");
        person.Dosen();
        System.out.println("====MAHASISWA====");
        person.Mahasiswa();
    }


    void Dosen(){   
        namaMhs = "Andi Teguh Pratama";
        Npm     = "201843500330";
        System.out.println("Nama Mahasiswanya adalah = " +namaMhs);
        System.out.println("Nama Mahasiswanya adalah = " +Npm);
    }

    void Mahasiswa(){
        namaDosen = "Salahudin";
        Nidn     = "185433837";
        System.out.println("Nama Dosen pengampu adalah = " +namaDosen);
        System.out.println("NIDN Dosennya adalah = " +Nidn);
    }
}
