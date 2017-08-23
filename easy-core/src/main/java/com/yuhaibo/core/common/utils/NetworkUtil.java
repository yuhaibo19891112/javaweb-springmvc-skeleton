package com.yuhaibo.core.common.utils;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

/**
 * @Title:
 * @Description:
 * @Author: yuhaibo
 * @Since: 2017年08月18日
 * @Version: 1.0
 */
public class NetworkUtil {


    /**
     * 获取用户真实ip
     * @param request
     * @return
     */
    public static String getClientIp(HttpServletRequest request) {

        String ip = request.getHeader("X-Forwarded-For");

        if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {

            ip = request.getHeader("Proxy-Client-IP");

            if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {

                ip = request.getHeader("WL-Proxy-Client-IP");

            }
            if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {

                ip = request.getHeader("HTTP_CLIENT_IP");

            }
            if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {

                ip = request.getHeader("HTTP_X_FORWARDED_FOR");

            }
            if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {

                ip = request.getRemoteAddr();

            }
        }else if (ip.indexOf(",") > 0) {
            String[] ips = ip.split(",");
            for (int index = 0; index < ips.length; index++) {
                String strIp = ips[index];
                if (!("unknown".equalsIgnoreCase(strIp))) {
                    ip = strIp;
                    break;
                }
            }
        }

        return ip;
    }
}
