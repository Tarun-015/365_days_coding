# Q33 – Bar Plot of Sales by Product
library(ggplot2)

sales <- data.frame(
  Product = c("Laptop","Phone","Tablet","Monitor","Headphones"),
  Revenue = c(3000000, 2500000, 1500000, 800000, 600000)
)

ggplot(sales, aes(x=Product, y=Revenue)) +
  geom_bar(stat="identity", fill="steelblue") +
  labs(title="Revenue by Product", x="Product", y="Revenue") +
  theme_minimal()


# Concepts: Bar plot with geom_bar(stat="identity"), titles, and theme.