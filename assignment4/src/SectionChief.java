
public class SectionChief extends RegularEmployee{
    private String city;
    public SectionChief(String name, String surname){
        super(name,surname);
        city = ChiefOfStaff.getChiefOfStaff().getNewCity();
    }
    public void upgradeGoldToPlatinum(int customerID){}
    public void downgradeGoldToRegular(int customerID){}
}
