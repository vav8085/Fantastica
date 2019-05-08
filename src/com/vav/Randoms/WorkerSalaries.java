package com.vav.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class WorkerSalaries {

    //using previous code for calculating the salaries of fte and contractors, this time we will use a hashmap and save worker id and their calculated salary
    static List<Integer> sortedListOfSalaries(List<List<String>> workers) {
        List<Integer> sortedSalaries = new ArrayList<>();
        HashMap<String, Integer> reporterSalaries = new HashMap();
        //Calculating worker salaries
        for(List<String> worker: workers){
            String workerId = worker.get(0);
            if(worker.get(1).equalsIgnoreCase("")){
                continue;
            }
            if(worker.get(1).equalsIgnoreCase("Contractor")){
                Integer hourlyWages = Integer.parseInt(worker.get(3));
                Integer hoursPerWeek = Integer.parseInt(worker.get(4));
                Integer calculatedSalary = hourlyWages * hoursPerWeek * 52;
                sortedSalaries.add(calculatedSalary);
                reporterSalaries.put(workerId, calculatedSalary);
            }else if(worker.get(1).equalsIgnoreCase("FTE")){
                Integer baseSalary = Integer.parseInt(worker.get(3));
                sortedSalaries.add(baseSalary);
                reporterSalaries.put(workerId, baseSalary);
            }
        }
        //Calculating manager salary using worker salaries stored in a hashmap along with their worker ids
        for(List<String> worker: workers){
            if(worker.get(1).equalsIgnoreCase("")){
                continue;
            }
            Integer totalManagerSalary = 0;
            if(worker.get(1).equalsIgnoreCase("Manager")){
                String reporterIdString = worker.get(3);
                String[] reporterIds = reporterIdString.split(",");
                for(int i=0;i<reporterIds.length;i++){
                    Integer reporterSalaryWithoutNull = reporterSalaries.get(i)==null?0:reporterSalaries.get(i);
                    totalManagerSalary = totalManagerSalary + reporterSalaryWithoutNull;
                }
                sortedSalaries.add(totalManagerSalary);
            }
        }

        Collections.sort(sortedSalaries);
        return sortedSalaries;
    }
    public static void main(String arg[]){
    }

}
