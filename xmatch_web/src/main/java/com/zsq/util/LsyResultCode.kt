package com.zsq.util

/**
 * @author _Lines
 * Created by _Lines on 2017/11/9.
 */
class LsyResultCode {
    companion object {
        val SUCCESS = 1
        val ERROR = 0
        val USER_EXIST=11
        val USER_NOT_EXIST=12

        val DEP_EXIT = 21
        val DEPMANAGER_EXIST = 31
        val DEPMANAGER_NOT_EXIST =32
        val DEPMANAGER_PASSWORD_ERROR = 33

        val map = mapOf<Int, String>(
                SUCCESS to "success",
                ERROR to "error",
                USER_EXIST to  "学号已存在",
                USER_NOT_EXIST to "用户不存在" ,
                DEP_EXIT to "部门已存在",

                DEPMANAGER_EXIST to "部门管理员已存在",
                DEPMANAGER_NOT_EXIST to "部门管理员不存在",
                DEPMANAGER_PASSWORD_ERROR to "部门管理员登录密码错误"
        )
    }
}