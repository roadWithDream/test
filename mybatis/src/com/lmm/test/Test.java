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
        //mybatis�������ļ�
        String resource = "conf.xml";
        //ʹ�������������mybatis�������ļ�����Ҳ���ع�����ӳ���ļ���
        InputStream is = Test.class.getClassLoader().getResourceAsStream(resource);
        //����sqlSession�Ĺ���
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        //ʹ��MyBatis�ṩ��Resources�����mybatis�������ļ�����Ҳ���ع�����ӳ���ļ���
        //Reader reader = Resources.getResourceAsReader(resource); 
        //����sqlSession�Ĺ���
        //SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //������ִ��ӳ���ļ���sql��sqlSession
        SqlSession session = sessionFactory.openSession();
        /**
         * ӳ��sql�ı�ʶ�ַ�����
         * me.gacl.mapping.userMapper��userMapper.xml�ļ���mapper��ǩ��namespace���Ե�ֵ��
         * getUser��select��ǩ��id����ֵ��ͨ��select��ǩ��id����ֵ�Ϳ����ҵ�Ҫִ�е�SQL
         */
        String statement = "com.lmm.mapping.userMapper.getinsurer";//ӳ��sql�ı�ʶ�ַ���
        //ִ�в�ѯ����һ��ΨһInsurerInfo�����sql
        InsurerInfo insurerInfo = session.selectOne(statement,"0023");

        System.out.println(insurerInfo.getTaName());
        
        
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        /**
         * ӳ��sql�ı�ʶ�ַ�����
         * me.gacl.mapping.userMapper��userMapper.xml�ļ���mapper��ǩ��namespace���Ե�ֵ��
         * getAllUsers��select��ǩ��id����ֵ��ͨ��select��ǩ��id����ֵ�Ϳ����ҵ�Ҫִ�е�SQL
         */
        String statement1 = "com.lmm.mapping.userMapper.getAllinsurer";//ӳ��sql�ı�ʶ�ַ���
        //ִ�в�ѯ����������ѯ����Զ���װ��List<User>����
        List<InsurerInfo> lstUsers = sqlSession.selectList(statement1,"select * from tbinsurerinfo");
        //ʹ��SqlSessionִ����SQL֮����Ҫ�ر�SqlSession
        //InsurerInfo ifo = lstUsers.get(0);
        sqlSession.close();
        System.out.println(lstUsers);
        //System.out.println(ifo.getTaName());
        System.out.println(lstUsers.get(0));
    }
}
