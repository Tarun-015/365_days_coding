# Sample inputs (# note: The values given in the prefix code(grey) will be changed by the autograder according to the testcase while running them.
a = 5

price1, discount1 = 50, 4 # for offer1
price2, discount2 = 60, 8 # for offer2

# Assume discount is given in percentages

# <eoi>

output1 = a >= 5 # bool: True if a greater than or equal to 5

output2 = a % 5 == 0 # bool: True if a is divisible by 5

output3 = a < 10 and a % 2 != 0 # bool: True if a is odd number less than 10

output4 = -10 < a < 10 and a % 2 != 0 # bool: True if a is an odd number within the range -10 and 10

output5 = len(str(abs(a))) % 2 == 0 and len(str(abs(a))) <= 10 # bool: True if a has even number of digits but not more than 10 digits

offer1_price = price1*(1-discount1/100)
offer2_price = price2*(1-discount2/100)

is_offer1_cheaper = offer1_price < offer2_price # bool: True if the offer1 is strictly cheaper
