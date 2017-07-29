package com.samya;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplaynameBeanpostprocessor implements BeanPostProcessor 

{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("After Initialization method bean name is  " +beanName);
		
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException 
			{
		System.out.println("Before Initialization method bean name is  " +beanName);
		
		return bean;
	}

}
