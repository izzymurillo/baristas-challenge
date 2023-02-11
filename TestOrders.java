public class TestOrders {

  public static void main(String[] args) {

    // ====== Menu items ======
    Item item1 = new Item("mocha", 5.5);
    Item item2 = new Item("latte", 5.0);
    Item item3 = new Item("drip coffee", 2.5);
    Item item4 = new Item("cappuccino", 3.5);

    // Create 2 orders for unspecified guests (without specifying a name);
    Order order1 = new Order();
    Order order2 = new Order();

    // Create 3 orders using the overloaded constructor to give each a name for the
    // order.
    Order order3 = new Order("Jimmy");
    Order order4 = new Order("Mario");
    Order order5 = new Order("Zeke");

    // Implement the addItem method within the Order class
    // Add at least 2 items to each of the orders using the addItem method you
    // wrote, for example, to add item1 to order3 you would need to call the addItem
    // method from the order3 instance like so: order3.addItem(item1);
    order1.addItem(item1);
    order1.addItem(item4);

    order2.addItem(item2);
    order2.addItem(item3);

    order3.addItem(item2);
    order3.addItem(item2);

    order4.addItem(item1);
    order4.addItem(item2);

    order5.addItem(item3);
    order5.addItem(item1);

    // Implement the getStatusMessage method within the Order class
    // Test your getStatusMessage functionality by setting some orders to ready and
    // printing the messages for each order. For example: order2.setReady(true);
    // System.out.println(order2.getStatusMessage());
    order1.setReady(true);
    System.out.println(order1.getName() + ": " + order1.getStatusMessage());

    order3.setReady(true);
    System.out.println(order3.getName() + ": " + order3.getStatusMessage());

    order5.setReady(true);
    System.out.println(order5.getName() + ": " + order5.getStatusMessage());

    // Implement the getOrderTotal method within the Order class
    // Test the total by printing the return value like so:
    // System.out.println(order1.getOrderTotal());
    System.out.println(order1.getName() + ", your Total is $" + order1.getOrderTotal());
    System.out.println(order2.getName() + ", your Total is $" + order2.getOrderTotal());
    System.out.println(order3.getName() + ", your Total is $" + order3.getOrderTotal());
    System.out.println(order4.getName() + ", your Total is $" + order4.getOrderTotal());
    System.out.println(order5.getName() + ", your Total is $" + order5.getOrderTotal());

    // Implement the display method within the Order class
    // Finally, call the display method on all of your orders, like so:
    // order3.display();
    order1.display();
    order2.display();
    order3.display();
    order4.display();
    order5.display();
  }
}
