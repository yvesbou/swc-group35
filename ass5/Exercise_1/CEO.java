public class CEO {
    Facility allEntities;

    public CEO(Facility allEntities){
        this.allEntities = allEntities;
    }

    public void printAllEntities(){
        allEntities.print();
    }
}
