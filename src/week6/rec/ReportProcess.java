package week6.rec;

/**
 * Created by serhii on 14.07.15.
 */
public class ReportProcess {

    public static int makeReport(WorkerRec curr){


        int amount = 0;

        WorkerRec[] team = curr.getArrWorker();
        for (int i = 0; i < team.length; i++) {
            int teamMemberReport = makeReport(team[i]);
            amount += teamMemberReport;
        }

        return amount + curr.getWorkHours();

    }


}
