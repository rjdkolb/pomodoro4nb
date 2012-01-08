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
package org.matveev.pomodoro4nb.dialogs;

import javax.swing.Action;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Alexey Matveev
 */
/*package*/ class DocumentValidator implements DocumentListener {
    
    private final Action action;

    /*package*/ DocumentValidator(Action action) {
        this.action = action;
        action.setEnabled(false);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        validate(e);
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        validate(e);
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        validate(e);
    }
    
    private void validate(DocumentEvent event) {
        action.setEnabled(event.getDocument().getLength() > 0);
    }
}
