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
                    && secondHeadLookingNow == thirdHeadLookingNow) {

                totalTime += 1;
            }
        }
        System.out.println("Total time equals: " + totalTime + " minutes");
    }
}
