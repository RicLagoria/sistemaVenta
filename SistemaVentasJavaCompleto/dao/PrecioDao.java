package dao;

import java.util.List;
import dtos.PrecioDto;
import singletonSqlConnection.SqlConnection;

public class PrecioDao implements Dao<PrecioDto> {
    private SqlConnection conn;

    public List<PrecioDto> listarTodos() {
        return null;
    }

    public PrecioDto buscar(PrecioDto obj) {
        return null;
    }

    public boolean actualizar(PrecioDto obj) {
        return false;
    }

    public boolean borrar(PrecioDto obj) {
        return false;
    }
}
