package solvd.sqlmimic.doing;

import solvd.sqlmimic.entities.Area;
import solvd.sqlmimic.interfaces.IAreaDao;

import java.sql.*;
import java.util.List;

public class AreaDao implements IAreaDao {

    @Override
    public Area getById(int idArea) throws SQLException {
        String query = "select * from Area where idArea = ?";
        Connection connection = DriverManager.getConnection("jdbc:mysql://52.59.193.212:3306/jeronimo_adamo", "root", "devintern");
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, 2);
            ResultSet resultSet = ps.executeQuery();
            resultSet.next();
            return new Area(resultSet.getInt("idArea"), resultSet.getString("cardinal_location"));
        } catch (SQLException e) {
            System.out.println(e);
        }
        throw new SQLException();
    }

    @Override
    public void save(Area area) throws SQLException {
        String query = "INSERT INTO Concerts (time_play,date,duration,idArea,idTickets) VALUES (?,?,?,?,?)";
        Connection connection = DriverManager.getConnection("jdbc:mysql://52.59.193.212:3306/jeronimo_adamo", "root", "devintern");
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, area.getIdArea());
            ps.setString(2, area.getCardinalLocation());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        throw new SQLException();

    }

    @Override
    public void update(Area area, String[] params) {

    }

    @Override
    public void delete(Area area) {

    }

    @Override
    public List<Area> selectAll() throws SQLException {
        return null;
    }
}
