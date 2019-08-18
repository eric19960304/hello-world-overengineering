import java.util.ArrayList;

public class Printer {

   private ArrayList<PrintCommand> jobList = new ArrayList<PrintCommand>(); 

   public void addJob(PrintCommand job) {
      jobList.add(job);
   }

   public void processAllJobs(){
      for (PrintCommand job : jobList) {
         job.execute();
      }
      jobList.clear();
   }
   
}