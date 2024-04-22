import org.postgresql.jdbc.PgConnection;
public class FunctionUse2010 {
public void funcUse() {
PgConnection pgconnection = new PgConnection();
pgconnection.getHideUnprivilegedObjects();
}
}