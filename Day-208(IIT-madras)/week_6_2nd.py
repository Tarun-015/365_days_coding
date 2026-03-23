#week-6(2nd dataset)
import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression


from google.colab import files
uploaded = files.upload()


X = pd.read_csv('/content/X.xlsx - Sheet1.csv')
y = pd.read_csv('/content/y.xlsx - Sheet1.csv')

# Convert y to 1D array (important)
y = y.iloc[:, 0]

# Step 4: Train-test split
X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.2, random_state=0
)

# Step 5: Build model
model = LinearRegression()
model.fit(X_train, y_train)

# Step 6: R2 score
r2 = model.score(X_test, y_test) * 100
print("R2:", round(r2, 2))

# Step 7: Intercept
print("Intercept:", model.intercept_)

# Step 8: Prediction for given values
sample = np.array([[1315.46, 115816.21, 297114.46, 1, 0]])
prediction = model.predict(sample)

print("Predicted Profit:", prediction[0])


# o/p :
    
#     R2: 93.47
# Intercept: 69744.9871238524
# Predicted Profit: 84489.10563629771