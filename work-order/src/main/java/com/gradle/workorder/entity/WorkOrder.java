package com.gradle.workorder.entity;

import com.gradle.common.entity.CommonUtil;
import com.gradle.logmerge.entity.LogMerge;
import com.gradle.user.entity.User;
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
public class WorkOrder {

    @Value("${workOrder-module-name}")
    private String moduleName;

    @Autowired
    private CommonUtil commonUtil;

    @Autowired
    private User user;

    @Autowired
    private LogMerge logMerge;

    @PostConstruct
    public void init() {
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>编译WorkOrder开始>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(commonUtil.getModuleName() + user.getModuleName() + logMerge.getModuleName() + this.getModuleName());
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>编译WorkOrder结束>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    public String getModuleName() {
        return moduleName;
    }

}
