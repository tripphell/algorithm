#include <iostream>
#include <string>
using namespace std;

int main() {
    string str_1 = "AaBbCcDd";
    string uppercase_str = "";
    string lowercase_str = "";
    
    // Получаем заглавные буквы (четные индексы: 0, 2, 4, 6)
    for (int i = 0; i < str_1.length(); i += 2) {
        uppercase_str += str_1[i];
    }
    
    // Получаем строчные буквы (нечетные индексы: 1, 3, 5, 7)
    for (int i = 1; i < str_1.length(); i += 2) {
        lowercase_str += str_1[i];
    }
