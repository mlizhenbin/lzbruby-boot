package org.lzbruby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述：
 *
 * @author: Zhenbin.Li
 * email： lizhenbin08@sina.com
 * company：org.lzbruby
 * Date: 2016/12/18 Time：10:56
 */
@Configuration
@ComponentScan("org.lzbruby")
@SpringBootApplication
//@EnableWebMvc 增加次配置,Springboot默认的静态文件,
// /static, /public, META-INF/resources, /resources等存放静态资源的目录。而将静态资源定位于src/main/webapp
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
