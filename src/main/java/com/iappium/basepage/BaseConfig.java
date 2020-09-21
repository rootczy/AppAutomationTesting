package com.iappium.basepage;

import lombok.Getter;
import lombok.Setter;

/**
 * BaseApp
 * @author czy
 * @version 1.0.0
 * @date 2020/8/1 23:28
 */

/**
 * 配置参数写死，其它类公用。目前无法通过YAML配置注入bean中，原因是testng套件不支持bean注入，所以定义一个基础配置BaseConfig
 * */
@Setter
@Getter
public class BaseConfig {

    /**
     * 手机系统iOS, Android, or FirefoxOS
     */
    private String platformName="Android";

    /**
     * app 包名
     */
    private String appPackage="com.tencent.mm";

    /**
     * app Activity
     */
    private String appActivity="com.tencent.mm.ui.LauncherUI";

    /**
     * 自动化测试引擎
     */
    private String automationName="Appium";

    /**
     * hub ip 地址
     */
    private String remoteIP="127.0.0.1";

    /**
     * hub 端口号
     */
    private String remotePort="4723";

    /**
     * 隐式等待时长
     */
    private Long implicitlyWait= Long.valueOf("6");

    // todo : 其它配置参数可自定义

}