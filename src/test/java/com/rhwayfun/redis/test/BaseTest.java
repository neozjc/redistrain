package com.rhwayfun.redis.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//ָ��beanע��������ļ�
@ContextConfiguration(locations = {"classpath:application.xml"})
//ʹ�ñ�׼��JUnit @RunWith ע������Spring Test Runner
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseTest extends AbstractJUnit4SpringContextTests{

}
