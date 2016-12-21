package org.lzbruby.web;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import org.lzbruby.domain.User;
import org.lzbruby.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * 功能描述：
 *
 * @author: Zhenbin.Li
 * email： lizhenbin08@sina.com
 * company：org.lzbruby
 * Date: 2016/12/18 Time：12:17
 */
@RestController
@RequestMapping("user")
public class UserController {

    /**
     * sl4j
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public JSONObject getAllUsers() {
        JSONObject jsonObject = new JSONObject();

        List<Map<String, Object>> allUsers = userService.getAllUsers();
        jsonObject.put("users", allUsers);
        return jsonObject;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public JSONObject addUser(@RequestBody User user) {
        Random random = new Random();
        int key = Math.abs(random.nextInt(1000000));
        userService.create("test", key);
        return new JSONObject();
    }

    @RequestMapping(value = "/{code}", method = RequestMethod.PUT)
    public JSONObject updateUserByCode(@PathVariable String code) {
        return new JSONObject();
    }

    @RequestMapping(value = "/{code}", method = RequestMethod.DELETE)
    public JSONObject deleteUserByCode(@PathVariable String code) {
        return new JSONObject();
    }

}
