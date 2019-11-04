public class StopWatch {
    private long startTime;
    private long endTime;


    public StopWatch() {
        this.startTime = System.nanoTime();
    }

    ;

    public void start() {
        this.startTime = System.nanoTime();
    }

    public void stop() {
        this.endTime = System.nanoTime();
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
