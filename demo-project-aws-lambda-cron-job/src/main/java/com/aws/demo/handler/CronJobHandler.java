package com.aws.demo.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class CronJobHandler implements RequestHandler<Object, String> {
    @Override
    public String handleRequest(Object input, Context context) {
        // Your scheduled task logic here
        System.out.println("Cron job executed!");
        return "Job completed successfully";
    }
}
