package solvd.sqlmimic.doing;

import solvd.sqlmimic.connectionpool.ConnectionPool;
import solvd.sqlmimic.connectionpool.Dao;
import solvd.sqlmimic.entities.Area;
import solvd.sqlmimic.entities.Concert;
import solvd.sqlmimic.interfaces.IConcertDao;

import java.sql.*;
import java.util.Properties;

public class ConcertsDao implements IConcertDao {
    public Concert getById(int idConcerts) throws SQLException {
        Connection connection = ConnectionPool.getConnection();
        try(PreparedStatement ps = connection.prepareStatement("SELECT * FROM Concerts WHERE idConcerts = ?");){
            ps.setInt(1,idConcerts);
            ResultSet resultSet = ps.executeQuery();
            resultSet.next();
            return new Concert(resultSet.getInt("idConcerts"),resultSet.getString("time_play"),resultSet.getString("duration"),resultSet.getString("date"), resultSet.getInt("idArea"));
        }catch (SQLException e){
            throw new SQLException();
        }

    }

    @Override
    public void save(Concert concert) {

    }

    @Override
    public void update(Concert concert, String[] params) {

    }

    @Override
    public void delete(Concert concert) {

    }
}
