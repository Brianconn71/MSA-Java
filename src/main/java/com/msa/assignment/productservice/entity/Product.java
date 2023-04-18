package com.msa.assignment.productservice.entity;

import jakarta.persistence.*;

import java.io.Serializable;

import javax.validation.constraints.Size;

@Entity
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private String Id;
    @Size(min=5)
    @Column(name="name")
    private String name;
    @Size(min=10)
    @Column(name="description")
    private String description;
    @Column(name="price", nullable=false)
    private Float price;

    public Product(){

    }

    public String getId(){
        return Id;
    }

    public String getname(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public Float getPrice(){
        return price;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public void setPrice(Float price){
        this.price=price;
    }

}
