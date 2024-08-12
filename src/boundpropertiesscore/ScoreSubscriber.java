/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundpropertiesscore;

import java.beans.PropertyChangeListener;

/**
 *
 * @author ittak
 */
public class ScoreSubscriber implements PropertyChangeListener {
    private String name;

    public ScoreSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(java.beans.PropertyChangeEvent evt) {
        System.out.println(name + " live result: " + evt.getNewValue()+ " <- SaDangPhon ");
    }
}

