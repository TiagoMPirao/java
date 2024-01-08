package CarSpeed;

public class DucatiSpeed extends Car{
    @Override
    void speedIncrease(){
        currentSpeed += 25;
    }

    @Override
    void speedDecrease(){
        if (currentSpeed >= 20){
            currentSpeed -= 20;
        }else {
            currentSpeed = 0;
        }
    }
}
