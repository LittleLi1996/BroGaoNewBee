package com.sun.test;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sun.dao.UserDao;
import com.sun.model.User;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {
   public static void main(String[] args) throws Exception {
      // 指定全局配置文件
      String resource = "mybatis-config.xml";
      // 读取配置文件
      InputStream inputStream = Resources.getResourceAsStream(resource);
      // 构建sqlSessionFactory
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
      // 获取sqlSession
      SqlSession sqlSession = sqlSessionFactory.openSession();
      try {
         // 操作CRUD，第一个参数：指定statement，规则：命名空间+“.”+statementId
         // 第二个参数：指定传入sql的参数：这里是用户id
//         User user = sqlSession.selectOne("MyMapper.selectUser", 1);
//         System.out.println(user.toString());
//         System.out.println("***************************************");
//         List<User> ulist = sqlSession.selectList("MyMapper.selectAll");
//         for(User u : ulist) {
//        	 System.out.println(u.toString());
//         }
    	  
    	  
//    	  sqlSession.delete("MyMapper.del", 8);
    	  
//    	  User u = new User( "zhangzhang1", "112", 1, "2000-08-08", null);
//    	  sqlSession.insert("MyMapper.insertU", u);
    	  
//    	  User u = new User( 26,"zhangzhang112", "11221", 1, "2000-08-08", null);
//    	  sqlSession.update("MyMapper.updateU", u);
    	  
    	  //获取UserDao接口的动态代理类
    	  UserDao dao = sqlSession.getMapper(UserDao.class);
    	  
//    	  User u = dao.getById(1);
//    	  
//    	  System.out.println(u);
    	  
//    	  List<User> ulist = dao.get("t_user01");
//    	  for(User u : ulist) {
//         	 System.out.println(u.toString());
//          }
//    	  
    	  
    	  User u = new User("zhang", 1);
    	  List<User> ulist = dao.find(u);
    	  for(User u1 : ulist) {
          	 System.out.println(u1.toString());
           }
    	  
    	  sqlSession.commit();
    	  
      }catch (Exception e) {
    	  e.printStackTrace();
	} 
      finally {
         sqlSession.close();
      }
   }
}


