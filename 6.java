#include <iostream>
#include <map>
#include <vector>
using namespace std;

// User structure
struct User {
    string pin;
    double balance;
    vector<string> transactionHistory;
};

// User database
map<string, User> users;

// Initialize users
void initializeUsers() {
    users["1234"] = {"1111", 5000.0, {}};
    users["5678"] = {"2222", 3000.0, {}};
    users["9012"] = {"3333", 7000.0, {}};
}

// Add transaction to history (keep last 5)
void addTransaction(vector<string>& history, string entry) {
    if (history.size() >= 5) {
        history.erase(history.begin());
    }
    history.push_back(entry);
}

// Authenticate user
bool authenticate(string acc) {
    string pin;
    cout << "Enter PIN for account " << acc << ": "<<endl;
    cin >> pin;
    if (users[acc].pin == pin) {
        cout << "✅ Login successful.\n";
        return true;
    } else {
        cout << "❌ Invalid PIN.\n";
        return false;
    }
}

// Check balance
void checkBalance(string acc) {
    cout << "💰 Current Balance: ₹" << users[acc].balance << endl;
}

// Deposit money
void deposit(string acc) {
    double amt;
    cout << "Enter amount to deposit: ₹";
    cin >> amt;
    if (amt <= 0) {
        cout << "❌ Invalid amount.\n";
        return;
    }
    users[acc].balance += amt;
    addTransaction(users[acc].transactionHistory, "Deposited ₹" + to_string(amt));
    cout << "✅ Deposit successful.\n";
    checkBalance(acc);
}

// Withdraw money
void withdraw(string acc) {
    double amt;
    cout << "Enter amount to withdraw: ₹";
    cin >> amt;
    if (amt <= 0 || amt > users[acc].balance) {
        cout << "❌ Invalid or insufficient balance.\n";
        return;
    }
    users[acc].balance -= amt;
    addTransaction(users[acc].transactionHistory, "Withdrew ₹" + to_string(amt));
    cout << "✅ Withdrawal successful.\n";
    checkBalance(acc);
}

// Show transaction history
void showHistory(string acc) {
    cout << "📜 Last 5 Transactions:\n";
    if (users[acc].transactionHistory.empty()) {
        cout << "No transactions found.\n";
        return;
    }
    for (const string& entry : users[acc].transactionHistory) {
        cout << "- " << entry << endl;
    }
}

// ATM menu
void atmMenu(string acc) {
    int choice;
    do {
        cout << "\n🏧 ATM Menu:\n";
        cout << "1. Check Balance\n";
        cout << "2. Deposit\n";
        cout << "3. Withdraw\n";
        cout << "4. Transaction History\n";
        cout << "5. Exit\n";
        cout << "Choose an option: "<<endl;
        cin >> choice;

        switch (choice) {
            case 1: checkBalance(acc); break;
            case 2: deposit(acc); break;
            case 3: withdraw(acc); break;
            case 4: showHistory(acc); break;
            case 5: cout << "🔒 Logging out...\n"; break;
            default: cout << "❌ Invalid choice. Try again.\n";
        }
    } while (choice != 5);
}

// Main function with manual user entry
int main() {
    initializeUsers();

    cout << "💡 Available Demo Accounts:\n";
    for (auto& user : users) {
        cout << "- Account Number: " << user.first << " (PIN: " << user.second.pin << ")\n";
    }

    while (true) {
    string account;
    cout << "🔐 Enter your account number (or type 'exit' to quit): "<<endl;
    cin >> account;

    if (account == "exit") {
        cout << "👋 Exiting ATM. Have a great day!\n";
        break; // Exit the loop
    }

    if (users.find(account) == users.end()) {
        cout << "❌ Account not found. Please try again.\n";
        continue;
    }

    if (authenticate(account)) {
        atmMenu(account);
    }
}


    return 0;
}
