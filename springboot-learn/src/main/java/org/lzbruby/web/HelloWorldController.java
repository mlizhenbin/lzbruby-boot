package org.lzbruby.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.lzbruby.config.ConfigProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 功能描述：
 *
 * @author: Zhenbin.Li
 * email： lizhenbin08@sina.com
 * company：org.lzbruby
 * Date: 2016/12/18 Time：11:00
 */
@RestController
public class HelloWorldController {

    /**
     * sl4j
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);

    @Autowired
    private ConfigProperties helloProperties;

    @Autowired
    private ObjectMapper objectMapper;

    @RequestMapping("/hello")
    public ModelAndView index(ModelMap map) {
        map.addAttribute("msg", "hello world!");

        return new ModelAndView("/index");
    }

//    @RequestMapping(value = "/hello.json", method = RequestMethod.GET)
//    public String hello() {
//
//        LOGGER.info("HelloProperties={}", ToStringBuilder.reflectionToString(helloProperties, ToStringStyle.MULTI_LINE_STYLE));
//
//        return "Hello World";
//    }
}
