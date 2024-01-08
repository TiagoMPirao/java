package CarSpeed;

public class CarTests {
    public static void main(String[] args){
        Car c1 = new FerrariSpeed();
        c1.speedIncrease();
        c1.speedIncrease();
        c1.speedIncrease();
        c1.speedDecrease();
        c1.speedDecrease();

        Car c2 = new DucatiSpeed();
        c2.speedIncrease();
        c2.speedIncrease();
        c2.speedIncrease();
        c2.speedDecrease();
        c2.speedDecrease();
    }
}
