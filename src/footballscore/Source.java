/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballscore;

/**
 *
 * @author jiapat
 */
public interface Source {
    public void notifyObservers(String result);
    public void registerObserver(Observer observer);
}
