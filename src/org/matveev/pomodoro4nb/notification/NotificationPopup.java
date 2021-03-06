/*
 * Copyright (C) 2012 Alexey Matveev <mvaleksej@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.matveev.pomodoro4nb.notification;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import org.matveev.pomodoro4nb.utils.Callback;

/**
 *
 * @author Alexey Matveev
 */
/*package*/ class NotificationPopup extends javax.swing.JPanel {

    public NotificationPopup(String title, String message, Callback callback) {
        initComponents();
        setStrings(title, message);
        setCallbackIfNeeded(callback);
    }

    private void setStrings(String title, String message) {
        titleLabel.setText(title);
        msgLabel.setText(message);
    }

    private void setCallbackIfNeeded(final Callback callback) {
        if (callback != null) {
            addComponentListener(new ComponentAdapter() {
                @Override
                public void componentHidden(ComponentEvent e) {
                    callback.call(null);
                }
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        messagesPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        msgLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/matveev/pomodoro4nb/resources/images/pomodoro_notify.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(logoLabel, org.openide.util.NbBundle.getMessage(NotificationPopup.class, "NotificationPopup.logoLabel.text")); // NOI18N
        add(logoLabel);

        messagesPanel.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        org.openide.awt.Mnemonics.setLocalizedText(titleLabel, org.openide.util.NbBundle.getMessage(NotificationPopup.class, "NotificationPopup.titleLabel.text")); // NOI18N
        messagesPanel.add(titleLabel);

        org.openide.awt.Mnemonics.setLocalizedText(msgLabel, org.openide.util.NbBundle.getMessage(NotificationPopup.class, "NotificationPopup.msgLabel.text")); // NOI18N
        messagesPanel.add(msgLabel);

        add(messagesPanel);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel messagesPanel;
    private javax.swing.JLabel msgLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
