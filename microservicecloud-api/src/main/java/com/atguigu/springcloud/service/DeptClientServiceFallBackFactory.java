package com.atguigu.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atguigu.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;
/**
 * 交给Spring管理
 * @author yzhang98
 *统一来进行处理服务降级
 */
@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable arg0) {
		return new DeptClientService() {
            @Override
            public boolean add(Dept deptEntity) {
                return false;
            }
			@Override
			public Dept get(long id) {
				return new Dept(id, "没有此部门可以对应的信息", "12") ;
			}
			@Override
			public List<Dept> list() {
				
				return null;
			}
        };
	}

}
