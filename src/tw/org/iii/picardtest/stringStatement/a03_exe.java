package tw.org.iii.picardtest.stringStatement;


public class a03_exe {
    static public void main(String[] args) {

        a03_AppicationID myID2 = new a03_AppicationID('B');
        System.out.println(myID2.getId());

        a03_AppicationID myID1 = new a03_AppicationID("M123456789");
        System.out.println(myID1.isCheckOK());
        System.out.println(myID1.getArea());



    }
}
