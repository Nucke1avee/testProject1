package gorynych;

/*
Три головы Змея Горыныча 3 часа смотрят в разные стороны.
Первая голова 10 минут смотрит вперед, затем 10 минут назад, потом 10 минут налево и 10 минут направо, снова 10 минут вперед и так далее по циклу.
Вторая голова 15 минут смотрит назад, затем 15 минут налево, потом 15 минут направо, снова назад и так далее по циклу.
Третья голова 20 минут смотрит направо, 20 минут налево, 20 минут вперед, снова навраво и так далее по циклу.
Сколько минут все три головы смотрели в одну сторону одновременно?
*/

public class Gorynych {
    public static void main(String[] args) {
        //Execution time: 11 ms
        System.out.println("Result: " + getMinutes(3));
        //Result: 15
    }

    private static int getMinutes(int timeAllHours) {
        int timeAllMinutes = timeAllHours * 60;
        int timeTogether = 0;

        String[] headFirst = {"forward", "back", "left", "right"};
        String[] headSecond = {"back", "left", "right"};
        String[] headThird = {"right", "left", "forward"};
        int turnTimeFH = 10;
        int turnTimeSH = 15;
        int turnTimeTH = 20;

        //каждые 5 минут проверяем куда смотрят все головы. направление одно - +5 минут в копилку
        for (int i = 0; i <= timeAllMinutes; i += 5) {
            if (headFirst[currElem(headFirst, turnTimeFH, i)].equals(headSecond[currElem(headSecond, turnTimeSH, i)])
                    && headFirst[currElem(headFirst, turnTimeFH, i)].equals(headThird[currElem(headThird, turnTimeTH, i)])) {
                timeTogether += 5;
            }
        }
        return timeTogether;
    }

    //куда смотрит голова (какой элемент массива нам нужен) в данный момент времени
    private static int currElem(String[] array, int turnTime, int i) {
        return i % (turnTime * array.length) / turnTime;
    }
}
