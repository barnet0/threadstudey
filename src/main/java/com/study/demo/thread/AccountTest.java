package com.study.demo.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author zsy
 * @date 2021/3/30 9:54
 * @email Chauncey.zhu@redearth.com
 * 对业务写方法加锁
 * 对业务读方法不加锁
 * 容易产生脏读问题
 * synchronized 方法和非synchronized方法可以同时运行
 * 加锁的效率低
 */
public class AccountTest {

    String name;
    double balance;


    public synchronized void set(String name,double balance) {
        this.name = name;
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.balance = balance;
    }

    public  /*synchronized*/ double getBalance(String name){
        return this.balance;
    }

    public static void main(String[] args) {
        AccountTest accountTest = new AccountTest();
        new Thread(() -> accountTest.set("zsy",100)).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(accountTest.getBalance("zsy"));
        try {
            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(accountTest.getBalance("zsy"));
    }
}
