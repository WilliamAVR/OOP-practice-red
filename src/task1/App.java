package task1;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.sub(2);
        calc.pow(-3);
        System.out.println(calc.abs());
        System.out.println(calc.getResult());

    }
}
