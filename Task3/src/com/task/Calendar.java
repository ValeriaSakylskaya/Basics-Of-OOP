package Task3;
import Enums.DayOfTheWeek;
import Enums.TypeOfDay;
import Enums.Months;
import java.util.ArrayList;

public class Calendar {
   private ArrayList <Day> Days =  new ArrayList<>();
  public Calendar (){
       Days.add(0,new Day(1,Months.October,2019,DayOfTheWeek.Tuesday,TypeOfDay.Weekday));
      Days.add(1,new Day(2,Months.October,2019,DayOfTheWeek.Wednesday,TypeOfDay.Weekday));
      Days.add(2,new Day(3,Months.October,2019,DayOfTheWeek.Thursday,TypeOfDay.Weekday));
      Days.add(3,new Day(4,Months.October,2019,DayOfTheWeek.Friday,TypeOfDay.Weekday));
      Days.add(4,new Day(5,Months.October,2019,DayOfTheWeek.Saturday,TypeOfDay.Weekend));
      Days.add(5,new Day(6,Months.October,2019,DayOfTheWeek.Sunday,TypeOfDay.Weekend));
      Days.add(6,new Day(7,Months.October,2019,DayOfTheWeek.Monday,TypeOfDay.Weekday));
      Days.add(7,new Day(8,Months.October,2019,DayOfTheWeek.Tuesday,TypeOfDay.Weekday));
      Days.add(8,new Day(9,Months.October,2019,DayOfTheWeek.Wednesday,TypeOfDay.Weekday));
      Days.add(9,new Day(10,Months.October,2019,DayOfTheWeek.Thursday,TypeOfDay.Weekday));
      Days.add(10,new Day(11,Months.October,2019,DayOfTheWeek.Friday,TypeOfDay.Weekday));
      Days.add(11,new Day(12,Months.October,2019,DayOfTheWeek.Saturday,TypeOfDay.Weekend));
      Days.add(12,new Day(13,Months.October,2019,DayOfTheWeek.Sunday,TypeOfDay.Weekend));
   }
   public void showAllPublicHoliday () {
      for(Day d : Days) {
          if(d.typeOfDay == TypeOfDay.PublicHoliday)
          {
              System.out.println(d.toString());
          }
      }
   }
   public void showAllWeekend () {
       for(Day d : Days) {
           if(d.typeOfDay == TypeOfDay.Weekend)
           {
               System.out.println(d.toString());
           }
       }
   }
    protected class Day {
        private int Day;
        private Months Month;
        private int Year;
        private  DayOfTheWeek Week;
        private TypeOfDay typeOfDay;
        Day (int day, Months month, int year, DayOfTheWeek week, TypeOfDay typeOfDay){
            this.Day = day;
            this.Month = month;
            this.Year = year;
            this.Week = week;
            this.typeOfDay = typeOfDay;
        }
        @Override
        public String toString (){
            return this.Day + " " + this.Month + " " + this.Year;
        }
    }
}
