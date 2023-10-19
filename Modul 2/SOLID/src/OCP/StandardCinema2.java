package OCP;

public class StandardCinema2 extends Cinema2 {
  public StandardCinema2(Double price) {
    this.price = price;
  }

  @Override
  Double calculateAdminFee() {
    return price * 10 / 100;
  }
}