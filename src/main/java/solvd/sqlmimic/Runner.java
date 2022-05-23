package solvd.sqlmimic;

import solvd.sqlmimic.doing.ConcertsDao;
import solvd.sqlmimic.entities.Concert;
import solvd.sqlmimic.service.ConcertDaoService;

import java.sql.SQLException;

public class Runner {
    public static void main(String args[]) throws SQLException {
        //ConcertsDao concertsDao = new ConcertsDao();
        //System.out.println(concertsDao.selectAll());
        /*Concert concert = new Concert(9,"18:45","2hs", "27/05/2022", 2, 2);
        concertsDao.save(concert);*/

        ConcertDaoService concertDaoService = new ConcertDaoService();
        System.out.println(concertDaoService.methodCall());

    }
}
