/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;

public class RoadMap {
    
    
    String roadName ;
    ArrayList<Subject> roadList ;

    public RoadMap() {
    }
    
    public RoadMap(String roadName, ArrayList<Subject> roadList) {
        this.roadName = roadName;
        this.roadList = roadList;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public ArrayList<Subject> getRoadList() {
        return roadList;
    }

    public void setRoadList(ArrayList<Subject> roadList) {
        this.roadList = roadList;
        System.out.println("Saved");
    }
    
  
}
