package cn.enn.service;

import java.util.List;

import cn.enn.bean.User;

public interface ProviderService {

	 /**
     * 获取全部用户
     * @return
     */
    List<User> getUser();
    
    
    void insert(User user);
}
