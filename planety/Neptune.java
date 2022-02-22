public class Neptune extends Planet implements PlanetsImpl{
    public Neptune(){
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
