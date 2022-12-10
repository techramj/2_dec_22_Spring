package com.easylearning.entity;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class SampleBean implements ResourceLoaderAware {
	private ResourceLoader resourceLoader;
	
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;	
	}
	
	public void readResource() throws IOException {
		Resource resource = resourceLoader.getResource("classpath:test.properties");
		InputStream inputStream = resource.getInputStream();
		Properties prop =  new Properties();
		prop.load(inputStream);
		
		String mod1 = prop.getProperty("module1");
		String mod2 = prop.getProperty("module2");
		String mod3 = prop.getProperty("module3");
		String mod4 = prop.getProperty("module4");
		
		System.out.println("Moduele1= "+mod1);
		System.out.println("Moduele2= "+mod2);
		System.out.println("Moduele3= "+mod3);
		System.out.println("Moduele4= "+mod4);
		
	}

}
