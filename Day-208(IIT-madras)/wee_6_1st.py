import pandas as pd      #week-6(1st dataset)
from sklearn.linear_model import LinearRegression


df = pd.read_excel('/content/fmcg_demand_data.xlsx')

# Filter Product_19
df_p19 = df[df['product'] == 'Product_19']

# Features & target
X = df_p19[['price','diff_price','temperature','rainfall','promotion','holiday']]
y = df_p19['demand']

# Model
model = LinearRegression()
model.fit(X, y)

# Predictions (needed for R2)
y_pred = model.predict(X)

# R2
r2 = model.score(X, y) * 100

# Intercept
intercept = model.intercept_

# Price coefficient
coef_price = model.coef_[0]

# Optimal price
optimal_price = -intercept / (2 * coef_price)

# Elasticity
elasticity = coef_price * (df_p19['price'].mean() / df_p19['demand'].mean())

# Print all answers
print("R2:", round(r2,2))
print("Intercept:", intercept)
print("Price Coefficient:", coef_price)
print("Optimal Price:", optimal_price)
print("Elasticity:", elasticity)

# o/p :
    
#     R2: 89.06
# Intercept: 497.60073571470303
# Price Coefficient: -4.533885823587887
# Optimal Price: 54.87574622257768
# Elasticity: -0.46788092553500504