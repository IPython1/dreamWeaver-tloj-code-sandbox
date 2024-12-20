package com.yupi.tloj.model.dto.questionsubmit;

import lombok.Data;

/**
 * @Author:杰杰睡不醒
 * @Date:2024/11/1 10:14
 * @Description:题目判题信息
 **/
@Data
public class JudgeInfo {
    /*
    * 程序执行信息
    * */
    private String message;
    /*
    * 消耗内存
    * */
    private Long memory;
    /*
    * 消耗时间(kb)
    * */
    private Long time;
}
