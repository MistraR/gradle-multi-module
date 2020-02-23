package com.gradle.common.entity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Mistra
 * @ version: 1.0
 * @ Time: 2020/2/22 22:18
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
@Component
@Slf4j
public class CommonUtil {

    @Value("${common-module-name}")
    private String moduleName;

    @PostConstruct
    public void init() {
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>编译Common开始>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(this.getModuleName());
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>编译Common结束>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    }

    public String getModuleName() {
        return moduleName;
    }

}
