package fr.youngdev.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@AllArgsConstructor
@Data
@Entity
public class Product {
    @GeneratedValue
    @Id
    private long id;
    @Length(min = 4,max = 20)
    private String name;
    @Length(max = 255)
    private String description;
    @Min(0)
    private String prix;
    @Min(0)
    private int stock;

}
