public class Product {
    private int productID;
    private String productName;
    private int categoryID;
    private int quantity;
    private boolean status;

    // Constructor
    public Product(int productID, String productName, int categoryID, int quantity, boolean status) {
        this.productID = productID;
        this.productName = productName;
        this.categoryID = categoryID;
        this.quantity = quantity;
        this.status = status;
    }

    // Getters and Setters
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product [productID=" + productID + ", productName=" + productName + ", categoryID=" + categoryID +
               ", quantity=" + quantity + ", status=" + status + "]";
    }
}
