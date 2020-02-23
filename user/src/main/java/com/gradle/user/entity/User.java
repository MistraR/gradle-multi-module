package com.gradle.user.entity;

import com.gradle.common.entity.CommonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Author: Mistra
 * @Version: 1.0
 * @Time: 2020/2/22 22:26
 * @Description:
 * @Copyright (c) Mistra,All Rights Reserved.
 * @Github: https://github.com/MistraR
 * @CSDN: https://blog.csdn.net/axela30w
 */
@Component
@Slf4j
public class User {

    @Value("${user-module-name}")
    private String moduleName;

    @Autowired
    private CommonUtil commonUtil;

    @PostConstruct
    public void init() {
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>编译User开始>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(commonUtil.getModuleName());
        System.out.println(this.getModuleName());
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>编译User结束>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    public String getModuleName() {
        return moduleName;
    }
}
