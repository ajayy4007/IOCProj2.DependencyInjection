package com.nt.text;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import com.nt.beans.Person1;
public class DependencyInjetionTest {
public static void main(String[] args) {
	//Creates IOC container
	XmlBeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
	//get Spring bean class obj
	Person1 person=(Person1)factory.getBean("per1");
	System.out.println(person);
}
}
