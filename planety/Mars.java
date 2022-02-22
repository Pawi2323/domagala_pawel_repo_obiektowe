public class Mars extends Planet implements PlanetsImpl{
    public Mars(){
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
