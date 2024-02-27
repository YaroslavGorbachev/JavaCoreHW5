package ru.geekbrains.core.lesson1.task4;

import java.util.ArrayList;
import java.util.List;


public class Catalog {
    public static int id;
    private ArrayList<Worker> workers;

    public Catalog() {
        this.workers = new ArrayList<>();
        id = 0;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Worker w: workers
        ) {
            sb.append(w).append("\n");
        }
        sb.delete(sb.length()-1, sb.length());
        return sb.toString();
    }

    public boolean addWorker(String name, String phone, int seniority){
        Worker worker = new Worker(++id, name, phone, seniority);
        if(!workers.contains(worker)){
            workers.add(worker);
            return true;
        }
        return false;


    }

    public List<Worker> findWorkerBySeniority(int needSeniority){

        return workers.stream().filter(w -> w.getSeniority()==needSeniority).toList();
    }

    public List<String> findPhoneByName(String needName){
        List<Worker> res = workers.stream().filter(e -> e.getName().equals(needName)).toList();
        if(!res.isEmpty()) {
            List<String> phones = new ArrayList<>();
            res.forEach(worker -> phones.add(worker.getPhone()));
            return phones;
        }
        else return null;

    }

    public Worker findWorkerByPersonalId(int needPersonalId){
        List<Worker> res = workers.stream().filter(e -> e.getPersonalId()==needPersonalId).toList();
        if(!res.isEmpty()) return res.get(0);
        else return null;
    }

}