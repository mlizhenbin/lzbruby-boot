package org.lzbruby.web;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import org.lzbruby.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public JSONObject getAllUsers() {
        JSONObject jsonObject = new JSONObject();

        User user = new User();
        user.setCode("07061176");
        user.setName("lizhenbin");

        ArrayList<User> users = Lists.newArrayList();
        users.add(user);

        jsonObject.put("users", user);
        return jsonObject;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public JSONObject addUser(@RequestBody User user) {
        ArrayList<User> users = Lists.newArrayList();
        users.add(user);
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
