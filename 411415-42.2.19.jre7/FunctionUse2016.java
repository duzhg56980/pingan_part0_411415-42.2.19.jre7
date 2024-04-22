import org.postgresql.jdbc.PgConnection;
public class FunctionUse2016 {
public void funcUse() {
PgConnection pgconnection = new PgConnection();
pgconnection.getDBVersionNumber();
}
}