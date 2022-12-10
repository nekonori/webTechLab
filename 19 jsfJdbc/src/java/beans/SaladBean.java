package beans;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;
import java.sql.*;
import java.util.*;
import java.io.*;
import MyPackage.SaladIngredient;
import MyPackage.Salad;

@ManagedBean
@SessionScoped
public class SaladBean implements Serializable {

    List<SaladIngredient> ingredients;
    List<Salad> salads;
    String name;
    int price, totalPrice;

    public SaladBean() throws Exception {
        ingredients = new ArrayList<>();
        salads = new ArrayList<>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        Statement st = con.createStatement();
        String query = "SELECT * FROM saladingredients";
        ResultSet res = st.executeQuery(query);
        while (res.next()) {
            String n = res.getString("name");
            int p = res.getInt("price");
            SaladIngredient si = new SaladIngredient(n, p);
            ingredients.add(si);
        }
    }

    public List<SaladIngredient> getIngredients() {
        return ingredients;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int p) {
        price = p;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }
    
    public List<Salad> getSalads(){
        return salads;
    }
    
    public int getTotalPrice(){
        return totalPrice;
    }
    
    public void submit(){
        salads.add(new Salad(name, price));
        totalPrice += price;
    }
}
