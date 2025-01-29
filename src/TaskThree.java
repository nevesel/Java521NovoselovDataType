public class TaskThree
{
    //TODO Даны стороны прямоугольника a и b. Найти его площадь S=a∗b и периметр P=2∗(a+b).

    public static void main(String[] args)
    {
        int a = 10;
        int b = 5;
        int S = 0;
        int P = 0;

        S = a * b;
        P = 2 * (a+b);

        System.out.println("Площадь прямоугольника = " + S + " условных единиц.");
        System.out.println("Периметр прямоугольника = " + P + " условных единиц.");

    }
}
