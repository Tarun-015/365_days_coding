import pandas as pd    #week 5(last potion)
from scipy.stats import chi2_contingency, chi2

# 👉 Load your dataset
# Replace with your file name
df = pd.read_csv('/content/iitm_onlineDegree.csv')

# 👉 Check column names
print(df.columns)

# Assume columns are named 'Gender' and 'Subject'
# Change names if different
contingency_table = pd.crosstab(df['Gender'], df['Preference'])
# 👉 Chi-square test
chi2_stat, p_value, dof, expected = chi2_contingency(contingency_table)

# 👉 Critical (tabulated) value
alpha = 0.05
critical_value = chi2.ppf(1 - alpha, dof)

# 👉 Round results
chi2_stat = round(chi2_stat, 2)
p_value = round(p_value, 4)
critical_value = round(critical_value, 2)

# 👉 Print outputs
print("Chi-square statistic:", chi2_stat)
print("p-value:", p_value)
print("Degrees of freedom:", dof)
print("Critical value:", critical_value)

# 👉 Final decision
if p_value < alpha:
    print("Reject Null Hypothesis → NOT independent")
else:
    print("Do NOT reject Null Hypothesis → Independent")
    
# o/p :
#     Index(['Gender', 'Preference'], dtype='object')
# Chi-square statistic: 2.66
# p-value: 0.2641
# Degrees of freedom: 2
# Critical value: 5.99
# Do NOT reject Null Hypothesis → Independent