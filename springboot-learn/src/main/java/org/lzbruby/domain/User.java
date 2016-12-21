package org.lzbruby.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 功能描述：
 *
 * @author: Zhenbin.Li
 * email： lizhenbin08@sina.com
 * company：org.lzbruby
 * Date: 2016/12/18 Time：12:18
 */
public class User implements Serializable {
    private static final long serialVersionUID = 7855141771217794699L;

    private Integer id;

    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
