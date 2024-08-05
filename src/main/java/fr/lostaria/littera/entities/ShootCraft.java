package fr.lostaria.littera.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "shootcraft")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShootCraft {

    @Id
    @Column(nullable = false, unique = true)
    private String label;

    @Column
    private String fr;

    @Column
    private String en;

}
