/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballscore;

import java.util.ArrayList;
/**
 *
 * @author jiapat
 */
public class FootballMatch implements Source {
    private final ArrayList<Observer> list;
    private String result;
    
    public FootballMatch() {
        this.list = new ArrayList<Observer>();
    }
    
    public void setResult(String result) {
        this.result = result;
        notifyObservers(result);
    }
    
    public String getResult() {
        return this.result;
    }
    
    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }
    
    @Override
    public void notifyObservers(String result) {
        for (Observer observer : list) {
            observer.update(result);
        }
    }
}
