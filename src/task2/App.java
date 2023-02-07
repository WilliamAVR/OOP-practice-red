package task2;

public class App {
    public static void main(String[] args) {
        Date d1 = new Date(31,0,2015);
        Date d2 = new Date(29,2,2000);
        Employee e1 = new Employee("Jonh","Smith",d2,d1);
        System.out.println(e1);
    }

}
