import org.junit.jupiter.api.AfterAll;
import org.sql2o.Connection;
//import org.sql2o.Sql2o;
//import spark.resource.ExternalResource;
//
//public class DatabaseRule extends ExternalResource {
//
//    /**
//     * Constructor
//     *
//     * @param path the path to the external resource
//     */
//    public DatabaseRule(String path) {
//        super(path);
//    }
//
//    @Override
//    protected void before() {
//        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/virtual_pets_test", "kajela", "8444");
//
//    }
//
//    @AfterAll
//    protected void afterAll() {
//        try(Connection conn = DB.sql2o.open()){
//            String deletePersonQuery = "DELETE FROM persons*;";
//            conn.createQuery(deletePersonQuery).executeUpdate();
//        }
//    }
//}

import org.sql2o.*;
import spark.resource.ExternalResource;

public class DatabaseRule extends ExternalResource implements before {

    /**
     * Constructor
     *
     * @param path the path to the external resource
     */
    public DatabaseRule(String path) {
        super(path);
    }

    @Override
    public void before() {
        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/virtual_pets_test", "v", "1234");
    }

    @Override
    public void after() {
        try(Connection con = DB.sql2o.open()) {
            String deletePersonsQuery = "DELETE FROM persons *;";
            con.createQuery(deletePersonsQuery).executeUpdate();
        }
    }

}