package DIP;

public class Main {
  public static void main(String[] args) {
    EngineInterface fuelCar = new PetrolEngine();
    EngineInterface dieselCar = new DieselEngine2();
    EngineInterface hybridCar = new HybridEngine();

    // Boom Boom
    fuelCar.start();
    dieselCar.start();
    hybridCar.start();
  }
}