package threadLearning.deadLock;

import threadLearning.deadLockDetector.DeadlockDetector;
import threadLearning.deadLockDetector.DetectionConsoleHandler;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class DeadLockLearning {

    public static final Object Lock1 = new Object();
    public static final Object Lock2 = new Object();

    public static void main(String args[]) {

        DeadlockDetector deadlockDetector = new DeadlockDetector(new DetectionConsoleHandler(),
                5, TimeUnit.SECONDS);
        deadlockDetector.start();

        WorkerThread1 t1 = new WorkerThread1();
        WorkerThread2 t2 = new WorkerThread2();
        t1.start();
        t2.start();
    }

    private static class WorkerThread1 extends Thread {
        public void run() {
            synchronized (Lock1) {
                System.out.println("Thread 1: Holding lock 1...");

                try {
                    Thread.sleep(10);
                }
                catch (InterruptedException e) {
                    System.out.println(Arrays.toString(e.getStackTrace()));
                }
                System.out.println("Thread 1: Waiting for lock 2...");

                synchronized (Lock2) {
                    System.out.println("Thread 1: Holding lock 1 & 2...");
                }
            }
        }
    }

    private static class WorkerThread2 extends Thread {
        public void run() {
            synchronized (Lock2) {
                System.out.println("Thread 2: Holding lock 2...");

                try {
                    Thread.sleep(10);
                }
                catch (InterruptedException e) {
                    System.out.println(Arrays.toString(e.getStackTrace()));
                }
                System.out.println("Thread 2: Waiting for lock 1...");

                synchronized (Lock1) {
                    System.out.println("Thread 2: Holding lock 1 & 2...");
                }
            }
        }
    }
}
