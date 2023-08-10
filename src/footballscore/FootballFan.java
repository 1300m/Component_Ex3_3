/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballscore;

/**
 *
 * @author jiapat
 */
public class FootballFan implements Observer {
    private String name;

    public FootballFan(String name) {
        this.name = name;
    }

    @Override
    public void update(String result) {
        System.out.println("live result: " + result);
    }
}
