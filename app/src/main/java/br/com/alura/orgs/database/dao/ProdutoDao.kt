package br.com.alura.orgs.database.dao

import androidx.room.*
import br.com.alura.orgs.model.Produto

@Dao
interface ProdutoDao {
    @Query("SELECT * FROM Produto")
    fun buscaTodos(): List<Produto>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun salva(vararg produto: Produto)

    @Delete
    fun remove(produto: Produto)

    @Query("SELECT * FROM Produto WHERE id = :id")
    fun buscaPorId(id: Long): Produto?

    @Query("SELECT * FROM Produto ORDER BY nome DESC")
    fun ordenaNomeDesc(): List<Produto>

    @Query("SELECT * FROM Produto ORDER BY nome ASC")
    fun ordenaNomeAsc(): List<Produto>

    @Query("SELECT * FROM Produto ORDER BY descricao DESC")
    fun ordenaDescricaoDesc(): List<Produto>

    @Query("SELECT * FROM Produto ORDER BY descricao ASC")
    fun ordenaDescricaoAsc(): List<Produto>

    @Query("SELECT * FROM Produto ORDER BY valor DESC")
    fun ordenaValorDesc(): List<Produto>

    @Query("SELECT * FROM Produto ORDER BY valor ASC")
    fun ordenaValorAsc(): List<Produto>
}