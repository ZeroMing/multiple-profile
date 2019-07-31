package com.leo.profile;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: LeoMee
 * @date: 2019年08月01 00时26分
 */
@Component
@ConfigurationProperties(prefix = "leo")
public class LeoProperty{

    private String tag;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
