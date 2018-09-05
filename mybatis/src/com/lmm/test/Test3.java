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
        //mybatis�������ļ�
        String resource = "conf.xml";
        //ʹ�������������mybatis�������ļ�����Ҳ���ع�����ӳ���ļ���
        InputStream is = Test.class.getClassLoader().getResourceAsStream(resource);
        //����sqlSession�Ĺ���
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        //ʹ��MyBatis�ṩ��Resources�����mybatis�������ļ�����Ҳ���ع�����ӳ���ļ���
        Reader reader = Resources.getResourceAsReader(resource); 
        //����sqlSession�Ĺ���
        SqlSessionFactory sqlsessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //������ִ��ӳ���ļ���sql��sqlSession
        SqlSession session = sessionFactory.openSession();

        Voucher voucher = session.getMapper(Voucher.class);
        
        VoucherReq req = voucher.getVoucher("20171012144751004685");
        
        System.out.println(req.getSerialNo());
    }
}
