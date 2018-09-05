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
import com.lmm.domain.VoucherReq;
import com.lmm.interf.Voucher;

public class Test3 {

    public static void main(String[] args) throws IOException {
        //mybatis的配置文件
        String resource = "conf.xml";
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = Test.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader(resource); 
        //构建sqlSession的工厂
        SqlSessionFactory sqlsessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中sql的sqlSession
        SqlSession session = sessionFactory.openSession();

        Voucher voucher = session.getMapper(Voucher.class);
        
        VoucherReq req = voucher.getVoucher("20171012144751004685");
        
        System.out.println(req.getSerialNo());
    }
}
