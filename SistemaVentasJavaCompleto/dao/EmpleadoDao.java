package dao;

import java.util.List;
import dtos.EmpleadoDto;
import singletonSqlConnection.SqlConnection;

public class EmpleadoDao implements Dao<EmpleadoDto> {
    private SqlConnection conn;

    public List<EmpleadoDto> listarTodos() {
        return null;
    }

    public EmpleadoDto buscar(EmpleadoDto obj) {
        return null;
    }

    public boolean actualizar(EmpleadoDto obj) {
        return false;
    }

    public boolean borrar(EmpleadoDto obj) {
        return false;
    }
}
