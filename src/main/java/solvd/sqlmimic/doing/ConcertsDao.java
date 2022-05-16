package solvd.sqlmimic.doing;

import solvd.sqlmimic.connectionpool.ConnectionPool;
import solvd.sqlmimic.connectionpool.Dao;
import solvd.sqlmimic.entities.Area;
import solvd.sqlmimic.entities.Concert;
import solvd.sqlmimic.interfaces.IConcertDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ConcertsDao implements IConcertDao {
    public Concert getById(int idConcerts) throws SQLException {
        String query = "use jeronimo_adamo select * from Concerts where idConcerts = ?";
        Connection connection = DriverManager.getConnection("jdbc:mysql://52.59.193.212:3306", "root", "devintern" );
        try(PreparedStatement ps = connection.prepareStatement(query)){
            ps.setInt(1,3);
            ResultSet resultSet = ps.executeQuery();
            resultSet.next();
            return new Concert(resultSet.getInt("idConcerts"),resultSet.getString("time_play"),resultSet.getString("duration"),resultSet.getString("date"), resultSet.getInt("idArea"), resultSet.getInt("idTickets"));
        }catch (SQLException e){
            System.out.println(e);
        } throw new SQLException();
    }

    @Override
    public void save(Concert concert) throws SQLException {
        String query = "use jeronimo_adamo INSERT INTO Concerts (time_play,date,duration,idArea,idTickets) VALUES (?,?,?,?,?)" ;
        Connection connection = DriverManager.getConnection("jdbc:mysql://52.59.193.212:3306", "root", "devintern" );
        try(PreparedStatement ps = connection.prepareStatement(query)){
            ps.setInt(1,concert.getIdConcerts());
            ps.setString(2, concert.getTime_Play());
            ps.setString(3,concert.getDate());
            ps.setString(4,concert.getDuration());
            ps.setInt(5,concert.getIdTickets());
            ps.executeUpdate();
                  }catch (SQLException e){
            System.out.println(e);
        } throw new SQLException();


    }

    @Override
    public void update(Concert concert, String[] params) {


    }

    @Override
    public void delete(Concert concert) {

    }

    @Override
    public List<Concert> selectAll() throws SQLException {
        List<Concert> concerts = new ArrayList<>();
        Concert concert;
    try{
        Connection connection = DriverManager.getConnection("jdbc:mysql://52.59.193.212:3306", "root", "devintern" );
        PreparedStatement preparedStatement = connection.prepareStatement("USE jeronimo_adamo SELECT * FROM Concerts");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            int idConcerts = resultSet.getInt("idConcerts");
            String time_play = resultSet.getString("time_play");
            String date = resultSet.getString("date");
            String duration = resultSet.getString("duration");
            int idArea = resultSet.getInt("idArea");
            int idTickets = resultSet.getInt("idTickets");
            concert = new Concert(idConcerts,time_play,duration,date,idArea,idTickets);
            concerts.add(concert);
        }
    }catch (SQLException exception){
        throw new SQLException(exception);

    }
    return concerts;
    }
}
