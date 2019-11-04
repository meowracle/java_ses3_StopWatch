public class MainRun {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
