# Q32 – Chained operations with pipe %>%
data <- data.frame(
  Item = c("Pen","Book","Notebook","Pencil","Eraser","Bag"),
  Category = c("Stationery","Stationery","Stationery","Stationery","Stationery","Accessories"),
  Quantity = c(100, 50, 75, 120, 60, 30),
  Price = c(10, 200, 50, 5, 3, 500)
)

# Chain multiple operations in one pipeline
result <- data %>%
  mutate(Total = Quantity * Price) %>%
  filter(Total > 1000) %>%
  group_by(Category) %>%
  summarize(
    TotalRevenue = sum(Total),
    AvgPrice = mean(Price)
  ) %>%
  arrange(desc(TotalRevenue))

print(result)


# Concepts: Full workflow with mutate, filter, group_by, summarize, and arrange.