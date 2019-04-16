package com.atguigu.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atguigu.springcloud.entities.Dept;
/**
 * 面向接口编程
 * @author yzhang98
 *接口加注解完成访问微服务
 *fallbackFactory交给 DeptClientServiceFallBackFactory统一进行处理
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT",path="/**",fallbackFactory = DeptClientServiceFallBackFactory.class)
/**
 *  Feign本身自动实现了负载均衡
 * @author yzhang98
 *
 */
public interface DeptClientService {


    // 采用Feign我们就可以使用SpringMVC的注解来对服务进行绑定！
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept);
}
