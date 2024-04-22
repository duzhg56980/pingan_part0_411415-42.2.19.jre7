import org.postgresql.jdbc.PgConnection;
public class FunctionUse2008 {
public void funcUse() {
PgConnection pgconnection = new PgConnection();
pgconnection.getIsolationLevelName(null);
}
}