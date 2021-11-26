# There are many techniques used for dependency Injection. 
<ol>
  <li>Using bean tag in .xml file</li>
  <li>Using component-scan tag in .xml file</li>
  <li >Using @Configuration, @Bean on a class and defining the "class object returner function inside it"</li>
</ol>
<br>


<div>
<h2>Bean tag definition in xml file and first-meathod of IoC</h2>
<p>
xml is meant for user defined tags. So whenever we are using 
<beans>
	<bean>
	</bean>
</beans>

then we need to provide the definition to beans tag. Search on internet about beans tag definition 
and you will get something like this:<br>
	<div>
	`xml:
<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
			 http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"></beans>`</div>

After this bean defintion You need to add the beans. 
Let say Bean id="car"
and the corresponding package is "com.example.demo"

So, the <bean> tag would be as follows:
<bean id="car" class="com.example.demo.Car"></bean>

So this bean would be accesible from IoC container ApplicationContext.

So in our Main class this would be accesible as follows:<br>
```java:
public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Car car=(Car)context.getBean("car");
		car.drive();				
	}
```
</p>
</div><br>

<div id="second-meathod">
	<h2>Second Meathod</h2>
	<p>
		<p>
	<h1> Will be adding soon, Im feeling littel bit lazy </h1>
</div>


