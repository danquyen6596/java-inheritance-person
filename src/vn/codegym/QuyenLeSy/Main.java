package vn.codegym.QuyenLeSy;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Vin Diesel", "O2O");
        Staff staff = new Staff("Dwayne Johnson", "New York", "Califonia", 25000);
        Student student = new Student("Jason Statham", "Wasington","BootCamp", 2018, 3000);

        System.out.println(person.toString());
        System.out.println(staff.toString());
        System.out.println(student.toString());
    }
}
