package dao;

import java.util.List;
import dtos.ProductoDto;
import singletonSqlConnection.SqlConnection;

public class ProductoDao implements Dao<ProductoDto> {
    private SqlConnection conn;

    public List<ProductoDto> listarTodos() {
        return null;
    }

    public ProductoDto buscar(ProductoDto obj) {
        return null;
    }

    public boolean actualizar(ProductoDto obj) {
        return false;
    }

    public boolean borrar(ProductoDto obj) {
        return false;
    }
}
