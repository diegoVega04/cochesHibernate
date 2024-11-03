package org.example.cocheshibernate.Util;

import javax.swing.*;

public class Alert {
    public static void notificacion (String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Notificacion",JOptionPane.WARNING_MESSAGE);
    }

    public static int confirmacion (String mensaje) {
        return JOptionPane.showConfirmDialog(null, mensaje, "Confirmacion", JOptionPane.OK_CANCEL_OPTION); //0 = si
    }
}
