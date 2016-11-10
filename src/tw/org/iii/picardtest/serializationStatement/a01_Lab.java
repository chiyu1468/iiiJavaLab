package tw.org.iii.picardtest.serializationStatement;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class a01_Lab {
    static public void main(String[] args){
        Student s1 = new Student("Tom",30,30,90);
        StudentSeries s2 = new StudentSeries("Mary",50,50,50);
        System.out.println(s2.name + "Total Score:" + s2.totalScore() + "  Avg Score:" + s2.avgScore());
        s2.age = 18;
        System.out.println(s2.getAge());


        try {
            ObjectOutputStream Oout =
                    new ObjectOutputStream(
                            new FileOutputStream("dir1/chiyu.oo"));
            // Oout.writeObject(s1); // 會出錯誤 java.io.NotSerializableException
            Oout.writeObject(s2);
            Oout.flush();
            Oout.close();

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}


class Student {
    int math, english, science;
    String name;
    Student (String name, int math,int english,int science) {
        this.name = name; this.math = math; this.english = english; this.science = science;
    }

    int totalScore(){return math+english+science;}
    double avgScore(){System.out.println("I'm MM");return (math+english+science)/3.0;}
}


// 為了讓使用者 確保自己知道這個 class 產生的 物件 可能會被序列化
// 一定要套用 Serializable 介面
class StudentSeries implements Serializable{
    int math, english, science;
    String name;

    // 如果有屬性不要被序列化出去
    // 就加上  transient 修飾
    transient int age;

    StudentSeries (String name, int math,int english,int science) {
        this.name = name; this.math = math; this.english = english; this.science = science;
    }

    int totalScore(){return math+english+science;}
    double avgScore(){System.out.println("I'm SS");return (math+english+science)/3.0;}
    int getAge(){return age;}
}
