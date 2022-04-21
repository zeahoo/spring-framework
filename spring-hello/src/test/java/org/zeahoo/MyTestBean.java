package org.zeahoo;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.zeahoo.spring.MyBean;

/**
 *
 */
public class MyTestBean {
	@Test
	public void MyTestBeanTest() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
		MyBean myBean = (MyBean) bf.getBean("myBean");
		System.out.println(myBean.getName());
		MyBean myBean1 = (MyBean) bf.getBean("myBean1");
		System.out.println(myBean1.getName());
	}

}