public class exswitchcase{
    public static void main(String[] args) 
      {
        int day = 3;
        String dayName = "";
        switch (day) 
        {
          case 1:
            dayName = "Monday";
            break;
          case 2:
            dayName = "Tuesday";
          case 3:
          dayName = "Wednesday";
          case 4:
          dayName = "Thursday";
          case 5:   
          dayName = "Friday";
          case 6:
          dayName = "Saturday";
          case 7:  
          dayName = "Sunday";
          
          default:
            dayName = "Invalidday";
        }
          System.out.println("The day is: " + dayName);
    }

  }