package CarSpeed;

public class FerrariSpeed extends Car {

    @Override
    void speedIncrease(){
        currentSpeed += 50;
    }

    @Override
    void speedDecrease(){
        if (currentSpeed >= 25){
            currentSpeed -= 25;
        }else {
            currentSpeed = 0;
        }
    }

}


