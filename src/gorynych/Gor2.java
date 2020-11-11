package gorynych;

public class Gor2 {
    public static void main(String[] args) {



        int totalTime = 0;
        int firstHead = 0;
        int secondHead = 0;
        int thirdHead = 0;

        String[] firstHeadsLooks = {"up", "down", "left", "right"};
        String[] secondHeadsLooks = {"down", "left", "right"};
        String[] thirdHeadsLooks = {"right", "left", "up"};

        for (int time = 0; time <= 180 ; time++) {
            //передаем в метод (функцию) текущее значение time, длину интересующего нас массива, значение локальной
            //переменной firstHead и время, за которое голова делает поворот, перевариваем все это в функции counter
            //и сохраняем результат обратно же в нашу переменную firstHead
            firstHead = counter(time, firstHeadsLooks.length, firstHead, 10);
            secondHead = counter(time, secondHeadsLooks.length, secondHead, 15);
            thirdHead = counter(time, thirdHeadsLooks.length, thirdHead, 20);

            String firstHeadLookingNow = firstHeadsLooks[firstHead];
            String secondHeadLookingNow = secondHeadsLooks[secondHead];
            String thirdHeadLookingNow = thirdHeadsLooks[thirdHead];

            if (firstHeadLookingNow == secondHeadLookingNow
                    && firstHeadLookingNow == thirdHeadLookingNow) {

                totalTime += 1;
            }
        }
        System.out.println("Total time equals: " + totalTime + " minutes");
    }

    //на вход - текщее время time, длина нужного массива, текущее значение ...head, время поворота головы
    //на выход - измененное здесь значение ...head
    private static int counter (int currentTime, int headLooksLength, int _head, int headRotationTime) {
        if (currentTime % headRotationTime == 0) {
            _head += 1;
            if (_head == headLooksLength) {
                _head = 0;
            }
        }
        return _head;
    }
    //стоило оно того?.. =)



}
