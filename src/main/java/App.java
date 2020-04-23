import hibernate.Book;
import hibernate.Users;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class App {
    public static void main(String[] args) {
        SessionFactory  sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        Book book = new Book(1,"Knjiga","Simo Esis","ISO-1234/A0");
        Users user = new Users(1,"Osman","sifra",24,"active");
        transaction.commit();
        session.close();
    }
}
