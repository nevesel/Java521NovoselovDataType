public class TaskSix
{
    //TODO Даны целые положительные числа A и B (A>B).
    // На отрезке длины A размещено максимально возможное количество отрезков длины B (без наложений).
    // Используя операцию деления нацело, найти количество отрезков B, размещенных на отрезке A.

    public static void main(String[] args)
    {
        int maxCountsOfSegments = 0;
        int A = 2750;
        int B = 341;

        maxCountsOfSegments = A / B;

        System.out.println("Максимальное количество отрезков B на отрезке A = " + maxCountsOfSegments + ".");
    }

}
