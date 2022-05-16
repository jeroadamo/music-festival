package solvd.sqlmimic;

import solvd.sqlmimic.doing.ConcertsDao;
import solvd.sqlmimic.entities.Concert;

import java.sql.SQLException;

public class Runner {
    public static void main(String args[]) throws SQLException {
        ConcertsDao concertsDao = new ConcertsDao();
        System.out.println(concertsDao.selectAll());
    }
}
