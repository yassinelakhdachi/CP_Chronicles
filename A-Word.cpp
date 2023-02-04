#include <bits/stdc++.h>
using namespace std;
 
int main() {
 
	string s;
	cin >> s;
	string s1="",s2="";
	int l=0,u=0;
	for(char ch : s){
		if(islower(ch)){
			l++;
		}
		else{
			u++;
		}
		s2+=toupper(ch);
		s1+= tolower(ch);
	}
	if(l >= u)
		cout << s1;
	else if(l < u)
		cout << s2;
	return 0;
}