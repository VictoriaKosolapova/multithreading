//package org.example;
//
//public class Main {
//    public static void main(String[] args) throws InterruptedException {
//        Thread eggThread = new Thread(() -> {
//            for (int i = 0; i <= 5; i++) {
//                try {
//                    Thread.sleep(1000L);
//                    System.out.println("egg");
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//
//            }
//        });
//        System.out.println("Let`s begin the discussion");
//        eggThread.start();
//        for (int i = 0; i <= 5; i++) {
//            try {
//                Thread.sleep(1000L);
//                System.out.println("chicken");
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//        }
//        if (eggThread.isAlive()) {
//            eggThread.join();
//            System.out.println("Egg was first");
//        } else {
//            System.out.println("Chicken was first");
//        }
//    }
//}