package pl.edu.pwr.abis.domain.generalization;

import jakarta.persistence.DiscriminatorValue;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DiscriminatorValue("ClassD1")
public class ClassD1 extends ClassD {}
