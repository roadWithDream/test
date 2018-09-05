package com.lmm.test;


import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.lmm.domain.InsurerInfo;
import com.lmm.domain.User;

public class Test {

    public static void main(String[] args) throws IOException {
        //mybatis的配置文件
        String resource = "conf.xml";
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = Test.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
        //Reader reader = Resources.getResourceAsReader(resource); 
        //构建sqlSession的工厂
        //SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中sql的sqlSession
        SqlSession session = sessionFactory.openSession();
        /**
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        String statement = "com.lmm.mapping.userMapper.getinsurer";//映射sql的标识字符串
        //执行查询返回一个唯一InsurerInfo对象的sql
        InsurerInfo insurerInfo = session.selectOne(statement,"0023");

        System.out.println(insurerInfo.getTaName());
        
        
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        /**
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * getAllUsers是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        String statement1 = "com.lmm.mapping.userMapper.getAllinsurer";//映射sql的标识字符串
        //执行查询操作，将查询结果自动封装成List<User>返回
        List<InsurerInfo> lstUsers = sqlSession.selectList(statement1,"select * from tbinsurerinfo");
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        //InsurerInfo ifo = lstUsers.get(0);
        sqlSession.close();
        System.out.println(lstUsers);
        //System.out.println(ifo.getTaName());
        System.out.println(lstUsers.get(0));
    }
}
