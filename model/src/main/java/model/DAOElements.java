package model;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * The Class DAOEntity.
 *
 * @author Cattelan Montes Duffaut | Exia A1 Promo 2015
 *
 * @param <E>
 *          the element type
 */
abstract class DAOElements<E extends Elements> {

	/** The connection. */
	private final Connection connection;

	/**
	 * Instantiates a new DAO entity.
	 *
	 * @param connection
	 *          the connection
	 * @throws SQLException
	 *           the SQL exception
	 */
	public DAOElements(final Connection connection) throws SQLException {
		this.connection = connection;
	}

	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 */
	protected Connection getConnection() {
		return this.connection;
	}

	/**
	 * Creates the.
	 *
	 * @param entity
	 *          the entity
	 * @return true, if successful
	 */
	public abstract boolean create(E entity);

	/**
	 * Delete.
	 *
	 * @param entity
	 *          the entity
	 * @return true, if successful
	 */
	public abstract boolean delete(E entity);

	/**
	 * Update.
	 *
	 * @param entity
	 *          the entity
	 * @return true, if successful
	 */
	public abstract boolean update(E entity);

	/**
	 * Find.
	 *
	 * @param id
	 *          the id
	 * @return the e
	 */
	public abstract E find(int id);

	/**
	 * Find.
	 *
	 * @param key
	 *          the key
	 * @return the e
	 */
	public abstract E find(String key);

}
