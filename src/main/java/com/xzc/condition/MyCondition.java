package com.xzc.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author xzc
 * @date 2024/3/15 10 03:33
 * @description
 */
public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String osName = System.getProperty("os.name");
        if(osName.contains("Windows")){
            return false;
        }
        if(osName.contains("Mac"))
        {
//            System.out.println(osName);
            return true;
        }
        return false;

    }
}
