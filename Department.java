package com.dailycodebuffer.Springboot.tutorial.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

    @NotBlank(message = "Please Add Department Name")
    /*@Length(max = 5,min =1)
    @Size(max = 10, min = 0)
    @Email
    @Positive
    @Negative
    @PositiveOrZero
    @NegativeOrZero
    @Future
    @FutureOrPresent
    @Past
    @PastOrPresent*/
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

    public static Object builder() {
        return null;
    }

    public String getDepartmentCode() {
        return null;
    }

    public String getDepartmentName() {
        return null;
    }

    public void setDepartmentName(String departmentName) {
    }

    public void setDepartmentCode(String departmentCode) {

    }

    public String getDepartmentAddress() {
        return null;
    }

    public void setDepartmentAddress(String departmentAddress) {

    }
}