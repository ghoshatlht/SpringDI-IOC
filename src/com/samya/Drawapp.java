package com.samya;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Drawapp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Trangle tr = new Trangle();
		
		//BeanFactory factory =  new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		//context.registerShutdownHook();
		//Trangle tr = (Trangle)context.getBean("tr");
		//Shape sh = (Shape)context.getBean("tr");
		Shape sh = (Shape)context.getBean("circle");
		
		sh.draw();
	}

}
