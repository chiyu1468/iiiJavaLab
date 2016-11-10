package tw.org.iii.picardtest.ObjectOriented;

public class a03_Bike {


    char owner;
    int weight;
    private double speed;


    a03_Bike(){
        weight = 10;
        System.out.println("I'm Bike");
    }

    a03_Bike(int year){
        System.out.println("I'm Old Bike from : " + year);
    }


    // 方法名稱雖然一樣，依照變數的型別、數量不同，可以識別為不同的東西
    void SpeedUp(){
        speed = speed<1?1:speed*1.3;
    }
    void SpeedUp(int gear){
        System.out.print("int加速器");
        speed = speed<1?1:speed*(1.2*gear);
    }
    void SpeedUp(double gear){
        System.out.print("double加速器");
        speed = speed<1?1:speed*(gear);
    }
    void SlowDown(){
        speed = speed<1?0:speed*0.7;
    }
    double getSpeed() {
        return speed;
    }



}
