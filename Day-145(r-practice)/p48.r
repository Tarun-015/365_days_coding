# Q48 – Monthly Sales Trend Project

# Scenario: Company wants monthly revenue analysis.
# Tasks:

# Create a dataset with Month, UnitsSold, Price.

# Add Revenue column.

# Calculate cumulative revenue.

# Visualize:

# Revenue trend (line chart with points)

# Cumulative revenue (line chart, different color)

# Concepts: mutate, cumulative calculations (cumsum()), ggplot2 (geom_line, geom_point).

library(dplyr)
library(ggplot2)

# Dataset
sales <- data.frame(
  Month = factor(c("Jan","Feb","Mar","Apr","May","Jun"),
                 levels=c("Jan","Feb","Mar","Apr","May","Jun")),
  UnitsSold = c(50,75,100,80,120,150),
  Price = c(2000,2000,2100,2200,2100,2300)
)

# Calculate Revenue
sales <- sales %>% mutate(Revenue = UnitsSold * Price)

# Calculate cumulative revenue
sales <- sales %>% mutate(CumulativeRevenue = cumsum(Revenue))

# Revenue trend line chart
ggplot(sales, aes(x=Month, y=Revenue, group=1)) +
  geom_line(color="blue", size=1) +
  geom_point(color="red", size=3) +
  labs(title="Monthly Revenue Trend", x="Month", y="Revenue") +
  theme_minimal()

# Cumulative revenue line chart
ggplot(sales, aes(x=Month, y=CumulativeRevenue, group=1)) +
  geom_line(color="green", size=1) +
  geom_point(color="orange", size=3) +
  labs(title="Cumulative Revenue Trend", x="Month", y="Cumulative Revenue") +
  theme_minimal()
