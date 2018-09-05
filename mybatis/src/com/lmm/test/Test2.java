package com.lmm.test;


import org.apache.ibatis.session.SqlSession;

import com.lmm.domain.InsureProduct;
import org.junit.Test;
public class Test2 {
    
    @Test
    public void testGetOrderById(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        /**
         * 映射sql的标识字符串，
         * me.gacl.mapping.orderMapper是orderMapper.xml文件中mapper标签的namespace属性的值，
         * getOrderById是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        String statement = "com.lmm.mapping.productMapper.getInsureProductByPrd";//映射sql的标识字符串
        //执行查询操作，将查询结果自动封装成Order对象返回
        InsureProduct insureProduct = sqlSession.selectOne(statement,"HF001");//查询orders表中id为1的记录
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(insureProduct.getPrdName());//打印结果：null，也就是没有查询出相应的记录
    }
    
    @Test
    public void testGetOrderById2(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        /**
         * 映射sql的标识字符串，
         * me.gacl.mapping.orderMapper是orderMapper.xml文件中mapper标签的namespace属性的值，
         * selectOrder是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        String statement = "com.lmm.mapping.productMapper.selectInsureProduct";//映射sql的标识字符串
        //执行查询操作，将查询结果自动封装成Order对象返回
        InsureProduct insureProduct = sqlSession.selectOne(statement,"HF001");//查询orders表中id为1的记录
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(insureProduct.getPrdName());//打印结果：Order [id=1, orderNo=aaaa, price=23.0]
    }
    
    @Test
    public void testGetOrderById3(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        /**
         * 映射sql的标识字符串，
         * me.gacl.mapping.orderMapper是orderMapper.xml文件中mapper标签的namespace属性的值，
         * selectOrderResultMap是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        String statement = "com.lmm.mapping.productMapper.selectInsureProductResultMap";//映射sql的标识字符串
        //执行查询操作，将查询结果自动封装成Order对象返回
        InsureProduct insureProduct = sqlSession.selectOne(statement,"HF001");//查询orders表中id为1的记录
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(insureProduct.getPrdName());//打印结果：Order [id=1, orderNo=aaaa, price=23.0]
    }
}