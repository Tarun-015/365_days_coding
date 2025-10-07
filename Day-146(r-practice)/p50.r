# Q50 – Product Category Revenue Comparison

# Scenario: Compare revenue contribution of each product category.

library(dplyr)
library(ggplot2)

products <- data.frame(
  Product = c("Laptop","Phone","Tablet","Monitor"),
  Category = c("Electronics","Electronics","Electronics","Peripherals"),
  UnitsSold = c(50,200,150,75),
  Price = c(60000,25000,20000,15000)
)

# Calculate revenue per product
products <- products %>% mutate(Revenue = UnitsSold * Price)

# Total revenue per category
category_revenue <- products %>% group_by(Category) %>% summarize(TotalRevenue = sum(Revenue))

# Visualization
ggplot(category_revenue, aes(x=Category, y=TotalRevenue, fill=Category)) +
  geom_bar(stat="identity") +
  labs(title="Revenue by Category", x="Category", y="Total Revenue") +
  theme_minimal()
