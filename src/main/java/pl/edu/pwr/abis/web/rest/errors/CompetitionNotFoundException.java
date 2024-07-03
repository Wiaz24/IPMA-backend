package pl.edu.pwr.abis.web.rest.errors;

public class CompetitionNotFoundException  extends BadRequestAlertException{
    
    private static final long serialVersionUID = 1L;

    public CompetitionNotFoundException(){
        super(ErrorConstants.COMPETITION_NOT_FOUND_TYPE, "Competition not found", "competition", "competitionnotfound");
    }
}
