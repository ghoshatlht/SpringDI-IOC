package com.samya;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Trangle implements Shape, ApplicationContextAware, BeanNameAware, InitializingBean,DisposableBean
{
	private String type;
	private int hight;
	ApplicationContext context;
	
	
	public int getHight() {
		return hight;
	}

	public Trangle(String type)
	{
		this.type=type;
	}
	
	public Trangle(String type, int hight)
	{
		this.type=type;
		this.hight=hight;
	}

	public String getType() {
		return type;
	}

	/*public void setType(String type) {
		this.type = type;
	}*/

	public void draw()
	{
		System.out.println(getType()  +"   Trangle is drawn of hight "  +getHight());
	}

	@Override
	public void afterPropertiesSet() throws Exception 
	{
	
		System.out.println("Initializing init method for the Trangle");
		
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("The name of the bean is " +beanName);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
	
		this.context=context;
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("destroythe bean for the Trangle");
	}
	
}
