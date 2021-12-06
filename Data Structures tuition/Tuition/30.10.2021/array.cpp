#include <iostream>
using namespace std;
int main()
{
    int a[20], len, i, j, k, ch;
    cout<<"Enter 1 to insert element in the begining"<<endl;
    cout<<"Enter 2 to insert element in the end"<<endl;
    cout<<"Enter 3 to insert element in the middle"<<endl;
    cout<<"Enter your choice"<<endl;
    cin>>ch;

    switch (ch)
    {
    case 1:
        cout<<"Enter the length of the array"<<endl;
        cin>>len;

        cout<<"Enter the value of the array"<<endl;
        for (i = 0; i < len; i++)
        {
            cin>>a[i];
        }

       cout<<"Value of the array before insertion"<<endl;
        for (i = 0; i < len; i++)
        {
            cin>>a[i];
        }

        printf("\n Enter a value for insertion \n");
        scanf("%d", &j);

        //right shift from end
        len++;
        for (i = len - 1; i >= 1; i--)
        {
            a[i] = a[i - 1];
        }
        a[0] = j; //new value insertion

        printf("Value of the array after insertion \n");
        for (i = 0; i < len; i++)
        {
            printf("%d ", a[i]);
        }
        printf("\n");
        break;

    case 2:
        printf("Enter the length of the array \n");
        scanf("%d", &len);

        printf("Enter the value of the array \n");
        for (i = 0; i < len; i++)
        {
            scanf("%d", &a[i]);
        }

        printf("Value of the array before insertion \n");
        for (i = 0; i < len; i++)
        {
            printf("%d ", a[i]);
        }

        printf("\n Enter a value for insertion \n");
        scanf("%d", &j);

        //right shift from end
        len++;
        a[len - 1] = j; //new value insertion

        printf("Value of the array after insertion \n");
        for (i = 0; i < len; i++)
        {
            printf("%d ", a[i]);
        }
        printf("\n");
        break;

    case 3:
        printf("Enter the length of the array \n");
        scanf("%d", &len);

        printf("Enter the value of the array \n");
        for (i = 0; i < len; i++)
        {
            scanf("%d", &a[i]);
        }

        printf("Value of the array before insertion \n");
        for (i = 0; i < len; i++)
        {
            printf("%d ", a[i]);
        }

        printf("\n Enter a value for insertion \n");
        scanf("%d", &j);
        printf("\n Enter position for value insertion \n");
        scanf("%d", &k);

        //right shift from end
        len++;
        for (i = len - 1; i >= k; i--)
        {
            a[i] = a[i - 1];
        }
        a[k - 1] = j; //new value insertion

        printf("Value of the array after insertion \n");
        for (i = 0; i < len; i++)
        {
            printf("%d ", a[i]);
        }
        printf("\n");
        break;

    default:
        printf("Wrong Input \n");
        break;
    }

    return 0;
}