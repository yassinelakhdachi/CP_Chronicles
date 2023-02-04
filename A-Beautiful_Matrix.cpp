#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	int a[6][6];
	for(int i=1;i<6;i++)
		for(int j=1;j<6;j++) cin>>a[i][j];
	int n;
	for(int i=1;i<6;i++)
		for(int j=1;j<6;j++)
		{
			if(a[i][j]==1) n=abs(i-3)+abs(j-3);
		}
	cout<<n;
	return 0;
}