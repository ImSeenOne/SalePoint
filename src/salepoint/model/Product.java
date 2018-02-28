package salepoint.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column (name = "barcode")
    private String barcode;
    
    @Column (name = "name")
    private String name;
    
    @Column (name = "price")
    private Double price;
    
    @Column (name = "stock")
    private Double stock;

    public Product() {
    }
    
    

    public Product(Integer id, String barcode, String name, Double price, Double stock) {
        this.id = id;
        this.barcode = barcode;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    
    public void serialize() throws FileNotFoundException, IOException {
        
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/tmpdata/product.tmp"));
            objectOutputStream.writeObject(this);
            objectOutputStream.flush();
            objectOutputStream.close();
            
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }
}
