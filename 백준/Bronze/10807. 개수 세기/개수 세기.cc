#include <stdio.h>
int main() {
    int n,v;
    int arr[101];

    scanf("%d", &n);
    for(int i=0; i<n; i++) {
        scanf("%d", &arr[i]);
    }
    scanf("%d", &v);
    int res = 0;
    for(int i=0; i<n; i++){
        if(arr[i] == v) res++;
    }
    printf("%d\n", res);
    return 0;

}