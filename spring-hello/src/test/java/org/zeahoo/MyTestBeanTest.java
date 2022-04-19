package org.zeahoo;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.zeahoo.spring.MyTestBean;

/**
 *
 */
public class MyTestBeanTest {
	@Test
	public void MyTestBeanTest() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
		MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");
		System.out.println(myTestBean.getName());
	}

}