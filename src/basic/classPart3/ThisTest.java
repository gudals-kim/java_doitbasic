package basic.classPart3;

public class ThisTest {
    public static void main(String[] args) {
        BirthDay dDay = new BirthDay();
        dDay.setYear(1998);
        System.out.println(dDay);
        dDay.printThis();
    }
}
