import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String,InfoCar>car=new HashMap<>();
        car.put("Mercedes",new InfoCar(1,"MM AK 173",2008,"C 220",3000,"White"));
        car.put("BMW",new InfoCar(2,"M AA 107",2012,"X6",7000,"Black"));
        car.put("Audi",new InfoCar(3,"I KJ 2969",2015,"Q5",7500,"Blue"));
        car.put("VW",new InfoCar(4,"W KI 2808",2010,"Golf 5",4500,"Silver"));
        car.put("Ford",new InfoCar(5,"F AJ 067",2006,"Mandeo",3500,"Red"));
        car.put("Toyota",new InfoCar(6,"B HH 25", 2011,"Avensis",5500,"Dark blue"));
        car.put("Honda",new InfoCar(7, "A GH 764",2018,"Inspire",5000,"Dark grey"));


       for (Map.Entry cars: car.entrySet()) {
           System.out.println(cars.getKey()+""+cars.getValue());
       }

    }
}