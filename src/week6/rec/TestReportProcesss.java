package week6.rec;

/**
 * Created by serhii on 14.07.15.
 */
public class TestReportProcesss {


    public static void main(String[] args) {
        WorkerRec w1 = new WorkerRec("director", 20);


        WorkerRec w2 = new WorkerRec("manger", 35);
        WorkerRec w3 = new WorkerRec("manager", 35);
        WorkerRec w4 = new WorkerRec("manager", 35);


        WorkerRec w5 = new WorkerRec("worker", 50);
        WorkerRec w6 = new WorkerRec("worker", 50);
        WorkerRec w7 = new WorkerRec("worker", 50);

        w2.addToTeamArr(w5, w6);
        w3.addToTeam(w7);

        w1.addToTeamArr(w2, w3, w4);

        int res = ReportProcess.makeReport(w1);

        System.out.println(res);



    }
}
