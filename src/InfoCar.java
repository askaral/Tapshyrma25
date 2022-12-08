import java.util.Map;

public class InfoCar extends Car {
   private int year;
   private String model;
   private int price;
   private String colour;

   public InfoCar(int id, String carNumber, int year, String model, int price, String colour) {
      super(id, carNumber);
      this.year = year;
      this.model = model;
      this.price = price;
      this.colour = colour;
   }

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public String getColour() {
      return colour;
   }

   public void setColour(String colour) {
      this.colour = colour;
   }

   @Override
   public String toString() {
      return ""  + super.toString()+
              "\nYear: " + year +
              "\nModel: " + model  +
              "\nPrice: " + price +" $"+
              "\nColour: " + colour;

   }
   public void find(Map<String,InfoCar>cars,String name){

      if(cars.containsKey(name)){
         System.out.println(cars);
      }


   }
}
