package com.yuhaibo.core.common.utils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

/**
 * 使用Xstream转换xml工具类
 *
 * @Title:
 * @Description:
 * @Author:yuhaibo
 * @Since:2015年11月4日
 * @Version:1.0
 */
public class XstreamXmlUtil {

    // domDriver对象
    private static DomDriver domDriver = new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_"));

    /**
     * 将对象转换成xml格式字符串
     *
     * @Description:
     * @param obj
     * @return String
     * @Author:yuhaibo
     */
    public static String toXml(Object obj) {

        XStream xStream = new XStream(domDriver);

        xStream.processAnnotations(obj.getClass());

        return xStream.toXML(obj);
    }

    /**
     * 将传入xml文本转换成Java对象
     *
     * @Description:
     * @param <T>
     * @param xmlStr
     * @param clazz
     * @return T
     * @Author:yuhaibo
     */
    public static <T> T toBean(String xmlStr, Class<T> clazz) {

        XStream xStream = new XStream(domDriver);

        xStream.processAnnotations(clazz);

        xStream.ignoreUnknownElements();

        T obj = (T) xStream.fromXML(xmlStr);

        return obj;
    }
}
