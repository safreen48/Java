class BankAccount:
    def init(self, account_holder_name, account_number, initial_balance=0):
        self.account_holder_name = account_holder_name
        self.account_number = account_number
        self.balance = initial_balance

    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
            print(f"Deposited ${amount}. Current balance: ${self.balance}")
        else:
            print("Deposit amount should be greater than zero.")

    def withdraw(self, amount):
        if amount > 0:
            if self.balance >= amount:
                self.balance -= amount
                print(f"Withdrew ${amount}. Current balance: ${self.balance}")
            else:
                print("Insufficient funds!")
        else:
            print("Withdrawal amount should be greater than zero.")

    def display_balance(self):
        print(f"Account Holder: {self.account_holder_name}")
        print(f"Account Number: {self.account_number}")
        print(f"Current Balance: ${self.balance}")


# Example usage:
account = BankAccount("John Doe", "1234567890", 1000)
account.display_balance()

account.deposit(500)
account.withdraw(200)
account.withdraw(1500)  # Attempt to withdraw more than the balance

account.display_balance()