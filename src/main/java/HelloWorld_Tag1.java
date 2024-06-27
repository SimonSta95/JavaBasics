public class HelloWorld_Tag1 {
    public static void main(String[] args) {
        // 1
        System.out.println("Hello, Java!");
        System.out.println("Java is cool!");

        // 2
        int a = 3;
        int b = 2;
        int sum = a + b;

        System.out.println("Sum: " + sum);

        // 3

        int dif = a - b;
        int div = a / b;
        int mul = a * b;

        System.out.println("----int----");
        System.out.println("Sub: " + dif);
        System.out.println("Div: " + div);
        System.out.println("Mul: " + mul);
        System.out.println("-----------");
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a == b);

        float c = 3.0f;
        float d = 2.0f;

        float sumF = c + d;
        float difF = c - d;
        float divF = c / d;
        float mulF = c * d;

        System.out.println("----Float----");
        System.out.println("Sum: " + sumF);
        System.out.println("Sub: " + difF);
        System.out.println("Div: " + divF);
        System.out.println("Mul: " + mulF);
        System.out.println("-----------");
        System.out.println(c < d);
        System.out.println(c > d);
        System.out.println(c == d);

        double e = 3.0;
        double f = 2.0;
        double sumD = e + f;
        double difD = e - f;
        double divD = e / f;
        double mulD = e * f;

        System.out.println("---double---");
        System.out.println("Sum: " + sumD);
        System.out.println("Sub: " + difD);
        System.out.println("Div: " + divD);
        System.out.println("Mul: " + mulD);
        System.out.println("-----------");
        System.out.println(e < f);
        System.out.println(e > f);
        System.out.println(e == f);

    }
}
