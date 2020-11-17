package com.boway.platemes.quartz;

import com.boway.platemes.util.DateUtils;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

import java.util.Date;

@DisallowConcurrentExecution //作业不并发
@Component
public class HelloWorldJob implements Job {

    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {

        System.out.println("欢迎使用,这是一个定时任务  --间隔5秒!"+ DateUtils.fullTime(new Date()));

    }

}
