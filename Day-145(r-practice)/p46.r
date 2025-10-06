# Q46 – Product Revenue Dashboard Project

# Scenario: E-commerce team wants to analyze product performance.
# Tasks:

# Create a dataset with Product, Category, UnitsSold, Price.

# Add a Revenue column (UnitsSold * Price).

# Filter high revenue products (Revenue > threshold).

# Visualize:

# Revenue by product (bar chart)

# Revenue by category (stacked bar chart or grouped bar chart)

# Concepts: mutate, filter, group_by, summarize, ggplot2.

library(dplyr)
library(ggplot2)

# Dataset
products <- data.frame(
  Product = c("Laptop","Phone","Tablet","Monitor"),
  Category = c("Electronics","Electronics","Electronics","Electronics"),
  UnitsSold = c(50,200,150,75),
  Price = c(60000,25000,20000,15000)
)

# Calculate Revenue
products <- products %>% mutate(Revenue = UnitsSold * Price)

# Filter high revenue products (> 1,000,000)
high_revenue <- products %>% filter(Revenue > 1000000)

# Visualize revenue by product
ggplot(high_revenue, aes(x=Product, y=Revenue, fill=Product)) +
  geom_bar(stat="identity") +
  labs(title="High Revenue Products", x="Product", y="Revenue") +
  theme_minimal()

# Revenue by category
category_revenue <- products %>%
  group_by(Category) %>%
  summarize(TotalRevenue = sum(Revenue))

ggplot(category_revenue, aes(x=Category, y=TotalRevenue, fill=Category)) +
  geom_bar(stat="identity") +
  labs(title="Revenue by Category", x="Category", y="Total Revenue") +
  theme_minimal()
