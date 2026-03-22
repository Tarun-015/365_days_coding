import pandas as pd
from sklearn.linear_model import LinearRegression

# Create dataset
data = {
    "Year": list(range(1970, 2021)),
    "Sales": [
        299,668,1151,1704,2477,2898,3962,4000,4148,4503,
        5256,6334,6519,7317,7690,7919,8383,9875,11980,13327,
        13739,14166,13312,12776,12656,13269,13600,14211,13523,14481,
        15887,15501,16132,19639,22619,26098,29638,33044,34346,29655,
        35321,39235,39565,39576,37940,32075,31129,33098,34778,40900,
        39003
    ]
}

df = pd.DataFrame(data)

# Define X and y
X = df[['Year']]
y = df['Sales']

# Create and fit model
model = LinearRegression()
model.fit(X, y)

# Outputs
intercept = round(model.intercept_, 2)
slope = round(model.coef_[0], 2)
r2 = round(model.score(X, y), 2)
correlation = round(df.corr().loc['Year', 'Sales'], 2)

# Print results
print("Intercept:", intercept)
print("Slope:", slope)
print("R^2:", r2)
print("Correlation:", correlation)