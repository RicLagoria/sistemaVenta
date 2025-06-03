package dao;

import java.util.List;
import dtos.VentaDto;
import singletonSqlConnection.SqlConnection;

public class VentaDao implements Dao<VentaDto> {
    private SqlConnection conn;

    public List<VentaDto> listarTodos() {
        return null;
    }

    public VentaDto buscar(VentaDto obj) {
        return null;
    }

    public boolean actualizar(VentaDto obj) {
        return false;
    }

    public boolean borrar(VentaDto obj) {
        return false;
    }
}
