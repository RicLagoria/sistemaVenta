package dao;

import java.util.List;
import dtos.DescuentoRecargoDto;
import singletonSqlConnection.SqlConnection;

public class DescuentoRecargoDao implements Dao<DescuentoRecargoDto> {
    private SqlConnection conn;

    public List<DescuentoRecargoDto> listarTodos() {
        return null;
    }

    public DescuentoRecargoDto buscar(DescuentoRecargoDto obj) {
        return null;
    }

    public boolean actualizar(DescuentoRecargoDto obj) {
        return false;
    }

    public boolean borrar(DescuentoRecargoDto obj) {
        return false;
    }
}
