package pl.edu.pwr.abis.domain.generalization;

import jakarta.persistence.DiscriminatorValue;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DiscriminatorValue("ClassB")
public class ClassB extends AbstractClassA {

}
