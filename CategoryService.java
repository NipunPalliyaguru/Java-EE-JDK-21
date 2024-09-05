import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CategoryService {
    private List<Category> categories = new ArrayList<>();

    // Create
    public void addCategory(Category category) {
        categories.add(category);
        System.out.println("Category added successfully: " + category);
    }

    // Read
    public List<Category> getAllCategories() {
        return categories;
    }

    public Optional<Category> getCategoryById(int id) {
        return categories.stream().filter(c -> c.getCategoryID() == id).findFirst();
    }

    // Update
    public boolean updateCategory(int id, Category updatedCategory) {
        Optional<Category> existingCategory = getCategoryById(id);
        if (existingCategory.isPresent()) {
            Category category = existingCategory.get();
            category.setCategoryName(updatedCategory.getCategoryName());
            category.setStatus(updatedCategory.isStatus());
            System.out.println("Category updated successfully: " + category);
            return true;
        }
        return false;
    }

    // Delete
    public boolean deleteCategory(int id) {
        Optional<Category> category = getCategoryById(id);
        if (category.isPresent()) {
            categories.remove(category.get());
            System.out.println("Category removed successfully: " + category.get());
            return true;
        }
        return false;
    }
}
