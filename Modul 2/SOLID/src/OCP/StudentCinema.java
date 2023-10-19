package OCP;

public class StudentCinema extends Cinema2 {
  public StudentCinema(Double price) {
    this.price = price;
  }

  @Override
  Double calculateAdminFee() {
    return price * 2 / 100;
  }
}