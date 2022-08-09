/*
 * Program for stopwatch
 * @author Lukhanyo Vena
 */

public class StopWatch {
    
    private long start;

    public void start() {
        start = System.currentTimeMillis();
    }

    public void stop() {
        System.out.println("Execution Time: "+((double)(System.currentTimeMillis()-start)/1000));
    }
}