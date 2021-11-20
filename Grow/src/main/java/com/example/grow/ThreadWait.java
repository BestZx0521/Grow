package com.example.grow;

public class ThreadWait {

    public static void main(String[] args) {
        try {
            new Thread(new Thread1()).start();
            try {
                Thread.sleep(10);
            }catch (Exception e){
                e.printStackTrace();
            }
            new Thread(new Thread2()).start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private static class Thread1 implements Runnable{

        @Override
        public void run() {

            synchronized (ThreadWait.class) {
                try {
                    System.out.println("线程1启动");
                    ThreadWait.class.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("线程1结束");
            }
        }
    }
    private static class Thread2 implements  Runnable{

        @Override
        public void run() {
            synchronized (ThreadWait.class){
                try {
                    ThreadWait.class.notify();
                    System.out.println("线程2启动");
//                    Thread.sleep(10);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println("线程2结束");
            }
        }
    }
}
