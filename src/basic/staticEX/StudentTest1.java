package basic.staticEX;

public class StudentTest1 {
    public static void main(String[] args) {
        Student lee = new Student();
        lee.setStudentname("이정현");
        System.out.println(lee.studentNum);
        lee.studentNum++;

        Student kim = new Student();
        kim.setStudentname("김형민");
        System.out.println(kim.studentNum);
        System.out.println(lee.studentNum);
    }
}
