/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package footballscore;

import java.util.Scanner;
/**
 *
 * @author 64050355 Jirapat Pichai
 */
public class FootballScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FootballMatch match = new FootballMatch();
        
        FootballFan fan1 = new FootballFan("Fan 1");
        FootballFan fan2 = new FootballFan("Fan 2");
        match.registerObserver(fan1);
        match.registerObserver(fan2);
        
        while (true) {
            System.out.print("Enter football match results: ");
            String input = in.nextLine();
            if (input.isEmpty()) {
                break;
            }
            match.setResult(input);
        }
        in.close();
    }
}
