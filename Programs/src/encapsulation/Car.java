package encapsulation;

public class Car {
    private String carModel;
    private String brandName;
    private int cost;

    //public getters  (it will allow the access)

    public String getCarModel() {
        return carModel;
    }

    public String getBrandName() {
        return brandName.toUpperCase();
    }

    public int getCost() {
        return cost;
    }


    ///public setter

    public void setCarModel(String bikeModel) {
        this.carModel = bikeModel+"Maveric";
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    void display()
    {
        System.out.println(carModel);
        System.out.println(brandName);
        System.out.println(cost);
    }
}
