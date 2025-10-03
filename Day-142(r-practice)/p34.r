# Q34 – Line Chart of Monthly Sales Trend
months <- data.frame(
  Month = factor(c("Jan","Feb","Mar","Apr","May","Jun"), 
                 levels=c("Jan","Feb","Mar","Apr","May","Jun")),
  Sales = c(120, 150, 180, 160, 200, 220)
)

ggplot(months, aes(x=Month, y=Sales, group=1)) +
  geom_line(color="darkgreen", size=1.2) +
  geom_point(color="red", size=3) +
  labs(title="Monthly Sales Trend", x="Month", y="Sales") +
  theme_minimal()


# Concepts: Line chart + points + custom styling.