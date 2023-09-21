# Codethon_Project
Simple Bank System
This code is a simple banking system program written in C++. It allows users to perform basic banking operations like creating accounts, logging in, depositing money, withdrawing money, checking account information, and logging out. Here's a breakdown of what each part of the code does:

**Initialization:**
The code starts by including necessary libraries, defining constants, and declaring arrays and variables to store account information. It also initializes some variables like accountCounter and loggedInAccountIndex.

**Main Menu:**
Inside the main() function, there's a loop that displays a menu to the user and waits for their choice. The menu includes options for login, creating a new account, depositing money, withdrawing money, checking account information, and logging out.

**Login Function (login()):**
This function allows a user to log in by entering their account number. It checks if the entered account number exists in the system. If it does, it sets the loggedInAccountIndex to the index of the logged-in account and displays a welcome message. If not, it informs the user that the account was not found.

**Create Account Function (createAccount()):**
This function lets a user create a new bank account. It asks for the account holder's name, generates a unique account number, and takes an initial deposit. It then stores this information in the respective arrays.

**Deposit Cash Function (depositCash(int index)):**
This function allows the logged-in user to deposit money into their account. It takes the amount to deposit, checks if it's valid (greater than zero), and updates the account balance accordingly. It then displays the new balance.

**Withdraw Cash Function (withdrawCash(int index)):**
Similar to the deposit function, this allows the logged-in user to withdraw money from their account. It checks if the withdrawal amount is valid (greater than zero and not exceeding the account balance) and updates the balance if the withdrawal is successful.

**Display Account Info Function (displayAccountInfo(int index)): **
This function displays the account number, account holder's name, and current balance of the logged-in user's account.

**Logout Function:**
Logging out simply resets loggedInAccountIndex to -1 and displays a logout message.

**Menu Logic:**
The main() function uses a switch statement to execute the appropriate function based on the user's choice. If the user is not logged in (i.e., loggedInAccountIndex is -1), they are prompted to log in first for certain operations.

**Loop:**
The program continues to display the menu and process user choices in a loop until the user decides to exit.

Overall, this code is a basic implementation of a console-based banking system, suitable for educational purposes. It demonstrates how functions, arrays, and control structures like loops and switch statements can be used in a simple program.
