#include <bits/stdc++.h>
using namespace std;

bool isBeautiful(vector<int> v1, vector<int> v2){
    int diff = 0;
    int count = 0;
    for (int i = 0; i < v1.size(); i++){
        diff = v1[i] - v2[i];
        if(diff != 0){
            count++;
        }
        diff = 0;
    }
    return count == 1;
}

int main() {
    int t;
    cin >> t;
    vector<int> res;
    while (t--)
    {
        int count = 0;
        int n;
        cin >> n;
        vector<int> v;
        for (int i = 0; i < n; i++){
            int k;
            cin >> k;
            v.push_back(k);
        }
        vector<vector<int>> trip;
        int x = 0, y = 1, z = 2;
        while (z < v.size()){
            vector<int> temp;
            temp.push_back(v[x++]);
            temp.push_back(v[y++]);
            temp.push_back(v[z++]);
            trip.push_back(temp);
        }
        for(int i = 0; i < trip.size(); i++){
            for (int j = i; j < trip.size(); j++)
            {
            int diff = 0;
                for (int k = 0; k < 3; k++)
                {
                    if(trip[i][k] != trip[j][k]){
                        diff++;
                    }
                }
                if(diff == 1){
                    count++;
                }
            }
        }
        res.push_back(count);
        
    }
    for(auto itr: res){
            cout << itr << "\n";
    }
    
    return 0;
}