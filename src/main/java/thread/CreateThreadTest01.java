package thread;

import io.netty.util.concurrent.DefaultThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CreateThreadTest01 {

    public static final ExecutorService pool = new ThreadPoolExecutor(4, 4, 1000, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<>(), new DefaultThreadFactory("CreateThreadTest01-pool"),
            new ThreadPoolExecutor.CallerRunsPolicy());


    public static void main(String[] args) {
        pool.execute(()-> {
            for (int i = 0; i < 200;i++){
                System.out.println("执行。。。" + i);
            }
        });
    }
}
