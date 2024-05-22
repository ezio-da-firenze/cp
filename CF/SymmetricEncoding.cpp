#include <bits/stdc++.h>
#include <algorithm> 
#include <string> 
using namespace std;

int main() {
    int t;
    cin >> t;
    vector<pair<int, string>> v;
    vector<string> res;
    while (t--)
    {
        int l;  
        string s;
        cin >> l;
        cin >> s;
        map<char, char> mpp;
        string st = s;
        sort(s.begin(), s.end());
        
        unordered_set<char> code;
        string codeStr;
        for(char c : s){
            if(code.find(c) == code.end()){
                code.insert(c);
                codeStr += c;
            }
        }
        for (int i = 0; i < codeStr.size(); i++)
        {
            mpp.emplace(codeStr[i], codeStr[codeStr.size() - 1 - i]);
        }
        
        string temp;
        for(char ch: st){
            temp.push_back(mpp.at(ch));
        }
        res.push_back(temp);
        v.push_back({l, s});
    }
    for(auto itr: res){
        cout << itr << "\n";
    }
    return 0;
}