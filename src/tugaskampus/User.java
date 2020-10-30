package tugaskampus;

public class User {

  String username;
  int password;

  void setUser(int password, String username) {
    this.password = password;
    this.username = username;
  }

  void tampil() {
    System.out.println("Username : " + username);
    System.out.println("Password : " + password);

  }

  public static void main(String[] args) {
    User usr = new User();

    usr.setUser(12345, "Andi Teguh");
    usr.tampil();
  }
}
