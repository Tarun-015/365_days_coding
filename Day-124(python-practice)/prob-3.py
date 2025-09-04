# Problem 3: BankAccount

class BankAccount:
    __slots__ = ('account_no', 'balance')
    
    def __init__(self, account_no, balance=0):
        self.account_no = account_no
        self.balance = balance
    
    def deposit(self, amt):
        self.balance += amt
    
    def withdraw(self, amt):
        if self.balance - amt < 0:
            raise ValueError("Insufficient balance!")
        self.balance -= amt

acc = BankAccount(12345, 500)
acc.deposit(200)
acc.withdraw(100)
print(acc.balance)  # 600
