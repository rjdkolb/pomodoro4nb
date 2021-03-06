/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.matveev.pomodoro4nb;

import java.awt.BorderLayout;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(dtd = "-//org.matveev.pomodoro4nb//Pomodoro4Nb//EN",
autostore = false)
@TopComponent.Description(preferredID = "Pomodoro4NbTopComponent",
iconBase = "org/matveev/pomodoro4nb/resources/images/pomodoro.png",
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "output", openAtStartup = false)
@ActionID(category = "Window", id = "org.matveev.pomodoro4nb.Pomodoro4NbTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(displayName = "#CTL_Pomodoro4NbAction",
preferredID = "Pomodoro4NbTopComponent")
public final class Pomodoro4NbTopComponent extends TopComponent {

    private final Pomodoro4NbController mainController;

    public Pomodoro4NbTopComponent() {
        mainController = new Pomodoro4NbController();
        initComponents();
        additionalInit();
        setName(NbBundle.getMessage(Pomodoro4NbTopComponent.class, "CTL_Pomodoro4NbTopComponent"));
        setToolTipText(NbBundle.getMessage(Pomodoro4NbTopComponent.class, "HINT_Pomodoro4NbTopComponent"));

    }

    private void additionalInit() {
        setLayout(new BorderLayout());
        add(mainController.createContent());
        // mainController.createQuickActionPanel(this);
    }

    @Override
    public int getPersistenceType() {
        return TopComponent.PERSISTENCE_ALWAYS;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
    }

    @Override
    public void componentClosed() {
    }

    void writeProperties(java.util.Properties p) {
        try {
            mainController.store(p);
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    void readProperties(java.util.Properties p) {
        try {
            mainController.restore(p);
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
    }
} 
