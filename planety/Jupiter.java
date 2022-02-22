public class Jupiter extends Planet implements PlanetsImpl{
    public Jupiter(){
        setPlanetLife(false);
        setPlanetType(false);
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
