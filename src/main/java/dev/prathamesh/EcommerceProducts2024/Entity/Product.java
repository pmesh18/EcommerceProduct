package dev.prathamesh.EcommerceProducts2024.Entity;

<<<<<<< HEAD

=======
>>>>>>> 0219d05377864e78880fa57aabb5e1e9c8709c78
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
<<<<<<< HEAD


public class Product {
    private int Id;
=======
@Entity
public class Product extends  BaseModel{
>>>>>>> 0219d05377864e78880fa57aabb5e1e9c8709c78
    private String Title;
    private double Price;
    private String Description;
    private String Category;
    private String Image;
    private double Rating;


}
