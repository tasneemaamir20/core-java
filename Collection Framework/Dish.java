
public class Dish {
    String dishName, type, cusine;
    int Price;

    Dish(String dishName, int Price, String type, String cusine) {
        this.dishName = dishName;
        this.Price = Price;
        this.type = type;
        this.cusine = cusine;
    }

    @Override
    public String toString() {

        return "Dish Name:" + dishName + "           Price:" + Price + "      Type:" + type + "      cuisine:" + cusine;
    }
}
