//2. Пусть дан произвольный список(ArrayList) целых чисел, удалить из него четные числа
//3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.*;
import java.util.logging.Logger;


public class homework2 {
    public static void main(String[] args) {
        ArrayList numbers = getArray(10);
        logger(String.valueOf(numbers));
        //mergeSort(numbers);
        logger(String.valueOf(numbers));
        numbers = deleteEven(numbers);
        logger(String.valueOf(numbers));
        logger(String.format("\nmin: %d\nmax: %d\naverage: %f", Collections.min(numbers), Collections.max(numbers), getAverage(numbers)));
    }

    public static ArrayList getArray(int n){
        ArrayList<Integer> resultArray = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            resultArray.add(random.nextInt(0, 100));
        }
        return resultArray;
    }



    // Удаляем чётные числа во второй задаче
    public static ArrayList deleteEven(ArrayList list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }
        return  list;
    }

    // Находим среднее арифметическое для третьей задачи:
    public static double getAverage(ArrayList<Integer> list){
        double sum = 0;
        for (int num : list) sum += num;
        return sum / list.size();
    }

    // Вывод в консоль через логгер
    public static void logger(String message) {
        Logger l = Logger.getAnonymousLogger();
        l.info(message);
    }
}