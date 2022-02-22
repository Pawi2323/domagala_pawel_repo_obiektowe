public class Earth extends Planet implements PlanetsImpl{
    public Earth(){
        setPlanetLife(true);
        setPlanetType(true);
    }
    @Override
    public boolean isLife(){
        return getPlanetLife();
    }
    @Override
    public boolean planetType(){
        return getPlanetType();
    }
}
