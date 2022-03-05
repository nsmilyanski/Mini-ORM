package entities;

import orm.MyConnector;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws SQLException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {


        MyConnector.createConnection("root", "", "custom_orm" );

        Connection connection = MyConnector.getConnection();

        EntityManager<User> userEntityManager = new EntityManager(connection);


        EntityManager<Address> addressEntityManager = new EntityManager(connection);

        User user = new User("Gercheto",  30, LocalDate.now());

        Address address = new Address("Bulgaria", "Sandanski", "Pirin");

        Address address1 = new Address("Bulgaria", "Sandanski", "Pirin", "A55");

        addressEntityManager.doAlter(Address.class);



        System.out.println();


    }
}
