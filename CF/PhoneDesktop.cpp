#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    vector<int> res;
    int s = 0, sy = 0, sx = 0;
    while (t--)
    {
        int x, y;
        cin >> x >> y;
        if (x == 0) {
                sx = 0;
            }
            if (y == 0) {
                sy = 0;
            } else if (y <= 2) {
                sy = 1;
            } else if (y > 2) {
                sy = 1 + static_cast<int>(ceil((y - 2) / 2.0));
            }
            int rem = (5 * 3 * sy) - 4 * y;
            if (x <= rem) {
                sx = 0;
            } else {
                int req = x - rem;
                // System.out.println(req);
                // System.out.println(Math.ceil(req / 15));
                // sx += (int) Math.ceil(req / 15);
               sx += static_cast<int>(ceil(static_cast<double>(req) / 15));

                // System.out.println(sx);
            }
            s = sx + sy;
            res.push_back(s);
    }
    for(auto itr: res){
        cout << itr << "\n";
    }
    
    return 0;
}