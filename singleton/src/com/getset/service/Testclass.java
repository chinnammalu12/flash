package com.getset.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.getset.bean.Student;

public class Testclass {
	public Testclass() {
	}
	public static void main(String[] args) {
      FileSystemResource res=new FileSystemResource("src/com/getset/cfgs/applicationContext.xml");
	  BeanFactory factory=new XmlBeanFactory(res);
	  Student std=factory.getBean("std",Student.class);
	  System.out.println("obj1..."+std);
	  Student std2=factory.getBean("std",Student.class);
	  System.out.println("obj2..."+std2);
	  
	}

}
