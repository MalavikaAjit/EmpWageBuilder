public class EmpWageBuilderUC1{

      public static final int IS_PART_TIME = 1;
       public static final int IS_FULL_TIME = 2;
        

       private final String company;
       private final int empRatePerHrs;
       private final int numOfWorkingDays;
       private final int maxHoursPerMonth;
       private int totalEmpWage;

       public EmpWageBuilderUC1(String company, int empRatePerHrs ,int  numOfWorkingDays , int maxHoursPerMonth)
	{

          this.company = company;
          this.empRatePerHrs = empRatePerHrs;
          this.numOfWorkingDays = numOfWorkingDays;
          this.maxHoursPerMonth =  maxHoursPerMonth;
        }
       public void calculateWages() 
       {
          //variables
           int empHrs = 0,totalEmpHrs = 0, totalWorkingDays = 0;
 
          //Computation
          while (totalEmpHrs <= maxHoursPerMonth && 
                 totalWorkingDays < numOfWorkingDays)
          {
                totalWorkingDays++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) 
                {
                    case IS_PART_TIME:
                       empHrs = 4;
                       break;
                    case IS_FULL_TIME:
                       empHrs = 8;
                       break;
                    default:
                       empHrs = 0; 
                 }
                 totalEmpHrs += empHrs;
                 System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
           }
            totalEmpWage = totalEmpHrs * empRatePerHrs ;



      }
	
      public String toString() {
      return "Total Emp Wage for Company: " + company +" is: " + totalEmpWage;
      }
      public static void main(String[] args) {

            EmpWageBuilderUC1 dMart = new EmpWageBuilderUC1("DMart", 20, 2, 10);
            EmpWageBuilderUC1 reliance = new EmpWageBuilderUC1("Reliance", 10, 4, 20);
            dMart.calculateWages();
            System.out.println(dMart);
            reliance.calculateWages();
            System.out.println(reliance);
        }
}