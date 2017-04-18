package stu.napls.task;

import org.springframework.scheduling.annotation.Scheduled;    
import org.springframework.stereotype.Component; 

@Component("testTask")
public class TestTask {
    @Scheduled(cron="0/10 * *  * * ? ")  
    public void task() {  
    	System.out.println("__________________________________");
    }  
}
