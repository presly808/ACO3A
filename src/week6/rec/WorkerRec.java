package week6.rec;

import week5.day1.MyArrayList;
import week5.day1.MyList;

/**
 * Created by serhii on 14.07.15.
 */
public class WorkerRec {

    private String position;
    private int workHours;
    private MyList team = new MyArrayList(10);

    public WorkerRec(String position, int workHours) {
        this.position = position;
        this.workHours = workHours;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public MyList getTeam() {
        return team;
    }

    public void setTeam(MyList team) {
        this.team = team;
    }

    public void addToTeam(WorkerRec workerRec){
        team.add(workerRec);
    }

    public void addToTeamArr(WorkerRec...workers){
        for (int i = 0; i < workers.length; i++) {
            team.add(workers[i]);
        }
    }

    public WorkerRec[] getArrWorker(){
        Object[] workers = team.toArray();
        WorkerRec[] mas = new WorkerRec[workers.length];
        for (int i = 0; i < workers.length; i++) {
            mas[i] = (WorkerRec) workers[i];
        }

        return mas;
    }
}
