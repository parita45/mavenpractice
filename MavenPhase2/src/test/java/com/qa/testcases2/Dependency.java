package com.qa.testcases2;

import org.testng.annotations.Test;

public class Dependency {

//In one single class, we can execute multiple test cases.
//It executes methods in alphabetical order by default.
//So, in order to manage the execution of test cases, provide methods either in alphabetical order or prioritize it.
//Provide the names of test methods in alphabetical order or give priority to each test methods.	
	@Test
public void login()
{
	System.out.println("executing script to log into the app");
}
	


//If we are creating email, we first need to log into the app. This is called dependency
@Test(dependsOnMethods= {"login"}, priority='1') //Here complier sees the priority 1,sees the dependency so runs login() first and then create()
public void create()	
{
	System.out.println("executing script to create the email");
}
	
@Test(dependsOnMethods= {"create"}, priority= '2')
public void modify()
{
	System.out.println("executing script to modify the email");
}
	
@Test(priority = '3')
public void delete()
{
	System.out.println("executing script to delete the email");
}
	
	
	
}
