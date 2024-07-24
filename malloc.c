#include<stdio.h>
#include<stdlib.h>

int main(){
    int *ptr;
    int n , i;

    printf("Enter the number of elements ? ");
    scanf("%d",&n);

    ptr = (int*)malloc(n * sizeof(int));

    if(ptr == NULL){
        printf("Memory not allocated \n");
        exit(0);
    }
    printf("memeory successfully allocated \n");

    for (int i = 0; i < n; i++)
    {
        ptr[i] = i+1;
    }

    for(int i = 0 ; i<n; i++){
        printf("%d ", ptr[i]);
    }
    


}