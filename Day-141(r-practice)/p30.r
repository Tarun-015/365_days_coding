# Q30 – Sales data: mutate + filter + arrange
sales <- data.frame(
  Product = c("Laptop","Phone","Tablet","Monitor","Headphones"),
  Units = c(50, 200, 150, 75, 180),
  Price = c(60000, 25000, 20000, 15000, 5000)
)

# Step 1: Add Revenue column
sales <- sales %>% mutate(Revenue = Units * Price)

# Step 2: Filter products with Revenue > 1,000,000
high_revenue <- sales %>% filter(Revenue > 1000000)

# Step 3: Sort products by Revenue
sorted_sales <- high_revenue %>% arrange(desc(Revenue))

print(sorted_sales)


# Concepts: mutate(), filtering, and sorting.