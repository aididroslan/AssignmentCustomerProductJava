package aidid.customer.product.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String emailOffice;
    private String emailPersonal;
    @ElementCollection
    private List<String> familyMembers;
}