package com.study.demo.thread;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zsy
 * @date 2021/4/6 11:17
 * @email Chauncey.zhu@redearth.com
 * volatile 并不能保证多个线程共同修改running变量时所带来的不一致问题，也就是说volatile不能代替sync
 */

public class ThreadTest {

   // /*volatile*/  int count = 0;

    AtomicInteger count = new AtomicInteger(0);
    //synchronized
    void m(){
        for (int i=0;i<10000;i++){
            //count这个值保证了可见性，++本身没有保证原子性，解决方法加sync
            //count++;
            count.incrementAndGet();
        }
    }

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        List<Thread> threads = Lists.newArrayList();
        for (int i=0;i<10;i++){
            threads.add(new Thread(threadTest::m,"threadName-"+i));
        }
        threads.forEach(Thread::start);
        threads.forEach((o) -> {
            try {
                o.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        System.out.println(threadTest.count);
    }
}
