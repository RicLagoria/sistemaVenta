package dao;

import java.util.List;
import dtos.StockDto;
import singletonSqlConnection.SqlConnection;

public class StockDao implements Dao<StockDto> {
    private SqlConnection conn;

    public List<StockDto> listarTodos() {
        return null;
    }

    public StockDto buscar(StockDto obj) {
        return null;
    }

    public boolean actualizar(StockDto obj) {
        return false;
    }

    public boolean borrar(StockDto obj) {
        return false;
    }
}
