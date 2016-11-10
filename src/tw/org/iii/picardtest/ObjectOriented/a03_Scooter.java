package tw.org.iii.picardtest.ObjectOriented;

// (幾乎)所有類別都要有 Constructor

// 若子類別裡面 沒有宣告任何 Constructor
// 則父類別 無參數的 Constructors 做為"唯一"的 Constructor 敘述
// 以上兩句應該是錯的

// 而是所有子類別 Constructor 的第一行 一定為 super()
// 若不特別寫 只是因簡寫而省略
// 原因為 子類別 必須要初始化 "從父類別繼承下來的屬性"
class a03_NotScooter extends a03_Bike {
    // a03_NotScooter(){super();}  // 這一行因為簡寫 所以省略
}



// 當然也可以特別指定自己要的 Constructor，不過第一行 仍然是 super()
class a03_Scooter extends a03_Bike{
    a03_Scooter(){
//        super(); // 這一行也因為簡寫 所以省略
        System.out.println("I'm Scooter");
        // super(); Constructor 中 沒有其他敘述 可以在 super 前面
    }
}


// 當然 其實也可以套用 父類別中 不同的 Constructor
class a03_OldScooter extends a03_Bike{
    a03_OldScooter(){
        super(1900);
        System.out.println("I'm Scooter");
    }
}


