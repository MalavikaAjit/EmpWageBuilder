public class EmpWageBuilderUC1{

        public static final int IS_FULL_TIME = 2;
        public static final int IS_PART_TIME = 1;
        
        public static int MAX_HRS_IN_MONTH =100;

        public static int calculateWages(String company , int empRatePerHr, int numOfWorkingDays,int maxHrsPerMonth) {
           
           int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
           //computation
           while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays <numOfWorkingDays) { 
                
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
               case IS_PART_TIME:
                 empHrs = 4;
                 break;
               case IS_FULL_TIME:
                 empHrs = 8;
                 break;
               default:
                 empHrs =0;
             }
             
              totalEmpHrs  += empHrs;   
            System.out.println("Day#: " + totalWorkingDays + " Emp Hours " + empHrs);
         }

          int totalEmpWage = totalEmpHrs * empRatePerHr;
         System.out.println("Total emp wage for company : " +company+  "  is:" + totalEmpWage);
         return totalEmpWage;
     }
      
       public static void main (String[] args) {
         calculateWages("DMart", 20,2,10);
         calculateWages("Reliance", 10,4,20); 
  }

}
 
