package cn.taiji.com.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.taiji.com.domain.User;

@Service
public class UserService {
	
	@Autowired
    private EntityManager em;
	
	//查询数据
    public List<User> findAll(){
        List<User> list = new ArrayList<User>();
        list = em.createQuery("select u from User u").getResultList();
        System.out.println(list);
        return list;
    }

}
