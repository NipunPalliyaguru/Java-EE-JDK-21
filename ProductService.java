import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    // Create
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added successfully: " + product);
    }

    // Read
    public List<Product> getAllProducts() {
        return products;
    }

    public Optional<Product> getProductById(int id) {
        return products.stream().filter(p -> p.getProductID() == id).findFirst();
    }

    // Update
    public boolean updateProduct(int id, Product updatedProduct) {
        Optional<Product> existingProduct = getProductById(id);
        if (existingProduct.isPresent()) {
            Product product = existingProduct.get();
            product.setProductName(updatedProduct.getProductName());
            product.setCategoryID(updatedProduct.getCategoryID());
            product.setQuantity(updatedProduct.getQuantity());
            product.setStatus(updatedProduct.isStatus());
            System.out.println("Product updated successfully: " + product);
            return true;
        }
        return false;
    }

    // Delete
    public boolean deleteProduct(int id) {
        Optional<Product> product = getProductById(id);
        if (product.isPresent()) {
            products.remove(product.get());
            System.out.println("Product removed successfully: " + product.get());
            return true;
        }
        return false;
    }
}
