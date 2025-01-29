public class TaskFive
{
    //TODO Дано расстояние L в сантиметрах.
    // Используя операцию деления нацело, найти количество полных метров в нем (1 метр = 100 см).

    public static void main(String[] args)
    {
        int L = 2750;
        int meters = 0;

        meters = L / 100;

        System.out.println("Количество целых метров в расстоянии L = " + meters);
    }


}
