public class Mercury extends Planet implements PlanetsImpl{
    public Mercury(){
        setPlanetLife(false);
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
