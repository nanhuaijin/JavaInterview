package com.code.juc;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author : breeze
 * @date : 2022/2/23
 * @desc : 多线程高并发
 */
public class JavaJuc {

    public static void main(String[] args) {

    }

    public static void createThread() throws ExecutionException, InterruptedException {

        Callable<Integer> callable = () -> {
            System.out.println("1");
            return 1;
        };
        FutureTask<Integer> task = new FutureTask<>(callable);
        Thread thread = new Thread(task);
        thread.start();
        Integer integer = task.get();
    }
}
