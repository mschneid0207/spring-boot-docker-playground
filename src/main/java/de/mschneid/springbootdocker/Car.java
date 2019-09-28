package de.mschneid.springbootdocker;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Car {

    private String brand;
    private String model;
    private int ps;

}
