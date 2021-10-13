/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: sumulige
 * Author:   willem
 * Date:     2021/10/13 10:54 上午
 * Description: 一个简单的测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mashibing.smulige;

import java.util.Objects;

/**
 * 〈一句话功能简述〉<br> 
 * 〈一个简单的测试类〉
 *
 * @author willem
 * @create 2021/10/13
 * @since 1.0.0
 */
public class Sumulige {
    private int id;
    private String name;
    private String old;

    @Override
    public String toString() {
        return "sumulige{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", old='" + old + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sumulige sumulige = (Sumulige) o;
        return id == sumulige.id && Objects.equals(name, sumulige.name) && Objects.equals(old, sumulige.old);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, old);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }
}
