package Decorator;

public class CarShop {
    private Car car;

    public CarShop(Car car) {
        this.car = car;
    }

    public void saleCar() throws Exception {
        System.out.println("Здравстуйте клиент, цена этого авто (Вызвано из объекта CarShop)") ;
        try {
            car.GetPrice();
            System.out.println("Хочешь купить авто? (Вызвано из объекта CarShop)");
        }catch (Exception e){
            System.out.println("Давайте посмотрим другие авто? (Вызвано из объекта CarShop)");
        }
    }
}
