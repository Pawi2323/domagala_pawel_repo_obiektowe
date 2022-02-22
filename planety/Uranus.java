public class Uranus extends Planet implements PlanetsImpl{
    public Uranus(){
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
