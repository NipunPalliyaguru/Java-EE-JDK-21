public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        CategoryService categoryService = new CategoryService();

        // Adding some categories
        Category category1 = new Category(1, "Cat 1", true);
        Category category2 = new Category(2, "Cat 2", true);
        categoryService.addCategory(category1);
        categoryService.addCategory(category2);

        // Adding some products
        Product product1 = new Product(1, "Prod 1", 1, 78, true);
        Product product2 = new Product(2, "Prod 2", 2, 20, false);
        Product product3 = new Product(3, "Prod 3", 1, 10, true);
        productService.addProduct(product1);
        productService.addProduct(product2);
        productService.addProduct(product3);

        // Read all products
        System.out.println("All Products:");
        productService.getAllProducts().forEach(System.out::println);

        // Read product by ID
        System.out.println("\nProduct with ID 1:");
        productService.getProductById(1).ifPresent(System.out::println);

        // Update a product
        System.out.println("\nUpdating Product 1:");
        Product updatedProduct = new Product(1, "Updated Prod 1", 1, 88, true);
        productService.updateProduct(1, updatedProduct);

        // Delete a product
        System.out.println("\nDeleting Product 2:");
        productService.deleteProduct(2);

        // Read all categories
        System.out.println("\nAll Categories:");
        categoryService.getAllCategories().forEach(System.out::println);

        // Update a category
        System.out.println("\nUpdating Category 1:");
        Category updatedCategory = new Category(1, "Updated Cat 1", true);
        categoryService.updateCategory(1, updatedCategory);
    }
}
