package com.daemon1993.moduledemo;

import com.daemon1993.router.loginmodule.LoginModuleService;
import com.daemon1993.router.usercentermodule.UserCenterModuleService;

import io.github.prototypez.appjoint.AppJoint;

/**
 * Created by Daemon1993 on 2018/10/28 上午11:04.
 */
public class Services {
    public static LoginModuleService loginModuleService=AppJoint.service(LoginModuleService.class);
    public static UserCenterModuleService userCenterModuleService=AppJoint.service(UserCenterModuleService.class);
}
