package com.sanju.Hibernate_reffression;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "user")
@ToString
@Getter
@Setter
@Cacheable  
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region="User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name = "username")
    private String username;

    @Column(name = "address")
    private String address;

    @Column(name = "salary")
    private Double salary;

    // Add the setter methods with the correct parameter types
    public void setUsername(String username) {
        this.username = username;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
