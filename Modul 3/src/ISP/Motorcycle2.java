package ISP;

public class Motorcycle2 implements VehicleInterface2 {
  @Override
  public void drive() {
    System.out.println("Sepeda motor sedang melaju");
  }

  @Override
  public void stop() {
    System.out.println("Sepeda motor sedang berhenti");
  }

  @Override
  public void refuel() {
    System.out.println("Sepeda motor sedang mengisi bahan bakar");
  }
}