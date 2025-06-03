package dao;

import java.util.List;

public interface Dao<T> {
    List<T> listarTodos();
    T buscar(T obj);
    boolean actualizar(T obj);
    boolean borrar(T obj);
}
