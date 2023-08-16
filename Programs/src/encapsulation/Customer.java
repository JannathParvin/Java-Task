package encapsulation;

public class Customer extends Car {

        public static void main(String[] args) {
        Car b = new Car();
        b.setCarModel("Innova");
        b.setBrandName("Toyoto");
        b.setCost(900000);

        Car b1=new Car();
        b1.setBrandName("Swift");
        b1.setCarModel("Suzuki");
        b1.setCost(300000);

        System.out.println(b.getCarModel());
        System.out.println(b.getBrandName());
        System.out.println(b.getCost());

        System.out.println(b1.getCarModel());
        System.out.println(b1.getBrandName());
        System.out.println(b1.getCost());

       /* Car c1= new Car();
            System.out.println(c1.getCarModel());
            System.out.println(c1.getBrandName());
            System.out.println(c1.getCost());*/


        }
    }


