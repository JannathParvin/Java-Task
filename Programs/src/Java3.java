abstract class Car{
    public abstract void category();
}
class Swift extends Car {
    public void category()
    {
        System.out.println("Suzuki");
    }
}
class Innova extends Car{
    public void category()
    {
        System.out.println("Toyota");
    }
}

class Seltos extends Car{
    @Override
    public void category() {
        System.out.println("Kia");
    }
}
public class Java3 {
    public static void main(String[] args) {
        Swift ob=new Swift();
        ob.category();
        Innova obj=new Innova();
        ob.category();
        Seltos o=new Seltos();
        o.category();

    }

}
