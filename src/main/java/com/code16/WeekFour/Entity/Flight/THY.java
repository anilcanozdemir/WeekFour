package com.code16.WeekFour.Entity.Flight;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity
@PrimaryKeyJoinColumn(name = "THYId")
@Getter
@Setter
public class THY extends Flight {
private boolean yemek;
}
