package cn.enn.service.impl;

import java.util.List;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.monitor.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;

import cn.enn.mapper.MonitorMapper;

@DubboService
public class MonitorServiceImpl implements MonitorService{
	
	@Autowired
	private MonitorMapper monitorMapper;

	@Override
	public void collect(URL statistics) {
		System.out.println("收集数据：" + statistics.toFullString());
		
		monitorMapper.insert(statistics);
	}

	@Override
	public List<URL> lookup(URL queryUrl) {
		 return null;
	}

}
