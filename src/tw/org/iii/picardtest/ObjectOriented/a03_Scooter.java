package tw.org.iii.picardtest.ObjectOriented;

public class a03_Scooter extends a03_Bike{
    a03_Scooter(){
        //super();
        super(1);
        System.out.println("I'm Scooter");
    }
}

// 若類別裡面 沒有任何 Constructors
// 父類別 無參數的 Constructors 做為"唯一"的 Constructors 敘述
class a03_NotScooter extends a03_Bike{

}

