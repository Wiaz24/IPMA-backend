package pl.edu.pwr.abis.domain.classes;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Trener")
@Getter
@Setter
public class Trener {
    @Id
    private Long id;

    @OneToMany(mappedBy = "trener")
    private Set<Webinarium> webinarium;
}
