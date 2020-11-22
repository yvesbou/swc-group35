import java.util.ArrayList;

public abstract class Office extends Facility{
    ArrayList facilities = new ArrayList();

    public void add(Facility facility) { facilities.add(facility); }
    public void remove(Facility facility) { facilities.remove(facility); }
}
