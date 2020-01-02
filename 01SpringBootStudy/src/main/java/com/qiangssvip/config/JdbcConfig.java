package com.qiangssvip.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 @configuration:声明一个类作为配置类，代替xml文件
 @Bean：声明在方法上，将方法的返回值加入Bean容器，代替<bean>标签
 @value:属性注入
 @PropertySource：指定外部属性文件
 * */
@Configuration
/*@PropertySource("classpath:jdbc.properties")*/
/*@EnableConfigurationProperties(JdbcProperties.class)*/
public class JdbcConfig {
    /*@Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;*/

    /* 方式一 */
    /*@Autowired
    private JdbcProperties jdbcProperties;*/

    /* 方式三 */
    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }

    /*@Bean
    public DataSource dataSource(){
    *//* 方式二 *//*
    *//*public DataSource dataSource(JdbcProperties jdbcProperties){*//*
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(jdbcProperties.getUrl());
        druidDataSource.setDriverClassName(jdbcProperties.getDriver());
        druidDataSource.setUsername(jdbcProperties.getUsername());
        druidDataSource.setPassword(jdbcProperties.getPassword());
        return druidDataSource;
    }*/
}
