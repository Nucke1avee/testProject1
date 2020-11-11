package gorynych;

public class Gor {
    public static void main(String[] args) {



        int totalTime = 0;
        int firstHead = 0;
        int secondHead = 0;
        int thirdHead = 0;

        String[] firstHeadsLooks = {"up", "down", "left", "right"};
        String[] secondHeadsLooks = {"down", "left", "right"};
        String[] thirdHeadsLooks = {"right", "left", "up"};

        //если я правильно понял, то у тебя время начинается с 1й минуты? Т.е. промежуток [1; 180]
        //а промежуток [0; 1]? если б они в начале смотрели бы в одну сторону, то ты не досчитался бы 1й минуты...
        for (int time = 1; time <= 180 ; time++) {
            if (time % 10 == 0) {
                firstHead += 1;
                if (firstHead == firstHeadsLooks.length) {
                    firstHead = 0;
                }
            }

            if (time % 15 == 0) {
                secondHead += 1;
                if (secondHead == secondHeadsLooks.length) {
                    secondHead = 0;
                }
            }

            if (time % 20 == 0) {
                thirdHead += 1;
                if (thirdHead == thirdHeadsLooks.length) {
                    thirdHead = 0;
                }
            }

            String firstHeadLookingNow = firstHeadsLooks[firstHead];
            String secondHeadLookingNow = secondHeadsLooks[secondHead];
            String thirdHeadLookingNow = thirdHeadsLooks[thirdHead];

            if (firstHeadLookingNow == secondHeadLookingNow
                    && firstHeadLookingNow == thirdHeadLookingNow
                    //зачем 3я проверка? есть a, b, c. если а = b и a = c, то уже понятно что и b = c
                    && secondHeadLookingNow == thirdHeadLookingNow) {

                totalTime += 1;
            }
        }
        System.out.println("Total time equals: " + totalTime + " minutes");









    }
}
