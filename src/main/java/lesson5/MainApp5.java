package lesson5;

public class MainApp5 {

    public static double degree(int base, int exp) {
        if (exp == 1 || exp == -1) {
            return base;
        } if (exp > 1) {
            return (base * degree(base, exp - 1));
        } if (exp < -1) {
            exp = exp * -1;
            return 1/(base * degree(base, exp - 1));//не знаю как записать в виде обыкновенной дроби
        }
        return degree(base, exp);
       }

    public static void main(String[] args) {
        System.out.println(degree(3,-2));
    }

}
