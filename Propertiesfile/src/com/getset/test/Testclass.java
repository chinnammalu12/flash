package com.getset.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Testclass {

	public Testclass() {

	}

	public static void main(String[] args) {
     FileSystemResource res=new FileSystemResource("src/com/getset/cfgs/applicationContext.xml");
     BeanFactory factory=new XmlBeanFactory(res);
     StudentDaoimpl stdao=(StudentDaoimpl) factory.getBean("dao");
     int result=stdao.insert();
     System.out.println("result is"+result);
	}

}
