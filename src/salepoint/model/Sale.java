package salepoint.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "sales")
public class Sale implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column (name = "amount")
    private Double amount;
    
    @Column (name = "date")
    private Date date;
    
    @Column (name = "user_id")
    private Integer user_id;

    public Sale() {
    }

    public Sale(Integer id, Double amount, Date date, Integer user_id) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.user_id = user_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Sale{"
                + "id = " + id
                +", amount = " + amount
                + ", date = " + date
                + ", user_id = " + user_id + '}';
    }
    
    
}
