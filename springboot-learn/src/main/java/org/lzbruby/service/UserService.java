package org.lzbruby.service;

import org.lzbruby.domain.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lizhenbin on 12/21/16.
 */
public interface UserService {

    /**
     * 新增一个用户
     *
     * @param name
     * @param key
     */
    void create(String name, Integer key);

    /**
     * 根据name删除一个用户高
     *
     * @param name
     */
    void deleteByName(String name);

    /**
     * 获取用户总量
     */
    List<Map<String, Object>> getAllUsers();

    /**
     * 删除所有用户
     */
    void deleteAllUsers();
}
