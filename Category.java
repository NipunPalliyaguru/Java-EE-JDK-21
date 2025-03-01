public class Category {
    private int categoryID;
    private String categoryName;
    private boolean status;

    // Constructor
    public Category(int categoryID, String categoryName, boolean status) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.status = status;
    }

    // Getters and Setters
    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Category [categoryID=" + categoryID + ", categoryName=" + categoryName + ", status=" + status + "]";
    }
}
