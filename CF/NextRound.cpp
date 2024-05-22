#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, k;
    cin >> n >> k;
    int count = 0;
    vector<int> scores(n);
    for (int i = 0; i < n; i++)
    {
        cin >> scores[i];
    }
    for(auto itr: scores){
        if(itr > 0 && itr >= scores[k-1])
            count++;
    }
    cout << count;

    return 0;
}