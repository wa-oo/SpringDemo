package cn.taiji.com;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.taiji.com.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDemoApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("-------");
	}
	
	@Autowired
    private EntityManager em;
	
	//查询数据
	@Test
    public List<User> findAll(){
        List<User> list = new ArrayList<User>();
        list = em.createQuery("select u from User u").getResultList();
        System.out.println(list);
        return list;
    }

}
