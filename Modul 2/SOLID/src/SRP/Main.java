package SRP;

public class Main {
  public static void main(String[] args) {
    Item item = new Item();
    Order2 order = new Order2();
    order.addItem(item);
    OrderHistory history = new OrderHistory();
    history.getDailyHistory();
    OrderViewer viewer = new OrderViewer();
    viewer.printOrder(order);
  }
}