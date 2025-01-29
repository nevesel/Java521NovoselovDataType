public class TaskEight
{
    //TODO Даны два ненулевых числа. Найти сумму, разность, произведение и частное их квадратов.

    public static void main(String[] args)
    {
        int A = -2750;
        int B = 576;

        int A2 = A * A;
        int B2 = B * B;


        System.out.println("Сумма квадратов чисел A и B = " + (A2 + B2) + ".");
        System.out.println("Разность квадратов чисел A и B = " + (A2 - B2) + ".");
        System.out.println("Произведение квадратов чисел A и B = " + (A2 * B2) + ".");
        System.out.println("Частное квадратов чисел A и B = " + (A2 / B2) + ".");

    }
}

