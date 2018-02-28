package salepoint.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column (name = "username")
    private String username;
    
    @Column (name = "password")
    private String password;
    
    @Column (name = "name")
    private String name;
    
    @Column (name = "last_name")
    private String lastName;
    
    @Column (name = "address")
    private String address;
    
    @Column (name = "can_sell")
    private boolean canSell;
    
    @Column (name = "can_buy")
    private boolean canBuy;
    
    @Column (name = "can_inventory")
    private boolean canInventory;
    
    @Column (name = "is_admin")
    private boolean admin;

    public User() {
    }

    public User(Integer id, String username, String password, String name, String lastName, boolean canSell, boolean canBuy, boolean canInventory, boolean admin) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.canSell = canSell;
        this.canBuy = canBuy;
        this.canInventory = canInventory;
        this.admin = admin;
    }

    public User(Integer id, String username, String password, String name, String lastName, String address, boolean canSell, boolean canBuy, boolean canInventory, boolean admin) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.canSell = canSell;
        this.canBuy = canBuy;
        this.canInventory = canInventory;
        this.admin = admin;
    }

    public User(Integer id, String username, String password, String name, String lastName, String address, boolean canSell, boolean canBuy, boolean canInventory) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.canSell = canSell;
        this.canBuy = canBuy;
        this.canInventory = canInventory;
        this.admin = false;
    }

    public User(Integer id, String username, String password, String name, String lastName, boolean canSell, boolean canBuy, boolean canInventory) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.canSell = canSell;
        this.canBuy = canBuy;
        this.canInventory = canInventory;
        this.admin = false;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isCanSell() {
        return canSell;
    }

    public void setCanSell(boolean canSell) {
        this.canSell = canSell;
    }

    public boolean isCanBuy() {
        return canBuy;
    }

    public void setCanBuy(boolean canBuy) {
        this.canBuy = canBuy;
    }

    public boolean isCanInventory() {
        return canInventory;
    }

    public void setCanInventory(boolean canInventory) {
        this.canInventory = canInventory;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
