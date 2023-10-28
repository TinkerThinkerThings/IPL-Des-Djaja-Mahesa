package DIP;

public class Car implements EngineInterface {
  private final Engine engine;

  public Car(Engine engine) {
    this.engine = engine;
  }

  public void start() {
    engine.start();
  }
}