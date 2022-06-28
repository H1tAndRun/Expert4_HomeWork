package Decorator;

public class Car {
    private int price;

    public Car(int price) {
        this.price = price;
    }

    public void GetPrice() throws Exception {
        if (price<0){
            System.out.println("Неизвестна мне - (вызванно из объекта Car)");
            throw new Exception();
        }else {
            System.out.println(price +" - (вызванно из объекта Car)");
        }

    }
}
