package fr.youngdev.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.Min;
import java.sql.Date;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Product {

    @GeneratedValue
    @Id
    private int id;
    @CreationTimestamp LocalDateTime dateTime;

    @Length(min = 4,max = 20)
    private String nom;
    @Length(max = 255)
    private String description;
    @Min(0)
    private int prix;
    @Min(0)
    private int stock;

}
