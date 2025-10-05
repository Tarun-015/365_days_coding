# Q44 – Sales Revenue Trend by Month
sales <- data.frame(
  Month = factor(c("Jan","Feb","Mar","Apr","May","Jun"),
                 levels=c("Jan","Feb","Mar","Apr","May","Jun")),
  UnitsSold = c(50, 75, 100, 80, 120, 150),
  Price = c(2000, 2000, 2100, 2200, 2100, 2300)
)

# Step 1: Calculate monthly revenue
sales <- sales %>% mutate(Revenue = UnitsSold * Price)

# Step 2: Visualize revenue trend
ggplot(sales, aes(x=Month, y=Revenue, group=1)) +
  geom_line(color="blue", size=1) +
  geom_point(color="red", size=3) +
  labs(title="Monthly Revenue Trend", x="Month", y="Revenue") +
  theme_minimal()


# Concepts: Mutate for calculations + line chart with points.