package tagtry.dblayout;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcHelper {

	public static String SELECT_ALL = "SELECT * FROM";

	public static void viewTable(Connection con, String dbName)
			throws SQLException {

		Statement stmt = null;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(SELECT_ALL + dbName);
			while (rs.next()) {
				String coffeeName = rs.getString("id");
				int supplierID = rs.getInt("name");
				String price = rs.getString("firstname");

				System.out.println(coffeeName + supplierID + price);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (stmt != null) {
				stmt.close();
			}
		}
	}
}
