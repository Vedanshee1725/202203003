#include<stdio.h>
#include<stdlib.h>
struct node// defined node
{
    int data;
    int key;
    struct node *next;
};
struct node *head=NULL;
struct node *current=NULL;

void printlist() //printing the list
{
    struct node *ptr=head;
    while(ptr!= NULL)
    {
        printf("%d --> ",ptr->data);
        ptr=ptr->next;
    }
    printf("NULL\n");
}


void insertfirst() // inserting at the first
{
    struct node *ptr=(struct node*) malloc(sizeof(struct node));
    int item;   
    if(ptr == NULL)  
    {  
        printf("\ninvalid");  
    }  
    else  
    {  
        printf("\nEnter value at first\n");    
        scanf("%d",&item);    
        ptr->data = item;  
        ptr->next = head;  
        head = ptr;  
    }  
}
void insertlast()
{
    struct node *ptr=(struct node*) malloc(sizeof(struct node));
    struct node *temp;
    int newitem;
    if(ptr==NULL){ printf("empty");}
    else
    {
        printf("Enter value at last\n");
        scanf("%d",&newitem);
        ptr->data=newitem;
        if(head==NULL)//when 0 elemnet
        {
            ptr->next=NULL;
            head=ptr;
        }
        else
        {
            temp=head;//temporaray storing head so that it doesn't get lost
            while(temp->next!=NULL)
            {
                temp=temp->next;
            }
            temp->next=ptr;
            ptr->next=NULL;
        }
    }
}
void insertatposition()
{
    int loc,newitem;int i;
    struct node *ptr,*temp;
    if(ptr == NULL)  // empty list
    {  
        printf("\ninvalid\n");  
    }  
    printf("Enter the value to be inserted\n");
    scanf("%d",&newitem);
    ptr->data=newitem;
    printf("which place to be inserted\n");
    scanf("%d",&loc);
    temp=head;            
    while(loc!=0)
    {
        
        if(temp==NULL)
        { printf("Invalid\n");return;}
        temp=temp->next;
        loc--;
    }
    ptr->next=temp->next;
    temp->next=ptr;
}


void deletefirst()
{
    struct node *temp=head;
    head=head->next;
}
void deletelast()
{
    struct node *temp;struct node *temp2;
    if(head==NULL)
    {
        printf("empty\n");
    }
    // else if(head->next==NULL);
    // {
    //     head=NULL;
    // }
    else
    {
        temp=head;
        while(temp->next!=NULL)
        {
            temp2=temp;
            temp=temp->next;
        }
        temp2->next=NULL;
    }   
}
void deleteatposition()
{
    struct node *ptr,*ptr1;  
    int loc,i;    
    printf("place to be deleted\n");  
    scanf("%d",&loc);  
    ptr=head;  
    for(i=0;i<loc;i++)  
    {  
        ptr1 = ptr;       
        ptr = ptr->next;  
              
        if(ptr == NULL)  
        {  
            printf("\ncan't delete\n");  
            return;  
        }  
    }  
    ptr1 ->next = ptr ->next;  
    free(ptr);  
    printf("\ndeleted node:%d ",loc+1);  
}  

int main()
{
    insertfirst();printlist();
    insertfirst();printlist();
    insertfirst();printlist();
    insertlast();printlist();
    printf("delete first\n");
    deletefirst();printlist();
    printf("delete last\n");
    deletelast();printlist();
    printf("Insert at a position\n");
    insertatposition();
    printlist();
    printf("Delete at a position\n");
    deleteatposition();
    printlist();
}


