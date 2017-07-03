package belski.ru.repository;

import belski.ru.repository.impl.UserHibernateDaoImpl;
import belski.ru.repository.model.*;
import belski.ru.repository.util.HibernateUtil;
import org.apache.log4j.BasicConfigurator;
import org.hibernate.Session;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 */
public class App {
    //private static  final  UserHibernateDao userHibernateDao = new UserHibernateDao();

    public static void main(String[] args) {
        //  BasicConfigurator.configure();
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
//        User user = new User();
//        user.setLogin("MINA");
//        user.setName("Mike");
//        User user1 = new User();
//        user1.setLogin("Grifin");
//        user1.setName("Stifin");
        Meetings meetings1 = new Meetings();
  //      Meetings meetings2 = new Meetings();
        meetings1.setMeetingName("IT Academy");
//        meetings2.setMeetingName("FootballConferention");
        Room room = new Room();
        room.setRoomNumber(50);
        room.setRoomName("Hall");
        room.setMeetings(meetings1);
//        Room room1 = new Room();
//        room1.setRoomNumber(100);
//        room1.setRoomName("Academy Room");
        meetings1.setRoom(room);
//        meetings2.setRoom(room1);
//        room.setMeetings(meetings2);
//        room1.setMeetings(meetings1);
//        session.save(room);
//        session.save(room1);
        session.save(meetings1);
       // session.save(meetings2);
//        user.setMeetings(meetings);
//        user1.setMeetings(meetings);
//        session.save(user);
//        session.save(user1); // don t need to save both instancies user and meeting, because meetings set
        //is already included into session by means of objects user and user1

//        session.save(meetings1);
//        session.save(meetings2);
//        Phone phone1 = new Phone();
//        Phone phone2 = new Phone();
//        UserInformation userInformation1 = new UserInformation();
//        userInformation1.setUser(user);
//        user.setUserInformation(userInformation1);
//        userInformation1.setAddress("ул Мира");
//        session.save(userInformation1);
//        phone1.setUser(user);
//        phone2.setUser(user);
//        phone1.setPhoneNumber("256-85-36");
//        phone2.setPhoneNumber("561-51-43");
//        session.save(phone1);
//        session.save(phone2);

        session.getTransaction().commit();
        session.close();
        // userHibernateDao.insert(user);
//
//        User user2 = new User();
//        user2.setLogin("MINA1");
//        user2.setName("Mike1");
    }
}
