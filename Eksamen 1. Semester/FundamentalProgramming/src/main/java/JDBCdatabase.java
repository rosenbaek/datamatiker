/*Hvad er en database, tabeller, felter/kolonner,
primær nøgler, fremmed-nøgler, et EER-diagram, CRUD, MySql, Workbench*/


import java.sql.*;
import java.util.ArrayList;

public class JDBCdatabase {
    private static String URL = "jdbc:mysql://localhost:3306/eksamen?serverTimezone=UTC";
    private static String USER = "user";
    private static String PASS = "password";
    private static Connection con;
    private static PreparedStatement ps_add_stock_trades;
    private static PreparedStatement ps_get_stocks_trades;

    public static void main(String[] args) {
        try {
            prepareConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        add_stock_trades("user1", "aktie3", 120,1);
        System.out.println(get_stocks_trades("user1").toString());

    }

    public static void add_stock_trades (String username, String symbol, double bought_soldPrice, int volume)
    {
        try
        {
            ps_add_stock_trades.setString(1, username);
            ps_add_stock_trades.setString(2, symbol);
            ps_add_stock_trades.setDouble(3, bought_soldPrice);
            ps_add_stock_trades.setInt(4, volume);
            if (ps_add_stock_trades.executeUpdate() != 1)
            {
                System.out.println("Failed when trying to write trade to DB");
            } else {
                System.out.println("trade added");
            }
        }
        catch (SQLException throwables)
        {
            System.out.println("Can't find stock in database");
            throwables.printStackTrace();
        }
    }

    public static ArrayList<Stocks> get_stocks_trades(String username){
        ArrayList<Stocks> stocks = new ArrayList<>();
        Stocks stock = null;
        try {
            ps_get_stocks_trades.setString(1,username);
        }
        catch(SQLException e)
        {
            System.out.println("executed");
            e.printStackTrace();
        }
        try (ResultSet rs = ps_get_stocks_trades.executeQuery())
        {
            while (rs.next())
            {
                stock = new Stocks(rs.getString(1), rs.getString(2), rs.getDouble(5), "APIname", rs.getInt(4), rs.getDouble(3));
                stocks.add(stock);
            }
        }
        catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
        return stocks;
    }

    public static void prepareConnection() throws SQLException {
            con = DriverManager.getConnection(URL,USER,PASS);
            ps_add_stock_trades = con.prepareStatement("insert into trades (users_username,aktie_symbol,bought_soldPrice,volume) values (?,?,?,?)");
            ps_get_stocks_trades = con.prepareStatement("select aktie.name,aktie.symbol,trades.bought_soldPrice,trades.volume,aktie.price from trades join users on trades.users_username = users.username join aktie on trades.aktie_symbol = aktie.symbol where trades.users_username = ?");
    }
}
