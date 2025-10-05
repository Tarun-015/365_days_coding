# Q42 – Product Sales Dashboard
products <- data.frame(
  Product = c("Laptop","Phone","Tablet","Monitor"),
  UnitsSold = c(50, 200, 150, 75),
  Price = c(60000, 25000, 20000, 15000)
)

# Step 1: Calculate total revenue
products <- products %>% mutate(Revenue = UnitsSold * Price)

# Step 2: Filter products with revenue > 1,000,000
high_revenue <- products %>% filter(Revenue > 1000000)

# Step 3: Visualize high revenue products
ggplot(high_revenue, aes(x=Product, y=Revenue, fill=Product)) +
  geom_bar(stat="identity") +
  labs(title="High Revenue Products", x="Product", y="Revenue") +
  theme_minimal()


# Concepts: mutate, filter, bar chart for filtered data.