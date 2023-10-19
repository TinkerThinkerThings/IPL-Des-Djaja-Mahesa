package OCP;

public class PremiumCinema2 extends Cinema2 {
  public PremiumCinema2(Double price) {
    this.price = price;
  }

  @Override
  Double calculateAdminFee() {
    return price * 20 / 100;
  }
}