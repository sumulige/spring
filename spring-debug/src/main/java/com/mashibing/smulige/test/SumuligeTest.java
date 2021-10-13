/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: 测试debug类
 * Author:   willem
 * Date:     2021/10/13 10:59 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mashibing.smulige.test;

import com.mashibing.smulige.Sumulige;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author willem
 * @create 2021/10/13
 * @since 1.0.0
 */
public class SumuligeTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("sumulige.xml");
        Sumulige sumulige = ac.getBean(Sumulige.class);
    }

}
