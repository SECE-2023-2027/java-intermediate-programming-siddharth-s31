public class Product {
    private String productId;
    private String productName;
    private double price;
    private int stockQuantity;

    public Product(String productId, String productName, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;
        setPrice(price);
        setStockQuantity(stockQuantity);
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0.0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity < 0) {
            this.stockQuantity = 0;
        } else {
            this.stockQuantity = stockQuantity;
        }
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0) {
            double discountAmount = this.price * (percentage / 100.0);
            this.price -= discountAmount;
            
            if (this.price < 0.0) {
                this.price = 0.0;
            }
        }
    }
}