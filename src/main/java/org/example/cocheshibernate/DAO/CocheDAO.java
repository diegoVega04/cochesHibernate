package org.example.cocheshibernate.DAO;

import javafx.collections.ObservableList;
import org.example.cocheshibernate.Clases.Coche;

public interface CocheDAO {

    ObservableList<Coche> cargarCoches();
    boolean guardarCoche (Coche a);
    boolean eliminarCoche (Coche a);
    boolean actualizarCoche (Coche a);
}
