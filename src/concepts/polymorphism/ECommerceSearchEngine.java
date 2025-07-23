package concepts.polymorphism;

class Search{
    private String productName;
    private String category;
    private double maxPrice;

    public Search(String productName, String category, double maxPrice) {
        this.productName = productName;
        this.category = category;
        this.maxPrice = maxPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory(String category) {
        return category;
    }
    public double getMaxPrice() {
        return maxPrice;
    }

    public void search(String productName){
        System.out.println("Searching for product name: " + productName);
    }

    public void search(String productName, double maxPrice){
        System.out.println("Searching for product name: " + productName + " with max price " + maxPrice);
    }

    public void search(String productName, double maxPrice, String category){
        System.out.println("Searching for product name: " + productName + " with max price " + maxPrice + " under the category " + category);
    }
}
public class ECommerceSearchEngine {
    public static void main(String[] args) {
        Search searchTab = new Search("Macbook", "mac", 34645747);
        searchTab.search("Macbook");
        searchTab.search("Macbook", 34645747);
        searchTab.search("Macbook", 34645747, "mac");
    }
}
