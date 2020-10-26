package src;

public class Property {

    private String city;
    private String owner;
    private String propertyName;
    private double rent;
    private Plot plot;

    /**
     * A simple no-args constructor for Property
     */
    public Property() {
        city = owner = propertyName = "";
        rent = 0;
        plot = new Plot();
    }

    /**
     * A deep clone constructor for Property
     * @param p the Property to be cloned
     */
    public Property(Property p) {
        this.propertyName = p.getPropertyName();
        this.city = p.getCity();
        this.rent = p.getRent();
        this.owner = p.getOwner();
        this.plot = new Plot(p.getPlot());
    }

    /**
     * A constructor to create a new Property object from the given values. Uses the default Plot constructor
     * @param propertyName the name of the property
     * @param city the city of the property
     * @param rent the rent of the property
     * @param owner the owner of the property
     */
    public Property(String propertyName, String city, double rent, String owner) {
        this.propertyName = propertyName;
        this.city = city;
        this.rent = rent;
        this.owner = owner;
        plot = new Plot();
    }
    /**
     * @param propertyName the name of the property
     * @param city the city of the property
     * @param rent the rent of the property
     * @param owner the owner of the property
     * @param x the top-left x coordinate of the property
     * @param y the top-left y coordinate of the property
     * @param width the width of the property
     * @param depth the depth of the property
     */
    public Property(String propertyName, String city, double rent, String owner, int x, int y, int width, int depth) {
        this.propertyName = propertyName;
        this.city = city;
        this.rent = rent;
        this.owner = owner;
        plot = new Plot(x, y, width, depth);
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getRent() {
        return rent;
    }

    public void setPlot(int x, int y, int width, int depth) {
        this.plot = new Plot(x, y, width, depth);
    }

    public Plot getPlot() {
        return new Plot(plot);
    }

    public String toString() {
        String output = "";
        output += "Property Name: " + propertyName + "\n";
        output += "Located in " + city + "\n";
        output += "Belonging to: " + owner + "\n";
        output += String.format("Rent Amount: %.1f\n", rent); // formats rent to one decimal place
        return output;
    }
}
