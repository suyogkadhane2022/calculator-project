package Stantic_Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator_Operation {
	 public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Welcome to Simple Calculator!");

	        boolean continueCalculation = true;

	        while (continueCalculation) 
	        {
	            try 
	            {
	                Thread.sleep(500);
	            } catch (InterruptedException e) 
	            {
	                e.printStackTrace();
	            }
	            System.out.println("=================MENU================");
	            try 
	            {
	                Thread.sleep(500);
	            } catch (InterruptedException e) 
	            {
	                e.printStackTrace();
	            }
	            System.out.println("Select operation:");
	            try 
	            {
	                Thread.sleep(500);
	            } catch (InterruptedException e) 
	            {
	                e.printStackTrace();
	            }
	            System.out.println("1. Addition");
	            try 
	            {
	                Thread.sleep(500);
	            } catch (InterruptedException e) 
	            {
	                e.printStackTrace();
	            }
	            System.out.println("2. Multiplication");
	            try 
	            {
	                Thread.sleep(500);
	            } catch (InterruptedException e) 
	            {
	                e.printStackTrace();
	            }
	            System.out.println("3. Subtraction");
	            try 
	            {
	                Thread.sleep(500);
	            } catch (InterruptedException e) 
	            {
	                e.printStackTrace();
	            }
	            System.out.println("4. Division");
	            try 
	            {
	                Thread.sleep(500);
	            } catch (InterruptedException e) 
	            {
	                e.printStackTrace();
	            }
	            System.out.println("5. Square of a number");
	            try 
	            {
	                Thread.sleep(500);
	            } catch (InterruptedException e) 
	            {
	                e.printStackTrace();
	            }
	            System.out.println("6. Square root of a number");
	            try 
	            {
	                Thread.sleep(500);
	            } catch (InterruptedException e) 
	            {
	                e.printStackTrace();
	            }
	            System.out.println("=================================");
	            try 
	            {
	                Thread.sleep(500);
	            } catch (InterruptedException e) 
	            {
	                e.printStackTrace();
	            }
	            System.out.println("Select the number for which operation you want:");
	            int choice = sc.nextInt();

	            switch (choice) 
	            {
	                case 1:
	                    try 
	                    {
	                    	
	                        System.out.println("Enter the number of elements for Addition:");
	                        int countAdd = sc.nextInt();
	                        int sumAdd = 0;
	                        for (int i = 0; i < countAdd; i++) 
	                        {
	                            System.out.println("Enter element " + (i + 1) + ":");
	                            sumAdd += sc.nextInt();
	                        }
	                        System.out.println("Result: Sum = " + sumAdd);
	                    } 
	                    catch (InputMismatchException e) 
	                    {
	                        System.out.println("Invalid input. Please enter a valid integer.");
	                        sc.next(); 
	                    }
	                    break;
	                    
	                    
	                case 2:
	                	try 
	                	{
	                    System.out.println("Enter the number of elements for Multiplication:");
	                    int countMul = sc.nextInt();
	                    int productMul = 1;
	                    for (int i = 0; i < countMul; i++) 
	                    {
	                        System.out.println("Enter element " + (i + 1) + ":");
	                        productMul *= sc.nextInt();
	                    }
	                    
	                    System.out.println("Result: Product = " + productMul);
	                	}catch (InputMismatchException e) 
	                	{
	            	        System.out.println("Invalid input. Please enter a valid integer.");
	            	        sc.next(); 
	            	    }
	            	    break;
	            	    
	            	    
	                case 3:
	                	try 
	                	{
	                	 System.out.println("Enter the number of elements for Subtraction:");
	                	    int subCount = sc.nextInt();
	                	    System.out.println("Enter element 1:");
	                	    int result = sc.nextInt(); 
	                	    for (int i = 1; i < subCount; i++) 
	                	    {
	                	        System.out.println("Enter element " + (i + 1) + ":");
	                	        result -= sc.nextInt(); 
	                	    }
	                	    System.out.println("Result: Subtraction = " + result);
	                	}
	                	catch (InputMismatchException e) 
	                	{
	            	        System.out.println("Invalid input. Please enter a valid integer.");
	            	        sc.next(); 
	            	    }
	            	    break;
	            	    
	            	    
	                case 4:
	                	try
	                	{
	                	System.out.println("Enter the number of elements for Division:");
	                    int divCount = sc.nextInt();
	                    if (divCount < 2) 
	                    {
	                        System.out.println("At least two numbers are required for division.");
	                        break;
	                    }
	                    System.out.println("Enter element 1:");
	                    float result1 = sc.nextFloat();
	                    
	                    for (int i = 1; i < divCount; i++)
	                    {
	                        System.out.println("Enter element " + (i + 1) + ":");
	                        float num = sc.nextFloat();
	                        if (num != 0) 
	                        {
	                            result1 /= num; 
	                        }
	                        else 
	                        {
	                            System.out.println("Cannot divide by zero.");
	                            result1 = 0;
	                            break;
	                        }
	                    }
	                    System.out.println("Result: Division = " + result1);
	                	}
	                	catch (InputMismatchException e)
	                	{
	            	        System.out.println("Invalid input. Please enter a valid integer.");
	            	        sc.next(); 
	            	    }
	            	    break;
	            	    
	            	    
	                case 5:
	                	try
	                	{
	                    System.out.println("Enter the number for squre :");
	                    int numSquare = sc.nextInt();
	                    System.out.println("Result: Square = " + (numSquare * numSquare));
	                	}
	                	catch (InputMismatchException e)
	                	{
	            	        System.out.println("Invalid input. Please enter a valid integer.");
	            	        sc.next(); 
	            	    }
	            	    break;
	            	    
	                   
	                case 6:
	                	try
	                	{
	                    System.out.println("Enter the number to find the Sure Root :");
	                    double numSquareRoot = sc.nextDouble();
	                    System.out.println("Result: Square root = " + Math.sqrt(numSquareRoot));
	                	}
	                	catch (InputMismatchException e) 
	                	{
	            	        System.out.println("Invalid input. Please enter a valid integer.");
	            	        sc.next(); 
	            	    }
	            	    break;
	                default:
	                    System.out.println("Invalid choice.");
	                    
	            }

	            System.out.println("---------------------------------");
	            System.out.println("Do you want to perform another calculation? (yes/no)");
	            String option = sc.next();
	            if (!option.equalsIgnoreCase("yes")) {
	                continueCalculation = false;
	            }
	        }

	        System.out.println("Thank you for using the calculator.");
	    }
	}
