package CarSpeed;

public class Car {
    int currentSpeed;

    void speedIncrease(){
        currentSpeed +=4;
    }

    void speedDecrease(){
       if (currentSpeed >= 5){
           currentSpeed -= 5;
       }else {
           currentSpeed = 0;
       }
    }

    public String toString(){
        return "Current Speed " + currentSpeed + " km/h.";
    }
}
