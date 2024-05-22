#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    if(n == 2 || n == 3){
        cout << "NO SOLUTION";
    }
    else if(n == 4){
        cout << "2 4 1 3";
    }
    else{
        vector<int> arr(n);
        int j = 1;
        for (int i = 0; i < n; i+=2){
            arr[i] = j;
            j++;
        }
        for (int i = 1; i < n; i+=2)
        {
            arr[i] = j;
            j++;
        }
        for(auto itr: arr){
            cout << itr << " ";
        }
    }
    return 0;
}