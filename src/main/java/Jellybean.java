public class Jellybean extends Sweet {
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    protected int weight = 40;
    protected int price = 30;
    protected String parameter = "Jelly";
    public Jellybean(){

    }
}
