public class Saturn extends Planet implements PlanetsImpl{
    public Saturn(){
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