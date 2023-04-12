class q1
{
    class node
    {
        int data;
        node next;
        node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    node head;
    // adding the first element
    public void addfirst(int data)
    {
        node newNode=new node(data);
        if(head==null)
        { head=newNode;return;}
        newNode.next=head;
        head=newNode;
    }
    public void searchnum(int data)
    {
        int i=1;node temp=head;int flag=0;
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            while(temp!=null)
            {
                if(temp.data==data)
                {
                    flag=1;break;
                }
                i++;
                temp=temp.next;
            }
        }
        if(flag==1)
        {
            System.out.println("Element present at " +i);
        }
        else System.out.println("Element not present");
    }
    public void printlist()
    {
        if(head==null)
        { System.out.println("Empty list");return;}

        node currnode=head;
        while(currnode!=null)
        {
            System.out.print(currnode.data +"->");
            currnode=currnode.next;
        }
        System.out.println("null");
    }
    public static void main(String args[])
    {
        q1 list=new q1();
        list.addfirst(3);
        list.addfirst(2);list.addfirst(8);
        list.addfirst(3);;list.addfirst(7);
        list.addfirst(5);list.addfirst(1);
        list.printlist();
        list.searchnum(7);   
    }
}
