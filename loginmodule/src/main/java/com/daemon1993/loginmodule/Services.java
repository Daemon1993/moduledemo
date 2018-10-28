package com.daemon1993.loginmodule;

import com.daemon1993.router.usercentermodule.UserCenterModuleService;

import io.github.prototypez.appjoint.AppJoint;

/**
 * Created by Daemon1993 on 2018/10/28 上午11:06.
 */
public class Services {
    public static UserCenterModuleService userCenterModuleService=AppJoint.service(UserCenterModuleService.class);
}
