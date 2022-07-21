package com.Amadi.training.salesmanager.config;

import com.Amadi.training.salesmanager.repository.EmployeeRepository;
import com.Amadi.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.Amadi.training.salesmanager.service.EmployeeService;
import com.Amadi.training.salesmanager.service.EmployeeServiceImpl;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("com.Amadi")
@PropertySource("application.properties")
public class ApplicationConfiguration {

    @Bean(name="employeeService")
    @Scope("singleton")
    //@Scope("prototype")
    public EmployeeService getEmployeeService(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

        return employeeService;
    }

    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigure(){
        return new PropertySourcesPlaceholderConfigurer();
    }
  /* @Bean(name="employeeRepository")
    public EmployeeRepository getEmployeeRepository(){
        return new HibernateEmployeeRepositoryImpl();
    }*/
}
