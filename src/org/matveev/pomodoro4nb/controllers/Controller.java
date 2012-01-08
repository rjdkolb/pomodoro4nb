/*
 * Copyright (C) 2011 Alexey Matveev <mvaleksej@gmail.com>
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
package org.matveev.pomodoro4nb.controllers;

import org.matveev.pomodoro4nb.utils.Handler;
import java.awt.Container;
import java.util.List;
import org.matveev.pomodoro4nb.utils.Storable;
import org.matveev.pomodoro4nb.data.Property;
import org.matveev.pomodoro4nb.data.PropertyListener;

/**
 *
 * @author Alexey Matvey
 */
public interface Controller extends Storable {
    
    public Container createUI();
    
    public void addPropertyListener(PropertyListener listener);
    public void removePropertyListener(PropertyListener listener);
    
    public List<Handler> getHandlers(Property<?> property);
}
