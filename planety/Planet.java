class Planet{
    private boolean planetType;
    private boolean isLife;

    public boolean getPlanetType(){
        return planetType;
    }
    public boolean getPlanetLife(){
        return isLife;
    }
    public void setPlanetType(boolean planetType){
        this.planetType = planetType;
    }
    public void setPlanetLife(boolean isLife){
        this.isLife = isLife;
    }
}