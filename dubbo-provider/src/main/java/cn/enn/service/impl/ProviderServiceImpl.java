package cn.enn.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import cn.enn.bean.User;
import cn.enn.mapper.ProvideMapper;
import cn.enn.service.ProviderService;

@DubboService
public class ProviderServiceImpl implements ProviderService {

	@Autowired
	private ProvideMapper provideMapper;
	
	@Override
	public List<User> getUser() {
		return provideMapper.findAll();
	}

	@Override
	public void insert(User user) {
		provideMapper.insert(user);
	}

}
