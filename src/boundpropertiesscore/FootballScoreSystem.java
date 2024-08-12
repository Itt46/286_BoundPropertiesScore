/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boundpropertiesscore;

import java.util.Scanner;

/**
 *
 * @author ittak
 */
public class FootballScoreSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LiveScoreBean liveScoreBean = new LiveScoreBean();

        // Creating subscriber objects
        ScoreSubscriber subscriber1 = new ScoreSubscriber("Subscriber 1");
        ScoreSubscriber subscriber2 = new ScoreSubscriber("Subscriber 2");

        // Registering subscribers
        liveScoreBean.addPropertyChangeListener(subscriber1);
        liveScoreBean.addPropertyChangeListener(subscriber2);

        Scanner scanner = new Scanner(System.in);
        String input;

        // Continuously read input from the user
        while (true) {
            input = scanner.nextLine();
            if (input.isEmpty()) {
                break; // Exit if Enter is pressed without any input
            }
            System.out.println("Enter Score " + input + " <- KonPon");
            liveScoreBean.setScoreLine(input);
        }

        scanner.close();
    }
}
