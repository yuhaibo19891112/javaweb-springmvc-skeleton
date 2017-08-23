package com.yuhaibo.core.common.utils;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

/**
 * cookie相关的操作
 *
 * @Title:
 * @Description:
 * @Author:yuhaibo
 * @Since:2015年9月7日
 * @Version:1.0
 */
public class CookieUtils {

    private static final String COOKIE_PATH = "/";

    public static void setVCookie(HttpServletRequest request, HttpServletResponse response, String key, String value) {
        Cookie cookie = new Cookie(key, value);
        cookie.setDomain("." + request.getServerName());
        cookie.setPath(COOKIE_PATH);
        response.addCookie(cookie);
    }

    public static void setVCookie(HttpServletRequest request, HttpServletResponse response, String key, String value,
            int maxAge) {
        Cookie cookie = new Cookie(key, value);
        cookie.setDomain("." + request.getServerName());
        cookie.setPath(COOKIE_PATH);
        cookie.setMaxAge(maxAge);
        response.addCookie(cookie);
    }

    public static void expireVCookie(HttpServletRequest request, HttpServletResponse response, String cookieName) {
        Cookie cookie = new Cookie(cookieName, "");
        cookie.setMaxAge(0);
        cookie.setDomain("." + request.getServerName());
        cookie.setPath(COOKIE_PATH);
        response.addCookie(cookie);
    }

    public static void expireVCookie(HttpServletRequest request, HttpServletResponse response, String cookieName, String domain) {
        Cookie cookie = new Cookie(cookieName, "");
        cookie.setMaxAge(0);
        cookie.setDomain(domain);
        cookie.setPath(COOKIE_PATH);
        response.addCookie(cookie);
    }

    public static String getCookieValue(HttpServletRequest request, String cookieName) {

        Cookie[] cookies = request.getCookies();

        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {

                if (StringUtils.equals(cookie.getName(), cookieName)) {

                    return cookie.getValue();
                }
            }
        }

        return null;
    }


    public static String getCookieValue(Cookie[] cookies, String cookieName) {

        for (Cookie cookie : cookies) {

            if (StringUtils.equals(cookie.getName(), cookieName)) {

                return cookie.getValue();
            }
        }

        return null;
    }

    public static Map<String, String> parseCookiesToMap(Cookie[] cookies) {

        Map<String, String> cookieMap = new HashMap<String, String>();

        if (ArrayUtils.isNotEmpty(cookies)) {
            for (Cookie cookie : cookies) {
                cookieMap.put(cookie.getName(), cookie.getValue());
            }
        }

        return cookieMap;
    }

}
