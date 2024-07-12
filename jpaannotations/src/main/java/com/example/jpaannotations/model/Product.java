package com.example.jpaannotations.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

/*
 * @Table entity is used to name the table with a name other than the class name
 */
@Table(name = "products")
public class Product {
    /* specifies the primary key for the table (Mandatory) */
    @Id
    /*
     * @GeneratedValue(strategy = GenerationType.IDENTITY)
     * auto generates the value for the column
     * do not uses this coumn in the insert statements as it is auto generated
     * the same applies to the forms in the templates
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /*
     * @Column annotation
     * is used to add additional parameters to the column
     * additional parameters list
     * name -- set a custom name to the column
     * length -- specify a length of the data for the column
     * nullable -- (true/false) specifies if the column can have null values
     * unique -- (true/false) specifies if the column can have duplicate values
     * precision & scale -- used to secify the length for bigdecimal value columns
     * 
     */
    @Column(name = "product_name", length = 250, unique = true)
    private String name;
    private String description;
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;
}
