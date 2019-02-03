//package com.ncu.assignment;
//package com.ncu.assignment.Exception;
import java.util.*;
import java.io.*;
class Address{

Address()	
{	
Scanner scan=new Scanner(System.in);

try
{
System.out.println("Enter the student address:");
scan.nextLine();
throw new MandatoryMissingException();
}
catch(MandatoryMissingException e)
{
System.out.println("Error");
}

System.out.println("Enter the city:");
scan.next();
System.out.println("Enter the state:");
scan.next();
System.out.println("Enter the pin code:");
scan.nextInt();
}

static void Display()
{
Address e1=new Address();
}
}

