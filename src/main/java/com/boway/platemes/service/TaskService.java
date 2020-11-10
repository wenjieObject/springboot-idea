package com.boway.platemes.service;

import com.boway.platemes.pojo.TaskDO;
import com.boway.platemes.quartz.QuartzManager;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    QuartzManager quartzManager;

    public TaskDO get(Long id) {
        return new TaskDO();
    }

    public int save(TaskDO task) {
        return 1;
//        task.setJobStatus(JobStatusEnum.STOP.getCode());
//        task.setCreateUser(((UserDO)SecurityUtils.getSubject().getPrincipal()).getUsername());
//        task.setCreateTime(new Date());
//        task.setUpdateUser(((UserDO)SecurityUtils.getSubject().getPrincipal()).getUsername());
//        task.setUpdateTime(new Date());
//        return taskMapper.save(task);
    }

    public int update(TaskDO task) {
        return 1;
        //return taskMapper.update(task);
    }

    public int remove(Long id) {
        return 1;
    }

    public int removeBatch(Long[] ids) {
        return 1;
    }

    public void initSchedule() throws SchedulerException {

        //模拟从数据库获取数据
        TaskDO taskDo=new TaskDO();
        taskDo.setBeanClass("com.boway.platemes.quartz.HelloWorldJob");
        taskDo.setJobName("HelloWorldJob");
        taskDo.setJobName("HelloWorldJobGroup");
        taskDo.setCronExpression("*/5 * * * * ?");
        taskDo.setJobStatus("1");
        quartzManager.addJob(taskDo);
        // 这里获取任务信息数据
//        List<TaskDO> jobList = new ArrayList<>();
//        for (TaskDO task : jobList) {
//            if ("1".equals(task.getJobStatus())) {
//                quartzManager.addJob(task);
//            }
//        }
    }

    public void changeStatus(Long jobId, String jobStatus) throws SchedulerException {
        TaskDO task = get(jobId);
        if (task == null) {
            return;
        }
        if ("0".equals(jobStatus)) {
            quartzManager.deleteJob(task);
            task.setJobStatus("0");
        } else {
            task.setJobStatus("1");
            quartzManager.addJob(task);
        }
        update(task);
    }

    public void updateCron(Long jobId) throws SchedulerException {
        TaskDO task = get(jobId);
        if (task == null) {
            return;
        }
        if ("1".equals(task.getJobStatus())) {
            quartzManager.updateJobCron(task);
        }
        update(task);
    }


    public void run(TaskDO task) throws SchedulerException {
        quartzManager.runJobNow(task);
    }
}
