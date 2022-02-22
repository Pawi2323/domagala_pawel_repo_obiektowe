public class Venus extends Planet implements PlanetsImpl{
    public Venus(){
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