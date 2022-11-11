package Kodlama.io.Devs.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "technologies")


public class Technology {


    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Id
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JsonIgnore
    private SoftwareLanguage softwareLanguage;

}
