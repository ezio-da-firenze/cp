#include <bits/stdc++.h>
using namespace std;


int main() {
    int t;
    cin >> t;
    vector<long> v;
    while(t--){
        long x, y;
        cin >> y >> x;
        if(y > x){
            long ans;
            if(y % 2 != 0){
                ans = ((y - 1) * (y - 1)) + 1 + (x - 1);
            }
            else{
                ans = (y * y) - (x - 1);
            }
            v.push_back(ans);
        }
        else{
            long ans;
            if(x % 2 != 0){
                ans = (x * x) - (y - 1);
            }
            else{
                ans = ((x - 1) * (x - 1)) + 1 + (y - 1);
            }
            v.push_back(ans);
        }
        
    }
    for(auto itr: v){
        cout << itr << endl;
    }
    return 0;
}
