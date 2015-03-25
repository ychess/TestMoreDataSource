package com.main;

import com.jolbox.bonecp.BoneCPDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * Created by zilongye on 15-3-24.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("com")
public class ApiServer{

    public static void main(String ...arg){
        SpringApplication.run(ApiServer.class, arg);
    }

    @Bean(name = "primaryDS") @Qualifier("primaryDS")
    @Primary
    public DataSource primaryDataSource(){
        BoneCPDataSource dataSource = new BoneCPDataSource();
        dataSource.setDriverClass("org.postgresql.Driver");
        dataSource.setJdbcUrl("jdbc:postgresql://192.168.8.22/bxr_production");
        dataSource.setUsername("xrkadmin");
        dataSource.setPassword("xrktest123");
        return dataSource;
    }

    @Bean(name = "secondaryDS") @Qualifier("secondaryDS")
    public DataSource secondaryDataSource(){
        BoneCPDataSource dataSource = new BoneCPDataSource();
        dataSource.setDriverClass("org.postgresql.Driver");
        dataSource.setJdbcUrl("jdbc:postgresql://192.168.8.22/bxr_app_production");
        dataSource.setUsername("xrkadmin");
        dataSource.setPassword("xrktest123");
        return dataSource;
    }


}
