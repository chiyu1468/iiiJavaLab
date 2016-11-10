package tw.org.iii.picardtest.ObjectOriented;

public class a01_Bike {
    // Member: 成員 > 屬性 / 方法
    // 變數範圍:
    // public > protected       > "NONE"  > private
    // 全世界  > 同pack & 繼承子類 > 同pack  > 只有該類別
    char owner;
    int weight;
    private double speed;

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
