package pl.edu.pwr.abis.domain.classes;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import pl.edu.pwr.abis.domain.dataTypes.Plik;

@Entity(name = "zalacznik_do_wniosku_aplikacyjnego")
@Getter
@Setter
public class ZalacznikDoWnioskuAplikacyjnego {
    @Id
    private Long id;

    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dataModyfikacji", column = @Column (name =
            "listeferencyjny_dataModyfikacji")),
            @AttributeOverride(name = "adres", column = @Column (name =
            "listReferencyjny_adres"))
        }
    )
    private Plik listReferencyjny;

    @ElementCollection
    private List<Plik> zdjecia = new ArrayList<>();

    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dataModyfikacji", column = @Column (name =
                "logotyp_dataModyfikacji")),
            @AttributeOverride(name = "adres", column = @Column (name =
                "logotyp_adres"))
        }
    )
    private Plik logotyp;

    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dataModyfikacji", column = @Column (name =
                "film_dataModyfikacji")),
            @AttributeOverride(name = "adres", column = @Column (name =
                "film_adres"))
        }
    )
    private Plik film;

    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dataModyfikacji", column = @Column (name =
                "oswiadczenieAplikanta_dataModyfikacji")),
            @AttributeOverride(name = "adres", column = @Column (name =
                "oswiadczenieAplikanta_adres"))
        }
    )
    private Plik oswiadczenieAplikanta;

    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dataModyfikacji", column = @Column (name =
                "oswiadczenieInicjatoraProjektu_dataModyfikacji")),
            @AttributeOverride(name = "adres", column = @Column (name =
                "oswiadczenieInicjatoraProjektu_adres"))
        }
    )
    private Plik oswiadczenieInicjatoraProjektu;

    @OneToOne(optional = false)
    private WniosekAplikacyjny wniosekAplikacyjny;
}
