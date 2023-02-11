public class Item {
    
    //  ===== MEMBER VARIABLES ===== 
    private String name;
    private double price;
    
    //  ===== CONSTRUCTOR ===== 
    //   Takes a name and price as arguments 
    //   and sets them accordingly
    public Item(String name, double price) {
      this.name = name;
      this.price = price;
    }
    
    // ==== GETTERS & SETTERS for name & price ==== 
    // Getter for name
    public String getName() {
      return name;
    }
    
    // Setter for name
    public void setName(String name) {
      this.name = name;
    }

    // Getter for price
    public double getPrice() {
      return price;
    }
    
    // Setter for price
    public void setPrice(double price) {
      this.price = price;
    }
    
}
