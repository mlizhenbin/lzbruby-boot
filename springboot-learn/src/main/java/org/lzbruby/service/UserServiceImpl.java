package org.lzbruby.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by lizhenbin on 12/21/16.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(String name, Integer key) {
        jdbcTemplate.update("insert INTO t_user (id, name) VALUE (?, ?)", key, name);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("delete from t_user WHERE name LIKE '%?'", "name");
    }

    @Override
    public List<Map<String, Object>> getAllUsers() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select id, name from t_user");
        return maps;
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("DELETE FROM t_user;");
    }
}
