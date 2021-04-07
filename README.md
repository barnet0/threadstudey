# threadstudey

线程：进程执行的最小单位，一个程序里不同的执行路径
run（）执行是一条路径执行的，一个程序执行完才会执行下一个。
start（）是多条路径执行，多个方法同时执行

![image-20210329161009146](https://user-images.githubusercontent.com/9976929/113840679-845c7200-97c3-11eb-8276-d04e0d81d3a0.png)


线程的三种方式：1.继承thread类2.实现runnable接口3.多线程启动 Executors.newCachedThread

![image-20210329163637495](https://user-images.githubusercontent.com/9976929/113841049-eae19000-97c3-11eb-8693-9b532eb4859c.png)


### Synchronized的底层实现

sync（obj ）当系统中只有一个线程启动时，markword 记录下这个线程ID，偏向锁，如果有线程争用，升级为自旋锁，10次以后，升级为重量级锁 - 系统锁，向操作系统申请资源

自旋锁： 执行时间短，线程数少

系统锁： 执行时间长，线程数多 sync

![image-20210402135442361](https://user-images.githubusercontent.com/9976929/113840756-9a6a3280-97c3-11eb-9442-3820c6879956.png)


![image-20210402145910940](https://user-images.githubusercontent.com/9976929/113840799-a3f39a80-97c3-11eb-8996-ab5ae83ea83d.png)


![image-20210402152540135](https://user-images.githubusercontent.com/9976929/113840830-aa821200-97c3-11eb-84bd-8ef891cf9d68.png)


![image-20210402153836983](https://user-images.githubusercontent.com/9976929/113840866-b7066a80-97c3-11eb-9c96-8d22b82346cb.png)


![image-20210406095735281](https://user-images.githubusercontent.com/9976929/113840897-c1c0ff80-97c3-11eb-9d10-70b5e5bac3cb.png)


![image-20210406173159619](https://user-images.githubusercontent.com/9976929/113840926-cab1d100-97c3-11eb-886d-b66a50799e87.png)


![image-20210406180432886](https://user-images.githubusercontent.com/9976929/113840953-d30a0c00-97c3-11eb-88c6-b02ea62967c5.png)
