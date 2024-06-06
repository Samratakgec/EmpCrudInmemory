package com.Emp.EmpCRUDapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Empdata")
public class EmpEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private String Phone;
    private String Email;

}
