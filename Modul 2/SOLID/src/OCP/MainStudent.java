package OCP;

public class MainStudent {
  public static void main(String[] args) {
    StudentCinema studentCinema = new StudentCinema(575.5);
    Double adminFee = studentCinema.calculateAdminFee();
    System.out.println(adminFee);
  }
}