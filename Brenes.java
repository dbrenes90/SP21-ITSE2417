/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Brenes implements FinalProject
{
    public Brenes()
    {

    }
    public void doTemp()
    {
        System.out.println("Convert Kelvin, Fahrenheit or Celcuis? (0,1,2)");
        int myIn = Itse2417Main.myScan.nextInt();
        
        System.out.println("To Fahrenheit or Celcius?(1,2)");
        int toIn = Itse2417Main.myScan.nextInt();
        
        if (myIn == toIn)
            System.out.println("Temperature unchanged: ");
        else
            if (myIn == 0 && toIn == 2)
            {
                System.out.println("Enter temperature K:");
                double userNo = Itse2417Main.myScan.nextDouble();
                double finNo = userNo - 273.15;
                System.out.println("In Celcius:" + finNo);
            }
        else
                if (myIn == 0 && toIn == 1)
                {
                System.out.println("Enter temperature K:");
                double userNo = Itse2417Main.myScan.nextDouble();
                double finNo = ((userNo - 273.15) * 9/5) + 32;
                System.out.println("In Fahrenheit:" + finNo);
                }
        else
            if (myIn == 1 && toIn == 2)
            {
                System.out.println("Enter temperature F:");
                double userNo = Itse2417Main.myScan.nextDouble();
                double finNo = (userNo - 32) * 5/9;
                System.out.println("In Celcius:" + finNo);
            }
        else
                if (myIn == 2 && toIn == 1)
                {
                    System.out.println("Enter temperature C:");
                    double userNo = Itse2417Main.myScan.nextDouble();
                    double finNo = (userNo*9)/5 + 32;
                    System.out.println("In Fahrenheit:" + finNo);
                }
        
    }
    public void doDist()
    {
        System.out.println("Convert Feet, Miles, Kilometers? (0,1,2)");
        int myIn = Itse2417Main.myScan.nextInt();
        System.out.println("To Feet, Miles, Kilometers? (0, 1, 2)");
        int toIn = Itse2417Main.myScan.nextInt();
        
            if (myIn == 0 && toIn == 1)
            {
                System.out.println("Enter feet:");
                double userNo = Itse2417Main.myScan.nextDouble();
                double finNo = userNo/5280;
                System.out.println("To Miles:" + finNo);
            }
            else
                if (myIn == 0 && toIn == 2)
            {
                System.out.println("Enter feet:");
                double userNo = Itse2417Main.myScan.nextDouble();
                double finNo = userNo*.0003048;
                System.out.println("To Kilometers:" + finNo);
            }
            else
                if (myIn == 1 && toIn == 2)
            {
                System.out.println("Enter miles:");
                double userNo = Itse2417Main.myScan.nextDouble();
                double finNo = userNo*1.60934;
                System.out.println("To Kilometers:" + finNo);
            }
            else
                if (myIn == 1 && toIn == 0)
            {
                System.out.println("Enter miles:");
                double userNo = Itse2417Main.myScan.nextDouble();
                double finNo = userNo*5280;
                System.out.println("To Feet:" + finNo);
            }
                else
                if (myIn == 2 && toIn == 1)
            {
                System.out.println("Enter Kilometers:");
                double userNo = Itse2417Main.myScan.nextDouble();
                double finNo = userNo*.621371;
                System.out.println("To Miles:" + finNo);
            }
            else
                if (myIn == 2 && toIn == 0)
            {
                System.out.println("Enter Kilometers:");
                double userNo = Itse2417Main.myScan.nextDouble();
                double finNo = userNo*3280.84;
                System.out.println("To Feet:" + finNo);
            }
           
         if (myIn == toIn)
            System.out.println("Distance unchanged: ");
                    
        
    }
    public void doMass()
    {
        System.out.println("Convert Pounds or Kilograms? (0,1)");
        int myIn = Itse2417Main.myScan.nextInt();
        System.out.println("To Pounds or Kilograms? (0,1)");
        int toIn = Itse2417Main.myScan.nextInt();
        if (myIn == toIn)
            System.out.println("Weight unchanged: ");
        else
                if (myIn < toIn)
            {
                System.out.println("Enter Pounds:");
                double userNo = Itse2417Main.myScan.nextDouble();
                double finNo = userNo*.453592;
                System.out.println("To Kilograms:" + finNo);
            }
        else
                if (myIn > toIn)
            {
                System.out.println("Enter Kilograms:");
                double userNo = Itse2417Main.myScan.nextDouble();
                double finNo = userNo*2.20462;
                System.out.println("To Pounds:" + finNo);
            }
    }

    public void begin()
    {
        System.out.println("*************************");
        System.out.println("Welcome to the Final");
        System.out.println("**************************");
        
        
        
        System.out.println("(1) Temperature conversion");
        System.out.println("(2) Distance conversion");
        System.out.println("(3) Mass conversion");
        
        System.out.println("Enter a choice (1-3), 0 to quit)");
        
        int selectInt = Itse2417Main.myScan.nextInt();
        switch(selectInt)
        {
            case 1: doTemp(); break;
            case 2: doDist(); break;
            case 3: doMass(); break;
            default: return;
            
        }
        try
        {
            java.util.concurrent.TimeUnit.SECONDS.sleep(2);  
        }
        catch(InterruptedException e)
        {}
    }
}