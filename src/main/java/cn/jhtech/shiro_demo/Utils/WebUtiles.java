package cn.jhtech.shiro_demo.Utils;


import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @Auther: LinYan
 * @Date: 2018/9/30 15:26
 * @Description:编写关于网页的工具类
 */
public class WebUtiles {

    public static <T> T request2Bean(HttpServletRequest request, Class<T> c) {

        try {
            T bean = c.newInstance();

            Enumeration enumeration = request.getParameterNames();
            while (enumeration.hasMoreElements()) {
                String name = (String) enumeration.nextElement();
                String value = request.getParameter(name);

                BeanUtils.setProperty(bean, name, value);
            }
            return bean;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
