package dev.prathamesh.EcommerceProducts2024.Entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends  BaseModel{
    private String Title;
    private double Price;
    private String Description;
    private String Category;
    private String Image;
    private String Rating;


}
