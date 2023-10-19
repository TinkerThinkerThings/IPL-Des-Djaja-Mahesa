package OCP;

public class DeluxeCinema2 extends Cinema2 {
  public DeluxeCinema2(Double price) {
    this.price = price;
  }

  @Override
  Double calculateAdminFee() {
    return price * 12 / 100;
  }
}