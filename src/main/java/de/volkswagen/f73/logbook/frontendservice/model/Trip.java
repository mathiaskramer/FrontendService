package de.volkswagen.f73.logbook.frontendservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
        
    // private LocalDate date;
    private Integer year;
    private Integer month;
    private Integer day;
    private Integer duration;
    private Double distance;
    private Double consumption;
}
