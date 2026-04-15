# =========================
# 1. Imports & Settings
# =========================
import warnings
warnings.filterwarnings("ignore")

import pandas as pd
from sklearn.linear_model import LogisticRegression
from sklearn.metrics import accuracy_score, precision_score, recall_score, confusion_matrix

# =========================
# 2. Load Data
# =========================
train = pd.read_csv('/content/train_LR.csv')
test = pd.read_csv('/content/test_LR.csv')

# =========================
# 3. Basic Info
# =========================
print("Train observations:", len(train))
print("Test observations:", len(test))

# =========================
# 4. Define X and y
# =========================
X_train = train.iloc[:, :-1]
y_train = train.iloc[:, -1]

X_test = test.iloc[:, :-1]
y_test = test.iloc[:, -1]

# =========================
# 5. Class Proportions
# =========================
train_prop = y_train.value_counts(normalize=True) * 100
test_prop = y_test.value_counts(normalize=True) * 100

print("\n--- Train Data ---")
print("Not Accepted (%):", round(train_prop.get(0, 0), 2))
print("Accepted (%):", round(train_prop.get(1, 0), 2))

print("\n--- Test Data ---")
print("Not Accepted (%):", round(test_prop.get(0, 0), 2))
print("Accepted (%):", round(test_prop.get(1, 0), 2))

# =========================
# 6. Model Training
# =========================
model = LogisticRegression(random_state=17)
model.fit(X_train, y_train)

# =========================
# 7. Predictions
# =========================
y_pred_train = model.predict(X_train)
y_pred_test = model.predict(X_test)

# =========================
# 8. Training Metrics
# =========================
train_acc = accuracy_score(y_train, y_pred_train) * 100
train_precision_0 = precision_score(y_train, y_pred_train, pos_label=0) * 100
train_recall_1 = recall_score(y_train, y_pred_train, pos_label=1) * 100

print("\n--- Training Metrics ---")
print("Accuracy:", round(train_acc, 3))
print("Precision (Not Accept):", round(train_precision_0, 3))
print("Recall (Accept):", round(train_recall_1, 0))

# =========================
# 9. Confusion Matrix (Test)
# =========================
tn, fp, fn, tp = confusion_matrix(y_test, y_pred_test).ravel()

print("\n--- Confusion Matrix (Test) ---")
print("False Positive (Type 1 Error):", fp)
print("False Negative (Type 2 Error):", fn)

# =========================
# 10. Test Metrics
# =========================
test_acc = accuracy_score(y_test, y_pred_test) * 100
test_precision_0 = precision_score(y_test, y_pred_test, pos_label=0) * 100
test_recall_1 = recall_score(y_test, y_pred_test, pos_label=1) * 100

print("\n--- Test Metrics ---")
print("Accuracy:", round(test_acc, 2))
print("Precision (Not Accept):", round(test_precision_0, 2))
print("Recall (Accept):", round(test_recall_1, 2))

# =========================
# 11. Precision Comparison (Accept class)
# =========================
train_precision_1 = precision_score(y_train, y_pred_train, pos_label=1)
test_precision_1 = precision_score(y_test, y_pred_test, pos_label=1)

print("\n--- Precision Comparison (Accept Class) ---")
if test_precision_1 > train_precision_1:
    print("Answer: Increased")
elif test_precision_1 < train_precision_1:
    print("Answer: Decreased")
else:
    print("Answer: Equal")
    
    

# OUTPUT :
    
# Train observations: 109244
# Test observations: 36415

# --- Train Data ---
# Not Accepted (%): 78.04
# Accepted (%): 21.96

# --- Test Data ---
# Not Accepted (%): 77.85
# Accepted (%): 22.15

# --- Training Metrics ---
# Accuracy: 81.487
# Precision (Not Accept): 82.686
# Recall (Accept): 28.0

# --- Confusion Matrix (Test) ---
# False Positive (Type 1 Error): 1002
# False Negative (Type 2 Error): 5798

# --- Test Metrics ---
# Accuracy: 81.33
# Precision (Not Accept): 82.51
# Recall (Accept): 28.11

# --- Precision Comparison (Accept Class) ---
# Answer: Increased