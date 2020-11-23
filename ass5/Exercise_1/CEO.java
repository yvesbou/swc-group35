/**
 * The CEO class is a helper class to call the actual functions provided by the composite design pattern.
 */

public class CEO {
    Facility allEntities;

    /**
     * The CEO gets initialized all entities with form a tree like company structure.
     * @param allEntities
     */
    public CEO(Facility allEntities){
        this.allEntities = allEntities;
    }

    /**
     * This function calls the print function of the entities (every entity has this function).
     * It enables us to print the whole company structure without caring whether it's a final leaf
     * or just a node
     */
    public void printAllEntities(){
        allEntities.print();
    }
}
