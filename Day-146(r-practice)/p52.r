# Q52 – Monthly Revenue Cumulative Analysis

# Scenario: Track monthly revenue and cumulative revenue.

sales <- data.frame(
  Month = factor(c("Jan","Feb","Mar","Apr","May","Jun"),
                 levels=c("Jan","Feb","Mar","Apr","May","Jun")),
  UnitsSold = c(50,75,100,80,120,150),
  Price = c(2000,2000,2100,2200,2100,2300)
)

# Revenue and cumulative revenue
sales <- sales %>% mutate(Revenue = UnitsSold * Price,
                          CumulativeRevenue = cumsum(Revenue))

# Revenue trend
ggplot(sales, aes(x=Month, y=Revenue, group=1)) +
  geom_line(color="blue", size=1) +
  geom_point(color="red", size=3) +
  labs(title="Monthly Revenue Trend", x="Month", y="Revenue") +
  theme_minimal()

# Cumulative revenue
ggplot(sales, aes(x=Month, y=CumulativeRevenue, group=1)) +
  geom_line(color="green", size=1) +
  geom_point(color="orange", size=3) +
  labs(title="Cumulative Revenue", x="Month", y="Cumulative Revenue") +
  theme_minimal()