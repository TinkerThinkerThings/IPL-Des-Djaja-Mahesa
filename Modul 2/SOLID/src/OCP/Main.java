package OCP;

public class Main {
  public static void main(String[] args) {
    StandardCinema2 standardCinema = new StandardCinema2(100.0);
    Double adminFee = standardCinema.calculateAdminFee();
    System.out.println(adminFee);
  }
}